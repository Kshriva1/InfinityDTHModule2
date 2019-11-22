package Logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.ChannelPackage;
import entities.SetTopBox;
import utility.JdbcDTH;

public class ChannelPackageLogic {

	public List<ChannelPackage> view() {

		// Create SetTopBoxModel Object
		List<ChannelPackage> pkgList = new ArrayList<>();

		try {

			// Create query to get information about all Set Top Boxes
			String viewQuery = "SELECT * FROM Package";
			ChannelPackage channelPkg;
			// Call utility class to connect to the database and receive ResultSet object
			ResultSet channelPackageInfo = JdbcDTH.executeDTHQueries(viewQuery);
			String categoriesQuery;
			ResultSet categoryId;
			String categoryQuery;
			ResultSet category;
			List<String> pkgCategoryList;
			while (channelPackageInfo.next()) {

				channelPkg = new ChannelPackage();
				pkgCategoryList = new ArrayList<>();
				channelPkg.setPkgName(channelPackageInfo.getString(2));
				channelPkg.setPkgChargeType(channelPackageInfo.getString(3));
				channelPkg.setPkgTransmissionType(channelPackageInfo.getString(4));
				channelPkg.setPkgCost(channelPackageInfo.getInt(5));
				channelPkg.setPkgFromDate(channelPackageInfo.getDate(6));
				channelPkg.setPkgToDate(channelPackageInfo.getDate(7));
				channelPkg.setPkgByDefault(channelPackageInfo.getString(8));
				
				categoriesQuery = "Select pkgCategoryId from Package_PackageCategory where PkgId=" + channelPackageInfo.getInt(1);
                categoryId = JdbcDTH.executeDTHQueries(categoriesQuery);
                while(categoryId.next()) {
                	categoryQuery = "Select pkgCategoryName from PackageCategory where pkgCategoryId=" + categoryId.getInt(1);
                	category = JdbcDTH.executeDTHQueries(categoryQuery);
                	while(category.next()) {
                		pkgCategoryList.add(category.getString(1));
                	}
                }
                
                channelPkg.setPkgCategory(pkgCategoryList);
				
				pkgList.add(channelPkg);

			}
			// Return a list of SetTopBoxModel Objects
			return pkgList;
		} catch (Exception e) {
			System.err.println("Exception thrown : " + e);
		}
		// Return empty list of SetTopBoxModel Objects
		return pkgList;
	}

	public boolean addPkg(String pkgName, String pkgChargeType, String pkgTransmissionType, int pkgCost,
			Date pkgFromDate, Date pkgToDate, String pkgByDefault, List<String> categories) {

		try {
			ResultSet pkgId;
			ResultSet categoryId;
			String categoryIdQuery;
			String addCategory;
			// Create query to insert new Set Top Box into SetTopBox Table
			String addPkg = "INSERT INTO Package VALUES (package_seq.nextval," + "'" + pkgName + "'" + "," + "'"
					+ pkgChargeType + "'" + "," + "'" + pkgTransmissionType + "'" + "," + pkgCost + "," + "'"
					+ pkgFromDate + "'" + "," + "'" + pkgFromDate + "'" + "'" + pkgByDefault + "'" + ")";

			// Call utility class to connect to the database and receive ResultSet object
			ResultSet STBAdded = JdbcDTH.executeDTHQueries(addPkg);
			String pkgIdQuery = "SELECT pkgId FROM SetTopBox WHERE pkgName=" + pkgName;
			pkgId = JdbcDTH.executeDTHQueries(pkgIdQuery);
			for (int i = 0; i < categories.size(); i++) {

				categoryIdQuery = "SELECT pkgCategoryId FROM PackageCategory WHERE pkgCategoryName="
						+ categories.get(i);
				categoryId = JdbcDTH.executeDTHQueries(categoryIdQuery);
				// Create query to insert features for new Set Top Box into settopbox_feature
				// Table
				addCategory = "INSERT INTO Package_PackageCategory VALUES (" + categoryId.getInt(1) + ","
						+ pkgId.getInt(1) + ")";

				// Call utility class to connect to the database and receive ResultSet object
				JdbcDTH.executeDTHQueries(addCategory);
			}
			return true;

		} catch (Exception e) {
			System.err.println("Exception thrown : " + e);
		}
		return false;

	}

	public boolean updateChannelPackage(String oldPkgName, String newPkgName, String newPkgChargeType,
			String newPkgTransmissionType, int newPkgCost, Date newPkgFromDate, Date newPkgToDate,
			String newPkgByDefault) {

		try {

			// Get the id of the SetTopBox we want to update
			String pkgId = "SELECT pkgId FROM Package WHERE STBType=" + oldPkgName;
			ResultSet id = JdbcDTH.executeDTHQueries(pkgId);

			// Create query to update information about particular Set Top Box
			String updateQuery = "UPDATE Package Set pkgName=" + "'" + newPkgName + "'" + "," + "pkgChargeType=" + "'"
					+ newPkgChargeType + "'" + "," + "pkgTransmissionType=" + "'" + newPkgTransmissionType + "'" + ","
					+ "pkgCost=" + newPkgCost + "," + "pkgFromDate=" + "'" + newPkgFromDate + "'" + "," + "pkgToDate="
					+ "'" + newPkgToDate + "'" + "," + "pkgByDefault=" + "'" + newPkgByDefault + "'" + "where pkgId="
					+ id.getInt(1);

			// Call utility class to connect to the database and receive ResultSet object
			JdbcDTH.executeDTHQueries(updateQuery);
			return true;
		} catch (Exception e) {
			System.err.println("Exception thrown : " + e);
		}
		return false;

	}

	public boolean deleteChannelPackage(String channelPackageName) {

		try {
			String idQuery = "Select pkgId from Package where pkgName=" + channelPackageName;
			ResultSet id = JdbcDTH.executeDTHQueries(idQuery);

			// Create query to remove particular Set Top Box from setTopBox Table
			String deletePkgQuery = "DELETE FROM Package WHERE pkgId=" + id.getInt(1);

			// Create query to remove features for a particular Set Top Box from
			// setTopBox_feature Table
			String deleteCategoriesQuery = "DELETE FROM Package_PackageCategory WHERE pkgId=" + id.getInt(1);

			// Call utility class to connect to the database and receive ResultSet object
			JdbcDTH.executeDTHQueries(deletePkgQuery);
			JdbcDTH.executeDTHQueries(deleteCategoriesQuery);
			return true;
		} catch (Exception e) {
			System.err.println("Exception thrown : " + e);
		}
		return false;
	}
}

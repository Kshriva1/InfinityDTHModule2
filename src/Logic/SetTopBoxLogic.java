package Logic;

import java.sql.*;

import entities.SetTopBox;
import utility.Jdbc;

public class SetTopBoxLogic {

	public static SetTopBox view(int setTopBoxId) throws SQLException {

		// Create SetTopBoxModel Object
		SetTopBox STBM = new SetTopBox();

		try {

			// Create query to get information about particular Set Top Box
			String viewQuery = "SELECT * FROM SetTopBox WHERE setTopBoxId=" + setTopBoxId;

			// Call utility class to connect to the database and receive ResultSet object
			ResultSet rs = Jdbc.executeDTHQueries(viewQuery);

			// Check if ResultSet is not empty
			if (rs.next()) {

				// Assign values to SetTopBoxModel Object
				STBM.setSTBType(rs.getString(2));
				STBM.setSTBlength(rs.getInt(3));
				STBM.setSTBbreadth(rs.getInt(4));
				STBM.setSTBwidth(rs.getInt(5));
				STBM.setPrice(rs.getDouble(6));
				STBM.setInstallationCharges(rs.getDouble(7));
				STBM.setUpdationCharges(rs.getDouble(8));
				STBM.setPercentageDiscount(rs.getInt(9));
				STBM.setBillingType(rs.getString(10));
				STBM.setRefundAmount(rs.getDouble(11));

				// Return SetTopBoxModel Object
				return STBM;
			}
		} catch (Exception e) {
			System.err.println("Exception thrown : " + e);
		}
		// Return empty SetTopBoxModel Object
		return STBM;
	}

	// Add new Set Top Box
	public static boolean addSetTopBox(String type, int length, int breadth, int width, double price,
			double installCharges, double updationCharges, int percentDiscount, String billingType, double refund) {

		try {

			// Create query to insert new Set Top Box into SetTopBox Table
			String addSTB = "INSERT INTO SetTopBox VALUES (frequency_seq.nextval," + type + "," + length + "," + breadth
					+ "," + width + "," + price + "," + installCharges + "," + updationCharges + "," + percentDiscount
					+ "," + billingType + "," + refund + ")";

			// Call utility class to connect to the database and receive ResultSet object
			ResultSet rs = Jdbc.executeDTHQueries(addSTB);
			return true;
		} catch (Exception e) {
			System.err.println("Exception thrown : " + e);
		}
		return false;

	}

	// Update already existing Set Top Box
	public static boolean updateSetTopBox(int whereId, String type, int length, int breadth, int width, double price,
			double installCharges, double updationCharges, int percentDiscount, String billingType, double refund)
			throws SQLException {

		try {

			// Create query to update information about particular Set Top Box
			String updateQuery = "UPDATE SetTopBox " + "SET setTopBoxId=" + whereId + ",STBType=" + type + ",STBlength="
					+ length + ",STBbreadth=" + breadth + ",STBwidth=" + width + ",price=" + price
					+ ",installationCharges=" + installCharges + ",updationCharges=" + updationCharges
					+ ",percentageDiscount=" + percentDiscount + ",billingType=" + billingType + ",refundAmount="
					+ refund + " WHERE setTopBoxId=" + whereId;

			// Call utility class to connect to the database and receive ResultSet object
			ResultSet rs = Jdbc.executeDTHQueries(updateQuery);
			return true;
		} catch (Exception e) {
			System.err.println("Exception thrown : " + e);
		}
		return false;
	}

	// Remove particular Set Top Box from SetTopBox Table
	public static boolean deleteSetTopBox(int id) throws SQLException {

		try {

			// Create query to remove particular Set Top Box from setTopBox Table
			String deleteQuery = "DELETE FROM setTopBox WHERE setTopBoxId=" + id;

			// Call utility class to connect to the database and receive ResultSet object
			ResultSet rs = Jdbc.executeDTHQueries(deleteQuery);
			return true;
		} catch (Exception e) {
			System.err.println("Exception thrown : " + e);
		}
		return false;
	}
}
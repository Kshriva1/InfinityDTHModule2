package Logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SetTopBoxLogic {
	public static Connection con = null;
	public static Statement st = null;
	public static ResultSet rs = null;
	public static PreparedStatement insertSTB = null;
	void DBConnection () {
		String driverInfo = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String uname = "system";
		String pwd = "tcs12345";
		
		try {
					
			//Register the driver
			Class.forName(driverInfo);
			
			//Establish Connection
			Connection con = DriverManager.getConnection(url, uname, pwd);

		}
		catch(Exception e) {
			System.err.println("Exception thrown : "+e);
		}
	}
	
	/*
	void InsertIntoSTB() {
		int stbId, length, breadth, width, price, instCharges, updateCharges, percentDiscount, refundAmt;//fetch from jsp form
		String type, billingType ;//fetch from jsp form
		try {
			String insertTableSTB = "insert into setTopBox values ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? ";
			insertSTB = con.prepareStatement(insertTableSTB);
			insertSTB.setInt(1, stbId);
			insertSTB.setString(2, type);
			insertSTB.setInt(3, length);
			insertSTB.setInt(4, breadth);
			insertSTB.setInt(5, width);
			insertSTB.setInt(6, price);
			insertSTB.setInt(7, instCharges);
			insertSTB.setInt(8, updateCharges);
			insertSTB.setInt(9, percentDiscount);
			insertSTB.setString(10, billingType);
			insertSTB.setInt(11, refundAmt);
		}
		catch(Exception e) {
			System.err.println("Exception thrown : "+e);
		}
	}
	*/
}

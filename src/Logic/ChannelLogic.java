package Logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Channel;
import utility.JdbcDTH;

public class ChannelLogic {

	public boolean addChannel(String channelName, String channelBand, double videoFrequency, double audioFrequency,
			String channelChargeType, String channelTransmissionType, double channelCharge,
			String channelEnableOrDisable, String pkgName) {
		long pkgId = 0;
		String query1 = "Select pkgId from Package where pkgName=" + pkgName;
		try {
			ResultSet rs1 = JdbcDTH.executeDTHQueries(query1);
			pkgId = rs1.getInt(1);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String query = "insert into Channel values(" + "channel_seq.nextval" + "," + "'" + channelName + "'" + "," + "'"
				+ channelBand + "'" + "," + videoFrequency + "," + audioFrequency + "," + "'" + channelChargeType + "'"
				+ "," + "'" + channelTransmissionType + "'" + "," + channelCharge + "'" + channelEnableOrDisable + "'"
				+ "," + pkgId + ")";
		try {
			JdbcDTH.executeDTHQueries(query);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

	}

	public List<Channel> viewChannel() {

		List<Channel> channelList = new ArrayList<>();
		Channel channel;
		String query2 = "Select * from Channel";
		try {
			ResultSet rs = JdbcDTH.executeDTHQueries(query2);
			while (rs.next()) {
				channel = new Channel();
				channel.setChannelName(rs.getString(2));
				channel.setChannelBand(rs.getString(3));
				channel.setVideoFrequency(rs.getInt(4));
				channel.setAudioFrequency(rs.getInt(5));
				channel.setChannelChargeType(rs.getString(6));
				channel.setChannelTransmissionType(rs.getString(7));
				channel.setChannelCharge(rs.getInt(8));
				channel.setChannelEnableOrDisable(rs.getString(9));
				channelList.add(channel);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return channelList;
	}

	public boolean updateChannel(String oldChannelName, String newChannelName, String newChannelBand,
			double newVideoFrequency, double newAudioFrequency, String newChannelChargeType,
			String newChannelTransmissionType, double newChannelCharge, String support, int newCategoryId) {

		try {

			// Get the id of the Channel we want to update
			String channelId = "SELECT channelId FROM channel WHERE channelName='" + oldChannelName + "'";
			ResultSet id = JdbcDTH.executeDTHQueries(channelId);
			System.out.println("Before query");
			while (id.next()) {
				// Create query to update information about particular Channel
				String updateQuery = "UPDATE channel SET" + " channelName=" + "'" + newChannelName + "'" + ",channelBand='" + newChannelBand + "'"
						+ ",videoFrequency=" + newVideoFrequency + ",audioFrequency=" + newAudioFrequency + ",channelChargeType='" + newChannelChargeType + "'"
						+ ",channelTransmissionType='" + newChannelTransmissionType + "'" + ",channelCharge=" + newChannelCharge
						+ ",channelEnableOrDisable='" + support + "'" + ",categoryId=" + newCategoryId
						+ " WHERE channelId=" + id.getInt(1);
				System.out.println(updateQuery);
				// Call utility class to connect to the database and receive ResultSet object
				JdbcDTH.executeDTHQueries(updateQuery);
			}
			return true;
		} catch (Exception e) {
			System.err.println("Exception thrown : " + e);
		}
		return false;
	}
	
	public boolean deleteChannel(String channelName) {
		
		String query = "Delete from Channel where channelName=" + channelName;
		try {
			JdbcDTH.executeDTHQueries(query);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}

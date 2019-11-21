package Logic;

import java.sql.ResultSet;
import java.sql.SQLException;

import entities.Channel;
import utility.Jdbc;

public class ChannelLogic {

	public boolean createChannel(String channelName, String channelBand, double videoFrequency, double audioFrequency,
			String channelChargeType, String channelTransmissionType, double channelCharge,
			String channelEnableOrDisable, String pkgName) {
		long pkgId = 0;
		String query1 = "Select pkgId from Package where pkName=" + pkgName;
		try {
			ResultSet rs1 = Jdbc.executeDTHQueries(query1);
			pkgId = rs1.getInt(1);
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String query = "insert into Channel values(" + "channel_seq.nextval" + "," + "'" + channelName + "'" + "," + "'"
				+ channelBand + "'" + "," + videoFrequency + "," + audioFrequency + "," + "'" + channelChargeType + "'"
				+ "," + "'" + channelTransmissionType + "'" + "," + channelCharge + "'" + channelEnableOrDisable + "'"
				+ "," + pkgId + ")";
		try {
			Jdbc.executeDTHQueries(query);
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

	}

	public Channel readChannel(String channelName) {

		Channel channel = new Channel();

		String query2 = "Select * from Channel where channelName=" + channelName;
		try {
			ResultSet rs = Jdbc.executeDTHQueries(query2);
			while (rs.next()) {
				channel.setChannelName(rs.getString(2));
				channel.setChannelBand(rs.getString(3));
				channel.setVideoFrequency(rs.getInt(4));
				channel.setAudioFrequency(rs.getInt(5));
				channel.setChannelChargeType(rs.getString(6));
				channel.setChannelTransmissionType(rs.getString(7));
				channel.setChannelCharge(rs.getInt(8));
				channel.setChannelEnableOrDisable(rs.getString(9));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return channel;
	}

	public boolean updateChannel(String oldChannelName, String newChannelName, String newChannelBand,
			double newVideoFrequency, double newAudioFrequency, String newChannelChargeType,
			String newChannelTransmissionType, double newChannelCharge, String newChannelEnableOrDisable) {

		long channelId = 0;
		String query1 = "Select channelId from Channel where channelName=" + oldChannelName;
		try {
			ResultSet rs = Jdbc.executeDTHQueries(query1);
			channelId = rs.getInt(1);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String query2 = "Update Channel Set channelName=" + "'" + newChannelName + "'" + "channelBand=" + "'"
				+ newChannelBand + "'" + "videoFrequency=" + newVideoFrequency + "audioFrequency=" + newAudioFrequency
				+ "channelChargeType=" + "'" + newChannelChargeType + "'" + "channelTransmissionType=" + "'"
				+ newChannelTransmissionType + "'" + "channelCharge=" + newChannelCharge + "channelEnableOrDisable="
				+ "'" + newChannelEnableOrDisable + "'" + "where channelId = " + channelId;
		
		try {
			Jdbc.executeDTHQueries(query2);
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
	
	public boolean deleteChannel(String channelName) {
		
		String query = "Delete from Channel where channelName=" + channelName;
		try {
			Jdbc.executeDTHQueries(query);
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}

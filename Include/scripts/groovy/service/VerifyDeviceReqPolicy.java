package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.kms.katalon.core.util.KeywordUtil;

public class VerifyDeviceReqPolicy {

	static String url = "jdbc:mysql://192.168.3.28/ztn_team_dev";
	static String usr = "root";
	static String pwd = "developer!@#123";

	static Connection connection = null;

	static PreparedStatement preparedStatement = null;

	static ResultSet resultSet = null;

	public static boolean verifyList(String teamUid) {
		try {
			connection = DriverManager.getConnection(url, usr, pwd);
			String findByTeam = "SELECT device_req_policy_id,team_uid,policy_type,policy_category,policy_name,policy_desc,policy_order"
					+ ",policy_state,policy_action,rule_set_id,policy_approval_option FROM `tbl_team_device_req_policy` WHERE team_uid = ?";
			preparedStatement = connection.prepareStatement(findByTeam);

			preparedStatement.setString(1, teamUid);

			resultSet = preparedStatement.executeQuery();

			if (!(resultSet.next())) {
				KeywordUtil.markFailedAndStop("The device requirement policy verification failed.");
				return false;
			}

			return true;
		} catch (Exception e) {
			KeywordUtil.markFailedAndStop("error on verify team doamin, the cause: " + e.getMessage());
			return false;
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}

				if (preparedStatement != null) {
					preparedStatement.close();
				}

				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

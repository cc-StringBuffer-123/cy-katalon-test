package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.kms.katalon.core.util.KeywordUtil;

import internal.GlobalVariable;
import model.TeamInfo;

public class VerifyData {

	static String url = GlobalVariable.Mysql_Url.toString();
	static String usr = GlobalVariable.Mysql_User.toString();
	static String pwd = GlobalVariable.Mysql_Pwd.toString();

	static Connection connection = null;

	static PreparedStatement preparedStatement = null;

	static ResultSet resultSet = null;

	public static TeamInfo getTeamInfo(String domain) {
		try {
			connection = DriverManager.getConnection(url, usr, pwd);
			String findByTeam = "SELECT team_uid, team_name, team_domain FROM tbl_team_info WHERE team_domain = ?";

			preparedStatement = connection.prepareStatement(findByTeam);

			preparedStatement.setString(1, domain);

			resultSet = preparedStatement.executeQuery();

			if (!(resultSet.next())) {
				KeywordUtil.markFailedAndStop("The team info verification failed. Terminating the test.");
				return new TeamInfo();
			}

			String teamUid = resultSet.getString("team_uid");

			String teamName = resultSet.getString("team_name");

			String teamDomain = resultSet.getString("team_domain");

			return TeamInfo.form(teamUid, teamName, teamDomain);
		} catch (Exception e) {
			KeywordUtil.markFailedAndStop("error on get team info, the cause: " + e.getMessage());
			return new TeamInfo();
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

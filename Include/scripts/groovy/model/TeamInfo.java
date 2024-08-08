package model;
import java.util.Objects;

public class TeamInfo {
	private String teamUID;
	private String teamName;
	private String teamDomain;

	public static TeamInfo form(String teamUID, String teamName, String teamDomain) {
		TeamInfo info = new TeamInfo();
		info.setTeamUID(teamUID);
		info.setTeamName(teamName);
		info.setTeamDomain(teamDomain);
		return info;
	}

	public String getTeamUID() {
		return teamUID;
	}
	public void setTeamUID(String teamUID) {
		this.teamUID = teamUID;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamDomain() {
		return teamDomain;
	}
	public void setTeamDomain(String teamDomain) {
		this.teamDomain = teamDomain;
	}

	@Override
	public int hashCode() {
		return Objects.hash(teamDomain, teamName, teamUID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeamInfo other = (TeamInfo) obj;
		return Objects.equals(teamDomain, other.teamDomain) && Objects.equals(teamName, other.teamName) && Objects.equals(teamUID, other.teamUID);
	}

	@Override
	public String toString() {
		return "TeamInfo [teamUID=" + teamUID + ", teamName=" + teamName + ", teamDomain=" + teamDomain + "]";
	}
}

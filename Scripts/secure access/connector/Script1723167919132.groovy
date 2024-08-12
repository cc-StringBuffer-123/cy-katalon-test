import model.InitialTeamInfo
import model.SecureAccess

String uniquValue = UUID.randomUUID().toString().replace('-', '').substring(0, 6)

InitialTeamInfo.createTeam(uniquValue)

SecureAccess.createConnector(uniquValue)
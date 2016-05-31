package iyte.idmanager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class IYTEOrgPersonDAO implements IIYTEOrgPersonDAO {
	
	public IYTEOrgPersonDAO() {
		super();
	}
	
	public Connection getConnection(){
		Connection conn=null;
		DatabaseConfiguration dc = DatabaseConfiguration.getInstance();
		conn = dc.getConnection();
		return conn;
	}
	
	public IYTEOrgPerson findByUserName(String userName) {
		IYTEOrgPerson auth = null;
		String userId = null,password = null,givenName = null,lastName = null,middleName = null,mailAccount=null;
		
		try {
			Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM USERS as users where users.USERNAME = ?");
			pstmt.setString(1,userName);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				userId = rs.getString("UID");
				password = rs.getString("PASSWORD");
				givenName = rs.getString("ADI");
				lastName = rs.getString("SOYADI");
				mailAccount = rs.getString("USERNAME");
				System.out.println(givenName);
				auth = new IYTEOrgPerson(userId, password, givenName, middleName, lastName, mailAccount);
			}
			
		} catch(Exception e) {
			System.err.println(e.getMessage());			
		}
		return auth;
	}
	
	/*public boolean authenticate(IAuthenticable auth,String Password) {
		boolean isAuthenticate = false;
		if((auth!=null)) {
			IYTEOrgPerson person = (IYTEOrgPerson)auth;
			try {
				String encPass = freeBSDcrypt.crypt(Password,person.getPassword());
				if(encPass.compareTo(person.getPassword())==0) {
					isAuthenticate = true;
				}
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return isAuthenticate;
	}*/
	
	
}

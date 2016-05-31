package iyte.idmanager;

import java.security.NoSuchAlgorithmException;

import net.spatula.utils.freeBSDcrypt;

public class IDManagerController implements IIDManagerController {

	private IIYTEOrgPersonDAO dao;

	public IDManagerController() {
		super();
		dao = new IYTEOrgPersonDAO();
	}

	public IYTEOrgPerson getAuthenticableSubject(String userName) {
		IYTEOrgPerson auth = dao.findByUserName(userName);
		return (IYTEOrgPerson) auth;
	}

	public IYTEOrgPerson authenticate(IYTEOrgPerson auth,
			String password) {
		IYTEOrgPerson person = (IYTEOrgPerson)auth;
		
		if((person != null)) {
			if((auth.getMailAccount()!=null) && (person=getAuthenticableSubject(auth.getMailAccount()))!=null) {
				String salt = person.getPassword();
				String encPass = null;
				try {
					encPass = freeBSDcrypt.crypt(password,salt);
				} catch (NoSuchAlgorithmException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (person.verifyPassword(encPass))
					return (IYTEOrgPerson) person;
				
			}
		}
		return null;		
	}

	
}

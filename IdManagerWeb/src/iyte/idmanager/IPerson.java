package iyte.idmanager;

public interface IPerson extends IAuthenticable, IMailUser {
	public String getGivenName();
	public void setGivenName(String givenName);
	public String getMiddleName();
	public void setMiddleName(String middleName);
	public String getLastName();
	public void setLastName(String lastName);
}

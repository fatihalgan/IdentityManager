package iyte.idmanager;

public interface IMailUser extends IAuthenticable {
	public String getMailAccount();
	public void setMailAccount(String mailAccount);
	public String getFullName();
}

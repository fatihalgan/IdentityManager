package iyte.idmanager;

import java.io.Serializable;

public interface IAuthenticable extends Serializable {
	public boolean verifyPassword(String password);
	public String getUserId();
	public boolean setPassword(String oldPassword, String newPassword);
	public String getMailAccount();
}

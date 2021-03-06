package com.motocho.portfolio.summary.dao.repo.user;

/*import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;*/

//@Entity
//@Table(name="users")
public class User {
	//@Id
	private long userId;//usrId
	private String userFirstName;//fstNme
	private String userMiddleName;//usrMidNme
	private String userLastName;//usrLstNme
	private String userName;//usrNme
	private String password;//pass
	private String previousPassword;//prevPass
	private String resetPassword;//resPass
	private String userRole;//usrRle
	private int loginAttempts;//lgnAtmp
	private byte status;//stat
	private long dateCreated;//dtCrt
	private long dateModified;//dtMod

	public User() {
		super();
	}

	public User(long userId, String userFirstName,
		String userMiddleName, String userLastName,
		String userName, String password,
		String previousPassword, String resetPassword,
		String userRole, int loginAttempts, byte status,
		long dateCreated, long dateModified) {
		
		super();
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userMiddleName = userMiddleName;
		this.userName = userName;
		this.password = password;
		this.previousPassword = previousPassword;
		this.resetPassword = resetPassword;
		this.userRole = userRole;
		this.loginAttempts = loginAttempts;
		this.status = status;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
	}

	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserMiddleName() {
		return userMiddleName;
	}
	public void setUserMiddleName(String userMiddleName) {
		this.userMiddleName = userMiddleName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPreviousPassword() {
		return previousPassword;
	}
	public void setPreviousPassword(String previousPassword) {
		this.previousPassword = previousPassword;
	}
	public String getResetPassword() {
		return resetPassword;
	}
	public void setResetPassword(String resetPassword) {
		this.resetPassword = resetPassword;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public int getLoginAttempts() {
		return loginAttempts;
	}
	public void setLoginAttempts(int loginAttempts) {
		this.loginAttempts = loginAttempts;
	}
	public byte getStatus() {
		return status;
	}
	public void setStatus(byte status) {
		this.status = status;
	}
	public long getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(long dateCreated) {
		this.dateCreated = dateCreated;
	}
	public long getDateModified() {
		return dateModified;
	}
	public void setDateModified(long dateModified) {
		this.dateModified = dateModified;
	}
}

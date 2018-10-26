package com.motocho.portfolio.summary.dao.repo.user;
/**
 * Users Table Mapping
 * @author rao.sobbana@motocho.io
 * userId, userFirstName, userMiddleName, userLastName,userName,
 * userPassword, previousPassword, resetPassword, userRole,
 * loginAttempts, status, dateCreated, dateModified
 */
public class User {
	private long usrId;
	private String usrFstNme;
	private String usrMidNme;
	private String usrLstNme;
	private String usrNme;
	private String usrPass;//SSH
	private String prevPass;//SSH
	private String rePass;//OneTimePassword
	private String usrRle;
	private int lgnAtmp;
	private int stat;
	private long dtCrt;
	private long dtMod;

	public long getUsrId() {
		return usrId;
	}
	public void setUsrId(long usrId) {
		this.usrId = usrId;
	}
	public String getUsrFstNme() {
		return usrFstNme;
	}
	public void setUsrFstNme(String usrFstNme) {
		this.usrFstNme = usrFstNme;
	}
	public String getUsrMidNme() {
		return usrMidNme;
	}
	public void setUsrMidNme(String usrMidNme) {
		this.usrMidNme = usrMidNme;
	}
	public String getUsrLstNme() {
		return usrLstNme;
	}
	public void setUsrLstNme(String usrLstNme) {
		this.usrLstNme = usrLstNme;
	}
	public String getUsrNme() {
		return usrNme;
	}
	public void setUsrNme(String usrNme) {
		this.usrNme = usrNme;
	}
	public String getUsrPass() {
		return usrPass;
	}
	public void setUsrPass(String usrPass) {
		this.usrPass = usrPass;
	}
	public String getPrevPass() {
		return prevPass;
	}
	public void setPrevPass(String prevPass) {
		this.prevPass = prevPass;
	}
	public String getRePass() {
		return rePass;
	}
	public void setRePass(String rePass) {
		this.rePass = rePass;
	}
	public String getUsrRle() {
		return usrRle;
	}
	public void setUsrRle(String usrRle) {
		this.usrRle = usrRle;
	}
	public int getLgnAtmp() {
		return lgnAtmp;
	}
	public void setLgnAtmp(int lgnAtmp) {
		this.lgnAtmp = lgnAtmp;
	}
	public int getStat() {
		return stat;
	}
	public void setStat(int stat) {
		this.stat = stat;
	}
	public long getDtCrt() {
		return dtCrt;
	}
	public void setDtCrt(long dtCrt) {
		this.dtCrt = dtCrt;
	}
	public long getDtMod() {
		return dtMod;
	}
	public void setDtMod(long dtMod) {
		this.dtMod = dtMod;
	}
}

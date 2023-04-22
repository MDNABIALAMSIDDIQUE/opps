package com.database.sbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotel")
public class Hotal {
	@Value("1234")
	private Integer hotalid;
	@Value("${hotal.name}")
	private String hotalName;
	@Value("${hotal.address}")
	private String hotaladdress;
	@Value("${hotal.phone}")
	private String moblie;
	
	@Value("${customar.name}")
	private String custName;
	@Value("#{menu.biryanirate+menu.water}")
	private float billAmount;
	
	@Value("${os.name}")
	private String osname;
	@Value("${user.name}")
	private String windowsUser;
	
	@Value("${path}")
	private String pathdata;
	
	
	public Integer getHotalid() {
		return hotalid;
	}


	public void setHotalid(Integer hotalid) {
		this.hotalid = hotalid;
	}


	public String getHotalName() {
		return hotalName;
	}


	public void setHotalName(String hotalName) {
		this.hotalName = hotalName;
	}


	public String getHotaladdress() {
		return hotaladdress;
	}


	public void setHotaladdress(String hotaladdress) {
		this.hotaladdress = hotaladdress;
	}


	public String getMoblie() {
		return moblie;
	}


	public void setMoblie(String moblie) {
		this.moblie = moblie;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public float getBillAmount() {
		return billAmount;
	}


	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}


	public String getOsname() {
		return osname;
	}


	public void setOsname(String osname) {
		this.osname = osname;
	}


	public String getWindowsUser() {
		return windowsUser;
	}


	public void setWindowsUser(String windowsUser) {
		this.windowsUser = windowsUser;
	}


	public String getPathdata() {
		return pathdata;
	}


	public void setPathdata(String pathdata) {
		this.pathdata = pathdata;
	}


	@Override
	public String toString() {
		return "Hotal [hotalid=" + hotalid + ", hotalName=" + hotalName + ", hotaladdress=" + hotaladdress
				+ ", custName=" + custName + ", billAmount=" + billAmount + ", osname=" + osname + ", windowsUser="
				+ windowsUser + ", pathdata=" + pathdata + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}

package com.hotel.DTO;

public class Consumer {
	
	private int cid;
	private String name;
	private long accno;
	private String email;
	private long phone;
	private String password;
	public Consumer(int cid, String name, long accno, String email, long phone, String password) {
		super();
		this.cid = cid;
		this.name = name;
		this.accno = accno;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Consumer [cid=" + cid + ", name=" + name + ", accno=" + accno + ", email=" + email + ", phone=" + phone
				+ ", password=" + password + "]";
	}

}

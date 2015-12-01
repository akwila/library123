package model;

import java.io.Serializable;
import java.util.Calendar;

public class UserDTO implements Serializable {

	public UserDTO() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String userName;
	private String password;
	private String name;
	private String address;
	private String phone;
	private String email;
	private int userTypeId;
	private Calendar updateDatetime;
	private int updateUserId;
	//from usertype table
	private String userTypeName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}
	public Calendar getUpdateDatetime() {
		return updateDatetime;
	}
	public void setUpdateDatetime(Calendar updateDatetime) {
		this.updateDatetime = updateDatetime;
	}
	public int getUpdateUserId() {
		return updateUserId;
	}
	public void setUpdateUserId(int updateUserId) {
		this.updateUserId = updateUserId;
	}
	public String getUserTypeName() {
		return userTypeName;
	}
	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", userName=" + userName + ", password=" + password + ", name=" + name
				+ ", address=" + address + ", phone=" + phone + ", email=" + email + ", userTypeId=" + userTypeId
				+ ", updateDatetime=" + updateDatetime + ", updateUserId=" + updateUserId + ", userTypeName="
				+ userTypeName + "]";
	}
	

}

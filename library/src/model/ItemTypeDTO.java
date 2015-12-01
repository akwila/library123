package model;

import java.io.Serializable;


public class ItemTypeDTO implements Serializable {

	public ItemTypeDTO() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String code;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ItemTypeDTO [id=" + id + ", code=" + code + ", name=" + name + "]";
	}

}

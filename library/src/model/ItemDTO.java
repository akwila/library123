package model;

import java.io.Serializable;
import java.util.Calendar;

public class ItemDTO implements Serializable{

	public ItemDTO() {
		// TODO Auto-generated constructor stub
	}
	private int id;
    private String name;
    private int itemTypeId;
    private String creator;
    private String publisher;
    private String year;
    private String description;
    private String ISBN;
    private Calendar updateDatetime;
    private String updateUserId;
    //from itemtype table
    private String itemTypeCode;
    private String itemTypeName;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getItemTypeId() {
		return itemTypeId;
	}
	public void setItemTypeId(int itemTypeId) {
		this.itemTypeId = itemTypeId;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public Calendar getUpdateDatetime() {
		return updateDatetime;
	}
	public void setUpdateDatetime(Calendar updateDatetime) {
		this.updateDatetime = updateDatetime;
	}
	public String getUpdateUserId() {
		return updateUserId;
	}
	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}
	public String getItemTypeCode() {
		return itemTypeCode;
	}
	public void setItemTypeCode(String itemTypeCode) {
		this.itemTypeCode = itemTypeCode;
	}
	public String getItemTypeName() {
		return itemTypeName;
	}
	public void setItemTypeName(String itemTypeName) {
		this.itemTypeName = itemTypeName;
	}
	@Override
	public String toString() {
		return "ItemDTO [id=" + id + ", name=" + name + ", itemTypeId=" + itemTypeId + ", creator=" + creator
				+ ", publisher=" + publisher + ", year=" + year + ", description=" + description + ", ISBN=" + ISBN
				+ ", updateDatetime=" + updateDatetime + ", updateUserId="
				+ updateUserId + ", itemTypeCode=" + itemTypeCode + ", itemTypeName=" + itemTypeName + "]";
	}

}

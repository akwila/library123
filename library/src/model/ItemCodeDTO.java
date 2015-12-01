package model;

import java.io.Serializable;
import java.util.Calendar;

public class ItemCodeDTO implements Serializable {

	public ItemCodeDTO() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private int itemId;
	private int copyNumber;
	private int itemStatusId;
	private Calendar updateDatetime;
	private int updateUserId;
	//from itemstatus table
	private String itemStatusName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getCopyNumber() {
		return copyNumber;
	}
	public void setCopyNumber(int copyNumber) {
		this.copyNumber = copyNumber;
	}
	public int getItemStatusId() {
		return itemStatusId;
	}
	public void setItemStatusId(int itemStatusId) {
		this.itemStatusId = itemStatusId;
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
	public String getItemStatusName() {
		return itemStatusName;
	}
	public void setItemStatusName(String itemStatusName) {
		this.itemStatusName = itemStatusName;
	}
	@Override
	public String toString() {
		return "ItemCodeDTO [id=" + id + ", itemId=" + itemId + ", copyNumber=" + copyNumber + ", itemStatusId="
				+ itemStatusId + ", activeIndicator=" + ", updateDatetime=" + updateDatetime
				+ ", updateUserId=" + updateUserId + ", itemStatusName=" + itemStatusName + "]";
	}
	

}

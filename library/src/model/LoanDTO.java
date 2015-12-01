package model;

import java.io.Serializable;
import java.util.Calendar;

public class LoanDTO implements Serializable {

	public LoanDTO() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private int userId;
	private int itemTypeId;
	private int itemId;
	private int itemCodeId;
	private int loanStatusId;
	private Calendar borrowedDate;
	private Calendar dueDate;
	private Calendar returnDate;
	private int fine;
	private Calendar updateDatetime;
	private int updateUserId;
	//from loanstatus table
	private String loanStatusName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getItemTypeId() {
		return itemTypeId;
	}
	public void setItemTypeId(int itemTypeId) {
		this.itemTypeId = itemTypeId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getItemCodeId() {
		return itemCodeId;
	}
	public void setItemCodeId(int itemCodeId) {
		this.itemCodeId = itemCodeId;
	}
	public int getLoanStatusId() {
		return loanStatusId;
	}
	public void setLoanStatusId(int loanStatusId) {
		this.loanStatusId = loanStatusId;
	}
	public Calendar getBorrowedDate() {
		return borrowedDate;
	}
	public void setBorrowedDate(Calendar borrowedDate) {
		this.borrowedDate = borrowedDate;
	}
	public Calendar getDueDate() {
		return dueDate;
	}
	public void setDueDate(Calendar dueDate) {
		this.dueDate = dueDate;
	}
	public Calendar getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Calendar returnDate) {
		this.returnDate = returnDate;
	}
	public int getFine() {
		return fine;
	}
	public void setFine(int fine) {
		this.fine = fine;
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
	public String getLoanStatusName() {
		return loanStatusName;
	}
	public void setLoanStatusName(String loanStatusName) {
		this.loanStatusName = loanStatusName;
	}
	@Override
	public String toString() {
		return "LoanDTO [id=" + id + ", userId=" + userId + ", itemTypeId=" + itemTypeId + ", itemId=" + itemId
				+ ", itemCodeId=" + itemCodeId + ", loanStatusId=" + loanStatusId + ", borrowedDate=" + borrowedDate
				+ ", dueDate=" + dueDate + ", returnDate=" + returnDate + ", fine=" + fine + ", updateDatetime="
				+ updateDatetime + ", updateUserId=" + updateUserId + ", loanStatusName=" + loanStatusName + "]";
	}

}

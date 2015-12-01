package dao;

import dao.mysql.ItemCodeDAOImpl;
import dao.mysql.ItemDAOImpl;
import dao.mysql.ItemTypeDAOImpl;
import dao.mysql.LoanDAOImpl;
import dao.mysql.UserDAOImpl;

public class DAOFactory {
	
	public static ItemCodeDAO getItemCodeDAO() {
		ItemCodeDAO itemcodedao = new ItemCodeDAOImpl();
		return itemcodedao;
	}
	public static ItemDAO getItemDAO() {
		ItemDAO itemdao = new ItemDAOImpl();
		return itemdao;
	}
	public static ItemTypeDAO getItemTypeDAO() {
		ItemTypeDAO itemtypedao = new ItemTypeDAOImpl();
		return itemtypedao;
	}
	public static LoanDAO getLoanDAO() {
		LoanDAO loandao = new LoanDAOImpl();
		return loandao;
	}
	public static UserDAO getUserDAO() {
		UserDAO userdao = new UserDAOImpl();
		return userdao;
	}
}

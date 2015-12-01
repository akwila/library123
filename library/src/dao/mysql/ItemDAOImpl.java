package dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dao.ItemDAO;
import exception.DAOException;
import model.ItemDTO;
import model.ItemTypeDTO;

public class ItemDAOImpl implements ItemDAO {

	private static final String url = "jdbc:mysql://localhost:3306/test";
	private static final String uname = "root";
	private static final String pwd = "password";
	
	private static Connection connection;
	private static Statement statement;
	private ResultSet rs;

	private static void openConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					url, uname, pwd);
			statement = connection.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void closeConnection() {
		try {
			statement.close();

			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public ArrayList<ItemDTO> getSearchByNameType(String criteria, String value, int type) throws DAOException {
		openConnection();
		ArrayList<ItemDTO> result = new ArrayList<ItemDTO>();
		try {
			if(type==0){
				rs = statement.executeQuery("SELECT TOP 100 a.id, a.name, b.id, a.creator, a.publisher, a.year, a.description, a.ISBN, a.updateDatetime, a.updateUserId,b.name" + 
						"FROM item a INNER JOIN itemtype b ON a.itemTypeId = b.id WHERE activeIndicator = 1 AND a."+criteria+" LIKE '%'."+value+".'%'");
								//to finish	
			}else{
				
			}
			
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new DAOException();
		}finally{
			closeConnection();
		}
	}
	
}

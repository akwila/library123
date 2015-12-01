package dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dao.ItemTypeDAO;
import exception.DAOException;
import model.ItemTypeDTO;

public class ItemTypeDAOImpl implements ItemTypeDAO {

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
	public ArrayList<ItemTypeDTO> getAllItemType() throws DAOException{
		openConnection();
		ArrayList<ItemTypeDTO> result = new ArrayList<ItemTypeDTO>();
		try {
			rs = statement.executeQuery("SELECT * FROM library.itemtype;");
			while (rs.next()) {
				ItemTypeDTO itemType = new ItemTypeDTO();
				itemType.setId(rs.getInt("id"));
				itemType.setCode(rs.getString("code"));
				itemType.setName(rs.getString("name"));
				result.add(itemType);
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

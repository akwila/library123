package dao;

import java.util.ArrayList;

import exception.DAOException;
import model.ItemDTO;

public interface ItemDAO {

	public ArrayList<ItemDTO> getSearchByNameType(String criteria, String value, int type) throws DAOException;
	
}

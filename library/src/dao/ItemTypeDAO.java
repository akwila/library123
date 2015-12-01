package dao;

import java.util.ArrayList;

import exception.DAOException;
import model.ItemTypeDTO;

public interface ItemTypeDAO {
	public ArrayList<ItemTypeDTO> getAllItemType() throws DAOException; 
}

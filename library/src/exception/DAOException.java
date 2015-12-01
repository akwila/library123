package exception;

public class DAOException extends Exception {

	public DAOException() {
		// TODO Auto-generated constructor stub
	}

	public DAOException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DAOException(Exception e){
		super(e);
	}
}

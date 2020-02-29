package pl.connectis.projektgrupowy.exceptione;

public class NoBorrowedBooksException extends Exception {
	private static final String EXCEPTION_MESSAGE = "No borrowed book";
	
	public NoBorrowedBooksException() {
		super(EXCEPTION_MESSAGE);
	}

}

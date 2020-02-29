

package pl.connectis.projektgrupowy.exceptione;

public class NoBookIDException extends Exception {
	private static final String EXCEPTION_MESSAGE = "No book to return";
	
	public NoBookIDException() {
		super(EXCEPTION_MESSAGE);
	}
	
}

package pl.connectis.projektgrupowy.exceptione;

public class NoClientIDException extends Exception {
	private static final String EXCEPTION_MESSAGE = "No Client to show";
	
	public NoClientIDException() {
		super(EXCEPTION_MESSAGE);
	}
	
}

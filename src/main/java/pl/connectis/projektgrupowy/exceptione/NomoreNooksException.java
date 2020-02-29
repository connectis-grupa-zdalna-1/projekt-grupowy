package pl.connectis.projektgrupowy.exceptione;
public class NomoreNooksException extends Exception {
	private static final String EXCEPTION_MESSAGE = "No more books";
	
	public NomoreNooksException() {
		super(EXCEPTION_MESSAGE);
	}
	
}


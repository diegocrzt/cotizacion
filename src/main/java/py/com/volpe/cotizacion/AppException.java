package py.com.volpe.cotizacion;

import java.io.IOException;

/**
 * @author Arturo Volpe
 * @since 4/26/18
 */
public class AppException extends RuntimeException {

	private final int number;

	public AppException(int number, String message) {
		super(message);
		this.number = number;
	}

	public AppException(int number, String message, IOException e) {
		super(message, e);
		this.number = number;
	}
}

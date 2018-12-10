package workshop.spring.boot.playerandteamworkshop.services;

public class PlayerNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 2842840981289103760L;

	public PlayerNotFoundException() {
		super("Player not found");
	}

	public PlayerNotFoundException(String message) {
		super(message);
	}

	public PlayerNotFoundException(Throwable cause) {
		super(cause);
	}

	public PlayerNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public PlayerNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

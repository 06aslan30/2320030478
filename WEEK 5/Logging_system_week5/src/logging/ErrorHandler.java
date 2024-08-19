package logging;

public class ErrorHandler extends LogHandler{

	public ErrorHandler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean canHandle(LogLevel level) {
		return level == LogLevel.ERROR;
	}

	@Override
	protected void log(String message) {
		System.out.println("ERROR: " + message);
	}

}

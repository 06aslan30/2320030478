package logging;

public class InfoHandler extends LogHandler{

	public InfoHandler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean canHandle(LogLevel level) {
		  return level == LogLevel.INFO;
	}

	@Override
	protected void log(String message) {
		System.out.println("INFO: " + message);
	}

}

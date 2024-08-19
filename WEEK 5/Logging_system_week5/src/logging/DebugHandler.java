package logging;

public class DebugHandler extends LogHandler{

	public DebugHandler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean canHandle(LogLevel level) {
		  return level == LogLevel.DEBUG;
	}

	@Override
	protected void log(String message) {
		  System.out.println("DEBUG: " + message);
		
	}

}

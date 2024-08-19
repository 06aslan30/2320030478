package logging;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Logger {
	
	    private List<Command> commands = new ArrayList<>();

	    public void addCommand(Command command) {
	        commands.add(command);
	    }

	    public void processCommands() {
	        Iterator<Command> iterator = commands.iterator();
	        while (iterator.hasNext()) {
	            Command command = iterator.next();
	            command.execute("");
	            iterator.remove();  // Optionally remove the command after processing
	        }
	    }
	}
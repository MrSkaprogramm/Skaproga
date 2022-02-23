public class TaxiController implements Controller, Serializable{
  /**
  * 
  */
  private static final long serialVersionUID = 8908941748525655826L;

  @Override
	public String doAction(String request) {
		String[] requestParts;
		requestParts = request.split(" +");
		String commandName = requestParts[0];
		
		CommandProvider commandProvider = new CommandProvider();
		Command command = commandProvider.getCommand(commandName);
		
        return command.execute(requestParts);
	}
}

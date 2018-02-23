package space.crab8012.textgamelib.handler.command;

class GameCommand{
    //This will be the base command.

    //Lets us know if the command is loaded.
    public boolean isLoaded(){
        return true;
    }

    public String getCommandString(){
        return "NULL";
    }

    public void executeCommand(){
        System.err.println("NULL COMMAND CALLED");
    }
}
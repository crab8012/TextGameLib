package space.crab8012.textgamelib.exception;

public InvalidCommandException extends Exception{
    public InvalidCommandException(){
        super("Invalid Command");
    }
    public InvalidCommandException(String message){
        super("Invalid Command - " + message);
    }
}
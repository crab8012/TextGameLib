package space.crab8012.textgamelib.exception;

public class InvalidNameCharacterException extends Exception{
    public InvalidNameCharacterException(){
        super("Invalid Character in Player Name");
    }
    public InvalidNameCharacterException(String message){
        super("Invalid Character in Player Name " + message);
    }
}
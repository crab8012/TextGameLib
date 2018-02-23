package space.crab8012.textgamelib.handler;

import java.util.Scanner;

import space.crab8012.textgamelib.command.GameCommand;
import space.crab8012.textgamelib.exception.InvalidNameCharacterException;

class InputHandler{
    //Space for Allowed Characters
    String nameAllowed = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ";
    
    //A Space where all commands registered with this InputHandler will go
    ArrayList<GameCommand> commands;

    public InputHandler(){
        commands = new ArrayList<GameCommand>(); //Instantiate the GameCommands arraylist.
        
        //Load in the commands
        commands.add(new GameCommand()); //Load in the base GameCommand.
        System.err.println("GameCommand Loaded: " + GameCommand.isLoaded()); //Let us know that the command is loaded.

        System.err.println("InputHandler Loaded"); //Let us know that the InputHandler is loaded. Keep at end of constructor.
    }

    //Handle when the game wants to get a player's name from the console, all at once
    public String inputPlayerName() throws InvalidNameCharacterException{
        String name = "";

        Scanner inputScanner = new Scanner(System.in);
        name += inputScanner.next();
        for(int i = 0; i < name.length(); i++){
            if(nameAllowed.indexOf(name.charAt(i)) == -1){
                throw new InvalidNameCharacterException("at" + name.charAt(i));
            } 
        }

        return name;
    }

    public GameCommand getCommand() throws InvalidCommandException{
        String commandString = "";
        Scanner inputScanner = new Scanner(System.in);
        commandString += inputScanner.next();
        for(int i = 0; i < commands.size(); i++){
            if(commandString.equalsIgnoreCase(commands.get(i).getCommandString())){
                return commands.get(i);
            }
        }
        throw new InvalidCommandException();
        return null;
    }
}
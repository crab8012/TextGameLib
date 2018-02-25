package space.crab8012.textgamelib.handler;

import java.util.Scanner;

import space.crab8012.textgamelib.command.GameCommand;
import space.crab8012.textgamelib.exception.InvalidNameCharacterException;
import space.crab8012.textgamelib.exception.InvalidCommandException;
import java.util.ArrayList;

class InputHandler{
    //Space for Allowed Characters
    String nameAllowed = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ";

    public InputHandler(){
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
}
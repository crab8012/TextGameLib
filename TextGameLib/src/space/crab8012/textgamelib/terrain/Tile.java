package space.crab8012.textgamelib.terrain;

public class Tile {
    private String name;
    private String description;
    
    public Tile(String name, String description){
        this.name = name;
        this.description = description;
        
    }
    public Tile(String name){
        this.name = name;
        this.description = "";
    }
    public Tile(){
        this.name = "INVALID TILE";
        this.description = "";
    }
    
    public String toString(){
        return(name + ": " + description);
    }
}

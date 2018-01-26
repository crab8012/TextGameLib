package space.crab8012.textgamelib.entity;

public class Entity {
    private String name;
    private int health;
    private int strength;
    
    public Entity(){
        this.name = "UNKNOWN ENTITY";
        this.health = 100;
        this.strength = 1;
    }
    public Entity(String name){
        this.name = name;
        this.health = 100;
        this.strength = 1;
    }
    public Entity(String name, int health){
        this.name = name;
        this.health = health;
        this.strength = 1;
    }
    public Entity(String name, int health, int strength){
        this.name = name;
        this.health = health;
        this.strength = strength;
    }
}

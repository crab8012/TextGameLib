package space.crab8012.textgamelib.item;

public class Item {
    private int durability;
    private int maxCount;
    private int count;
    private String name;
    
    public Item(){
        this.durability = 1;
        this.maxCount = 1;
        this.count = 1;
        this.name = "UNKNOWN ITEM";
    }
    public Item(String name){
        this.durability = 1;
        this.maxCount = 1;
        this.count = 1;
        this.name = name;
    }
    public Item(String name, int durability){
        this.durability = durability;
        this.maxCount = 1;
        this.count = 1;
        this.name = name;
    }
    public Item(String name, int count, int durability){
        this.durability = durability;
        this.maxCount = count;
        this.count = count;
        this.name = name;
    }
    public Item(String name, int count, int maxCount, int durability){
        this.durability = durability;
        this.maxCount = maxCount;
        this.count = count;
        this.name = name;
    }
    
    public int getDurability(){
        return durability;
    }
    public int getCount(){
        return count;
    }
    public int getMaxCount(){
        return maxCount;
    }
    public String getName(){
        return name;
    }
    public void setDurability(int newDurability){
        durability = newDurability;
    }
    public void increaseCount(int addedItems){
        count += addedItems;
    }
    public void decreaseCount(int takenItems){
        count -= takenItems;
    }
    public void printStats(){
        System.out.println(getName());
        System.out.println("Count: " + getCount() + "/" + getMaxCount());
        System.out.println("Durability: " + getDurability());
    }
}

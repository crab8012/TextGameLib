package space.crab8012.textgamelib.item;

import space.crab8012.textgamelib.entity.Entity;

public class CombatItem extends Item{
    private boolean damage;
    private boolean pierceArmour;
    private double armourPiercing;
    
    public void doDamage(Entity attacker, Entity defender){
        int damage = attacker.getStrength();
        defender.addHealth(-damage);
    }
}

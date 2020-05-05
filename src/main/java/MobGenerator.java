
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 0781317
 */
public class MobGenerator {

    private String mobName;
    private int mobHealth;
    private int mobAttackDamage;
    private String mobWeakness;
    private int playerLevel;

    public MobGenerator() {
        mobName = "";
        mobHealth = 0;
    }
    
    public MobGenerator(int playerLevel){
        this.playerLevel=playerLevel;
    }

    public String getMobName() {
        Random random = new Random();
        int number = random.nextInt();
        if (number % 2 == 0) {
            mobName="Rhonda The Furious";
        }else{
            mobName = "Suptic the Sad";
        }
        return mobName;
    }

    public void setMobName(String mobName) {
        this.mobName = mobName;
    }

    public int getMobHealth() {
        Random random = new Random();
        int number = random.nextInt(100);
        mobHealth = number*5;
        return mobHealth;
    }

    public void setMobHealth(int mobHealth) {
        this.mobHealth = mobHealth;
    }

    public int getMobAttackDamage() {
        mobAttackDamage = playerLevel*5;
        return mobAttackDamage;
    }

    public void setMobAttackDamage(int mobAttackDamage) {
        this.mobAttackDamage = mobAttackDamage;
    }

    public String getMobWeakness() {
        if(mobHealth<=150){
            mobWeakness = "Truthbound being: they are unable to lie";
        }else if(mobHealth>150&&mobHealth<=250){
            mobWeakness = "Gullible: they are easily manipulated";
        }else{
            mobWeakness = "Celestial Magic: they recieve 2x damage from celestial based spells";
        }
                
        return mobWeakness;
    }

    public void setMobWeakness(String mobWeakness) {
        this.mobWeakness = mobWeakness;
    }
    
    
    
    
    @Override
    public String toString(){
        return "Random Mob encounter:" + "\nMob Name: " + mobName+
                "\nHealth: " + mobHealth + "\nMob Attack Damage: " +
                mobAttackDamage + "\nMob Weakness: " + mobWeakness;
    }
    
}

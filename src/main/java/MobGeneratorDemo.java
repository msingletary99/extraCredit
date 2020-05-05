/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
public class MobGeneratorDemo {

    public static void main(String[] args) {
        MobGenerator random = new MobGenerator(7);
        random.getMobName();
        random.getMobHealth();
        random.getMobAttackDamage();
        random.getMobWeakness();
        System.out.println(random.toString());
        
        System.out.println("=============================================");
        
        MobGenerator random2 = new MobGenerator(15);
        random2.getMobName();
        random2.getMobHealth();
        random2.getMobAttackDamage();
        random2.getMobWeakness();
        System.out.println(random2.toString());

    }

}

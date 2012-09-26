/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package barn;

/**
 *
 * @author nurban
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instantiate a pig.
        Animal pig = new Pig();
        pig.introduce();
        pig.performFly();
        pig.performNoise();
        
        //instantiate a chicken.
        Animal chicken = new Chicken();
        chicken.introduce();
        chicken.performFly();
        chicken.performNoise();
        
        //instantiate a cow.
        Animal cow = new Chicken();
        cow.introduce();
        cow.performFly();
        cow.performNoise();
        
        //instantiate other animals...
    }
}

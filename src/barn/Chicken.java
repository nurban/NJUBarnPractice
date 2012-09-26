/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package barn;

/**
 *
 * @author nurban
 */
public class Chicken extends Animal{

    public Chicken() {
        flyBehavior = new FlyWithWings();
        soundBehavior = new ChickenNoise();
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm a chicken!");
    }
    
}

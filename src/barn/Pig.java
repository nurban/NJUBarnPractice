/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package barn;

/**
 *
 * @author nurban
 */
public class Pig extends Animal{

    public Pig() {
    flyBehavior = new FlyNotPossible();
    soundBehavior = new PigNoise();
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm a pig!");
    }
    
}

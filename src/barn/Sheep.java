/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package barn;

/**
 *
 * @author nurban
 */
public class Sheep extends Animal{

    public Sheep() {
        flyBehavior = new FlyNotPossible();
        soundBehavior = new SheepNoise();
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm a sheep!");
    }
    
}

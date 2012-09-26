/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package barn;

/**
 *
 * @author nurban
 */
public class Horse extends Animal{

    public Horse() {
        flyBehavior = new FlyNotPossible();
        soundBehavior = new HorseNoise();
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm a horse!");
    }
    
}

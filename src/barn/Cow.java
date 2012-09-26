/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package barn;

/**
 *
 * @author nurban
 */
public class Cow extends Animal {
    
    private int age;
    
    public Cow() {
        flyBehavior = new FlyWithJetPack();
        soundBehavior = new CowNoise();
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm a cow!");
    }
    
}

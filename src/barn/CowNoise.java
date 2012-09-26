/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package barn;

/**
 *
 * @author nurban
 */
public class CowNoise implements SoundBehavior{

    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }
    
}

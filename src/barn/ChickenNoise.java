/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package barn;

/**
 *
 * @author nurban
 */
public class ChickenNoise implements SoundBehavior{

    @Override
    public void makeSound() {
        System.out.println("cluck-cluuuck!");
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package barn;

/**
 *
 * @author nurban
 */
public class FlyNotPossible implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly...");
    }
    
}

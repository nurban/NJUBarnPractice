/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package barn;

/**
 *
 * @author nurban
 */
public abstract class Animal {
    
    //generate fly and sound behavior variables, which the subclasses instantiate
    //in their constructor to generate their performed behaviors. 
    FlyBehavior flyBehavior;
    SoundBehavior soundBehavior;
    
    //empty constructor.
    public Animal() {}
    
    //abstract class which all subclasses must use to introduce themselves.
    public abstract void introduce();

    //when called by startup class, this allows the subclass' performed noise to
    //be outputted.
    public void performNoise() {
        soundBehavior.makeSound();
    }
    //when called by startup class, this allows the subclass' performed flight method to
    //be outputted.
    public void performFly() {
        flyBehavior.fly();
    }
}

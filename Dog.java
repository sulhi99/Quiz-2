/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author H P
 */
public class Dog extends Animals {
    
    String dog;
    
    public Dog(String dog) {
        this.dog = dog; //To change body of generated methods, choose Tools | Templates.
    }

    public void introduceYourself() {
        System.out.println("Woof. I am a dog. My name is " + dog); //To change body of generated methods, choose Tools | Templates.
    }
}

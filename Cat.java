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
public class Cat extends Animals {

    String cat;

    public Cat(String cat) {
        this.cat = cat; //To change body of generated methods, choose Tools | Templates.
    }

    public void introduceYourself() {
        System.out.println("Meow. I am a cat. My name is " + cat);
    }
}

//Animal Sound Polymorphism
//Create a class "Animal" and subclasses "Dog" and "Cat". Override a method to make each animal make a sound.

package Test_OOPs;

public class Challenge5 {
    public static void main(String[] args) {
    Animal d = new Dog();
    Animal c = new Cat();
    d.makeSound();
    c.makeSound();
    }
}

class Animal{
 void  makeSound(){

 }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog says: Woof! Woof!");

    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat says: Meow! Meow!");
    }
}

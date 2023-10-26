//Creating the superclass/baseclass Animal with a method makeSound
public class Animal {
    public static void main(String[] args) {
        //Testing the animal class
		Animal animal = new Animal();
		animal.makeSound();

		Animal cat = new Cat();
		cat.makeSound();

		Animal dog = new Dog();
		dog.makeSound();
    }
	public void makeSound() {
		System.out.println("Animal makes a sound.");
	}
}

//Creating the subclasses of the superclass Animal 
//Cat and Dog that will override the superclass method makeSound according to their convinience.

class Cat extends Animal {
	@Override
	public void makeSound(){
		System.out.println("The Cat meows.");
	}
}
class Dog extends Animal {
	@Override
	public void makeSound(){
		System.out.println("The Dog barks.");
	}
}
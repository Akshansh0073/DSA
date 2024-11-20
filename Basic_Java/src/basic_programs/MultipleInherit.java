package basic_programs;

class Animal {
void eat() {
System.out.println("This animal eats food.");
}
}
class Mammal extends Animal {
void breathe() {
System.out.println("Mammals breathe air.");
}
}
class Dog extends Mammal {
void bark() {
System.out.println("Dogs bark.");
}
}

public class MultipleInherit {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.breathe();
		dog.bark();

	}

}
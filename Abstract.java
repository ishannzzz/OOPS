
    abstract class Animal {

        abstract void sound();
        
        void eat() {
            System.out.println("This animal eats food.");
        }
    }

    class Dog extends Animal {

        void sound() {
            System.out.println("Dog says: Woof!");
        }
    }
    public class Abstract {
        public static void main(String[] args) {
            Dog myDog = new Dog();
            myDog.sound();
            myDog.eat();
        }
    }



public class Inheritance {

    public void main(String... args)
    class Vehicle {
        protected String brand = "Ford";
        public void honk() {
            System.out.println("Tuut, tuut!");
        }
    }
    class Car extends Vehicle {
        private String modelName = "Mustang";
        public void main(String[] args) {
            Car myCar = new Car();
            myCar.honk();
            System.out.println(myCar.brand + " " + myCar.modelName);
        }
    }
}

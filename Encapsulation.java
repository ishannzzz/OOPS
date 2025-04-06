class Person {
    private String name;
    private int age;
    public void setName(String newName) {
            name = newName;
        }
        public String getName() {
            return name;
        }
        public void setAge(int newAge) {
            age = newAge;
        }
        public int getAge() {
            return age;
        }
    }
    public class Encapsulation {
        public static void main(String[] args) {
            Person p1 = new Person();
            p1.setName("John");
            p1.setAge(25);

            System.out.println("Name: " + p1.getName());
            System.out.println("Age: " + p1.getAge());
        }
    }



public class Calculator {
        int a, b;
        Calculator(int x, int y) {
            a = x;
            b = y;
        }
        void add() {
            int sum = a + b;
            System.out.println("Sum = " + sum);
        }
        public static void main(String[] args) {
            Calculator obj = new Calculator(10, 20);
            obj.add();
        }
    }



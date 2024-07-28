package Aston;

class FactorialExample {
    public static int main(int args) {
        int number = 5;
        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        System.out.println("Факториал " + number + " равен: " + fact);
        return number;
    }
}

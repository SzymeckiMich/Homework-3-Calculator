public class CalcTest {
    public static void main(String[] args) {
        int k = 7;
        double z = 8;
        Calculator calculator = new Calculator();
        System.out.println("Is the number Even: " + calculator.isEven(k));
        System.out.println("Is the number Odd: " + calculator.isOdd(k));
        System.out.println("Circle field with a radius of a " + z + " = " + calculator.circleField(z));
        System.out.println(k + " to the power of 2 = "+calculator.power(k));
    }

}

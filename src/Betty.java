import java.util.Scanner;

public class Betty {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("Enter the value for side");
        double sum = s.nextDouble();
        System.out.println("Enter num");
        double num = s.nextDouble();


        double Area;


        Area = num * ( sum * sum) /(4 * Math.tan(3.14/num));

        System.out.printf("%f", Area);

        

    }
}

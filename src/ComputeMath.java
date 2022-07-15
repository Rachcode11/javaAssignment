public class ComputeMath {
    public static void main(String[] args) {
      //  james();
        //kemi();
        //anu();
        ire();
       // abike();
    }
    public static void james(){
        System.out.println();
        double a;
        double b;
        a = 4 *(1.0 -(1.0 /3.0) + (1.0 / 5.0) - (1.0 /7.0) + ( 1.0 / 9.0) - (1.0 / 11.0) + ( 1.0 / 13.0));
        b = 4 * (1.0 -(1.0 / 3.0) + (1.0 / 5.0) - (1.0 / 7.0) + ( 1.0 / 9.0) - (1.0 / 11.0));
        System.out.printf("This a is %.2f%n The b is %.2f", a, b);
    }
    public static void kemi(){
        double perimeter;
        double area;
        perimeter = 2 * 5.5 * 3.14;
        area = 5.5 * 5.5 * 3.14;
        System.out.printf("The area is %.2f%nThe perimeter is %.2f ", area, perimeter);


    }
    public static void anu(){
        double area;
        area = 4.5 * 7.9;
        System.out.printf("%n%.2f", area);

    }
    public static void ire(){
        double average;
        average = 8.75 / 0.7583;
        System.out.printf("%n%.2f", average);

    }
    public static void abike(){
        double born = 31_536_000 / 7.0;
        double death = 31_536_000 / 13.0;
        double immigrant = 31_536_000 / 45.0;

        int currentpopulation = 312032486;
        double population = born + immigrant - death;
        for(int i = 1; i < 5; i++) {
            double currentpopulation1 = currentpopulation + population;
            System.out.println(i +" year population is :" + currentpopulation1 * i);
        }




    }
}

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int myNum = 0;
        for(int i = 0; i < 10; i++){
            System.out.println("Please enter any number");
            myNum = input.nextInt();
            if(myNum % 2 == 0){
                System.out.printf("%d num is not a prime number %n", myNum);
            } else {
                System.out.printf("%d num is a prime number %n", myNum);
            }
        }

    }

    }



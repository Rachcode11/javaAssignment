import java.security.SecureRandom;

public class InIt {
    public static void main(String[] args) {
        //  ade();
        // abike();
        // jaime();
        // Barchart();
       // Rolldice();
        StudentPoll();
        int[] array = new int[10];
        System.out.printf("%s%8s%n", "Index", "Value");
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }

    public static void ade() {
        int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

        System.out.printf("%s%8s%n", "index", "value");
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }

    public static void abike() {
        final int array_length = 10;
        int[] array = new int[array_length];
        for (int counter = 0; counter < array_length; counter++) {
            array[counter] = 2 + 2 * counter;
        }
        System.out.printf("%s%8s%n", "index", "value");

        for (int counter = 0; counter < array_length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);

        }
    }

    public static void jaime() {
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;
        for (int counter = 0; counter < array.length; counter++) {
            total += array[counter];
        }
        System.out.printf("total of array elementa : %d%n", total);
    }

    public static void Barchart() {
        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        System.out.println("Grade contribution");

        for (int counter = 0; counter < array.length; counter++) {
            if (counter == 10) {
                System.out.printf("%5d:  ", 100);
            } else {
                System.out.printf("%02d - %02d:  ",
                        counter * 10, counter * 10 + 9);
            }
            for (int star = 0; star < array[counter]; star++) {
                System.out.print(" * ");

            }
        }
    }

    public static void Rolldice() {
        SecureRandom randomNumber = new SecureRandom();
        int[] frequency = new int[7];
        for (int roll = 0; roll <= 60_000_000; roll++) {
            ++frequency[1 + randomNumber.nextInt(6)];
        }
        System.out.printf("%s%10s%n", "face", "frequency");

        for (int face = 1; face < frequency.length; face++) {
            System.out.printf("%4d%10d%n", face, frequency[face]);
        }
    }

    public static void StudentPoll() {
        int[] response = {1, 2, 5, 4, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        int[] frequency = new int[6];
        for (int answer = 0; answer < response.length; answer++) {
            try {
                ++frequency[response[answer]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf("  response[%d] = %d%n%n",
                        answer, response[answer]);

            }
        }
        System.out.printf("%s%10s%n", "Rating", "Frequency");
        for (int rating = 0; rating < frequency.length; rating++) {
            System.out.printf("%6d%10d%n", rating, frequency[rating]);

        }
    }
    public static void DeckCard() {

    }

}



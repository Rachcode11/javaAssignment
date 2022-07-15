public class AverageArrayTest {
    public static void main(String[] args) {
james();
    }
        public static void james(){
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
            int sum = 0;
            int counter;
            for(counter = 0; counter < array.length; counter++){
                sum = sum + array[counter];
            }
            double avg = (double) sum / counter;

            System.out.printf("Average of array values is %.2f", avg);

        }




    }


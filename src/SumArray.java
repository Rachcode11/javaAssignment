public class SumArray {
    public static void main(String[] args) {
        int [] array = {2,4,6,8,10,12,14};
        int total = 0;
        for(int i : array) {
            total += i;
        }
        System.out.printf("Total of array elements: %d%n", total);

    }
}

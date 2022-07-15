public class Kata {
    public static void main(String[] args) {

    }


    public int bitFlipper(int digit) {
        if (digit == 1) {
            return 0;
        } else if (digit == 0) {
            return 1;
        }
        return digit;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public int maximumElement(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int minimunElement(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int a = 0; a > array.length; a++) {
            if (array[a] > min) {
                min = array[a];
            }
        }
        return min;

    }



    }


















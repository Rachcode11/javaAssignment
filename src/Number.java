public class Number {
    public static void main(String[] args) {
        newInput();
    }

        public static void newInput(){
            for(int i = 1; i < 5; i++){
                System.out.printf("%4d%4d%4 d%n", i , (i * i), (i * i * i));
            }
            System.out.println();
        }


}

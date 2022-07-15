public class SevenSegment {

    static String [][] sevenSegment = new String[5][4];

    private static void setA(){
      sevenSegment[0][0] = "# ";
      sevenSegment[0][1] = "# ";
      sevenSegment[0][2] = "# ";
      sevenSegment[0][3] = "# ";
    }

    private static void setB(){
        sevenSegment[0][3] = "# ";
        sevenSegment[1][3] = "# ";
        sevenSegment[2][3] = "# ";
    }

    private static void setC(){
        sevenSegment[2][3] = "# ";
        sevenSegment[3][3] = "# ";
        sevenSegment[4][3] = "# ";
    }

    private static void setD(){
        sevenSegment[4][0] = "# ";
        sevenSegment[4][1] = "# ";
        sevenSegment[4][2] = "# ";
        sevenSegment[4][3] = "# ";
    }

    private static void setE(){
        sevenSegment[2][0] = "# ";
        sevenSegment[3][0] = "# ";
        sevenSegment[4][0] = "# ";
    }

    private static void setF(){
        sevenSegment[0][0] = "# ";
        sevenSegment[1][0] = "# ";
        sevenSegment[2][0] = "# ";
    }

    private static void setG(){
        sevenSegment[2][0] = "# ";
        sevenSegment[2][1] = "# ";
        sevenSegment[2][2] = "# ";
        sevenSegment[2][3] = "# ";
    }

    public static void setScreen(String input){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                sevenSegment[i][j] = "  ";
            }
        }

        if (input.charAt(7) == '1'){
            if (input.charAt(0) == '1'){
                setA();
            }
            if (input.charAt(1) == '1'){
                setB();
            }
            if (input.charAt(2) == '1'){
                setC();
            }
            if (input.charAt(3) == '1'){
                setD();
            }
            if (input.charAt(4) == '1'){
                setE();
            }
            if (input.charAt(5) == '1'){
                setF();
            }
            if (input.charAt(6) == '1'){
                setG();
            }
        }
    }

    public static void display(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(sevenSegment[i][j] + " ");
            }
            System.out.println();
        }
    }
}

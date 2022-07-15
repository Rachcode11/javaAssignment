import java.sql.SQLOutput;
import java.util.Scanner;
public class MeyerBrigg {

        static Scanner scanner = new Scanner(System.in);
        static String userInput;
        static int countA1;
        static int countB1;
        static int countA2;
        static int countB2;
        static int countA3;
        static int countB3;
        static int countA4;
        static int countB4;
        static int countA5;
        static int countB5;


        public static void main(String[] args) {
            questionnaire();
            questionnaireResult();

        }

        private static void questionnaire() {
            for (int i = 1; i < 20; i++) {
                System.out.println("choose either A or B");
                switch (i) {
                    case 1:
                        System.out.println("""
                            1.
                            A. Expend energy, Enjoy Groups
                            B. Conserve Energy, Enjoy One-On-One
                            """);
                        userInput = scanner.nextLine();
                        if (userInput.equalsIgnoreCase("A")) {
                            countA1++;
                        } else
                            countB1++;
                        break;
                    case 2:
                        System.out.println("""
                            2.
                            A.Interpret, literally
                            B.Look for meaning and possibillities
                            """);
                        userInput = scanner.nextLine();
                        if (userInput.equalsIgnoreCase("A")) {
                            countA2++;
                        } else
                            countB2++;
                        break;

                    case 3: {
                        System.out.println("""
                            3.
                            A.Logical, thinking, questioning
                            B.Empathetic, fearing, accommodating
                            """);
                        userInput = scanner.nextLine();
                        if (userInput.equalsIgnoreCase("A")) {
                            countA3++;
                        } else
                            countB3++;
                    }
                    break;

                    case 4: {
                        System.out.println("""
                            4.
                            A.Organized, orderly
                            B.Flexible, adaptable
                            """);
                        userInput = scanner.nextLine();
                        if (userInput.equalsIgnoreCase("A")) {
                            countA4++;
                        } else
                            countB4++;
                    }
                    break;


                    case 5: {
                        System.out.println("""
                            5. 
                            A. More outgoing, think out loud 
                            B. More reserved, think to yourself
                            """);
                        userInput = scanner.nextLine();
                        if (userInput.equalsIgnoreCase("A")) {
                            countA5++;
                        } else
                            countB5++;
                    }
                    break;

                    case 6: {
                        System.out.println("""
                            6. 
                            A. Practical, realistic, experimental 
                            B. Immaginative, innovative
                            """);
                        userInput = scanner.nextLine();
                        if (userInput.equalsIgnoreCase("A")) {
                            countA1++;
                        } else
                            countB1++;
                    }
                    break;

                    case 7: {
                        System.out.println("""
                            7.
                            A. Candid,straight forward, frank
                            B. Tactful, kind, encouraging
                            """);
                        userInput = scanner.nextLine();
                        if (userInput.equalsIgnoreCase("A")) {
                            countA2++;
                        } else
                            countB2++;
                    }
                    break;

                    case 8: {
                        System.out.println("""
                            8.
                            A. Plan, Schedule
                            B. unplanned, spontaneous
                            """);
                        userInput = scanner.nextLine();
                        if (userInput.equalsIgnoreCase("A")) {
                            countA3++;
                        } else
                            countB3++;
                    }
                    break;

                    case 9: {
                        System.out.println("""
                            9.
                            A. Seek many tasks, public activities, interaction with others
                            B. Seek private, solitary activities with quiet to concentrate
                            """);
                        userInput = scanner.nextLine();
                        if (userInput.equalsIgnoreCase("A")) {
                            countA4++;
                        } else
                            countB4++;
                    }
                    break;

                    case 10: {
                        System.out.println("""
                            10.
                            A. Standard,usual,conventional
                            B. Different,novel,unique
                            """);
                        userInput = scanner.nextLine();
                        if (userInput.equalsIgnoreCase("A")) {
                            countA5++;
                        } else
                            countB5++;
                    }
                    break;

                    case 11: {
                        System.out.println("""
                            11.
                            A. Firm, tend to criticize, hold the line
                            B. Gentle,tend to appreciate, concilliate
                            """);
                        userInput = scanner.nextLine();
                        if (userInput.equalsIgnoreCase("A")) {
                            countA1++;
                        } else
                            countB1++;
                    }
                    break;

                    case 12: {
                        System.out.println("""
                            12.
                            A. Regulated, Structured
                            B. Easygoing, live and let live
                            """);
                        userInput = scanner.nextLine();
                        if (userInput.equalsIgnoreCase("A")) {
                            countA2++;
                        } else
                            countB2++;
                    }
                    break;

                    case 13: {
                        System.out.println("""
                            13.
                            A. External, communicative, express yourself
                            B. Internal, reticent,keep to yourself
                            """);
                        userInput = scanner.nextLine();
                        if (userInput.equalsIgnoreCase("A")) {
                            countA3++;
                        } else
                            countB3++;
                    }
                    break;

                    case 14: {
                        System.out.println("""
                            14.
                            A.Focus on here and now
                            B.Look to the future, global perspective,"big picture"
                            """);
                        userInput = scanner.nextLine();
                        if (userInput.equalsIgnoreCase("A")) {
                            countA4++;
                        } else
                            countB4++;
                    }
                    break;

                    case 15: {
                        System.out.println("""
                            15.
                            A.Tough minded, just
                            B.Tend hearted, merciful
                            """);
                        userInput = scanner.nextLine();
                        if (userInput.equalsIgnoreCase("A")) {
                            countA5++;
                        } else
                            countB5++;
                    }
                    break;

                    case 16: {
                        System.out.println("""
                            16.
                            A. Preparation, plan ahead
                            B.Go with the flow, adapt as you go
                            """);
                        userInput = scanner.nextLine();
                        if (userInput.equalsIgnoreCase("A")) {
                            countA1++;
                        } else
                            countB1++;
                    }
                    break;

                    case 17: {
                        System.out.println("""
                            17.
                            A.Active, initiate
                            B.Reflective, deliberate
                            """);
                        userInput = scanner.nextLine();
                        if (userInput.equalsIgnoreCase("A")) {
                            countA2++;
                        } else
                            countB2++;
                    }
                    break;

                    case 18: {
                        System.out.println("""
                            18.
                            A.Facts, thing,"what is"
                            B.Ideas, dreams,"what could be," philosophical
                            """);
                        userInput = scanner.nextLine();
                        if (userInput.equalsIgnoreCase("A")) {
                            countA3++;
                        } else
                            countB3++;
                    }
                    break;

                    case 19: {
                        System.out.println("""
                            19.
                            A.Matter of fact, issue-oriented
                            B.Sensitive, people-oriented, compassionate
                            """);
                        userInput = scanner.nextLine();
                        if (userInput.equalsIgnoreCase("A")) {
                            countA4++;
                        } else
                            countA4++;
                    }
                    break;

                    case 20: {
                        System.out.println("""
                            20.
                            A.Control, Govern
                            B.Latitude, Freedom
                            """);
                        userInput = scanner.nextLine();
                        if (userInput.equalsIgnoreCase("A")) {
                            countA5++;
                        } else
                            countB5++;
                    }
                }
            }
        }

        private static void questionnaireResult() {
            if (countA1 > countB1) {
                System.out.print("E");
            } else
                System.out.print("I");
            if(countA2 > countB2) {
                System.out.print("S");
            } else
                System.out.print("N");
            if(countA3 > countB3) {
                System.out.print("T");
            }else
                System.out.print("F");
            if(countA4 > countB4) {
                System.out.print("J");
            }else
                System.out.print("P");



        }








}


import java.util.Scanner;

public class Game {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nWelcome to Mind Game");
        System.out.println("\nEnter your Name please");
        String a = in.nextLine();
        System.out.print("\nThank You " + a);
        System.out.println(" Select Any Option to test yourself");
        System.out.println("\n1) Test how much you are Friendly ");
        System.out.println("2) Test how much you are Angry");
        System.out.println("3) Test how much you are Lazy");
        System.out.println("4) Test how much you are Hard Worker");
        System.out.println("5) Test how much you are Facebook Addicted");
        int bb = in.nextInt();
        if (bb == 1) {
            int a1 = 0;
            System.out.println("You wanted to test  How much you are Friendly");
            System.out.println("Now carefully answer the given questions then you will "
                    + "\nget the answer which will inform you how much you are friendly.");
            System.out.println("\n1) If one of your friend wants some money from you"
                    + "what you will do?"
                    + "\n 1)I will give money.\n 2)I will refuse to give money."
                    + "\n 3)I will give money with condition.\n 4)I will advise him to take that money from others."
                    + "\nYour Answer?? ");

            int c = in.nextInt();

            if (c == 1) {
                a1 = a1 + 4;
            } else if (c == 2) {
                a1 = a1 + 1;
            } else if (c == 3) {
                a1 = a1 + 3;
            } else if (c == 4) {
                a1 = a1 + 2;
            } else {
                System.out.println("Please select  from 1 to 4");
            }
            System.out.println("\n2)If one of your friend get accident what you will do??"
                    + "\n 1)I will take him to hospital as soon as possible."
                    + "\n 2)I will do nothing and go to home."
                    + "\n 3)I will call the ambulance and sit beside my friend till the"
                    + " ambulance come."
                    + "\n 4)I will call the versity autority."
                    + "\nYour Answer?? ");
            int d = in.nextInt();

            if (d == 1) {
                a1 = a1 + 4;
            } else if (d == 2) {
                a1 = a1 + 1;
            } else if (d == 3) {
                a1 = a1 + 3;
            } else if (d == 4) {
                a1 = a1 + 2;
            } else {
                System.out.println("Please select  from 1 to 4");
            }
            System.out.println("\n3)If one of your friend Ask you to go to the market with him "
                    + "what you will do??"
                    + "\n 1)I will refuse to go."
                    + "\n 2)I will go."
                    + "\n 3)I will go with condition."
                    + "\n 4)I will advise him to go with other friend."
                    + "\nYour Answer??");
            int e = in.nextInt();

            if (e == 1) {
                a1 = a1 + 1;
            } else if (e == 4) {
                a1 = a1 + 1;
            } else if (e == 3) {
                a1 = a1 + 2;
            } else if (e == 4) {
                a1 = a1 + 3;
            } else {
                System.out.println("Please select  from 1 to 4");
            }
            System.out.println("\n RESULT\n");
            if (a1 <= 4) {
                System.out.println("You are totally not friendly minded. Its sure that you have not any real friend. You "
                        + "\n have to change your behavior otherwise you will suffer in future.");
            } else if (a1 > 4 && a1 < 7) {
                System.out.println("You are a little friendly minded. you should love your friends more than now");
            } else if (a1 > 6 && a1 < 10) {
                System.out.println("You are perfect friendly minded. Very good. ");
            } else if (a1 > 9 && a1 <= 12) {
                System.out.println("You are so much friendly. And thats why sometimes your friends may use you"
                        + "\n in their problems. You should be carefull in making good friends and  not to act a good friend to all");
            }
        } else if (bb == 2) {

            int a2 = 0;
            System.out.println("You wanted to test  How much you are Angry");
            System.out.println("Now carefully answer the given questions then you will "
                    + "\nget the answer which will inform you how much you are Angry.");
            System.out.println("\n1)If one of your friend forget to bring a book which is given by you then what you will do??"
                    + "\n 1)you will be very angry on him and slang him."
                    + "\n 2)You will say its ok. bring it next day. "
                    + "\n 3)You order him to go to his home and to  bring it."
                    + "\n 4)You will punish him for that"
                    + "\nYour Answer??");
            int c = in.nextInt();

            if (c == 1) {
                a2 = a2 + 4;
            } else if (c == 2) {
                a2 = a2 + 1;
            } else if (c == 3) {
                a2 = a2 + 2;
            } else if (c == 4) {
                a2 = a2 + 3;
            } else {
                System.out.println("Please select  from 1 to 4");
            }
            System.out.println("\n2)If one of your friend Ask you to go to the market with him in your busy time  "
                    + "what you will do??"
                    + "\n 1)I will refuse to go."
                    + "\n 2)I will go."
                    + "\n 3)I will go with condition."
                    + "\n 4)I will advise him to go with other friend."
                    + "\nYour Answer??");
            int e = in.nextInt();

            if (e == 1) {
                a2 = a2 + 4;
            } else if (e == 2) {
                a2 = a2 + 1;
            } else if (e == 3) {
                a2 = a2 + 2;
            } else if (e == 4) {
                a2 = a2 + 3;
            } else {
                System.out.println("Please select  from 1 to 4");
            }
            System.out.println("\n3)If one of anyone say something wrong about you then what you will do??"
                    + "\n 1)I will do nothing."
                    + "\n 2)I will take action against him."
                    + "\n 3)I will tell him not to say wrong about anyone."
                    + "\n 4)I will also say wrong thing about him"
                    + "\nYour Answer??");
            int g = in.nextInt();
            if (g == 1) {
                a2 = a2 + 4;
            } else if (g == 2) {
                a2 = a2 + 1;
            } else if (g == 3) {
                a2 = a2 + 2;
            } else if (g == 4) {
                a2 = a2 + 3;
            } else {
                System.out.println("Please select  from 1 to 4");
            }
            System.out.println("\n RESULT\n");
            if (a2 <= 4) {
                System.out.println("Very good. you are not a angry man. But sometime be angry is needed.");
            } else if (a2 > 4 && a2 < 7) {
                System.out.println("You are a little angry minded. But you have the control of your angry mind");
            } else if (a2 > 6 && a2 < 10) {
                System.out.println("You are a angry man. If you try you can be control over it. ");
            } else if (a2 > 9 && a2 <= 12) {
                System.out.println("You are totally angry minded. It is very bad habit. You must have to control "
                        + "your angru otherwise it will sometimes not go with you.");
            }
        } else if (bb == 3) {
            int a3 = 0;
            System.out.println("You wanted to test  How much you are Lazy");
            System.out.println("Now carefully answer the given questions then you will "
                    + "\nget the answer which will inform you how much you are Lazy.");
            System.out.println("\n1)If one of your friend Ask you to go to the market with him in your free time  "
                    + "what you will do??"
                    + "\n 1)I will refuse to go."
                    + "\n 2)I will go."
                    + "\n 3)I will go with condition."
                    + "\n 4)I will advise him to go with other friend."
                    + "\nYour Answer??");
            int f = in.nextInt();

            if (f == 1) {
                a3 = a3 + 4;
            } else if (f == 2) {
                a3 = a3 + 1;
            } else if (f == 3) {
                a3 = a3 + 2;
            } else if (f == 4) {
                a3 = a3 + 3;
            } else {
                System.out.println("Please select  from 1 to 4");
            }
            System.out.println("\n2)If your mom ask you to do some important work what will your respose?/"
                    + "\n 1)I will do as soon as possible."
                    + "\n 2)I will refuse to do."
                    + "\n 3)I will do later."
                    + "\n 4)I will say to ask other to do that work."
                    + "\nYour Answer??");
            int h = in.nextInt();

            if (h == 1) {
                a3 = a3 + 1;
            } else if (h == 2) {
                a3 = a3 + 4;
            } else if (h == 3) {
                a3 = a3 + 2;
            } else if (h == 4) {
                a3 = a3 + 3;
            } else {
                System.out.println("Please select  from 1 to 4");
            }
            System.out.println("\n3)What you normally do in your free time??"
                    + "\n 1)Play game with friend."
                    + "\n 2)Read story book"
                    + "\n 3)Work in gardening."
                    + "\n 4)Sleeping"
                    + "\nYour Answer??");
            int i = in.nextInt();

            if (i == 1) {
                a3 = a3 + 3;
            } else if (i == 2) {
                a3 = a3 + 2;
            } else if (i == 3) {
                a3 = a3 + 1;
            } else if (i == 4) {
                a3 = a3 + 4;
            } else {
                System.out.println("Please select  from 1 to 4");
            }
            System.out.println("\n RESULT\n");
            if (a3 <= 4) {
                System.out.println("You are not a  lazy man.");
            } else if (a3 > 4 && a3 < 7) {
                System.out.println("You are a  lazy man But you can be hard worker if you wish.");
            } else if (a3 > 6 && a3 < 10) {
                System.out.println("You are 50-50 lazy man. ");
            } else if (a3 > 9 && a3 <= 12) {
                System.out.println("You are a very lazy man at all. Its very bad.");
            }

        } else if (bb == 4) {

            int a4 = 0;
            System.out.println("You wanted to test  How much you are Hard  worker.");
            System.out.println("Now carefully answer the given questions then you will "
                    + "\nget the answer which will inform you how much you are Hard worker.");
            System.out.println("\n1)What you normally do in your free time??"
                    + "\n 1)Play game with friend."
                    + "\n 2)Read story book"
                    + "\n 3)Work in gardening."
                    + "\n 4)Sleeping"
                    + "\nYour Answer??");
            int i = in.nextInt();

            if (i == 1) {
                a4 = a4 + 3;
            } else if (i == 2) {
                a4 = a4 + 2;
            } else if (i == 3) {
                a4 = a4 + 1;
            } else if (i == 4) {
                a4 = a4 + 4;
            } else {
                System.out.println("Please select  from 1 to 4");
            }
            System.out.println("\n1)If one of your friend Ask you to go to the market with him in your free time  "
                    + "what you will do??"
                    + "\n 1)I will refuse to go."
                    + "\n 2)I will go."
                    + "\n 3)I will go with condition."
                    + "\n 4)I will advise him to go with other friend."
                    + "\nYour Answer??");
            int f = in.nextInt();

            if (f == 1) {
                a4 = a4 + 4;
            } else if (f == 2) {
                a4 = a4 + 1;
            } else if (f == 3) {
                a4 = a4 + 2;
            } else if (f == 4) {
                a4 = a4 + 3;
            } else {
                System.out.println("Please select  from 1 to 4");
            }
            System.out.println("\n2)If your mom ask you to do some important work what will your respose?/"
                    + "\n 1)I will do as soon as possible."
                    + "\n 2)I will refuse to do."
                    + "\n 3)I will do later."
                    + "\n 4)I will say to ask other to do that work."
                    + "\nYour Answer??");
            int h = in.nextInt();

            if (h == 1) {
                a4 = a4 + 1;
            } else if (h == 2) {
                a4 = a4 + 4;
            } else if (h == 3) {
                a4 = a4 + 2;
            } else if (h == 4) {
                a4 = a4 + 3;
            } else {
                System.out.println("Please select  from 1 to 4");
            }
            System.out.println("\n RESULT\n");
            if (a4 <= 4) {
                System.out.println("You are very hard worker at all.");
            } else if (a4 > 4 && a4 < 7) {
                System.out.println("You are a  lazy man But you can be hard worker if you wish.");
            } else if (a4 > 6 && a4 < 10) {
                System.out.println("You are 50-50 hard worker. ");
            } else if (a4 > 9 && a4 <= 12) {
                System.out.println("You are not hard worker. Its very bad.");
            }

        } else if (bb == 5) {

            int a5 = 0;
            System.out.println("You wanted to test  How much you are Facebook Addicted.");
            System.out.println("Now carefully answer the given questions then you will "
                    + "\nget the answer which will inform you how much you are Facebook Addicted.");
            System.out.println("\n1)How much time you spend in facebook in a day??"
                    + "\n 1)1 hour."
                    + "\n 2)3 hours."
                    + "\n 3)5 hours."
                    + "\n 4)6 hours."
                    + "\nYour Answer??");
            int h = in.nextInt();

            if (h == 1) {
                a5 = a5 + 1;
            } else if (h == 2) {
                a5 = a5 + 2;
            } else if (h == 3) {
                a5 = a5 + 3;
            } else if (h == 4) {
                a5 = a5 + 4;
            } else {
                System.out.println("Please select  from 1 to 4");
            }
            System.out.println("\n2)Why you use facebook??"
                    + "\n 1)For getting university updates."
                    + "\n 2)Its very interesting thats why am use facebook."
                    + "\n 3) 3)My friends use facebook so I also use itr."
                    + "\n 4)I dont know."
                    + "\nYour Answer??");
            int i = in.nextInt();

            if (i == 1) {
                a5 = a5 + 1;
            } else if (i == 2) {
                a5 = a5 + 4;
            } else if (i == 3) {
                a5 = a5 + 3;
            } else if (i == 4) {
                a5 = a5 + 2;
            } else {
                System.out.println("Please select  from 1 to 4");
            }
            System.out.println("\n3)Can you leave facebook for 7 days??"
                    + "\n 1)No never!"
                    + "\n 2)Not sure about it."
                    + "\n 3)Yes I can."
                    + "\n 4)I can try."
                    + "\nYour Answer??");
            int j = in.nextInt();

            if (j == 1) {
                a5 = a5 + 4;
            } else if (j == 2) {
                a5 = a5 + 2;
            } else if (j == 3) {
                a5 = a5 + 1;
            } else if (j == 4) {
                a5 = a5 + 3;
            } else {
                System.out.println("Please select  from 1 to 4");
            }
            System.out.println("\n RESULT\n");
            if (a5 <= 4) {
                System.out.println("You are not Facebook Addicted.");
            } else if (a5 > 4 && a5 < 7) {
                System.out.println("You are little facebook Addicted");
            } else if (a5 > 6 && a5 < 10) {
                System.out.println("You are going to Addicted with facebook. Control it. ");
            } else if (a5 > 9 && a5 <= 12) {
                System.out.println("You are fully Addicted with facebook.");
            }

        }
    }
}

public class Main {
    //init variable

    public static void main(String[] args) {
        //Init variable
        int i = 0;
        int j = 0;

        //Count from 0 to 30
        System.out.println("A loop that counts up by 1 from 0 to 30.");
        for (i = 0; i <= 30; i++) {
            System.out.println(i);
        }

        //Count down from 30 to 0
        System.out.println("A loop that counts down by 1 from 30 to 0.");
        for (i = 30; i >= 0; i--) {
            System.out.println(i);
        }

        //Count up by 3 from 0 to 18
        System.out.println("A loop that counts up by 3 from 0 to 18.");
        for (i = 0; i <= 18; i += 3) {
            System.out.println(i);
        }

        //Count down by 2 from 10
        System.out.println("A loop that counts down 2 from 10 to 0.");
        for (i = 10; i >= 0; i -= 2) {
            System.out.println(i);
        }

        //Nested loop that draws star figure 1
        for (i = 1; i <= 5; i++) {
            //Separate loop to print out 1 more star per line until the j variable exceeds the i variable
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //Print line break
            System.out.println();
        }

        //Nested loop that draws star figure 2
        for (i = 5; i >= 0; i--) {
            //Separate loop to print out 1 less star per line (beginning at 5) until the j variable is less than i variable
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            //Print line break
            System.out.println();
        }

        //Nested loop that draws star figure 3
        //This loop is essentially just making sure there are 5 lines.
        for (i = 1; i <= 5; i++) {
            //Loop is same as above this time but different variable. This part prints the 5 stars.
            for (j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            //Print line break
            System.out.println();
        }




        //Some lines so the K doesn't touch the previous shape
        System.out.println();
        System.out.println();

        //print a capital letter K
        //Make the K 12 lines tall. This took tweaking to make the K look the least weird
        for (i = 0; i < 12; i++) {
            //Loop 2nd variable, which will essentially represent the width of each line
            for (j = 0; j < 12; j++) {
                //Always draw a star when j is 0, and when i + j = 6
                if (j == 0 || i + j == 6) {
                    System.out.print("*");
                    //Begin drawing the lower outside K 5 rows down
                } else if (i > 4 && i == j + 4) {
                    System.out.print("*");
                } else {
                    //If none of the above parameters are met, draw a space
                    System.out.print(" ");
                }
            }
            //Line break
            System.out.println();
        }
    }
}
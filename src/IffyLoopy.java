import java.util.Scanner;

public class IffyLoopy {
    public static void main(String[] args){
        String output = "";
        System.out.println("Please enter 5 words: ");
        Scanner words = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            output += words.next();
        }
        System.out.println(output);

        System.out.println("Are your eyes red?");
        String response = words.next();
        String  redEyes  = "y";
        boolean checkResponse = redEyes.equalsIgnoreCase("y");

        while( checkResponse ) {
            if (checkResponse || response.equalsIgnoreCase("yes")) {
                System.out.println("Get some sleep!");
            } else {
                System.out.println("You look great!");
            }

            System.out.println("Do you want to try again?");
           String tryAgain  = words.next();
            if( tryAgain.equalsIgnoreCase("n")){
                break;
            }

        }
    }
}

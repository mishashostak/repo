import java.util.*;

/**
 * This class defines https://www.vik-20.com/java/3-2-arrays-in-action/
 * 3-2 "Arrays in Action"
 * You Try: Question 2
 * 
 * @author Misha Shostak
 * 
 * @version 11/9/2022
 */
public class ThreeTwoN2 {
    private static String[] nArr;
    /**
     * Main method to test the program
     * 
     * @param args - Command line arguments
     */
    public static void main(String[] args) {
        setNumArr();
        System.out.println(arrToString());
    }

    /**
     * This method creates an array from an input amount of inputted integers 
     * then converts the array into a string to be returned
     * 
     * @return String - The Array presented as a String
     */
    public static void setNumArr() {
        System.out.println("\nInput the desired amount of different integers you'd like to input:");
        try (Scanner input = new Scanner( System.in )) {
            String hold = input.nextLine();
            while(!hold.matches("[0-9]+")) {
                System.out.println("\nHow is that remotely an integer?\nTry again and don't be an idiot this time:");
                hold = input.nextLine();
            }
            while (hold.substring(0) == "0" && hold.length()>1) {
                System.out.println("\nStop mucking about\nTry again and don't be a complete moron this time:");
                hold = input.nextLine();
            }
            nArr = new String[Integer.parseInt(hold)];
            System.out.printf("%nInput %d different integers:%n", nArr.length);
            do {
                String plac = input.nextLine();
                for (int i = 0; i<=nArr.length-1; i++) {
                    while(Arrays.asList(nArr).contains(plac)) {
                        System.out.println("\nI said DIFFERENT!!! ...god you're frustrating\nTry again and don't be an idiot this time:");
                    }
                    nArr[i] = plac;
                    System.out.println("\nNext please:");
                    plac = input.nextLine();
                }
            } while(true);
        }
    }

    public static String arrToString() {
        StringBuilder strB = new StringBuilder("\n[");
        for (String st : nArr){
            strB.append(st+", ");
        }
        return strB.substring(0, strB.toString().length()-2) + "]\n";
    }
}
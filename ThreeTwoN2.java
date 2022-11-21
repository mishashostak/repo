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
     * Mutator to define String Array
     */
    public static void setNumArr() {
        System.out.println("\nInput the desired amount of different integers you'd like to input:");
        try (Scanner input = new Scanner( System.in )) {
            String hold = input.nextLine();
            while(!hold.matches("[0-9]+")) {
                System.out.println("\nHow is that remotely an integer?\nTry again and don't be an idiot this time:");
                hold = input.nextLine();
            }
            nArr = new String[Integer.parseInt(hold)];
            System.out.printf("%nInput %d different integers:%n", Integer.parseInt(hold));
            String plac = input.nextLine();
            for (int i = 0; i<nArr.length; i++) {
                while(Arrays.asList(nArr).contains(plac)) {
                    System.out.println("\nI said DIFFERENT!!! ...god you're frustrating\nTry again and don't be an idiot this time:");
                    plac = input.nextLine();
                }
                while(!plac.matches("[0-9]+")) {
                    System.out.println("\nExplain how that's an integer? Absolute imbecile.\nTry again and make sure to use your brain cells:");
                    plac = input.nextLine();
                }
                nArr[i] = plac;
                if (i == nArr.length-1) {
                    break;
                } else {
                    System.out.println("\nNext please:");
                }
                plac = input.nextLine();
            }
        }
    }

    /**
     * This method returns the String Array in a formatted String
     * 
     * @return String - The String representation of the String Array
     */
    public static String arrToString() {
        Arrays.sort(nArr);
        StringBuilder strB = new StringBuilder("\n[");
        for (String st : nArr){
            strB.append(st+", ");
        }
        return strB.substring(0, strB.toString().length()-2) + "]\n";
    }

    //could've just done:
    //Arrays.sort(nArr)
    //return Arrays.toString(nArr);
}
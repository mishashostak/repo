import java.util.*;

/**
 * This class defines https://www.vik-20.com/java/3-4-the-arraylist-collection/
 * 3-4 "The ArrayList Collection"
 * You Try: Question 2
 * 
 * @author Misha Shostak
 * 
 * @version 11/19/2022
 */
public class ThreeFour {
    private static ArrayList<Integer> nArrLi;
    
    /**
     * Main method to test the program
     * 
     * @param args - Command line arguments
     */
    public static void main(String[] args) {
        setArrLi();
        System.out.println(arrsToString());
        intArrDoub();
        System.out.println(arrsToString());
        System.out.println(intArrSum());
    }

    /**
     * This method calculates and returns the sum and mean of all values of the ArrayList
     * 
     * @return String - The String representation of the sum and mean of the ArrayList
     */
    private static String intArrSum() {
        int sum = 0;
        for (int i : nArrLi) {
            sum = sum + i;
        }
        int avg = sum / nArrLi.size();
        return "Sum of all integers:\n" + sum + "\nMean of all integers\n" + avg;
    }

    /**
     * This method mutates the Integer ArrayList to have each integer multiplied by 2
     */
    private static void intArrDoub() {
        for (int i = 0; i<=nArrLi.size()-1; i++) {
            nArrLi.set(i, nArrLi.get(i) * 2);
        }
    }

    /**
     * Mutator to define Integer ArrayList
     */
    public static void setArrLi() {
        System.out.println("\nInput the desired amount of different integers you'd like to input:\n(Input an integer less than or equal to 0 to `quit)");
        try (Scanner input = new Scanner( System.in )) {
            String len = input.nextLine();
            while(nArrLi == null) {
                try{
                    if (Integer.parseInt(len)<=0) {
                        System.exit(0);
                    }
                    nArrLi = new ArrayList<Integer>(Integer.parseInt(len));
                } catch(NumberFormatException e) {
                    System.out.println("\nExplain how that's an integer? Absolute imbecile.\nTry again and make sure to use your brain cells:");
                    len = input.nextLine();
                }
            }

            //Second portion of Input sequence
            System.out.printf("%nInput %d different integers:%n(Input an integer less than or equal to 0 to `quit)\n", Integer.parseInt(len));
            String item = "";
            for (int i = 0; i<=Integer.parseInt(len)-1; i++) {
                try{
                    item = input.nextLine();
                    while(nArrLi.contains(Integer.parseInt(item))) {
                        System.out.println("I said DIFFERENT!!! ...god you're frustrating\nTry again and don't be an idiot this time:");
                        item = input.nextLine();
                    }
                    if (Integer.parseInt(item)<=0) {
                        System.exit(0);
                    }
                    nArrLi.add(Integer.parseInt(item));
                } catch(NumberFormatException e) {
                    while(!item.matches("[0-9]+")) {
                        System.out.println("\nExplain how that's an integer? Absolute imbecile.\nTry again and make sure to use your brain cells:");
                        item = input.nextLine();
                    }
                    i--;
                }
            }
        } 
    }

    /**
     * This method returns the ArrayList in a String
     * 
     * @return String - The String representation of the ArrayList
     */
    public static String arrsToString() {
        return "Contents of your ArrayList: \n" + nArrLi;
    }
}
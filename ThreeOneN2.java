import java.util.*;

public class ThreeOneN2 {
    public static void main(String[] args) {
        strArr();
    }

    //develops the string array of names inputted
    public static void strArr() {
        try (Scanner input = new Scanner( System.in )) {
            System.out.println("Input the amount of friends' names:");   
            String[] friends = new String[input.nextInt()];
            
            System.out.printf("%nInput %d names:\n", friends.length);
            for (int i = 0; i<=friends.length-1; i++) {
                if (i==0) input.nextLine();
                friends[i] = input.nextLine();
            }
            checkNamArr(friends);
        }
    }

    //checks if the additionally inputted name is contained within array
    public static void checkNamArr(String[] f) {
        try (Scanner input = new Scanner( System.in )) {
            System.out.println("\nInput a name:");
            String cheNam = input.nextLine();
            if (Arrays.asList(f).contains(cheNam)) {
                System.out.printf("%s IS one of the friends's names! :D %n", cheNam);
            } else {
                System.out.printf("%s isn't one of the friends' names  ˃╭╮˂ ⁽ˢᵃᵈ ᶠᵃᶜᵉ⁾ %n", cheNam);
            }
        }
        printNamArr(f);
    }

    //prints all the elements of the array in reverse order
    public static void printNamArr(String[] f) {
        System.out.println("\nAll friends' names in reverse order of input:");
        for (int i = f.length-1; i > 0; i--) {
            System.out.printf("%s, ", f[i]);
        }
        System.out.printf("%s.%n", f[0]);
    }
}
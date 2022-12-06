import java.util.Scanner;

class LinkedListTest {
    public static void main( String[] args ) {        
        String command;
        try (Scanner input = new Scanner(System.in)) {
            LinkedList<String> myList = new LinkedList<>();
            
            while (true) {
                System.out.printf( "\nList Empty? %b   List Size? %d   %s\n", myList.isEmpty(), myList.size(), myList );
                System.out.print("Command >");
                command = input.nextLine().toLowerCase().trim();
                if (command.startsWith("add front")) {
                    myList.addFirst(command.substring(10));
                    System.out.println( "Added to front: " + myList.peekFirst() );
                }
                else if (command.startsWith("add last")) {
                    myList.addLast(command.substring(9));
                    System.out.println( "Added to last: " + command.substring(9) );
                }
                else if (command.startsWith("peek")) {
                    System.out.println( "Peeked at front: " + myList.peekFirst() );
                }
                else if (command.startsWith("rem")) {
                    System.out.println( "Removed from front: " + myList.removeFirst() );
                }
                else if (command.startsWith("con")) {
                    System.out.println( "Contains \"" + command.substring(4) +"\"? " + myList.contains(command.substring(4)) );
                }
                else if (command.startsWith("clear")) {
                    myList.clear();
                    System.out.println( "Cleared!" );
                }
                else if (command.startsWith("quit")) {
                    System.out.println( "Bye-Bye!");
                    break;
                }
                else {
                    System.out.println( "I don't understand \""+command+"\".  Please use: add X, peek, rem, con X, clear, or quit" );
                }
            }
        }
    }
}
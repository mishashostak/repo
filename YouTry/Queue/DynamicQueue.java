package Queue;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class DynamicQueue<T> implements QueueADT<T> {
    private LinkedList<T> myList;
    
    // Creates an empty queue (based on a linked list).
    public DynamicQueue() {
        myList = new LinkedList<T>();
    }
    
    // Adds the specified element to the top of the queue
    public void enqueue( T element ) {
        myList.addLast( element );
    }
    
    // Removes the element from the top of the queue and returns a reference to it, or null (if empty).
    public T dequeue() {
        return myList.removeFirst(); 
    }
    
    // Returns a reference to the element at the top of the queue, or null (if empty).
    public T peek() {
        return myList.peekFirst();
    }
    
    // Returns true if the queue contains no elements, false otherwise.
    public boolean isEmpty() {
        return myList.isEmpty();
    }
    
    // Returns the number of elements in the queue.
    public int size() {
        return myList.size();
    }
    
    // Clears all elements from the queue
    public void clear() {
        myList.clear();
    }
    
    // Returns a String representation of the queue.
    public String toString() {
        return myList.toString();
    }
}  

class Potato {
    public static void main(String[] args) {
        DynamicQueue<String> players = new DynamicQueue<>();
        try (Scanner scanner = new Scanner(System.in)) {
            String name = scanner.nextLine();
            while(!name.equals("")) {
                players.enqueue(name);
                name = scanner.nextLine();
            }
        }
        System.out.println(players.toString());
        while(players.size() > 1) {
            int rand = ThreadLocalRandom.current().nextInt(1, players.size() + 1);
            System.out.println(rand + " is the random number chosen!");
            while(rand-- > 0) {
                String person = players.dequeue();
                players.enqueue(person);
            }
            String out = players.dequeue();
            System.out.println(out + " is out!");
            System.out.println(players.toString());
        }
        System.out.println(players.peek() + " is the winner!");
    }
}
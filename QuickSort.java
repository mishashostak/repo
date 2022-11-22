import java.util.Random;
import java.util.Arrays;

/**
 * This class defines https://www.vik-20.com/java/3-8-recursive-sorting-algorithms/
 * 3-8 "Recursive Sorting Algorithms"
 * You Try: Question 1
 * 
 * @author Misha Shostak
 * 
 * @version 11/22/2022
 */
public class QuickSort{
    private int[] data;
    public static final int RANDOM = 0;
    public static final int ASCENDING = 1;
    public static final int DESCENDING = 2;
    
    // create data of given size and fill with random integers
    public QuickSort( int size ) {
        this( size, RANDOM );
    }
    
    // create data of given size and fill with integers in a specified order
    public QuickSort( int size, int order ) {
        Random generator = new Random();
        data = new int[ size ];
        
        for ( int i = 0; i < size; i++ ) {
            data[ i ] = 100 + generator.nextInt(900);
            // BETTER: data[ i ] = generator.nextInt();
        }
        
        if (order == RANDOM)
            return;
        else {
            Arrays.sort(data);
            if (order == ASCENDING)
                return;
            else if (order == DESCENDING) {
                for(int i=0; i < data.length / 2; i++) {
                    // swap the elements
                    swap( i, data.length-(i+1) );
                }
            }
        }
    }

    // method to find the partition position
    static int partition(int array[], int low, int high) {
        // choose the rightmost element as pivot
        int pivot = array[high];
        // pointer for greater element
        int i = (low - 1);

        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                // if element smaller than pivot is found
                // swap it with the greater element pointed by i
                i++;

                // swapping element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // swap the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the position from where partition is done
        return (i + 1);
    }

    // this method defines the Quick Sort algorithm (Invented by Tony Hoare)
    static void quickSorting(int array[], int low, int high) {
        if (low < high) {
            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition(array, low, high);
            
            // recursive call on the left of pivot
            quickSorting(array, low, pi - 1);

            // recursive call on the right of pivot
            quickSorting(array, pi + 1, high);
        }
    }

    // helper method to swap values in two data elements
    private void swap( int first, int second ) {
        int temporary = data[ first ];  
        data[ first ] = data[ second ]; 
        data[ second ] = temporary;     
    } 
    
    // Return string representing all elements in data
    public String toString() {
        return Arrays.toString( data ) + "\n";
    }
}
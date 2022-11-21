import java.util.Random;
import java.util.Arrays;

public class SelectionSort{
    private int[] data;
    public static final int RANDOM = 0;
    public static final int ASCENDING = 1;
    public static final int DESCENDING = 2;
    
    // create data of given size and fill with random integers
    public SelectionSort( int size ) {
        this( size, RANDOM );
    }
    
    // create data of given size and fill with integers in a specified order
    public SelectionSort( int size, int order ) {
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

    /* This method defines the selection sort process */
    public void selectSorting(){
        int size = data.length;

        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;
        
            for (int i = step + 1; i < size; i++) {
        
                // To sort in descending order, change > to < in this line.
                if (data[i] < data[min_idx]) {
                min_idx = i;
                }
            }
        
            // put min at the correct position
            int temp = data[step];
            data[step] = data[min_idx];
            data[min_idx] = temp;
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
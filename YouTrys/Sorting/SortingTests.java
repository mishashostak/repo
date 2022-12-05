package Sorting;
/**
 * This class is utilized for testing the speeds of different
 * sorting algorithms
 * 
 * @author Misha Shostak
 * 
 * @version 11/22/2022
 */
public class SortingTests {
    public static void main(String[] args) {
        long start, finish;

        // create object to perform Selection Sort
        SelectionSort selectArr = new SelectionSort( 100000, SelectionSort.DESCENDING );
        
        System.out.println( "Selection Sort (100000 randomly ordered integers): " );
        start = System.currentTimeMillis();
        selectArr.selectSorting();
        finish = System.currentTimeMillis();
        System.out.println( (finish - start) + " ms\n" );  

        // reset
        start=0;
        finish=0;

        // create object to perform Bubble Sort
        BubbleSort bubbleArr = new BubbleSort( 100000, BubbleSort.DESCENDING );

        System.out.println( "Bubble Sort (100000 randomly ordered integers): " );
        start = System.currentTimeMillis();
        bubbleArr.bubbleSortv3();
        finish = System.currentTimeMillis();
        System.out.println( (finish - start) + " ms\n" );  

        // reset
        start=0;
        finish=0;

        // create object to perform Bubble Sort
        QuickSort quickArr = new QuickSort( 10000000, QuickSort.ASCENDING );

        System.out.println("Quick Sort (100000 randomly ordered integers): " );
        start = System.currentTimeMillis();
        quickArr.quickSort();
        finish = System.currentTimeMillis();
        System.out.println( (finish - start) + " ms\n");  

        /**
         * RESULTS *
         * (100 000 elements)
         * 
         * (**testing done on horrid school computer**)
         * (approx. 10 trials done for each type of data set)
         *   Bubble                 Selection               Quick
         *               [RANDOM]
         *  16083-16340 ms          4268-4666 ms           9-13 ms
         *              [ASCENDING]
         *   1-3 ms                 1554-1661 ms           7-13 ms
         *              [DESCENDING]
         *  6871-7233 ms            2884-4434 ms           8-16 ms
         * 
         * 
         * Quick sort (1 000 000 elements):
         *          27-38 ms
         * Quick sort (10 000 000 elements):
         *          242-256 ms
         */
    }
}

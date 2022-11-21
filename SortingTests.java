public class SortingTests {
    public static void main(String[] args) {
        long start, finish;
        
        // create object to perform Selection Sort
        SelectionSort selectArr = new SelectionSort( 100000);
        
        System.out.println( "Selection Sort (100000 randomly ordered integers): " );
        start = System.currentTimeMillis();
        selectArr.selectSorting();
        finish = System.currentTimeMillis();
        System.out.println( (finish - start) + " ms\n" );  

        // reset
        start=0;
        finish=0;

        // create object to perform Bubble Sort
        BubbleSort bubbleArr = new BubbleSort( 10, BubbleSort.RANDOM );

        System.out.println( "Bubble Sort (100000 randomly ordered integers): " );
        start = System.currentTimeMillis();
        bubbleArr.bubbleSortv3();
        finish = System.currentTimeMillis();
        System.out.println( (finish - start) + " ms\n" );  

        /**
         * Bubble sorting is far quicker
         * than Selection sorting
         * 
         * Bubble       Selection
         *  0 ms         2163 ms
         */
    }
}

public class SelectionSortTest {
    public static void main(String[] args) {
        long start, finish;
        
        // create object to perform bubble sort
        SelectionSort arr = new SelectionSort( 100000);
        
        System.out.println( "Selection Sort (100000 randomly ordered integers): " );
        start = System.currentTimeMillis();
        arr.selectSorting();
        finish = System.currentTimeMillis();
        System.out.println( (finish - start) + " ms\n" );  
    }
}

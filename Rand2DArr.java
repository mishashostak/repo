import java.util.*;

//Program for 3-3; Two-dimensional Arrays with randomized integers in each element
public class Rand2DArr{
    public void randRectArr() {
    try (Scanner input = new Scanner( System.in )) {
        System.out.println("Input the height value of the rectangular 2-D Array:");
        int rows = input.nextInt();
 
        System.out.println("Input the width value of the rectangular 2-D Array:");
        int cols = input.nextInt();
 
        inpRandIntoArr(rows,cols);
    }
    }

    public void inpRandIntoArr(int rows, int cols){
        Random random = new Random();
        int[][] randArr;
        randArr = new int[rows][cols]; 
        int rand=0;
        for (int i=0; i<=rows-1; i++){
            for (int j=0; j<=cols-1; j++){
                while (true){
                    rand = random.nextInt(100);
                    if(rand !=0) break;
                }
                randArr[i][j] = rand;
            }
        }
        printArr(rows, cols, randArr);
    }

    public void printArr(int rows, int cols, int[][] randArr){
        int maxInt = 0, minInt = 100;
        for (int a=0; a<=rows-1; a++){
            for (int b=0; b<=cols-1; b++){
                maxInt = Math.max(randArr[a][b],maxInt);
                minInt = Math.min(randArr[a][b],minInt);
                System.out.print("|"+randArr[a][b]);
            }
            System.out.printf("%s%n","|");
        }
        System.out.printf("Largest integer found within array is %d%nSmallest integer found within array is %d", maxInt, minInt);
    }
}
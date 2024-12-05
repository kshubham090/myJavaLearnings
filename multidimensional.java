import java.util.*;
public class multidimensional {
    public static void main(String[] args) {
        int[][] array = new int[3][4];
        //initialization
        for(int i =0 ; i < 3 ; i++){
            for(int j =0 ; j<4 ; j++){
                Scanner input = new Scanner(System.in);
                array[i][j] = input.nextInt();
            }
        }
        for(int i =0 ; i < 3 ; i++){
            for(int j =0 ; j<4 ; j++){
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listOfLists = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                list.add(combination(i, j)); // Calculate combinations directly
            }
            listOfLists.add(list);
        }
        return listOfLists;
    }

    // Calculate combinations directly (nCk)
    public int combination(int n, int k) {
        long result = 1; // Use long to prevent overflow
        for (int i = 0; i < k; i++) {
            result = result * (n - i) / (i + 1);
        }
        return (int) result; // Cast back to int (safe for small Pascal's triangles)
    }
}


// n Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
// https://leetcode.com/problems/pascals-triangle/description/?source=submission-noac

 

// Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Example 2:

// Input: numRows = 1
// Output: [[1]]

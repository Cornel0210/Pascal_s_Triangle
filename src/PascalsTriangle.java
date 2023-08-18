import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers directly above.
 *
 * Example 1:
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 *
 * Example 2:
 * Input: numRows = 1
 * Output: [[1]]
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
        System.out.println(generate(10));
        System.out.println("-------------------------------");
        System.out.println(getRow(8));
        System.out.println(getRow(9));
        System.out.println(getRow(10));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new LinkedList<>();
        List<Integer> temp;
        pascalsTriangle.add(new ArrayList<>());
        pascalsTriangle.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            pascalsTriangle.add(new ArrayList<>());
            temp = pascalsTriangle.get(i-1);
            for (int j = 0; j <=temp.size(); j++) {
                if (j == 0 || j == temp.size()){
                    pascalsTriangle.get(i).add(1);
                } else {
                    pascalsTriangle.get(i).add(temp.get(j-1) + temp.get(j));
                }
            }
        }
        return pascalsTriangle;
    }

    /**
     * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
     */
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascalsTriangle = new LinkedList<>();
        List<Integer> temp;
        pascalsTriangle.add(new ArrayList<>());
        pascalsTriangle.get(0).add(1);
        for (int i = 1; i <= rowIndex; i++) {
            pascalsTriangle.add(new ArrayList<>());
            temp = pascalsTriangle.get(i-1);
            for (int j = 0; j <=temp.size(); j++) {
                if (j == 0 || j == temp.size()){
                    pascalsTriangle.get(i).add(1);
                } else {
                    pascalsTriangle.get(i).add(temp.get(j-1) + temp.get(j));
                }
            }
        }
        return pascalsTriangle.get(rowIndex);
    }
}
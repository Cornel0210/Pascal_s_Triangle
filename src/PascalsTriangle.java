import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
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
}
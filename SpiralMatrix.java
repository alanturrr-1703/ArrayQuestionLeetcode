import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix.length == 0) return ans;
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int columnBegin = 0;
        int columnEnd = matrix[0].length -1;
        while (rowBegin <= rowEnd && columnBegin <= columnEnd){
            for (int i = columnBegin; i <= columnEnd; i++) {
                ans.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            for (int i = rowBegin; i <= rowEnd; i++) {
                ans.add(matrix[i][columnEnd]);
            }
            columnEnd--;
            if (rowBegin <= rowEnd){
                for (int i = columnEnd; i >= columnBegin; i--) {
                    ans.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            if (columnBegin <= columnEnd){
                for (int i = rowEnd; i >= rowBegin; i--) {
                    ans.add(matrix[i][columnBegin]);
                }
            }
            columnBegin++;
        }
        return ans;
    }

}

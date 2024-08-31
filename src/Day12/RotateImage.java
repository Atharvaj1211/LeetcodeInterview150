package Day12;

public class RotateImage {
    // LeetCode 48 : Rotate Image
    // https://leetcode.com/problems/rotate-image/?envType=study-plan-v2&envId=top-interview-150
    public void rotate(int[][] matrix) {
        int n= matrix.length;
        for(int i = 0 ;i<n;i++){
            for(int j = i ; j<n;j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j = 0 ; j<n/2;j++){
                int temp =0;
                temp = matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
    }
}

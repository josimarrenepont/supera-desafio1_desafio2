package Desafio2;

import java.util.ArrayList;
import java.util.List;

public class Snail {

    public static List<Integer> snail(int[][] matrix){
        List<Integer> result = new ArrayList<>();
        if(matrix.length == 0) return result;

        int n = matrix.length;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;

        while (top <= bottom && left <= right){
            for (int i = left; i <= right; i++) result.add(matrix[top][i]);
            top++;
            for (int i = top; i <= bottom; i++) result.add(matrix[i][right]);
            right--;
            if(top <= bottom){
                for (int i = right; i >= left; i--) result.add(matrix[bottom][i]);
                bottom--;
            }
            if(left <= right){
                for (int i = bottom; i >= top; i--) result.add(matrix[i][left]);
                left++;
            }
        }
        return result;
    }
    public static void main(String [] args){
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(snail(matrix));
    }
}

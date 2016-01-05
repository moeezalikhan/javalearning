/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

/**
 *
 * @author Moeez
 */
public class Challenge1 {

    public static void main(String[] args) {
        int[][] matrix = {{19, 4, 3}, {6, 33, 8}, {11, 10, 58}};
        int temp = 0;
        System.out.println("{" + matrix[0][0] + " ," + matrix[0][1] + " ," + matrix[0][2] + "}");
        System.out.println("{" + matrix[1][0] + " ," + matrix[1][1] + " ," + matrix[1][2] + "}");
        System.out.println("{" + matrix[2][0] + " ," + matrix[2][1] + " ," + matrix[2][2] + "}");
        System.out.println("The Sorted Matrix");
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 2; y++) {
                if (matrix[x][y] > matrix[x][y + 1]) {
                    temp = matrix[x][y];
                    matrix[x][y] = matrix[x][y + 1];
                    matrix[x][y + 1] = temp;
                }
            }
        }
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 3; y++) {
                if (matrix[y][x] > matrix[y][x + 1]) {
                    temp = matrix[y][y];
                    matrix[y][x] = matrix[y][x + 1];
                    matrix[y][x + 1] = temp;
                }
            }
        }
        System.out.println("{" + matrix[0][0] + " ," + matrix[0][1] + " ," + matrix[0][2] + "}");
        System.out.println("{" + matrix[1][0] + " ," + matrix[1][1] + " ," + matrix[1][2] + "}");
        System.out.println("{" + matrix[2][0] + " ," + matrix[2][1] + " ," + matrix[2][2] + "}");

    }
}

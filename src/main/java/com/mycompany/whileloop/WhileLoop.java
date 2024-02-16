/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.whileloop;

/**
 *
 * @author Ribaration
 */
public class WhileLoop {

    public static void main(String[] args) {
           int rows = 4; // Number of rows in the pattern
        int i = 1; // Variable to keep track of the current row

        while (i <= rows) {
            int j = 1; // Variable to keep track of the number of stars in each row

            // Print '*' j times in the current row
            while (j <= i) {
                System.out.print("* ");
                j++;
            }

            System.out.println(); // Move to the next line for the next row
            i++; // Move to the next row
        }
    }
}

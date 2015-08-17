package Assignments;

import java.util.Scanner;

/**
 * @author Anjita
 * Matrix class.
 * variables
 * Data[][] :- storing matrix
 * nrow :- number of rows
 * ncol :- number of column
 */
public class Matrix {
	int data[][];
	int nrow, ncol;

	public Matrix(int row, int col) {
		nrow = row;
		ncol = col;
		data = new int[row][col];
	}

	/**
	 * @param row
	 * @param col
	 * @param val
	 * sets the value at particular index
	 */
	public void addElement(int row, int col, int val) {
		data[row][col] = val;
	}

	/**
	 * @return returns transposed matrix
	 */
	public Matrix transpose() {
		Matrix trans = new Matrix(ncol, nrow);
		for (int i = 0; i < nrow; i++) {
			for (int j = 0; j < ncol; j++)
				trans.data[j][i] = data[i][j];
		}
		return trans;
	}

	/**
	 * Prints the matrix
	 */
	public void show() {
		for (int i = 0; i < nrow; i++) {
			for (int j = 0; j < ncol; j++)
				System.out.print(" " + data[i][j] + " ");
			System.out.println();
		}
	}

	/**
	 * @param 
	 * takes value of matrix from user and print matrix and its transpose
	 */
	public static void main(String[] args) {

		System.out.print("Enter row and column of matrix");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		Matrix obj = new Matrix(row, col);
		System.out.print("Enter elements of matrix row wise");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				obj.addElement(i, j, sc.nextInt());
		}
		obj.show();
		Matrix tran = obj.transpose();
		tran.show();
		sc.close();
	}

}

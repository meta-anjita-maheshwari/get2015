package Assignments;

import java.util.Scanner;
//class showing the working of first come first serve job
//arr_time = contains  value of jobs arrival time
//job_size = contains value of job size

public class Assignment4 {
	public static void main(String[] args) {
		Assignment4 fcfs1 = new Assignment4();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of jobs");
		int length = sc.nextInt();
		int arr_time[] = new int[length];
		int job_size[] = new int[length];
		System.out.println("enter arrival time of jobs");
		for (int i = 0; i < length; i++)
			arr_time[i] = sc.nextInt();
		System.out.println("enter size of jobs");
		for (int i = 0; i < length; i++)
			job_size[i] = sc.nextInt();
		int array[][] = fcfs1.fcfs(arr_time, job_size);
		System.out
				.println("Job\t arrival time\t  wait time\t  start time\t  finish time");
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < 5; j++)
				System.out.print(array[i][j] + "\t\t");
			System.out.println("");
		}

	}

	int[][] fcfs(int arrival_time[], int job_size[]) // function calculating job
														// wait time, job start
														// time, job finish time
	{
		int table[][] = new int[arrival_time.length][5];
		for (int i = 0; i < arrival_time.length; i++) {
			table[i][0] = i + 1;
			table[i][1] = arrival_time[i];
			if (i == 0)
				table[0][2] = 0;
			else if (table[i - 1][4] < table[i][1])
				table[i][2] = 0;
			else
				table[i][2] = table[i - 1][4] - table[i][1] + 1;
			table[i][3] = table[i][1] + table[i][2];
			table[i][4] = job_size[i] + table[i][3] - 1;
		}
		return table;
	}
}

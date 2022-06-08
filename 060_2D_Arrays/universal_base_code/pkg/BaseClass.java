package pkg;
import java.util.Scanner;
import java.util.Random;


public int rowAverage(int[][] arr){
	int avg;
	int total;
	
	for(int i = 0;i < arr.length;i++){
		for(int j = 0;j < arr[0].length;j++){
			total += arr[i][j];
		}
		average = total / arr[j];
	}
	return average;
}

public int arrayAverage(int[][] arr){
	int total;
	int c;
	
	for(int i = 0;i < arr.length;i++){
		for(int j = 0;j < arr[0].length;j++){
			total += arr[i][j];
			c++;
		}
	}
	return total / c;
}

public void printArray(int[][] arr){
	for(int i = 0;i < arr.length;i++){
		for(int j = 0;j < arr[0].length){
			System.out.println(arr[i][j]);
		}
	}
}


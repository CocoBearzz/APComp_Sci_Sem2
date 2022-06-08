import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[][] arr = new int[4][4];
		
		for(int i = 0;i < arr.length;i++){
			for(int j = 0;j < arr[0].length;j++){
				arr[i][j] = Math.floor(Math.random()*10);
			}
		}
	}
}

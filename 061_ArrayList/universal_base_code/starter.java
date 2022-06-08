import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int outer, inner, key;
		
		int[][] arr = new int[10][20];
		
		for(outer = 1;outer < arr.length;outer++){
			key = arr[outer];
			inner = outer-1;
			
			while(inner >= 0 && arr[inner] > key){
				arr[inner+1] = arr[inner];
				inner = inner -1;
			}
			arr[inner+1] = key;
		}
		for(outer = 0;outer<arr.length;outer++){
			for(inner = 0;inner <=arr[0].length;inner++){
				arr[outer][inner] = Math.floor(Math.random()*10);
				System.out.println(arr[outer][inner]);
			}
		}
		
	}
}

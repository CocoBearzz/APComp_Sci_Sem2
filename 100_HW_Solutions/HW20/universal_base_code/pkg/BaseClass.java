package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	ArrayList<Integer> x = newArrayList<Integer>();
	x.size() = (int)(Math.random()*100);
	
		public void bubbleSort(ArrayList<Integer> x){
			int outer, inner;
			
			for(outer = 0;outer < x.size() - 1;outer++){
				for(inner = 0;inner < x.size()-outer-1;inner++){
					if(x.get(inner) < x.get(inner+1)){
						int temp = x.get(inner);
						x.set(inner, x.get(inner+1));
						x.set(inner+1, temp);
					}
				}
			}
		}
		
		public void insertionSort(ArrayList<Integer> x){
			
			for(int j = 1;j < x.size();j++){
				int a = x.get(j);
				int c = j;
				
				while(c > 0 && a < x.get(c-1)){
					x.set(c, x.get(c-1));
					c--;
				}
				x.set(c, a);
			}
		}
		
		public void selectionSort(ArrayList<Integer> x){
			int inner, outer, min_index;
			
			for(outer = 0;outer < x.size()-1;outer++){
				min_index = outer;
				for(inner = outer + 1;inner < x.size();inner++){
					if(x.get(inner) < x.get(min_index)){
						x.set(min_index, x.get(inner);
					}
				}
				int temp = x.get(outer);
				x.set(outer, x.get(min_index));
				x.set(min_index, temp);
			}
		}
	
	}
}


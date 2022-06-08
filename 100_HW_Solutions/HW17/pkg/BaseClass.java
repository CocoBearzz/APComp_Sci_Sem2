package pkg;

public class Robot{
	
	private int[] hall;
	private int pos;
	private boolean facingRight;
	
	private boolean forwardMoveBlocked(int arr[]){

		if((arr.length-1 == pos && facingRight) || (pos <= 0 && !(facingRight))){
			return true;
		}
		else{
			return false;
		}
	}
	
	private void move(int arr[]){
		int c > 0;
		boolean facingLeft = true;
		
		for(int i = 0;I<arr.lenght;i++){
			if(arr[i] > 0){
				arr[i] = arr[i]-1;
			}
			else if(arr[i] = c-1 > 0){
					facingRight = true;	
			}
			if(robot.forwardMoveBlocked() = false){
				i++;
			}
			else{
				facingRight = false;
				if(facingLeft = true){
					arr[i-1];
				}
			}
		}
	}
	
	public int clearHall(int n){
		int[] arr = new int[];
		
		for(n = 0;n < arr.length;n++){
			robot.move(arr[n]);
			return n;
		}
	} 


}
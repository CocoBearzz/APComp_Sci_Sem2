import pkg.*;

public class GizmoRunner {

	public Gizmo(String maker,boolean a, double price){
		
	}
	
	public void setPrice(Double p){
		p = price;
	}
	
	public int getPrice(){
		return price;
	}
	
	public void setMaker(String m){
		m = maker;
	}
	
	public String getMaker(){
		return maker;
	}
	
	public boolean is Electronic(){
		if(Gizmo.isElectronic == true){
			return true;
		}
		else{
			return false;
		}
	}
	
   public static void main(String args[])
	{
		Gizmo gz = new Gizmo( "sony", true );
		System.out.println( gz.getMaker() );
		System.out.println( gz.isElectronic() );
		System.out.println( gz.getMaker() );
		System.out.println( gz );	
			
		Gizmo et = new Gizmo( "aplus", false );	
		System.out.println( et );
										
		System.out.println( et.equals( gz ) );	
			
		Gizmo at = new Gizmo( "sony", true );
		System.out.println( at );
			
		System.out.println( at.equals( gz ) );																															
	} 
}
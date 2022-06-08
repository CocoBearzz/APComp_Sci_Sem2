import java.util.ArrayList;


public class OnlinePurchaseManager
{
   
   private ArrayList<Gizmo> purchases;
   
   public int countElectronicsByMaker(String maker)
   {
      int total;
      
      if(purchases.isElectronic == true){
         if(purchases.getMaker().equals(Gizmo.getMaker())){
            total++;
         }
      }
      
      else if ( purchases.isElectronic == false )
      {
         total+= 0;
      }
      return total;
   }
   
   public Gizmo getCheapestGizmoByMaker( String maker )
   {
      for ( int i=0; i < purchase.size(); i++ ){
         if ( purchase.getMaker().equals(maker) ) {
            return super(price);
         }
         if ( purchase.getPrice() < price )
         {
            return purchase.getPrice();
         }
         else if ( purchase.getPrice() > price )
         {
            return price;
         }
      }
   }
   
   public boolean hasAdjacentEqualPair( Gizmo a, Gizmo b )
   {
      for ( int i = 0; i < purchases.length(); i++){
         
         if ( a.equals(b) )
         {
            return true;
        }
        else
        {
           return false;
        }
      }
   }   
   
   public String toString()
   {
   	return "" + purchases;
   }
}

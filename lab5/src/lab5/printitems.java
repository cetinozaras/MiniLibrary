package lab5;

import java.io.IOException;

public class printitems  {
	public static void main(String[] args) {
	       item[] items = new item[4];
	       items[0] = new printed (7985, "Alice in Wonderland", 105);
	       items[1] = new multimedia (3565, "In a Sentimental Mood", 597);
	       items[2] = new printed (2365, "Building Java Programs", 874);
	       items[3] = new item (5823, "Complete Wreck Diving");
	       printItems(items);
	    }
	       public static void printItems (item[] items) {
	    	   try{
	    		   
	    	   for(int i=0;i<6;i++){
	    		   System.out.println(items[i].toString());
	    	   }
	    	 }catch(ArrayIndexOutOfBoundsException e){
	    		 //e.printStackTrace();
	    		 System.out.println("Array Index Problem");
	    	 }catch (Exception e){}
	    	   finally  {
	    		   System.out.println("Always executed");
	    	   }
	 
	 } 

}

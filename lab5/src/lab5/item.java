package lab5;

public class item {
	private int idnumber;
	private String title;
	public item(int id,String name){
		idnumber=id;
		title=name;
	}
	public String toString(){
		String s=" ";
		s= s + idnumber + " " + title;
		return s;
	}
	
}

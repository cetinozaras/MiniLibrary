package lab5;

public class printed extends item {
	private int pages;
	public printed(int id,String title, int pages){
	super(id,title);
	this.pages=pages;
	
	}
	public String toString(){
		String s = super.toString() + "" + pages ;
		return s;
	}
}


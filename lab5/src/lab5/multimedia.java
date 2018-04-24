package lab5;

public class multimedia extends item {
	int length;
	
	public multimedia(int id,String title,int length){
		super(id,title);
		this.length=length;
	}
	
	public String toString(){
		String s = super.toString() + "" + length ;
		return s;
	}
	
}


package srcCode;
/**
 * 
 */


import java.util.ArrayList;

/**
 * @author FIS
 *
 */
public class shop {

	public int count;
	public ArrayList<oday> a=new ArrayList<oday>();
	
	public void additem(int i, double d, String string) {
	oday od=new oday(i,d,string);
	a.add(od);
	count=a.size();	
	}

	public double calcTPrice() {
		double sum = 0;
		for(int i=0;i<a.size();i++) {
		oday Tobj=(oday) a.get(i);
			sum+= Tobj.price;
			
		}
		
		
		return sum;
	}
	

}
class oday {
	int quntity;
	double price;
	String name;
	oday(){
		quntity=0;
		price=0;
		name=null;
	}
	oday(int q,double p,String n){
		quntity=q;
		price=p;
		name=n;
	}
}
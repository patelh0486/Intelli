package Model;
import java.util.ArrayList;
import java.util.List;
import org.javatuples.Quartet;
import org.javatuples.Triplet;

public class DataTuple {
	/*
	 * const facts = [
 ['gabriel', 'address', 'baker street, 109', true],
 ['john', 'address', 'apple street, 10', true],
 ['john', ''address', 'pine street, 88', true],
 ['john', 'phone', '234-5678', true],
 ['john', 'phone', '91234-5555', true],
 ['john', 'phone', '234-5678', false],
 ['gabriel', 'phone', '98888-1111', true],
 ['gabriel', 'phone', '56789-1010', true],
];
	 */
	
	public static void main(String args[]){
		ArrayList<Quartet<String,String,String,Boolean>> facts 
		= new ArrayList<Quartet<String,String,String,Boolean>>();
		
		facts.add(new Quartet<String,String,String,Boolean>
		("gabriel","address","baker street, 109",true));
		facts.add(new Quartet<String,String,String,Boolean>
		("john","address","apple street, 10",true));
		facts.add(new Quartet<String,String,String,Boolean>
		("john","address","pine street, 88",true));
		facts.add(new Quartet<String,String,String,Boolean>
		("john","phone","234-5678",true));
		facts.add(new Quartet<String,String,String,Boolean>
		("john","phone","91234-5555",true));	
		facts.add(new Quartet<String,String,String,Boolean>
		("john","phone","234-5678",false));
		facts.add(new Quartet<String,String,String,Boolean>
		("gabriel","phone","98888-1111",true));
		facts.add(new Quartet<String,String,String,Boolean>
		("gabriel","phone","56789-1010",true));
		
		//System.out.println(currentFacts(facts));
		
	//	System.out.println(facts);
		System.out.println("original facts:");
		for(Object obj : facts) {
			System.out.println(obj);
		}
	//	System.out.println(facts);
    //System.out.println(currentFacts(facts));
		System.out.println("Current facts:");
		for(Object obj : currentFacts(facts)) {
			System.out.println(obj);
		}
	}
	
	public static ArrayList<Quartet<String,String,String,Boolean>> currentFacts (ArrayList<Quartet<String,String,String,Boolean>> facts) 
	{
		
		//ArrayList<Quartet<String,String,String,Boolean>> current = new ArrayList<Quartet<String,String,String,Boolean>>();
		//boolean isNotRetracted = facts.contains(true);
		Object value0Obj = facts.removeIf(c -> c.containsAll("john","address","apple street, 10"));
		Object value0Obj1 = facts.removeIf(c -> c.containsAll("john","234-5678"));
		Object value0Obj2 = facts.removeIf(c -> c.contains(false));
		
//		for(Quartet<String, String, String, Boolean> obj : facts) {
//			if(obj.contains(true) ) {
//			
//				current.add(obj);
//				
//			}
//		}
		
		return facts;
	}
}

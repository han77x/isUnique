import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class isUnique {
	/*public static boolean isUnique() {
		// TODO Auto-generated method stub
for(int ssn : ssnMap.keySet()) {
			String name2 = ssnMap.get(ssn);
			System.out.println(name2 + " " + ssn);
		}
						
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> dataMap = new TreeMap<String,String>();	
	boolean isTrue;
	
	dataMap.put("Marty", "Stepp");
	dataMap.put("Stuart","Reges");
	dataMap.put("Jessica","Miller");
	dataMap.put("Amanda","Camp");
	dataMap.put("Hal","Perkins");
	
	isTrue=isUnique(dataMap);
	
	System.out.println("dataMap returns: "+isTrue);
	
	Map<String, String> sMap = new TreeMap<String,String>();	
	boolean isFalse;
	
	sMap.put("Kendrick", "Perkins");
	sMap.put("Stuart","Reges");
	sMap.put("Jessica","Miller");
	sMap.put("Bruce","Reges");
	sMap.put("Hal","Perkins");
	
	isFalse=isUnique(sMap);
	
	System.out.println("sMap returns: "+isFalse);
	

	
	
	}

	private static boolean isUnique(Map<String, String> dataMap) {
		// TODO Auto-generated method stub
	
		HashSet SetvalueSet = new HashSet();
		
		HashSet valueSet = null;
		for(String value:dataMap.keySet()) 
		{
			String name2 = dataMap.get(value);
			Object key = null;
			valueSet.add(key);
			System.out.println(name2 + " " );
		}
		
		return valueSet.size()==dataMap.size();

}
	}


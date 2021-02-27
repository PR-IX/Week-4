import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lists {

	public static void main(String[] args) {
		
    List<String>employeeNames = new ArrayList<String>();
    
    Set<Integer> ids = new HashSet<Integer>();
    
    Map<Integer, String> employeeMap = new HashMap<Integer, String>();
   
    employeeNames.add("Chris");
	employeeNames.add("Adam");
	employeeNames.add("Sam");
	employeeNames.add("Tony");
	employeeNames.add("Amanda");
	
	ids.add(5);
	ids.add(1);
	ids.add(4);
	ids.add(2);
	ids.add(3);
	for (int i = 1; i <= employeeNames.size(); i++) {
		ids.add(i);
	}  
    int i = 0;
   
   
   for (Integer id: ids) {
 	   employeeMap.put(id, employeeNames.get(i));
 	   i++;
    }
   for (Integer key : employeeMap.keySet()) {
	   System.out.println("Employee " + key + " " + "is" + " " + employeeMap.get(key));
  
      
   

     }
    	 StringBuilder idsbuilder = new StringBuilder();
    	 for(int id : ids) {
    		 idsbuilder.append(id + "-" );
    	 }
    	 System.out.println(idsbuilder.toString());
    	 
    	 StringBuilder namesBuilder = new StringBuilder();
    	 for (String name : employeeNames ) {
    		 namesBuilder.append(name + " ");
    	 }
    	 System.out.println(namesBuilder.toString());
    }
	
}



	



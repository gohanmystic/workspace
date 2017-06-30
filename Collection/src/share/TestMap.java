package share;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class TestMap {
	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<>();
		scores.put("Vu", 100);
		scores.put("Tran", 150);
		scores.put("Quoc", 130);
		
		Object[] ds;
		ds = scores.keySet().toArray();
		for(int i = 0; i < scores.size(); i++){
			System.out.println(ds[i] + " has score: " + scores.get(ds[i]));
		}
		
		Iterator itr =  scores.keySet().iterator();
		while(itr.hasNext()) {
			String str = (String) itr.next();
			System.out.println(str + " has score: " + scores.get(str));
		}
		
		System.out.println(scores.get("Tran"));
		
		Properties capitals = new Properties();
		
		capitals.put("Illinois", "Springfield");
		capitals.put("Missouri", "Jefferson City");
		capitals.put("Washington", "Olympia");
		capitals.put("California", "Sacramento");
		capitals.put("Indiana", "Indianapolis");
		
		System.out.println(capitals.getProperty("Missouri"));
	}
}

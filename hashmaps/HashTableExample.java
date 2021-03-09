import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashTableExample {

	public static void main(String[] args) {
		int size = 5;
		String[] favFoods = new String[size];
		
		int carsen = Math.abs("carsen".hashCode());		
		carsen = carsen % size;
		System.out.println(carsen);
		favFoods[carsen] = "chicken";
		
		int jeremy = Math.abs("jeremy".hashCode());
		jeremy = jeremy % size;
		System.out.println(jeremy);
		favFoods[jeremy] = "lobster";
		
		int beatrice = Math.abs("beatrice".hashCode());
		beatrice = beatrice % size;
		System.out.println(beatrice);
		favFoods[beatrice] = "spaghetti";
		
		HashMap<String, String> map = new HashMap<>();
		map.put("NY", "Albany");
		map.put("PA", "Harrisburg");
		map.put("NJ", "Trenton");
		
		System.out.println("\nOption 1:");
		Set<String> keys = map.keySet();							//traversing map to print
		for (String key : keys) {
			System.out.println("key is " + key + ", value is " +map.get(key));
		}
		
		System.out.println("\nOption 2:");
		for(Map.Entry<String,String> entry : map.entrySet()) {		//traversing map with entry to print
			System.out.print(entry.getKey() + ", ");
			System.out.println(entry.getValue());
		}
	}
}

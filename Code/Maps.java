import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        // map is interface
        // hashmap is implementation
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("jhon", 1);
        empIds.put("alex", 2);
        empIds.put("Max", 3);

        empIds.put("alex", 22); // replace old value, if not exist - create new
        empIds.replace("alex", 222); // replace old value, if not exist - doesnt create new

        System.out.println(empIds); // {alex=2, Max=3, jhon=1} //doesnt guarente the order

        System.out.println(empIds.get("jhon")); // 1

        System.out.println(empIds.containsKey("jhon")); // true
    }
}

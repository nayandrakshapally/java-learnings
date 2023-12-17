import java.util.*;

public class CollectionsT {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        Collections.sort(nums);
        System.out.println(nums);
        System.out.println(nums.indexOf(2));
        System.out.println(nums.get(1));

        // set supports unique values, it doesn't have index values
        Set<Integer> nums2 = new HashSet<>();
        nums2.add(1);
        nums2.add(2);
        nums2.add(3);
        System.out.println(nums2);

        // Map it is the collection of key and value pairs
        Map<String, Integer> student = new HashMap<>();
        student.put("Nayan", 17);
        student.put("test", 18);
        System.out.println(student);
        System.out.println(student.get("Nayan"));
        System.out.println(student.keySet());
        // Both hasmap & hashtable works same

        Employee one = new Employee(1, "nayan", "nirmal");
        Employee two = new Employee(2, "test", "hyd");
        Employee three = new Employee(3, "hike", "del");

        HashMap<Integer, Object> maps = new HashMap<>();
        maps.put(12, one);
        maps.put(23, two);
        maps.put(34, three);
        System.out.println(maps);

    }
    // comparator & comparable
}

class Employee {
    private int id;
    private String name;
    private String place;

    Employee(int id, String name, String place) {
        this.id = id;
        this.name = name;
        this.place = place;
    }
}
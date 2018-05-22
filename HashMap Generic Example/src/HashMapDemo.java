
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Mahesh
 *
 */
public class HashMapDemo {

	HashMap<Employee, Integer> empMap = new HashMap<Employee, Integer>();
	HashMap<Student, Boolean> studMap = new HashMap<Student, Boolean>();

	public static void main(String[] args) {
		
		HashMapDemo h = new HashMapDemo();
		h.getKeyAndValue();
	}

	@SuppressWarnings("unchecked")
	public <T> void getKeyAndValue() {
		
		Employee e1 = new Employee(1, "Mahesh");
		Employee e2 = new Employee(2, "Akshay");
		Employee e3 = new Employee(3, "Guru");
		empMap.put(e1, 1);
		empMap.put(e2, 2);
		empMap.put(e3, 3);

		Student s1 = new Student(101, "Mahesh");
		Student s2 = new Student(101, "Guru");
		Student s3 = new Student(101, "Akshay");
		studMap.put(s1, true);
		studMap.put(s2, false);
		studMap.put(s3, true);
		
		T empValue = (T) getValueFromKey(empMap, e2);
		System.out.println("Employee value = " + empValue);
		T empKey = (T) getKeyFromValue(empMap, 3);
		System.out.println("Employee Key = " + empKey);

		T studValue = (T) getValueFromKey(studMap, s2);
		System.out.println("Student Value = " + studValue);
		T studKey = (T) getKeyFromValue(studMap, true);
		System.out.println("Student Key = " + studKey);
	}

	@SuppressWarnings("unchecked")
	public static <T, K, L> T getKeyFromValue(HashMap<T, K> mapObject, L i) {
		Set<Entry<T, K>> s = mapObject.entrySet();
		Iterator<Entry<T, K>> itr = s.iterator();
		while (itr.hasNext()) {
			Entry<T, T> e = (Entry<T, T>) itr.next();
			// Integer j = (Integer) e.getValue();
			if (i == e.getValue()) {
				return (T) e.getKey();
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public static <T, K> T getValueFromKey(HashMap<T, K> mapObject, T e) {

		Set<T> s = mapObject.keySet();
		Iterator<T> itr = s.iterator();
		while (itr.hasNext()) {
			if (itr.next() == e) {
				return (T) mapObject.get(e);
			}
		}
		return null;
	}

}

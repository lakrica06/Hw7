import javax.crypto.spec.PSource;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Danila", "Sagan", Gender.Male);
        Person person2 = new Person("Egor","Ambrazhevich", Gender.Male);
        Person person3 = new Person("Ulyana","Gorbatzevich", Gender.Female);
        Person person4 = new Person("Maxim","Telica", Gender.Male);
        Person person5 = new Person("Anna","Sagan", Gender.Female);

        System.out.println(person1.equals(person3));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person4.toString());
        System.out.println();

        List<Person> list1 = new ArrayList<>();

        list1.add(person1);
        list1.add(person2);
        list1.add(person3);
        list1.add(person4);
        list1.add(person5);

        for(Person a : list1){
            System.out.println(a);
        }
        System.out.println("Количество элементов коллекции " + list1.size());
        System.out.println();

        Person person6 = new Person("Danila", "Sagan", Gender.Male);
        Person person7 = new Person("Egor","Ambrazhevich", Gender.Male);
        Person person8 = new Person("Alesya","Tumashik", Gender.Female);

        Set<Person> set1 = new HashSet<>();
        set1.add(person1);
        set1.add(person2);
        set1.add(person6);
        set1.add(person7);
        set1.add(person8);
        for(Person b : set1){
            System.out.println(b);
        }
        System.out.println("Количество уникальных элементов " + set1.size());
        System.out.println();

        Map<Integer, Person> map = new HashMap<>();
        map.put(1, person1);
        map.put(2, person2);
        map.put(3, person3);
        map.put(4, person4);
        map.put(5, person5);
       for(int c = 0; c <= 5; c++){
           System.out.println(map.get(c));
       }
        System.out.println("Количество элементов отображений " + map.size());
    }
}

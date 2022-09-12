import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;


public class ComplexExamples {

  public static void main(String[] args) {

    //TODO TASK 1 - Sorted List
    HashMap<Integer, String> map = new HashMap<>();
    for (Person person : RAW_DATA) {
      map.put(person.getId(), person.getName());
    }
    List<String> list = new ArrayList<>(map.values());
    Collections.sort(list);
    Set<String> printed = new HashSet<>();
    for (String key : list) {
      if (printed.add(key)) {
        System.out.println("Key: " + key + "\n" + "Value: " + Collections.frequency(list, key));
      }
    }

    System.out.println("**************************************************");

    //TODO TASK 2 - SUM NUMBERS == 10
    int[] numbers = new int[]{3, 4, 2, 7};
    int sum = 10;
    int[] k;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] + numbers[j] == sum) {
          k = new int[]{numbers[i], numbers[j]};
          System.out.println(Arrays.toString(k));
        }
      }
    }

    System.out.println("**************************************************");

    // TODO TASK 3 - Fuzzy search
     System.out.println(fuzzySearch("car", "ca6$$#_rtwheel"));
    System.out.println(fuzzySearch("cwhl", "cartwheel"));
    System.out.println(fuzzySearch("cwhee", "cartwheel"));
    System.out.println(fuzzySearch("cartwheel", "cartwheel"));
    System.out.println(fuzzySearch("cwheeel", "cartwheel"));
     System.out.println(fuzzySearch("lw", "cartwheel"));
  }


  private static boolean fuzzySearch(String s1, String s2) {
      String similar = "";
      if ((s1 != null) & (s2 != null)) {
        similar = Arrays.stream(s2.split("")) .filter(s1::contains) .collect(Collectors.joining());
      }  return similar.equals(s1);
    }


  static class Person {

    final int id;

    final String name;

    Person(int id, String name) {
      this.id = id;
      this.name = name;
    }

    public int getId() {
      return id;
    }

    public String getName() {
      return name;
    }


    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof Person person)) {
        return false;
      }
      return getId() == person.getId() && getName().equals(person.getName());
    }

    @Override
    public int hashCode() {
      return Objects.hash(getId(), getName());
    }
  }

  private static Person[] RAW_DATA = new Person[]{
      new Person(0, "Harry"),
      new Person(0, "Harry"),
      new Person(2, "Harry"),
      new Person(3, "Emily"),
      new Person(4, "Jack"),
      new Person(4, "Jack"),
      new Person(5, "Amelia"),
      new Person(5, "Amelia"),
      new Person(6, "Amelia"),
      new Person(7, "Amelia"),
      new Person(8, "Amelia"),
  };
}











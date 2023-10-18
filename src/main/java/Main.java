import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

  

    LinkedList<Person> myFamily = new LinkedList<>(List.of(
            new Person(1, "Bektur"),
            new Person(2, "Ainazik"),
            new Person(3, "Mama"),
            new Person(4, "Son"),
            new Person(5, "Daughter")
    ));
        System.out.println(myFamily);

}
}

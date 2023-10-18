import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.LinkedList;
import java.util.List;

public class FamilyTest {

    @Test
    public void testFamilyLinkedList() {
        LinkedList<Person> myFamily = new LinkedList<>(List.of(
                new Person(1, "Bektur"),
                new Person(2, "Ainazik"),
                new Person(3, "Mama"),
                new Person(4, "Son"),
                new Person(5, "Daughter")
        ));


        assertEquals(5, myFamily.size());

        assertEquals("Bektur", myFamily.get(0).getName());
        assertEquals("Ainazik", myFamily.get(1).getName());
        assertEquals("Mama", myFamily.get(2).getName());
        assertEquals("Son", myFamily.get(3).getName());
        assertEquals("Daughter", myFamily.get(4).getName());
    }
}

package netology.ru;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhonebookTest {
    Phonebook test = new Phonebook();

    @Test
    void addTest() {
        int tested = test.add("Иван", 111111);
        int tested2 = test.add("Иван", 222222);
        int tested3 = test.add("Антон", 222222);
        int expected = 1;
        int expected2 = 2;

        Assertions.assertEquals(expected, tested);
        Assertions.assertEquals(expected, tested2);
        Assertions.assertEquals(expected2, tested3);
    }
}

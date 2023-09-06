package netology.ru;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhonebookTest {
    Phonebook test;

    @BeforeEach
    void setUp() {
        test = new Phonebook();
    }

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

    @Test
    void findByNumberTest(){
        test.add("Иван", 111111);
        test.add("Петр", 222222);
        test.add("Алексей", 333333);
        String expectedIvan = "Иван";
        String expectedPetya = "Петр";
        String expectedAleksey = "Алексей";
        String expectedNotFound = "Number not found";

        Assertions.assertEquals(expectedIvan, test.findByNumber(111111));
        Assertions.assertEquals(expectedPetya, test.findByNumber(222222));
        Assertions.assertEquals(expectedAleksey, test.findByNumber(333333));
        Assertions.assertEquals(expectedNotFound, test.findByNumber(444444));
    }
}

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

    @Test
    void findByNameTest(){
        test.add("Иван", 111111);
        test.add("Петр", 222222);
        test.add("Алексей", 333333);
        int expectedIvan = 111111;
        int expectedPetya = 222222;
        int expectedAleksey = 333333;
        Assertions.assertEquals(expectedIvan, test.findByName("Иван"));
        Assertions.assertEquals(expectedPetya, test.findByName("Петр"));
        Assertions.assertEquals(expectedAleksey, test.findByName("Алексей"));
        Assertions.assertEquals(0, test.findByName("Роман"));

    }

    @Test
    void printAllNamesTest(){
        test.add("Иван", 111111);
        test.add("Петр", 222222);
        test.add("Алексей", 333333);
        String expected = "Алексей, т. 333333\nИван, т. 111111\nПетр, т. 222222";
        Assertions.assertEquals(expected, test.printAllNames());
    }
}

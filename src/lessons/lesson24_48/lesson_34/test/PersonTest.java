package lessons.lesson24_48.lesson_34.test;

import lessons.lesson24_48.lesson_34.Person;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

class PersonTest {

    Person person;

    String startEmail = "john@test.com";
    String startPassword = "Qwerty1!";

    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);
    }

//    @BeforeAll
//    void beforeAll() { // этот метод выполнится один раз перед запуском всех тестов (тестовых методов)
//
//    }

    // @AfterEach // метод выполнится после каждого теста
    // @AfterAll // метод выполнится один раз после всех тестов
    @Test
    void testSetValidEmail() {
        String validEmail = "valid@test.de";
        person.setEmail(validEmail);
        Assertions.assertEquals(validEmail, person.getEmail());
    }

    //@Disabled // указывает что Тест или группа Тестов отключены и не будут выполняться
    @Test
    void testInvalidEmail() {
        String incorrectEmail = "invalid.test.de";
        person.setEmail(incorrectEmail);
        Assertions.assertEquals(startEmail,person.getEmail());
    }

    @Test
    void testInvalidEmailTwoAtSet() {
        String incorrectEmailTwoAtSet = "invalid@test@.de";
        person.setEmail(incorrectEmailTwoAtSet);
        Assertions.assertEquals(startEmail, person.getEmail());
    }
    @Test
    void testInvalidDotEmail() {
        String incorrectDotEmail = "invalid@testde";
        person.setEmail(incorrectDotEmail);
        Assertions.assertEquals(startEmail,person.getEmail());
    }
    @Test
    void testInvalidBeginLettersEmail() {
        String incorrectBeginLettersEmail = "@test.de";
        person.setEmail(incorrectBeginLettersEmail);
        Assertions.assertEquals(startEmail,person.getEmail());
    }
    @Test
    void testInvalidEndLettersEmail() {
        String incorrectEndLettersEmail = "smith@test.d";
        person.setEmail(incorrectEndLettersEmail);
        Assertions.assertEquals(startEmail,person.getEmail());
    }

    @ParameterizedTest
    @ValueSource(strings = {"invalid@testd.e", "invalid@testde." , "invalid@testde"})
    void testIncorrectEmailSetParam(String incorrectEmail) {
        person.setEmail(incorrectEmail);
        Assertions.assertEquals(startEmail , person.getEmail());
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void testIntsParam(int value) {
        Assertions.assertTrue(value > 0);
        Assertions.assertFalse(value < 2);
    }
    static Stream<String> generateDataForEmailTest() {
        return Stream.of("invaДid@test.de", "inva!lid@test.de" , "invalid@te*st.de",
                "inva lid@test.de", "invalid@test.d#e", "invalid@te$st.de");
    }

    @ParameterizedTest
    @MethodSource("generateDataForEmailTest")
    void testIncorrectEmailSetParamMethodSource(String incorrectEmail) {
        Assertions.assertEquals(startEmail, person.getEmail());
    }
    @Disabled
    @ParameterizedTest
    @CsvSource({"apple, 1, true", "banana, 4, false", "cherry, 5, false"})
    void testCSVsource(String fruit, int count, boolean flag) {
        Assertions.assertNotNull(fruit);
        Assertions.assertTrue(count > 0);
        Assertions.assertFalse(flag);
    }
    @Disabled
    @ParameterizedTest
    @CsvFileSource(resources ="/data.csv")
    void testDataFromFile(String fruit, int count, boolean flag) {
        Assertions.assertNotNull(fruit);
        Assertions.assertTrue(count > 0);
        Assertions.assertFalse(flag);
    }

    @Test
    void testSetValidPassword() {
        String validPassword = "Qwerty1!";
        person.setPassword(validPassword);
        Assertions.assertEquals(validPassword, person.getPassword());
    }

    @Test
    void testInvalidPasswordLength() {
        String incorrectPassword = "Qwert1!";
        person.setPassword(incorrectPassword);
        Assertions.assertEquals(startPassword,person.getPassword());
    }
    @Test
    void testInvalidPasswordUpperCase() {
        String incorrectPassword = "qwerty1!";
        person.setPassword(incorrectPassword);
        Assertions.assertEquals(startPassword,person.getPassword());
    }
    @Test
    void testInvalidPasswordLowerCase() {
        String incorrectPassword = "QWERTY1!";
        person.setPassword(incorrectPassword);
        Assertions.assertEquals(startPassword,person.getPassword());
    }
    @Test
    void testInvalidPasswordDigit() {
        String incorrectPassword = "Qwertyu!";
        person.setPassword(incorrectPassword);
        Assertions.assertEquals(startPassword,person.getPassword());
    }
    @Test
    void testInvalidPasswordSpecialSymbol() {
        String incorrectPassword = "Qwerty12";
        person.setPassword(incorrectPassword);
        Assertions.assertEquals(startPassword,person.getPassword());
    }
}
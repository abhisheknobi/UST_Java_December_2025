import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class AssignmentTests {

    AssignmentLogic logic = new AssignmentLogic();

    // Example 1: Valid credentials -> pass
    @Test
    public void testUserLoginValidation() {
        assertTrue(logic.checkLogin("admin", "admin123"));
        assertFalse(logic.checkLogin("user", "pass"));
    }

    // Example 2: Age >= 18 eligible
    @Test
    public void testAgeEligibility() {
        assertTrue(logic.isEligibleToVote(18));
        assertFalse(logic.isEligibleToVote(17));
    }

    // Example 3: Input "java" -> Output "JAVA"
    @Test
    public void testStringUppercaseConversion() {
        assertEquals("JAVA", logic.convertToUppercase("java"));
    }

    // Example 4: Valid email passes test
    @Test
    public void testEmailValidation() {
        assertTrue(logic.isValidEmail("test@example.com"));
    }

    // Example 5: Short password fails
    @Test
    public void testPasswordLengthRule() {
        assertTrue(logic.isValidPasswordLength("password123"));
        assertFalse(logic.isValidPasswordLength("pass"));
    }

    // Example 6: CSV file passes test
    @Test
    public void testFileNameExtension() {
        assertTrue(logic.isCsvFile("data.csv"));
    }

    // Example 7: Username should not be null
    @Test
    public void testNullCheck() {
        assertNotNull(logic.getUsername());
    }

    // Example 8: List size should be 3
    @Test
    public void testListSize() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        assertEquals(3, logic.getListSize(list));
    }

    // Example 9: Value exists in array
    @Test
    public void testArrayContainsValue() {
        int[] data = {1, 2, 3, 4, 5};
        assertTrue(logic.arrayContains(data, 3));
    }

    // Example 10: Exception should be thrown
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionForInvalidAge() {
        logic.validateAge(-5);
    }

    // Example 11: Message should match exactly
    @Test
    public void testGreetingMessage() {
        assertEquals("Welcome, User", logic.getGreeting());
    }

    // Example 12: Active user returns true
    @Test
    public void testBooleanFlag() {
        assertTrue(logic.isUserActive());
    }

    // Example 13: Correct character count returned
    @Test
    public void testCharacterCount() {
        assertEquals(5, logic.getCharCount("Hello"));
    }

    // Example 14: Country code matches
    @Test
    public void testDefaultValue() {
        assertEquals("IN", logic.getDefaultCountryCode());
    }

    // Example 15: Data presence validated
    @Test
    public void testDataPresentFlag() {
        assertTrue(logic.isDataPresent());
    }
}
import java.util.List;

public class AssignmentLogic {

    // Example 1: User Login Validation
    // Logic: Returns true if username is "admin" and password is "admin123"
    public boolean checkLogin(String username, String password) {
        return "admin".equals(username) && "admin123".equals(password);
    }

    // Example 2: Age Eligibility
    // Logic: Returns true if age >= 18
    public boolean isEligibleToVote(int age) {
        return age >= 18;
    }

    // Example 3: String Uppercase Conversion
    // Logic: Returns input string in uppercase
    public String convertToUppercase(String input) {
        if (input == null) return null;
        return input.toUpperCase();
    }

    // Example 4: Email Validation
    // Logic: Returns true if email contains "@"
    public boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }

    // Example 5: Password Length Rule
    // Logic: Returns true if password length >= 8
    public boolean isValidPasswordLength(String password) {
        return password != null && password.length() >= 8;
    }

    // Example 6: File Name Extension
    // Logic: Returns true if file name ends with .csv
    public boolean isCsvFile(String filename) {
        return filename != null && filename.endsWith(".csv");
    }

    // Example 7: Null Check
    // Logic: Returns hardcoded username
    public String getUsername() {
        return "hardCodedUser"; 
    }

    // Example 8: List Size
    // Logic: Returns list size
    public int getListSize(List<String> list) {
        return list.size();
    }

    // Example 9: Array Contains Value
    // Logic: Returns true if value exists
    public boolean arrayContains(int[] array, int value) {
        for (int i : array) {
            if (i == value) return true;
        }
        return false;
    }

    // Example 10: Exception for Invalid Age
    // Logic: Throws IllegalArgumentException if age is negative
    public void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    // Example 11: Greeting Message
    // Logic: Returns "Welcome, User"
    public String getGreeting() {
        return "Welcome, User";
    }

    // Example 12: Boolean Flag
    // Logic: Returns boolean status
    public boolean isUserActive() {
        return true; 
    }

    // Example 13: Character Count
    // Logic: Returns string length
    public int getCharCount(String input) {
        return input == null ? 0 : input.length();
    }

    // Example 14: Default Value
    // Logic: Returns "IN"
    public String getDefaultCountryCode() {
        return "IN";
    }

    // Example 15: Data Present Flag
    // Logic: Returns true if data is present
    public boolean isDataPresent() {
        return true;
    }
}
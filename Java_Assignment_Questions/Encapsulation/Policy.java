package Java_Assignment_Questions.Encapsulation;
public class Policy {

    // Private data members
    private int policyId;
    private double premium;

    // Constructor
    public Policy(int policyId, int age) {
        this.policyId = policyId;
        calculatePremium(age); // business rule hidden here
    }

    // Private method for premium calculation
    private void calculatePremium(int age) {
        if (age < 25) {
            premium = 5000;
        } else if (age <= 40) {
            premium = 3000;
        } else {
            premium = 2000;
        }
    }

    // Public getter methods
    public int getPolicyId() {
        return policyId;
    }

    public double getPremium() {
        return premium;
    }

     public static void main(String[] args) {
        Policy p = new Policy(101, 30);

        System.out.println("Policy ID: " + p.getPolicyId());
        System.out.println("Premium: " + p.getPremium());
    }
}


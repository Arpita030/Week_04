package insurance_policy_management_system;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy("P123", "Manish Patel", new Date(2023, 12, 31), "Health", 1500.0));
        manager.addPolicy(new Policy("P456", "Arpita Goutam", new Date(2023, 11, 15), "Auto", 2000.0));
        manager.addPolicy(new Policy("P789", "Shubhanshi Verma", new Date(2023, 10, 20), "Home", 3000.0));
        manager.addPolicy(new Policy("P123", "Raj Chandanan", new Date(2023, 12, 31), "Health", 1800.0));

        manager.displayAllPolicies();



        
        manager.displayPoliciesExpiringSoon();

        manager.displayPoliciesByCoverageType("Health");

        manager.displayDuplicatePolicies();

        manager.comparePerformance();

    }
}

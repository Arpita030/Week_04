package Insurance_policy_management_using_map;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();

        manager.addPolicy(new Policy("P001", "Raj", LocalDate.now().plusDays(10)));
        manager.addPolicy(new Policy("P002", "Manish", LocalDate.now().plusDays(40)));
        manager.addPolicy(new Policy("P003", "Arpita", LocalDate.now().plusDays(5)));
        manager.addPolicy(new Policy("P004", "Bhuri", LocalDate.now().minusDays(1)));

        System.out.println("Retrieve P001: " + manager.getPolicyByNumber("P001"));

        System.out.println("\nExpiring Policies:");
        manager.getExpiringPolicies().forEach(System.out::println);

        System.out.println("\nPolicies for Raj:");
        manager.getPoliciesByHolder("Raj").forEach(System.out::println);

        System.out.println("\nRemoving expired policies...");
        manager.removeExpiredPolicies();
        manager.displayAllPolicies();
    }
}

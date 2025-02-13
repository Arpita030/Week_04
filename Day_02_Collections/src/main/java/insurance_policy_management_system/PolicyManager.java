package insurance_policy_management_system;

import java.util.*;

public class PolicyManager {
    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public void displayAllPolicies() {
        System.out.println("All Policies (HashSet):");
        hashSet.forEach(System.out::println);

        System.out.println("\nAll Policies (LinkedHashSet):");
        linkedHashSet.forEach(System.out::println);

        System.out.println("\nAll Policies (TreeSet):");
        treeSet.forEach(System.out::println);
    }

    public void displayPoliciesExpiringSoon() {
        Date now = new Date();
        long thirtyDaysInMillis = 30L * 24 * 60 * 60 * 1000;
        Date thirtyDaysLater = new Date(now.getTime() + thirtyDaysInMillis);

        System.out.println("Policies Expiring Soon:");
        treeSet.stream()
                .filter(policy -> policy.getExpiryDate().after(now) && policy.getExpiryDate().before(thirtyDaysLater))
                .forEach(System.out::println);
    }

    public void displayPoliciesByCoverageType(String coverageType) {
        System.out.println("Policies with Coverage Type: " + coverageType);
        hashSet.stream()
                .filter(policy -> policy.getCoverageType().equalsIgnoreCase(coverageType))
                .forEach(System.out::println);
    }

    public void displayDuplicatePolicies() {
        Set<String> seenPolicyNumbers = new HashSet<>();
        System.out.println("Duplicate Policies:");
        hashSet.stream()
                .filter(policy -> !seenPolicyNumbers.add(policy.getPolicyNumber()))
                .forEach(System.out::println);
    }

    public void comparePerformance() {
        Policy samplePolicy = new Policy("P123", "John Doe", new Date(), "Health", 100.0);

        long startTime = System.nanoTime();
        hashSet.add(samplePolicy);
        long hashSetAddTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        linkedHashSet.add(samplePolicy);
        long linkedHashSetAddTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        treeSet.add(samplePolicy);
        long treeSetAddTime = System.nanoTime() - startTime;

        System.out.println("\nPerformance Comparison:");
        System.out.println("HashSet Add Time: " + hashSetAddTime + " ns");
        System.out.println("LinkedHashSet Add Time: " + linkedHashSetAddTime + " ns");
        System.out.println("TreeSet Add Time: " + treeSetAddTime + " ns");

        startTime = System.nanoTime();
        hashSet.contains(samplePolicy);
        long hashSetSearchTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        linkedHashSet.contains(samplePolicy);
        long linkedHashSetSearchTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        treeSet.contains(samplePolicy);
        long treeSetSearchTime = System.nanoTime() - startTime;

        System.out.println("\nHashSet Search Time: " + hashSetSearchTime + " ns");
        System.out.println("LinkedHashSet Search Time: " + linkedHashSetSearchTime + " ns");
        System.out.println("TreeSet Search Time: " + treeSetSearchTime + " ns");

        startTime = System.nanoTime();
        hashSet.remove(samplePolicy);
        long hashSetRemoveTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        linkedHashSet.remove(samplePolicy);
        long linkedHashSetRemoveTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        treeSet.remove(samplePolicy);
        long treeSetRemoveTime = System.nanoTime() - startTime;

        System.out.println("\nHashSet Remove Time: " + hashSetRemoveTime + " ns");
        System.out.println("LinkedHashSet Remove Time: " + linkedHashSetRemoveTime + " ns");
        System.out.println("TreeSet Remove Time: " + treeSetRemoveTime + " ns");
    }
}
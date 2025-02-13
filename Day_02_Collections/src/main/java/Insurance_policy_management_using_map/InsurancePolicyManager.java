package Insurance_policy_management_using_map;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManager {
    private final Map<String, Policy> policyMap = new HashMap<>();
    private final Map<String, Policy> orderedPolicyMap = new LinkedHashMap<>();
    private final TreeMap<LocalDate, Policy> sortedByExpiry = new TreeMap<>();

    public void addPolicy(Policy policy) {
        policyMap.put(policy.policyNumber, policy);
        orderedPolicyMap.put(policy.policyNumber, policy);
        sortedByExpiry.put(policy.expiryDate, policy);
    }

    public Policy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    public List<Policy> getExpiringPolicies() {
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);
        return new ArrayList<>(sortedByExpiry.subMap(today, next30Days).values());
    }

    public List<Policy> getPoliciesByHolder(String policyHolder) {
        List<Policy> result = new ArrayList<>();
        for (Policy policy : policyMap.values()) {
            if (policy.policyHolder.equalsIgnoreCase(policyHolder)) {
                result.add(policy);
            }
        }
        return result;
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<LocalDate, Policy>> iterator = sortedByExpiry.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<LocalDate, Policy> entry = iterator.next();
            if (entry.getKey().isBefore(today)) {
                Policy expiredPolicy = entry.getValue();
                policyMap.remove(expiredPolicy.policyNumber);
                orderedPolicyMap.remove(expiredPolicy.policyNumber);
                iterator.remove();
            }
        }
    }

    public void displayAllPolicies() {
        for (Policy policy : orderedPolicyMap.values()) {
            System.out.println(policy);
        }
    }
}

package insurance_policy_management_using_map;

import Insurance_policy_management_using_map.InsurancePolicyManager;
import Insurance_policy_management_using_map.Policy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InsurancePolicyManagerTest {
    private InsurancePolicyManager manager;

    @BeforeEach
    void setUp() {
        manager = new InsurancePolicyManager();

        manager.addPolicy(new Policy("P001", "Raj", LocalDate.now().plusDays(10)));
        manager.addPolicy(new Policy("P002", "Manish", LocalDate.now().plusDays(40)));
        manager.addPolicy(new Policy("P003", "Arpita", LocalDate.now().plusDays(5)));
        manager.addPolicy(new Policy("P004", "Bhuri", LocalDate.now().minusDays(1))); // Expired policy
    }

    @Test
    void testGetPolicyByNumber() {
        assertNotNull(manager.getPolicyByNumber("P001"), "Policy P001 should be retrievable.");
        assertNull(manager.getPolicyByNumber("P999"), "Non-existent policy should return null.");
    }

    @Test
    void testGetExpiringPolicies() {
        List<Policy> expiringPolicies = manager.getExpiringPolicies();
        assertTrue(expiringPolicies.size() > 0, "There should be policies expiring within 30 days.");
    }

    @Test
    void testGetPoliciesByHolder() {
        List<Policy> rajPolicies = manager.getPoliciesByHolder("Raj");
        assertEquals(1, rajPolicies.size(), "Raj should have exactly one policy.");
    }

    @Test
    void testRemoveExpiredPolicies() {
        manager.removeExpiredPolicies();
        assertNull(manager.getPolicyByNumber("P004"), "Expired policy P004 should be removed.");
    }
}

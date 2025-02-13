package voting_system;

import java.util.*;

public class VotingSystem {
    private Map<String, Integer> voteMap = new HashMap<>();;
    private Map<String, Integer> sortedResults;
    private LinkedHashMap<String, Integer> voteHistory = new LinkedHashMap<>();; // LinkedHashMap to maintain vote order


    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        voteHistory.put(candidate, voteMap.get(candidate));
    }

    public void displayResults() {
        sortedResults = new TreeMap<>((a, b) -> voteMap.get(b) - voteMap.get(a));
        sortedResults.putAll(voteMap);

        System.out.println("Election Results (Sorted by Votes):");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }

    public void displayVoteOrder() {
        System.out.println("\nVote Order (As Cast):");
        for (Map.Entry<String, Integer> entry : voteHistory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }
}

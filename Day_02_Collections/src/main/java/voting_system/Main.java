package voting_system;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        votingSystem.castVote("Arpita");
        votingSystem.castVote("Bobby");
        votingSystem.castVote("Arpita");
        votingSystem.castVote("Chandrika");
        votingSystem.castVote("Arpita");
        votingSystem.castVote("Bobby");

        votingSystem.displayResults();

        votingSystem.displayVoteOrder();
    }
}


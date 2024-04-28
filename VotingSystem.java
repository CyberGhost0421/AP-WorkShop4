import java.util.ArrayList;


public class VotingSystem {
    private ArrayList<Voting> votingList;
    private Object index;

    public VotingSystem() {
        this.votingList = new ArrayList<>();
    }

    public void createVoting(String question, boolean isAnonymous, int type, ArrayList<String> choices) {
        Voting voting = new Voting(question, type, isAnonymous);
        for (String choice : choices) {
            voting.createChoice(choice);
        }
        votingList.add(voting);
    }

    public Voting getVoting(int index) {
        if (index < 0 || index >= votingList.size()) {
            System.out.println("Invalid index.");
            return null;
        }
        return votingList.get(index);
    }

    public ArrayList<Voting> getVotingList() {
        return votingList;
    }

    public void printResults(int index) {
        Voting voting = getVoting(index);
        if (voting != null) {
            voting.printResults();
        }
    }

    public void printVoters(int index) {
        Voting voting = getVoting(index);
        if (voting != null) {
            voting.printVoters();
        }
    }

    public void printVoting(int index) {
        Voting voting = getVoting(index);
        if (voting != null) {
            System.out.println("Question: " + voting.getQuestion());
            System.out.println("Choices:");
            for (String choice : voting.getChoices()) {
                System.out.println(choice);
            }
        }
    }
}

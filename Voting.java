import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

class Voting {
    private String question;
    private int type;
    private HashMap<String, HashSet<Person>> choices;
    private boolean isAnonymous;
    private ArrayList<Person> voters;

    public Voting(String question, int type, boolean isAnonymous) {
        this.question = question;
        this.type = type;
        this.isAnonymous = isAnonymous;
        this.choices = new HashMap<>();
        this.voters = new ArrayList<>();
    }

    public String getQuestion() {
        return question;
    }

    public int getType() {
        return type;
    }

    public boolean isAnonymous() {
        return isAnonymous;
    }

    public ArrayList<String> getChoices() {
        return new ArrayList<>(choices.keySet());
    }

    public void createChoice(String choice) {
        choices.put(choice, new HashSet<>());
    }

    public void vote(Person voter, String voterChoices) {
        if (isAnonymous) {
            System.out.println("Error: Anonymous voting enabled. Use vote(Person person) instead.");
            return;
        }

            vote(voterChoices, voter);

    }

    public void vote(Person person) {
        if (!isAnonymous) {
            System.out.println("Error: Anonymous voting disabled. Use vote(Person voter, ArrayList<String> voterChoices) instead.");
            return;
        }
        ArrayList<String> allChoices = getChoices();
        Random random;
        random = new Random();
        String randomChoice = allChoices.get(random.nextInt(allChoices.size()));
        vote(randomChoice, person);
    }

    private void vote(String choice, Person person) {
        if (type == 0 && voters.contains(person)) {
            System.out.println("Sorry, you can only vote once.");
            return;
        }
        if (!choices.containsKey(choice)) {
            System.out.println("Invalid choice.");
            return;
        }
        HashSet<Person> votersForChoice = choices.get(choice);
        votersForChoice.add(person);
        voters.add(person);
        System.out.println("Vote recorded successfully.");
    }

    public void printResults() {
        System.out.println("Results for the vote: " + question);
        for (Map.Entry<String, HashSet<Person>> entry : choices.entrySet()) {
            String choice = entry.getKey();
            HashSet<Person> votersForChoice = entry.getValue();
            System.out.println(choice + ": " + votersForChoice.size());
        }
    }

    public void printVoters() {
        if (isAnonymous) {
            System.out.println("Error: Anonymous voting enabled. Voters cannot be printed.");
            return;
        }
        System.out.println("Voters for each choice:");
        for (Map.Entry<String, HashSet<Person>> entry : choices.entrySet()) {
            String choice = entry.getKey();
            HashSet<Person> votersForChoice = entry.getValue();
            System.out.println(choice + ": " + votersForChoice);
        }
    }

    public void printVoter() {
        if (isAnonymous) {
            System.out.println("Error: Anonymous voting enabled. Voters cannot be printed.");
            return;
        }
        System.out.println("Voters for each choice:");
        for (Map.Entry<String, HashSet<Person>> entry : choices.entrySet()) {
            String choice = entry.getKey();
            HashSet<Person> votersForChoice = entry.getValue();
            System.out.println(choice + ": " + votersForChoice);
        }
    }
}

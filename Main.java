import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an instance of VotingSystem
        VotingSystem votingSystem = new VotingSystem();
        ArrayList<String> choices = new ArrayList<>();
        choices.add("1");
        choices.add("2");
        choices.add("3");


        // Create a new voting with different types
        votingSystem.createVoting("Do you like pizza?", false, 0 , choices);
        votingSystem.createVoting("What is your favorite color?", true, 1 , choices);

        // Display all the votings
        votingSystem.printVoting(2);

        // Retrieve the first voting
        Voting voting1 = votingSystem.getVoting(0);
        if (voting1 != null) {
            // Add choices to the first voting
            voting1.createChoice("Yes");
            voting1.createChoice("No");

            // Create some Person instances
            Person person1 = new Person("mahsa" , "mohammadi");
            Person person2 = new Person("asghar" , "aliabadi");

            // Vote in the first voting
            voting1.vote(person1, "Yes");
            voting1.vote(person2, "No");

            // Display the results of the first voting
            voting1.printResults();
            voting1.printVoters();
        }

        // Retrieve the second voting
        Voting voting2 = votingSystem.getVoting(1);
        if (voting2 != null) {
            // Add choices to the second voting
            voting2.createChoice("Red");
            voting2.createChoice("Blue");
            voting2.createChoice("Green");

            // Create some Person instances
            Person person1 = new Person("mahdi" , "oudi");
            Person person2 = new Person("ali" , "asghari");

            // Vote in the second voting
            voting2.vote(person1, "Red");
            voting2.vote(person2, "Blue");

            // Display the results of the second voting
            voting2.printResults();
            voting2.printVoters();
        }
    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        ArrayList<String> choices1 = new ArrayList<>();
        choices1.add("Yes");
        choices1.add("No");
        votingSystem.createVoting("Do you like pizza?", false, 0 , choices1);
        votingSystem.printVoting(0);

        System.out.println("\n");

        Voting voting1 = votingSystem.getVoting(0);

        if (voting1 != null) {
            Person person1 = new Person("mahsa" , "mohammadi");
            Person person2 = new Person("asghar" , "aliabadi");

            voting1.vote(person1, "Yes");
            voting1.vote(person2, "No");
            System.out.println("\n");

            voting1.printResults();
            voting1.printVoters();
        }

        System.out.println("\nVoting 2  : \n");


        ArrayList<String> choices2 = new ArrayList<>();
        choices2.add("Red");
        choices2.add("Green");
        choices2.add("Blue");
        votingSystem.createVoting("What is your favorite color?", false, 1 , choices2);
        votingSystem.printVoting(1);

        Voting voting2 = votingSystem.getVoting(1);
        System.out.println("\n");

        if (voting2 != null) {
            voting2.createChoice("Brown");

            Person person1 = new Person("mahdi" , "oudi");
            Person person2 = new Person("ali" , "asghari");
            Person person3 = new Person("mmd" , "rohani");
            Person person4 = new Person("mahsa" , "khani");
            Person person5 = new Person("dina" , "alikhani");

            voting2.vote(person1, "Red");
            voting2.vote(person2, "Blue");
            voting2.vote(person3, "Red");
            voting2.vote(person4, "Blue");
            voting2.vote(person5, "Green");
            System.out.println("\n");

            voting2.printResults();
//            voting2.printVoters();
        }
    }
}

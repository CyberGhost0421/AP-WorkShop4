import java.util.Objects;

public class Vote {

    private Person voter;

    private String date;

    public Vote(Person voter , String date){
        this.voter = voter;
        this.date = date;
    }

    public Person getVoter() {
        return voter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return Objects.equals(voter, vote.voter) && Objects.equals(date, vote.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voter, date);
    }

    public String getDate() {
        return date;
    }

}

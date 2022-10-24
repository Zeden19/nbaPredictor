public class Team {
    int offensiveRating;
    int defensiveRating;
    String name;
    String conference;
    int win;
    int loss;

    public Team(int offensiveRating, int defensiveRating, String name, String conference) {
        this.defensiveRating = defensiveRating;
        this.offensiveRating = offensiveRating;
        this.name = name;
        this.conference = conference;
    }
}

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

    public String toString() {
        return "Team: " + name + " | Conference: " + conference + "\nOffensive Rating: "  + offensiveRating
                + " | Defensive Rating: " + defensiveRating + "\nWins: " + win + " | Losses:" + loss;
    }

    public int getOffensiveRating(){return offensiveRating;}

    public int getDefensiveRating() {return defensiveRating;}

    public int getWin() {return win;}

    public int getLoss() {return loss;}

    public String getName() {return name;}

    public String getConference() {return conference;}
}

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

    public Team(String name, String conference) {
        this.name = name;
        this.conference = conference;
        offensiveRating = -1;
        defensiveRating = -1;
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

    public void setOffensiveRating(int offensiveRating) {this.offensiveRating = offensiveRating;}

    public void setDefensiveRating(int defensiveRating) {this.defensiveRating = defensiveRating;}




}


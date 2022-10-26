import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.net.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        HashMap<String, Team> teams = new HashMap<>();
        WebsiteData teamData = new WebsiteData("https://www.balldontlie.io/api/v1/teams");
        String stringData = teamData.getData();

        String[] teamArray = stringData.split("},");
        for (String team : teamArray) {
            String[] teamInfo = team.split(",");
            String abbreviation = teamInfo[1].split(":")[1].replace("\"", "");
            String conference = teamInfo[3].split(":")[1].replace("\"", "");
            String name = teamInfo[5].split(":")[1].replace("\"", "");
            teams.put(abbreviation, new Team(name, conference));
        }

        System.out.println(teams.get("GSW"));

    }
}



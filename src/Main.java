import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.net.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        HashMap<String, Team> teams = new HashMap<>();
        Team tor = new Team(0, 0, "Toronto Raptors", "East");
        teams.put("tor", tor);
        System.out.println(teams.get("tor"));



        try {
            URL url = new URL("https://www.balldontlie.io/api/v1/teams/");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            int responseCode = connection.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("Oops");
            } else{
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                scanner.close();

                System.out.println(informationString);
            }

        }
    catch (Exception e) {
        throw e;
        }
    }

}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.net.*;

public class Main {

    public static void main(String[] args) throws IOException {
        HashMap<String, Team> teams = new HashMap<String, Team>();
        Team tor = new Team(0, 0, "Toronto Raptors", "East");
        teams.put("tor", tor);


//        StringBuilder content = new StringBuilder();
//        URL url = new URL("https://www.nba.com/teams");
//        URLConnection urlConnection = url.openConnection();
//
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//        String line;
//        while ((line = bufferedReader.readLine()) != null)
//        {
//            content.append(line + "\n");
//        }
//        bufferedReader.close();
//        System.out.println(content.toString());

    }

}


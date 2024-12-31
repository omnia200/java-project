import java.util.ArrayList;
import java.util.List;

public class Team {
    String teamName;
    String coach;
    List<Player> players;

    public Team(String teamName, String coach) {
        this.teamName = teamName;
        this.coach = coach;
        this.players = new ArrayList<>();
    }

    public Team(String teamBName) {
        this.teamName=teamBName;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public String getTeamStats() {
        return "Team: " + teamName + ", Coach: " + coach + ", Players: " + players.size();
    }
}
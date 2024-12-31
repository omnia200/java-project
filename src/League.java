import java.util.ArrayList;
import java.util.List;

    public class League {
            String leagueName;
            List<Team> teams;
            List<Match> schedule;
            public League(String leagueName) {
                this.leagueName = leagueName;
                this.teams= new ArrayList<>();
                this.schedule = new ArrayList<>();
            }
            public void addTeam(Team team){
                teams.add(team);
            }
        public int addScore(int score){
            return score;
        }
            }




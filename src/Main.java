    import java.util.*;
    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
        public class Main {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("enter your league name");
                String leagueName = scan.nextLine();
                League league = new League(leagueName);
                String teamName = "";
                String coachName="";

                while (true) {
                    System.out.print("Enter team name ('done' to finish adding teams): ");
                    teamName = scan.nextLine();
                    if (teamName.equalsIgnoreCase("done")) break;
                    ///////////////////coach data/////////////////////////////////////////
                    System.out.print("Enter the coach's name for team " + teamName + ": ");
                    coachName = scan.nextLine();

                    Team team = new Team(teamName, coachName);
                    league.addTeam(team);

                    //add player///////////////////////////////////////////////////////////
                    while (true) {
                        System.out.print("Add a player to " + teamName + " ('done' to finish adding players): ");
                        String playerName = scan.nextLine();
                        if (playerName.equalsIgnoreCase("done")) break;

                        System.out.print("Enter age for " + playerName + ": ");
                        int age = scan.nextInt();
                        scan.nextLine();

                        System.out.print("Enter position for " + playerName + ": ");
                        String position = scan.nextLine();

                        System.out.print("Enter goals for " + playerName + ": ");
                        int goals = scan.nextInt();

                        System.out.print("Enter assists for " + playerName + ": ");
                        int assists = scan.nextInt();

                        System.out.print("Enter matches_played for " + playerName + ": ");
                        int playedMatches = scan.nextInt();
                        scan.nextLine();

                        Player player = new Player(playerName, age, position, goals, assists, playedMatches);
                        team.addPlayer(player);

        //                System.out.println(player.getStats());
        //                System.out.println(team.getTeamStats());
        //                System.out.println(player.calculatePerformance());
            }}
                System.out.println("\n your League Summary:\n");
                System.out.println("League Name: " + league.leagueName);
                for (Team team : league.teams) {
                    System.out.println(team.getTeamStats());
                    for (Player player : team.players) {
                        System.out.println("  " + player.getStats());
                        System.out.println(player.calculatePerformance());}}
                
                System.out.println("\nFinal Match Results:");
                System.out.println("Enter the name of Team A:");
                String teamAName = scan.nextLine();
                Team teamA = new Team(teamAName);

                System.out.println("Enter the name of Team B:");
                String teamBName = scan.nextLine();
                Team teamB = new Team(teamBName);

                System.out.println("Enter the score for " + teamAName + ":");
                int scoreA = scan.nextInt();

                System.out.println("Enter the score for " + teamBName + ":");
                int scoreB = scan.nextInt();

                Match match = new Match(teamA, teamB, scoreA, scoreB);
                match.printFinalResults();
                scan.close();

            }}

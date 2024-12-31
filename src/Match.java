public class Match {
    Team teamA;
    Team teamB;
    int scoreA;
    int scoreB;

    public Match(Team teamA, Team teamB, int scoreA, int scoreB) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.scoreA = scoreA;
        this.scoreB = scoreB;
    }
    public void printFinalResults() {

        System.out.println(teamA.teamName + ": " + scoreA + " goals");
        System.out.println(teamB.teamName + ": " + scoreB + " goals");

        if (scoreA > scoreB) {
            System.out.println("The Winner is : " + teamA.teamName);
        } else if (scoreA < scoreB) {
            System.out.println("The Winner is : " + teamB.teamName);
        } else {
            System.out.println("The match ended in a draw!");
        }
    }}
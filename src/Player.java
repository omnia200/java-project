public class Player extends User {
    public int age;
   public   String position;
   public   int goals;
   public    int assists;
    public int played_matches;
    public Player(String name,int age,String position,int goals,int assists,int played_matches) {
        super(name,"player");
        this.age=age;
        this.position=position;
        this.goals=goals;
        this.assists=assists;
        this.played_matches=played_matches;
    }

    ///////////////////////get,set////////////////////
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setGoals(int goals) {
        this.goals = goals;
    }
    public int getGoals() {
        return goals;
    }
    public int getAssists() {
        return assists;
    }
    public void setAssists(int assists) {
        this.assists = assists;
    }

    public void setPlayed_matches(int played_matches) {
        this.played_matches = played_matches;
    }
    public int getPlayed_matches() {
        return played_matches;
    }
    public String calculatePerformance() {
        if (played_matches==0)
            return "the performane is:0";
        else {
            return (" the performane of "+getName()+" is:"+(goals + assists) / (float) played_matches);
        }
    }
    public String getStats() {
        return "Name: " + getName() + ", Position: " + position + ", Goals: " + goals + ", Assists: " + assists+" ,num_of_matches:"+played_matches;
    }

}



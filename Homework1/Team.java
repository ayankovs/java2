package Homework1;


public class Team {
    String TeamName;
    Competitor[] Members;

    public Team (String Teamname, Competitor[] competitors) {
      this.TeamName = Teamname;
      Members = competitors.clone();
     }

    public void GetTeamInfo () {
        System.out.println(this.TeamName+":");
        for (Competitor c : Members) {
            c.infoteam();
        }
    }

    public void GetDoneRes () {
        System.out.println("Из команды-"+this.TeamName+" прошли дистанцию следующие участники:");
        for (Competitor c : Members) {
            c.infores();
        }
    }
}

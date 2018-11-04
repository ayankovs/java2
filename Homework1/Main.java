package Homework1;

public class Main {
    public static void main(String[] args) {


        Competitor[] competitors = {new Human("John"), new Human("Bob"), new Cat("Vaska"), new Dog("Sharik")};
        Team Team1 = new Team("Команда1", competitors);
        Team1.GetTeamInfo();
        Barrier[] barriers = {new Cross(80), new Wall(5), new Water(3)};
       /// System.out.println(competitors);
        Curse c = new Curse(barriers);
        c.StartRace(Team1);

        /*for (Competitor c : Team1.Members) {
            for (Barrier b : barriers) {
                b.doIt(c);
                if (!c.isOnDistance()) {
                    break;
                }
            }
        }
        */
/*        for (Competitor c : Team1.Members) {
            c.info();
        }*/
        Team1.GetDoneRes();
    }
}

package Homework1;



public class Curse {
    Barrier[] curse;

    public Curse(Barrier[] Barrier) {
        curse = Barrier.clone();
    }

    public void StartRace (Team t) {
        for (Competitor c : t.Members) {
            for (Barrier b: curse) {
                b.doIt(c);
            }
        }
    }
}

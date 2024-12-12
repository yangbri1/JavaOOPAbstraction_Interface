// where it goes down
public class Main {
    
    public static void main(String[] args) {
        // print block showing brief intro
        System.out.println("Inheritance via Interfaces");
        System.out.println();
        System.out.println("Game recap:");

        // creating 'SoccerPlayer' & 'Midfielder' objs
        SoccerPlayer mbappe = new SoccerPlayer("Mbappe");
        Midfielder rin = new Midfielder("Satoshi Rin");

        // call dribbleBall() method implemented from 'BallHandler' interface (from mbappe & rin objs)
        /* interface abstracts/separates away implementation (.dribbleBall()) from intent (for which player) */
        mbappe.dribbleBall();
        rin.dribbleBall();

        // calling takeShot() method implemented from 'Shooter' interface
        System.out.println(mbappe.takeShot("Penalty kicks"));

        // console log output stream 'sport' variable from 'BallHandler' interface 
        /* since variable is 'static' can access variable directly from 'BallHandler' interface (w/o instantiation b4) */
        System.out.println("This is " + BallHandler.sport + " at it's finest! Exclaims the caster!");  // can have concrete variables in interface

        // calling 'BallHandler' interface's concrete method directly from interface
        // b/c '.dropTheBall()' is a concrete "static" method (static methods DN need instatiation of class for an obj b4-hand)
        BallHandler.dropTheBall();
    }
}
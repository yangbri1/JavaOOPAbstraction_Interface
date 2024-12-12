// Aside: Classes do NOT support multiple inheritance (via extends)
// ... while Interfaces do indeed support multiple inheritances (via implements) 
class SoccerPlayer implements BallHandler, Shooter {
    // declare instance field for 
    String name;

    public SoccerPlayer(String name){
        // assigning instance field 'name' w/ value of arg 'name'
        this.name = name;
    }

    // implement 'BallHandler' interface's abstract method (required since 'abstract' otw errors)
    @Override
    public void dribbleBall(){
        System.out.println(name + " performs an air elastico on the center stage, between two defenders ...");
    }

    // implement 'Shooter' interface's abstract method (much needed as 'implements' in otw errors)
    @Override
    public String takeShot(String shot){
        return("Goalie braces for the barage of " + shot + " headed his way --- the crowd roars in approval!" );
    }
}
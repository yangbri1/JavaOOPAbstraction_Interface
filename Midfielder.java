// 'Midfielder' class 'implements' from 'BallHandler' interface (can implement multiple interfaces) to use 'dribbleBall()' method
class Midfielder implements BallHandler {   
    // Why didn't 'implements' 'Shooter' like 'SoccerPlayer'?
    // It does NOT fit in with the role of a midfielder which is the interim to pass ball up for strikers to aim
    
    // declare instance field/variable 'name'
    String name;

    // constructor
    Midfielder(String name) {
        // setting 'Midfielder' class instance field 'name' to arg's 'name' value
        this.name = name;
    }

    // method from 'BallHandler' interface
    public void dribbleBall() {
        System.out.println(name + " Dribbles behind the back, b/t legs (nutmeg), slick moves all around defender");
    }
}
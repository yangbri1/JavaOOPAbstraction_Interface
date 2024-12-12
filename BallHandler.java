interface BallHandler {
    // const variable -- interface variables are public, static, & final implicitly
    String sport = "Soccer";
    // public static final String sport = "Soccer"; // equivalent to above

    // concrete methods must be static for interfaces
    /* Why does the interface variables & methods need to be 'static'?
    - 'static' keyword makes them part of interface itself rather than instances (can't instantiate objs from interface) */
    public static void dropTheBall() {
        System.out.println("The ball bounces a couple of times, rolls away, and players rush to intercept it.");
    }

    // abstract method -- again just method signature and no implementation
    public void dribbleBall();
}
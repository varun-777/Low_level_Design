package CARDESIGN;

enum Enginestate {
    IDLE,
    RUNNING,
    OVERHEATED
}

public class Engine {
    private Enginestate state;

    public Engine() {
        state = Enginestate.IDLE;
    }

    public void start() {
        if (state == Enginestate.RUNNING) {
            System.out.println("The car is already running");
            return;
        }
        if (state == Enginestate.OVERHEATED) {
            System.out.println("The engine is overheatd , Can't start right now! ");
            return;
        }
        state = Enginestate.RUNNING;
        System.out.println("The engine has started successfully");
    }

    public void stop() {
        if (state == Enginestate.RUNNING) {
            System.out.println("The engine has successfully stopped");
            state = Enginestate.IDLE;
            return;
        }
    }

    public void overheat() {
        state = Enginestate.OVERHEATED;
        System.out.println("Engine overheated");
    }

    public boolean isRunning() {
        return state == Enginestate.RUNNING;
    }

    public boolean ishealthy() {
        return state != Enginestate.OVERHEATED;
    }
}

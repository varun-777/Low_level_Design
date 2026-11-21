package CARDESIGN;

import java.util.*;

public class Car {
    private Engine engine;
    private List<Wheels> wheels;

    public Car() {
        engine = new Engine();
        wheels = new ArrayList<>();

        wheels.add(new Wheels(32));
        wheels.add(new Wheels(28));
        wheels.add(new Wheels(35));
        wheels.add(new Wheels(25));
    }

    public void start() {
        if (!engine.ishealthy()) {
            System.out.println("Car cannot start now as engine is overheated");
            return;
        }
        if (engine.isRunning()) {
            System.out.println("The car is already running");
            return;
        }
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void accelerate(int speed) {
        if (speed < 0)
            throw new IllegalArgumentException("Invalid speed");
        if (engine.isRunning()) {
            System.out.println("The car is accelerating at a speed of " + speed + " km per hr");
        } else {
            System.out.println("The car cannot accelerate now as engine is not running");
            return;
        }
    }

    public List<Wheels> checktyres() {
        List<Wheels> underinflated = new ArrayList<>();
        for (Wheels wheel : wheels) {
            if (wheel.getpressure() < 30) {
                underinflated.add(wheel);
            }
        }
        return underinflated;
    }
}

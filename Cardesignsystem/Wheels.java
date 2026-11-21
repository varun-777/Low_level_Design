package CARDESIGN;

public class Wheels {
    private double pressure;

    public Wheels(double pressure) {
        if (pressure < 0) {
            throw new IllegalArgumentException("Invalid pressure");
        }
        this.pressure = pressure;
    }

    public double getpressure() {
        return pressure;
    }

    public void inflate(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid pressure");
        }
        pressure += amount;
    }
}

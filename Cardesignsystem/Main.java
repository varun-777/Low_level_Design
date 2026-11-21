package CARDESIGN;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.start();
        car1.accelerate(100);
        car1.stop();
        System.out.println("Number of underflated tyres: " + car1.checktyres().size());

        Wheels wheels = new Wheels(35);
        System.out.println(wheels.getpressure());
    }
}

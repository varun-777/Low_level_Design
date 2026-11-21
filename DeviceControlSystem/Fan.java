public class Fan extends Device {

    public void turnOn() {
        if (isOn())
            return;
        setState(true);
        System.out.println("Fan ON");
    }

    public void turnOff() {
        if (!isOn())
            return;
        setState(false);
        System.out.println("Fan OFF");
    }
}

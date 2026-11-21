public class Light extends Device {

    public void turnOn() {
        if (isOn())
            return;
        setState(true);
        System.out.println("Light ON");
    }

    public void turnOff() {
        if (!isOn())
            return;
        setState(false);
        System.out.println("Light OFF");
    }
}

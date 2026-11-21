abstract public class Device {

    private boolean isOn = false;

    protected boolean isOn() {
        return isOn;
    }

    protected void setState(boolean state) {
        this.isOn = state;
    }

    abstract void turnOn();

    abstract void turnOff();
}

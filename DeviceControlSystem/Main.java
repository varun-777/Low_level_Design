public class Main {
    public static void main(String[] args) {

        DeviceController controller = new DeviceController();

        Device fan = new Fan();
        Device light = new Light();

        controller.operate(fan);
        controller.operate(light);
    }
}
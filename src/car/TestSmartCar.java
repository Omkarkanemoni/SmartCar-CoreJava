package car;

public class TestSmartCar extends SmartCar {

    public static void main(String[] args) {
        SmartCar myCar = new SmartCar();

        // Call composition-based methods
        myCar.startFeatures();
        myCar.stopFeatures();

        // Call interface methods
        myCar.showBatteryStatus();
        myCar.checkEngine();

        myCar.navigateTo("Bangalore");

        myCar.startMusic();
        myCar.stopMusic();

        myCar.ecoMode();
        myCar.sportMode();
    }
}

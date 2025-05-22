package car;

public class SmartCar implements DriveMode, Entertainment, Gps, Diagnostics {

    // Composition: SmartCar "has-a" Engine, MusicSystem, Navigator
    private Engine engine;
    private MusicSystem musicSystem;
    private Navigator navigator;

    // Constructor
    public SmartCar() {
        engine = new Engine();
        musicSystem = new MusicSystem();
        navigator = new Navigator();
    }

    public void startFeatures() {
        engine.startEngine();
        musicSystem.play();
        navigator.navigate("Hyderabad");
    }

    public void stopFeatures() {
        engine.stopEngine();
        musicSystem.stop();
        System.out.println("SmartCar is shutting down.");
    }

    // Interface methods
    @Override
    public void showBatteryStatus() {
        System.out.println("Battery is at 80% and functioning normally.");
    }

    @Override
    public void checkEngine() {
        System.out.println("Engine check completed: No issues detected.");
    }

    @Override
    public void navigateTo(String loc) {
        System.out.println("Navigation started to: " + loc);
    }

    @Override
    public void startMusic() {
        System.out.println("Music system started.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music system stopped.");
    }

    @Override
    public void ecoMode() {
        System.out.println("Eco mode activated for fuel efficiency.");
    }

    @Override
    public void sportMode() {
        System.out.println("Sport mode activated for high performance.");
    }
}

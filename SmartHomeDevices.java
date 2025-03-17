import java.util.*;

// Superclass: Device
class Device {

    protected String deviceId;
    protected String status;

    // Constructor to initialize Device details
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass: Thermostat
class Thermostat extends Device {

    private double temperatureSetting;

    // Constructor to initialize Thermostat details
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus method
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class to test Smart Home Devices
public class SmartHomeDevices {
    public static void main(String[] args) {

        // Creating a Thermostat object
        Thermostat thermostat = new Thermostat("TH1234", "ON", 22.5);

        // Displaying device status
        thermostat.displayStatus();
    }
}

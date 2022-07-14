package day05_variables.homework05;

public class Computer {
    public static void main(String[] args) {

        String computerBrand = "Lenovo";
        String computerProcessor = "Yoga";
        String computerDescription = "New Lenovo Yoga with three Thunderbolt 4 ports, HDMI port, SDXC card slot, MagSafe 3 port and with Touch ID";
        String computerCPU = "10-Core";
        String color = "Cosmic Blue";
        double computerPrice = 2400.99;
        char numberOfMonitors = '1';
        char numberOfUsbSlots = '3';
        int ramMemory = 32;
        byte storageMemory = 1;
        boolean hasMonitor = true;
        boolean hasWiFiCard = false;
        boolean hasUSB3_0 = true;

        System.out.println("Brand: " + computerBrand);
        System.out.println("Description: " + computerDescription);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + computerPrice);
        System.out.println("Processor: " + computerProcessor);
        System.out.println("CPU: " + computerCPU);
        System.out.println("RAM: " + ramMemory + "GB Unified Memory");
        System.out.println("Storage: " + storageMemory + "TB SSD Storage");
        System.out.println("Does it have monitor? - " + hasMonitor);
        System.out.println("Number of monitors: " + numberOfMonitors);
        System.out.println("Does it have WiFi Card? - " + hasWiFiCard);
        System.out.println("Does it have USB 3.0? - " + hasUSB3_0);
        System.out.println("Number of USB slots: " + numberOfUsbSlots);

    }
}

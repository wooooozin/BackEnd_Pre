package ch10;

abstract class Device {
    int deviceId;

    abstract void deviceInfo();
    abstract void connect();
    abstract void disconnect();
    abstract void send();
    abstract void receive();
}

class UsbPort extends Device {
    UsbPort(int id) {
        this.deviceId = id;
    }
    @Override
    void deviceInfo() {
        System.out.println("Device ID: " + this.deviceId);
    }

    @Override
    void connect() {
        System.out.println("connect UsbPort");
    }

    @Override
    void disconnect() {
        System.out.println("disconnect UsbPort");
    }

    @Override
    void send() {
        System.out.println("send Data used UsbPort");
    }

    @Override
    void receive() {
        System.out.println("receive Data used UsbPort");
    }
}

class Wifi extends Device {
    Wifi(int id) {
        this.deviceId = id;
    }

    @Override
    void deviceInfo() {

    }

    @Override
    void connect() {

    }

    @Override
    void disconnect() {

    }

    @Override
    void send() {

    }

    @Override
    void receive() {

    }
}

public class PracticeTest {

    public static void main(String[] args) {
        UsbPort usb = new UsbPort(1001);
        usb.deviceInfo();

    }

}

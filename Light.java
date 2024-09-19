package commandPattern;

class Light {
    private boolean isOn;
    private int brightness;

    public Light() {
        this.isOn = false;
        this.brightness = 5;  // Default brightness level
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Lights are turned on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Lights are turned off.");
    }

    public void setBrightness(int level) {
        this.brightness = level;
        System.out.println("Lights brightness set to: " + level);
    }

    public boolean isOn() {
        return isOn;
    }

    public int getBrightness() {
        return brightness;
    }
}


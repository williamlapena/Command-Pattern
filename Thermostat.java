package commandPattern;

class Thermostat {
    private int temperature;

    public Thermostat() {
        this.temperature = 22;  // Default temperature
    }

    public void increaseTemperature() {
        temperature++;
        System.out.println("Temperature increased to: " + temperature);
    }

    public void decreaseTemperature() {
        temperature--;
        System.out.println("Temperature decreased to: " + temperature);
    }

    public int getTemperature() {
        return temperature;
    }
}

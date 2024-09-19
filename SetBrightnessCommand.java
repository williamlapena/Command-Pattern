package commandPattern;

class SetBrightnessCommand implements Command {
    private Light light;
    private int brightness;

    public SetBrightnessCommand(Light light, int brightness) {
        this.light = light;
        this.brightness = brightness;
    }

    @Override
    public void execute() {
        light.setBrightness(brightness);
    }
}

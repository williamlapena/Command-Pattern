package commandPattern;

import java.util.Scanner;

public class ViewerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Light blindingLights = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        // Create commands
        Command TurnOnLightCommand = new TurnOnLightCommand(blindingLights);
        Command TurnOffLightCommand = new TurnOffLightCommand(blindingLights);
        Command setBrightnessCommand = new SetBrightnessCommand(blindingLights, 7);

        Command increaseTempCommand = new IncreaseTemperatureCommand(thermostat);
        Command decreaseTempCommand = new DecreaseTemperatureCommand(thermostat);

        Command playMusicCommand = new PlayMusicCommand(musicPlayer);
        Command stopMusicCommand = new StopMusicCommand(musicPlayer);
        Command setVolumeCommand = new SetVolumeCommand(musicPlayer, 8);

        RemoteControl remote = new RemoteControl();
        boolean SmartHomeAutomation = true;


        while (SmartHomeAutomation) {
            System.out.println("Choose a device to control:");
            System.out.println("1. Light");
            System.out.println("2. Thermostat");
            System.out.println("3. Music Player");
            System.out.println("4. Check Status of All Devices");
            System.out.println("5. Turn off system");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Light Controls
                    System.out.println("Light Commands:");
                    System.out.println("1. Turn On");
                    System.out.println("2. Turn Off");
                    System.out.println("3. Set Brightness (1-10)");
                    int lightChoice = scanner.nextInt();

                    switch (lightChoice) {
                        case 1:
                            remote.setCommand(TurnOnLightCommand);
                            remote.executeCommand();
                            break;
                        case 2:
                            remote.setCommand(TurnOffLightCommand);
                            remote.executeCommand();
                            break;
                        case 3:
                            System.out.println("Enter brightness level (1-10):");
                            int brightness = scanner.nextInt();
                            remote.setCommand(new SetBrightnessCommand(blindingLights, brightness));
                            remote.executeCommand();
                            break;
                        default:
                            System.out.println("Invalid command for lights.");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Thermostat Commands:");
                    System.out.println("1. Increase Temperature");
                    System.out.println("2. Decrease Temperature");
                    int thermostatChoice = scanner.nextInt();

                    switch (thermostatChoice) {
                        case 1:
                            remote.setCommand(increaseTempCommand);
                            remote.executeCommand();
                            break;
                        case 2:
                            remote.setCommand(decreaseTempCommand);
                            remote.executeCommand();
                            break;
                        default:
                            System.out.println("Invalid command for thermostat.");
                            break;
                    }
                    break;

                case 3: // Music Player Controls
                    System.out.println("Music Player Commands:");
                    System.out.println("1. Play Music");
                    System.out.println("2. Stop Music");
                    System.out.println("3. Set Volume (1-10)");
                    int musicChoice = scanner.nextInt();

                    switch (musicChoice) {
                        case 1:
                            remote.setCommand(playMusicCommand);
                            remote.executeCommand();
                            break;
                        case 2:
                            remote.setCommand(stopMusicCommand);
                            remote.executeCommand();
                            break;
                        case 3:
                            System.out.println("Enter volume level (1-10):");
                            int volume = scanner.nextInt();
                            remote.setCommand(new SetVolumeCommand(musicPlayer, volume));
                            remote.executeCommand();
                            break;
                        default:
                            System.out.println("Invalid command for music player.");
                            break;
                    }
                    break;

                case 4: // Check Status of All Devices
                    System.out.println("Current Status of Devices:");
                    System.out.println("1. Light: " + (blindingLights.isOn() ? "On" : "Off") + ", Brightness: " + blindingLights.getBrightness());
                    System.out.println("2. Thermostat: Current Temperature: " + thermostat.getTemperature());
                    System.out.println("3. Music Player: " + (musicPlayer.isPlaying() ? "Playing" : "Stopped") + ", Volume: " + musicPlayer.getVolume());
                    break;

                case 5: // Turn off system
                    System.out.println("Turning off the system...");
                    SmartHomeAutomation = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid device.");
                    break;
            }
        }

        scanner.close();
    }
}
package commandPattern;

class MusicPlayer {
    private boolean isPlaying;
    private int volume;

    public MusicPlayer() {
        this.isPlaying = false;
        this.volume = 5;  // Default volume
    }

    public void play() {
        isPlaying = true;
        System.out.println("Music is playing.");
    }

    public void stop() {
        isPlaying = false;
        System.out.println("Music is stopped.");
    }

    public void setVolume(int level) {
        this.volume = level;
        System.out.println("Music volume set to: " + level);
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public int getVolume() {
        return volume;
    }
}

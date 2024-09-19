package commandPattern;

class SetVolumeCommand implements Command {
    private MusicPlayer musicPlayer;
    private int volume;

    public SetVolumeCommand(MusicPlayer musicPlayer, int volume) {
        this.musicPlayer = musicPlayer;
        this.volume = volume;
    }

    @Override
    public void execute() {
        musicPlayer.setVolume(volume);
    }


}

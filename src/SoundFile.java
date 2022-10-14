import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class SoundFile {

    Clip clip;

    //constructor - specify the filename as the parameter
    public SoundFile(String filename) {
        try {
            // Open an audio input stream.
            File soundFile = new File(filename); //you could also get the sound file with an URL
            //AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);

            AudioInputStream audioIn =  AudioSystem.getAudioInputStream(getClass().getResource(filename));
            // Get a sound clip resource.
            clip = AudioSystem.getClip();
            // Open audio clip and load samples from the audio input stream.
            clip.open(audioIn);

        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    //plays the clip
    public void play() {
        clip.setFramePosition(0);
        clip.start();   //start playing the sound
    }

    public void pause() {
        clip.stop();
    }

    public void resume(){
        clip.start();
    }

    //stops playing the clip
    public void stop() {
        clip.stop();
        clip.setFramePosition(0);
    }

    //plays the clip continuously
    public void loop() {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    //checks if the clip is playing and returns true if it is and false if it isn't
    public boolean isPlaying() {
        return (clip.isRunning());
    }

}






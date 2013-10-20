import javax.sound.midi.*;

public class MusicTest1 {
  public void play() {
    try {
      Sequencer sequencer = MidiSystem.getSequencer();
      //sequencer object -- MIDI system gets us one
      System.out.println("Successfully got a sequencer.");
    }//wrap in a try block to indicate you understand there is a risk that something could go wrong at runtime
    catch(MidiUnavailableExpection ex) {
      System.out.println("Bummer");
    }//in case it fails
  }//close play

  public static void main(String[] args) {
    MusicTest1 mt = new MusicTest1();
    mt.play();
  }//close main
}//close class

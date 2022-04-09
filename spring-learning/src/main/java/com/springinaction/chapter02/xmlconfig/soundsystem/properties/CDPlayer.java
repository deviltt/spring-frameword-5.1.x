package com.springinaction.chapter02.xmlconfig.soundsystem.properties;
import com.springinaction.chapter02.xmlconfig.soundsystem.CompactDisc;
import com.springinaction.chapter02.xmlconfig.soundsystem.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;


public class CDPlayer implements MediaPlayer {
  private CompactDisc compactDisc;

  @Autowired
  public void setCompactDisc(CompactDisc compactDisc) {
    this.compactDisc = compactDisc;
  }

  public void play() {
    compactDisc.play();
  }

}

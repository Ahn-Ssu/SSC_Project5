package edu.handong.csee.java;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MusicPlayer {

	

	public MusicPlayer() {
	
	}
	
	public void  BGMPlay() {

		File file = new File("/Users/suhyun/git/SSC_Project5/Source/BGM.wav");
        System.out.println(file.exists()); //true
        
        try {
            
            AudioInputStream stream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();
            clip.loop(100);
        } catch(Exception e) {
            
            e.printStackTrace();
        }
	}
	
	public static void  putSound() {

		File file = new File("/Users/suhyun/git/SSC_Project5/Source/puteffect.wav");
        System.out.println(file.exists()); //true
        
        try {
            
            AudioInputStream stream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();
        } catch(Exception e) {
            
            e.printStackTrace();
        }
	}
	
	
}

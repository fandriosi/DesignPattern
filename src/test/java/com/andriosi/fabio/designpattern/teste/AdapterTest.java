/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.teste;

import com.andriosi.fabio.designpattern.adpter.AudioPlayer;
import com.andriosi.fabio.designpattern.adpter.Audio;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class AdapterTest {
    private AudioPlayer ap;
    public AdapterTest() {
        ap = new AudioPlayer();
    }
    
    @Test
    public void mp3(){        
        assertEquals("Playing mp3 file. Name: File Name", ap.play(Audio.MP3, "File Name"));
    }
    
    @Test
    public void mp4(){        
        assertEquals("Playing mp4 file. Name: File Name", ap.play(Audio.MP4, "File Name"));
    }
    @Test
    public void vlc(){        
        assertEquals("Playing vlc file. Name: File Name", ap.play(Audio.VLC, "File Name"));
    }
}

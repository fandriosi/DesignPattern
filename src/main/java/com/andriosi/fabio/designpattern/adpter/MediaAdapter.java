/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.adpter;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class MediaAdapter implements MediaPlayer{
    
    AdvancedMediaPlayer amp;

    public MediaAdapter(Audio audioType) {
        if(audioType == Audio.VLC)
            amp = new VlcPlayer();
        if(audioType == Audio.MP4)
            amp = new Mp4Player();
    }
    
    @Override
    public String play(Audio audioType, String fileName) {
        String play = null;
        if(audioType == Audio.VLC)
            play = amp.playVlc(fileName);   
        if(audioType == Audio.MP4)
            play = amp.playMp4(fileName);
        return play;
    }
    
}

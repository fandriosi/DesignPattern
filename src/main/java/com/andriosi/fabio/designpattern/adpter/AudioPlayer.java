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
public class AudioPlayer implements MediaPlayer{
    MediaAdapter ma;
    @Override
    public String play(Audio audioType, String fileName) {
        String play = null;
        if(audioType == Audio.MP3){
            play ="Playing mp3 file. Name: "+fileName;
        }else if(audioType == Audio.MP4 || audioType == Audio.VLC){
            ma = new MediaAdapter(audioType);
            play = ma.play(audioType, fileName);
        }else{
            play="Invalid media. " + audioType + " format not supported";
        }            
        return play;
    }    
}

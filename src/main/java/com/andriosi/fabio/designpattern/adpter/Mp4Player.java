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
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public String playVlc(String fileName) {
        return null;
    }

    @Override
    public String playMp4(String fileName) {
        return "Playing mp4 file. Name: "+fileName;
    }
    
}

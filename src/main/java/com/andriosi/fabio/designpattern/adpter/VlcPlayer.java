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
public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public String playVlc(String fileName) {
        return "Playing vlc file. Name: "+fileName;
    }

    @Override
    public String playMp4(String fileName) {
        return null;
    }
    
}

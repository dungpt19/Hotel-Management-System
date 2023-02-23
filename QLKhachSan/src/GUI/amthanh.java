/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import jaco.mp3.player.MP3Player;
import java.io.File;

/**
 *
 * @author Administrator
 */
public class amthanh extends  Thread{
    
    @Override
    public void run(){
        String SONG="D:\\Study\\QuanLyKhachSanCuoiKi\\Sunset.mp3";
        MP3Player mp3player =new MP3Player(new File(SONG));
        mp3player.play();
    }
}

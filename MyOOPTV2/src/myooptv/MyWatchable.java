/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myooptv;

import javax.swing.ImageIcon;

/**
 *
 * @author LeeJaeseok
 */
public abstract class MyWatchable {

    boolean power = true;
    // 파워(true:켜짐, false:꺼짐)
    int chNo = 0;
    // 채널 인덱스
    int zoom = 100;
    // zoom값

    abstract void resizeImage(String imageName, int index, ImageIcon[] imgIcons);
    // 이미지 크기 조절 메소드

    abstract void setImage();
    // 이미지 표시 메소드

    abstract void setZoom(int zoom);
    // zoom값을 이용한 이미지 크기 조절 메소드
}

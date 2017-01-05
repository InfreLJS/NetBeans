/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myooptv;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author LeeJaeseok
 */
public class MyTVModel extends MyWatchable {

    private int image_width = 400;
    // 이미지 너비
    private int image_height = 300;
    // 이미지 높이
    private final JLabel lblImage;
    // 이미지를 표시할 라벨 레퍼런스 변수

    public MyTVModel(JLabel lbl) {
        lblImage = lbl;
        // 매개변수로 JLabel형 lbl을 받아 lblImage 초기화

        for (int i = 0; i < icons.length; i++) {
            resizeImage(imageNames[i], i, icons);
            // 이미지 크기 조절
        }
        setImage();
        // 표시되는 이미지 세팅
    }

    @Override
    void resizeImage(String imageName, int index, ImageIcon[] imgIcons) {
        // 이미지 크기 조절 메소드. MyWatchable 추상 클래스의 추상 메소드 오버라이드.
        java.net.URL imgUrl = this.getClass().getResource(imageName);
        if (imgUrl == null) {
            return;
        }
        Image img = new ImageIcon(imgUrl).getImage().getScaledInstance(image_width, image_height, Image.SCALE_DEFAULT);
        imgIcons[index] = new ImageIcon(img);
    }

    @Override
    void setImage() {
        // 표시되는 이미지 설정 메소드. MyWatchable 추상 클래스의 추상 메소드 오버라이드.
        ImageIcon icon = icons[chNo];
        // icons배열의 chNo번 인덱스에 있는 ImageIcon 객체 하나를 icon 레퍼런스 변수에 저장.
        lblImage.setIcon(icon);
        // icon을 lblImage에 표시
        lblImage.invalidate();
        // 화면 갱신
    }

    @Override
    void setZoom(int zoom) {
        // zoom을 이용하여 이미지 크기를 재조절하는 메소드. MyWatchable 추상 클래스의 추상 메소드 오버라이드.
        image_width = zoom * 4;
        image_height = zoom * 3;
        // 100%일 때 400*300이므로
        for (int i = 0; i < icons.length; i++) {
            resizeImage(imageNames[i], i, icons);
        }
    }

    ImageIcon[] icons = {
        // ImageIcon 배열
        new ImageIcon("images/appleGalaxy_800x600.jpg"),
        new ImageIcon("images/earth_800x600.jpg"),
        new ImageIcon("images/macOSXLake_800x600.jpg"),
        new ImageIcon("images/setaDeMarioBros_800x600.jpg"),
        new ImageIcon("images/sunflower_800x600.jpg")
    };

    String[] imageNames = {
        // 이미지 이름 배열
        "images/appleGalaxy_800x600.jpg",
        "images/earth_800x600.jpg",
        "images/macOSXLake_800x600.jpg",
        "images/setaDeMarioBros_800x600.jpg",
        "images/sunflower_800x600.jpg"
    };
}

package com.raven.component;

import com.raven.swing.blurHash.BlurHash;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Image_Item extends javax.swing.JLayeredPane {

    public Image_Item() {
        initComponents();
    }

    public void setImage(String image) {
        int width = 200;
        int height = 200;
        int[] data = BlurHash.decode(image, width, height, 1);
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        img.setRGB(0, 0, width, height, data, 0, width);
        Icon icon = new ImageIcon(img);
        pic.setImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pic = new com.raven.swing.PictureBox();
        progress1 = new com.raven.swing.Progress();

        progress1.setMaximumSize(new java.awt.Dimension(50, 50));
        progress1.setMinimumSize(new java.awt.Dimension(10, 50));
        progress1.setPreferredSize(new java.awt.Dimension(50, 50));
        progress1.setProgressType(com.raven.swing.Progress.ProgressType.CANCEL);

        pic.setLayer(progress1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout picLayout = new javax.swing.GroupLayout(pic);
        pic.setLayout(picLayout);
        picLayout.setHorizontalGroup(
            picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(picLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        picLayout.setVerticalGroup(
            picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(picLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        setLayer(pic, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.PictureBox pic;
    private com.raven.swing.Progress progress1;
    // End of variables declaration//GEN-END:variables
}

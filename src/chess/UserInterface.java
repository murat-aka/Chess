/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author murat
 */
import java.awt.*;
import javax.swing.*;
public class UserInterface extends JPanel{
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(20, 20, 20, 20);
        g.setColor(new Color(190,81,215));
        g.fillRect(40, 20, 80, 50);
    }
}

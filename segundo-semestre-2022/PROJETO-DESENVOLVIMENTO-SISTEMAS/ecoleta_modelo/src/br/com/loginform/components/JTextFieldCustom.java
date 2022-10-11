package br.com.loginform.components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JTextFieldCustom extends JTextField {

//    private final Font PTSans_Regular_16 = FontManager.Loading("PTSans-Regular.ttf", Font.PLAIN, 16f);
    private final Color backgroundColor = new Color(244, 244, 244);
//    private final Color backgroundColor = Color.WHITE;

    public JTextFieldCustom() {
        setBackground(new Color(244, 244, 244, 0));
//        setBackground(new Color(255, 255, 255, 0));
        setOpaque(false);
        setBorder(new EmptyBorder(10, 10, 10, 50));
//        setFont(PTSans_Regular_16);
//        setFont(new java.awt.Font("sansserif", 0, 14));
        setSelectionColor(new Color(80, 199, 255));
    }

    @Override
    protected void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();

        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.setColor(backgroundColor);
        g2.fillRoundRect(0, 0, width, height, 16, 16);

        super.paintComponent(g);
    }
}

package br.com.loginform.components;

import br.com.loginform.utils.FontManager;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JTextFieldCustom extends JTextField {
    
    private final Font PTSans_Regular_16 = FontManager.Loading("PTSans-Regular.ttf", Font.PLAIN, 16f);
    private final Color backgroundColor = new Color(244, 244, 244);
    
    public JTextFieldCustom() {
        setBackground(new Color(244, 244, 244));
        setOpaque(false);
        setBorder(new EmptyBorder(10, 10, 10, 50));
        setFont(PTSans_Regular_16);
        setSelectionColor(new Color(80, 199, 255));
    }
    
    @Override
    public void paintComponents(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.setColor(backgroundColor);
        g2.fillRoundRect(0, 0, width, height, height, height);
        
        super.paintComponents(g);
    }
    
}

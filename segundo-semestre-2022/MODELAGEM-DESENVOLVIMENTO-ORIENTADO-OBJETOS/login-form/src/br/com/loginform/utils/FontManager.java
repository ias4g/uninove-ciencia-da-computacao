package br.com.loginform.utils;

import br.com.loginform.screem.SplashScreem;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FontManager {

//    public Font loadFont(String pathFont, int typeFont, int sizeFont) {
//
//        Font myFont = null;
//
//        try {
//
//            myFont = Font.createFont(
//                    Font.TRUETYPE_FONT,
//                    getClass().getResourceAsStream(pathFont)
//            ).deriveFont(typeFont, sizeFont);
//
//        } catch (FontFormatException | IOException ex) {
//            System.out.println(ex);
//        }
//
//        return myFont;
//    }
    public static final Font Loading(String Fontname, int Fonttype, Float Fontsize) {

        Font myFont = null;

        try {
            myFont = Font.createFont(Font.TRUETYPE_FONT, new File("src/br/com/loginform/fonts/" + Fontname)).deriveFont(Fonttype, Fontsize);

            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(myFont);

        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(SplashScreem.class.getName()).log(Level.SEVERE, null, ex);
        }

        return myFont;
    }

}

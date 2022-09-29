package br.com.loginform.utils;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

public class FontManager {

    public Font loadFont(String pathFont, int typeFont, int sizeFont) {

        Font myFont = null;

        try {

            myFont = Font.createFont(
                    Font.TRUETYPE_FONT,
                    getClass().getResourceAsStream(pathFont)
            ).deriveFont(typeFont, sizeFont);

        } catch (FontFormatException | IOException ex) {
            System.out.println(ex);
        }

        return myFont;
    }
}

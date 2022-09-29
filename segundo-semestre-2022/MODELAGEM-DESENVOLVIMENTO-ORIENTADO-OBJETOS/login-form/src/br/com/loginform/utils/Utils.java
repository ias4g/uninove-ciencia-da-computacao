package br.com.loginform.utils;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

public class Utils {

    public Font loadFonts(String fontpath, int fonttype, int fontsize) {

        Font minhaFonte = null;

        try {

            minhaFonte = Font.createFont(
                    Font.TRUETYPE_FONT,
                    getClass().getResourceAsStream(fontpath)
            ).deriveFont(fonttype, fontsize);

        } catch (FontFormatException | IOException ex) {
            System.out.println(ex);
        }

        return minhaFonte;
    }
}

package br.com.loginform.utils;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

public class Utils {

    private Font PT_SANS_BOLD_12;
    private Font PT_SANS_BOLD_16;

    private Font PT_SANS_REGULAR_12;
    private Font PT_SANS_REGULAR_16;
    private Font PT_SANS_REGULAR_24;

    private Font UBUNTU_BOLD_32;
    private Font UBUNTU_BOLD_24;

    private Font loadFonts(String fontpath, int fonttype, int fontsize) {

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

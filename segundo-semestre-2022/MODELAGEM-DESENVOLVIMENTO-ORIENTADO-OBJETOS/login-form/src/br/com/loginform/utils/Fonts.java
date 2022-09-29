package br.com.loginform.utils;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

public class Fonts {

    public Font getPT_SANS_BOLD_12() {
        Font PT_SANS_BOLD_12 = loadFonts("/br/com/loginform/fonts/pt-sans-bold.ttf", Font.BOLD, 12);

        return PT_SANS_BOLD_12;
    }
//
//    public Font getPT_SANS_BOLD_16() {
//        return PT_SANS_BOLD_16;
//    }
//
//    public Font getPT_SANS_REGULAR_12() {
//        return PT_SANS_REGULAR_12;
//    }
//
//    public Font getPT_SANS_REGULAR_16() {
//        return PT_SANS_REGULAR_16;
//    }
//
//    public Font getPT_SANS_REGULAR_24() {
//        return PT_SANS_REGULAR_24;
//    }
//
//    public Font getUBUNTU_BOLD_24() {
//        return UBUNTU_BOLD_24;
//    }
//
//    public Font getUBUNTU_BOLD_32() {
//        return UBUNTU_BOLD_32;
//    }
//
//    private final Font PT_SANS_BOLD_16 = loadFonts("/br/com/loginform/fonts/pt-sans-bold.ttf", Font.BOLD, 16);
//
//    private final Font PT_SANS_REGULAR_12 = loadFonts("/br/com/loginform/fonts/pt-sans-regular.ttf", Font.PLAIN, 12);
//    private final Font PT_SANS_REGULAR_16 = loadFonts("/br/com/loginform/fonts/pt-sans-regular.ttf", Font.PLAIN, 16);
//    private final Font PT_SANS_REGULAR_24 = loadFonts("/br/com/loginform/fonts/pt-sans-regular.ttf", Font.PLAIN, 24);
//
//    private final Font UBUNTU_BOLD_24 = loadFonts("/br/com/loginform/fonts/ubuntu-bold.ttf", Font.BOLD, 24);
//    private final Font UBUNTU_BOLD_32 = loadFonts("/br/com/loginform/fonts/ubuntu-bold.ttf", Font.BOLD, 32);

    private Font loadFonts(String fontpath, int fonttype, int fontsize) {

        Font myFont = null;

        try {

            myFont = Font.createFont(
                    Font.TRUETYPE_FONT,
                    getClass().getResourceAsStream(fontpath)
            ).deriveFont(fonttype, fontsize);

        } catch (FontFormatException | IOException ex) {
            System.out.println(ex);
        }

        return myFont;
    }
}

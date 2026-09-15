package software.ulpgc.chess;

import java.awt.*;

public class Bird {
    private final Color color;

    public static final boolean isMammal = false; // Si un campo lleva static es de la clase, en caso de que no es del objeto

    public Bird(Color color) {
        this.color = color;
    }

    public Color color() {
        return color;
    }

    public static boolean isMammal() {
        return isMammal;
    }

    public enum Color {
        Red, Yellow
    }

}

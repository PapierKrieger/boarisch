package BoarischSystem;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class BoarischSystem {
    public static InputStream boarischRein() {
        return System.in;
    }
    public static OutputStream boarischRaus() {
        return System.out;
    }
    public static PrintStream boarischFoisch() {
        return System.err;
    }
}

package model;

import javafx.util.StringConverter;

public class NumberConverter extends StringConverter<String> {

    private int fromradix;
    private int toradix;

    public NumberConverter(int fromradix, int toradix) {
        this.fromradix = fromradix;
        this.toradix = toradix;
    }

    @Override
    public String toString(String s) {
        return Integer.toString(Integer.parseInt(s,toradix),fromradix);
    }

    @Override
    public String fromString(String s) {
        return Integer.toString(Integer.parseInt(s,fromradix),toradix);
    }
}

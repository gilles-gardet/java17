package com.ggardet.features;

import java.text.NumberFormat;
import java.util.Locale;

public class Java12 {

    public static void main(final String[] args) {
        // une nouvelle méthode pour indenter une String
        // indentMethod();

        // une nouvelle méthode pour transformer une String
        // transformMethod();

        // une nouvelle méthode plutôt stylée pour formatter les nombres
        // numberFormat();

        // (teeing collector, File::mismatch, changements sur la JVM, etc...)
    }

    private static void indentMethod() {
        var text = "Salut!\nBien ou bien ?";
        text = text.indent(4);
        System.out.println(text);

        text = text.indent(-10);
        System.out.println(text);
    }

    private static void transformMethod() {
        final var text = "Yo!";
        final var transformed = text.transform(String::chars);
        System.out.println(transformed.count());
    }

    private static void numberFormat() {
        final var locale = new Locale("fr", "FR");
        final var decimales = 3;

        final var nombreAronditCourt = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.SHORT);
        nombreAronditCourt.setMaximumFractionDigits(decimales);
        System.out.println(nombreAronditCourt.format(2592));

        final var nombreAronditLong = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.LONG);
        nombreAronditLong.setMaximumFractionDigits(decimales);
        System.out.println(nombreAronditLong.format(2592));
    }
}

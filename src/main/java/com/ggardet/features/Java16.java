package com.ggardet.features;

import java.util.Objects;

public class Java16 {

    public static void main(final String[] args) {
        // les records <3
        records();

        // les pattern matching pour les instanceof
        // patternMatching();
    }

    private static void records() {
        var george = new Personne("George Abitbol", 40);
        System.out.println(george);
        System.out.println(george.hashCode());
        var adresse = new Adresse("Paris");
        System.out.println(adresse);
    }

    public record Personne(String nom, int age) {
    }

    public record Adresse(String ville, String rue) {
        public static String ADRESSE_INCONNUE = "Chai pas";

        public Adresse {
            Objects.requireNonNull(ville);
            Objects.requireNonNull(rue);
        }

        public Adresse(String ville) {
            this(ville, ADRESSE_INCONNUE);
        }
    }

    public interface Film {
    }

    public record Alien() implements Film {
    }

    public record Seven() implements Film {
        public String getTitre() {
            return "Seven";
        }
    }

    private static void patternMatching() {
        final Film film = new Seven();
        shadowCast(film);
    }

    private static void shadowCast(Film film) {
        if (film instanceof Seven seven) {
            System.out.println(seven.getTitre());
        }
    }
}

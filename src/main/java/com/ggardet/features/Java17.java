package com.ggardet.features;

public class Java17 {

    public static void main(final String[] args) {
        // les sealed classes
        sealedClasses();

        // les switch expressions
//        switchCase();
//        switchExpressions();
    }

    private static void sealedClasses() {
        final Film film1 = new Seven();
        System.out.println(film1);
        final Film film2 = new Alien();
        System.out.println(film2);
    }

    public sealed interface Film permits Seven, Alien {
    }

    public record Alien() implements Film {
    }

    public non-sealed static class Seven implements Film {
    }

    private static void switchCase() {
        for (int day = 1; day <= 7; day++) {
            String dayOfWeek;
            switch (day) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    dayOfWeek = "Vivement le weekend";
                    break;
                case 6:
                case 7:
                    dayOfWeek = "Youhou c'est le weekend";
                    break;
                default:
                    throw new IllegalArgumentException("Jour invalide: " + day);
            }
            System.out.println(dayOfWeek);
        }
    }

    private static void switchExpressions() {
        for (int day = 1; day <= 7; day++) {
            String dayOfWeek = switch (day) {
                case 1, 2, 3, 4, 5 -> "Vivement le weekend";
                case 6, 7 -> "Youhou c'est le weekend";
                default -> throw new IllegalArgumentException("Jour invalide: " + day);
            };
            System.out.println(dayOfWeek);
        }
    }
}

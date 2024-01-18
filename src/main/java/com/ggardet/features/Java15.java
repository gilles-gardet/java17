package com.ggardet.features;

public class Java15 {

    public static void main(final String[] args) {
        // Les "text blocks" permettent d'écrire des Strings multi-lignes
        textBlockBefore();
        // textBlockAfter();

        // (et d'autres trucs importants mais pas hyper intéressants pour nous au jour le jour)
    }

    private static void textBlockBefore() {
        System.out.println("# Avant");
        final var oldWay = "{\n" +
                "\t\"name\": \"George Abitbol\",\n" +
                "\t\"age\": 40,\n" +
                "\t\"profession\": \"Homme le plus classe du monde\"\n" +
                "}";
        System.out.println(oldWay);
    }

    private static void textBlockAfter() {
        System.out.println("# Après");
        final var newWay = """
            {
                "name": "George Abitbol",
                "age": 40,
                "profession": "Homme le plus classe du monde"
            }
            """;
        System.out.println(newWay);
    }
}

package models;

public class ListeningExercise {

    private int id;
    private String name;
    private String[] sentences;

    public ListeningExercise(int i, String n, String[] s) {
        id = i;
        name = n;
        sentences = s;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getSentences() {
        return sentences;
    }

    public static ListeningExercise[] getExercises() {
        return new ListeningExercise[]{
            new ListeningExercise(0, "test", new String[]{"Je suis une baguette"})
        };
    }
}

package search.Linear_search;

public class string_search {
    public static void main(String[] args) {
        String name = "Rhythm Gupta";
        char letter = 'm';
        System.out.println(letter + " is at " + search(name, letter));
    }

    static int search(String name, char letter) {
        if (name.length() == 0) {
            return -1;
        }

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == letter) {
                return i + 1;
            }
        }
        return -1;
    }
}
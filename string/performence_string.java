public class performence_string {
    public static void main(String[] args) {
        // this program has a problem that when ever we dd ch in our series it is
        // creating a new object which cause lot of memory wastage.
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch + " ";
        }
        System.out.println(series);

        // so, to improve this we need to use a datatype (stringBuilder: superate class
        // just like string) which allow to modify its values.
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            build.append(ch + " ");
        }
        System.out.println(build.toString());
        System.out.println(build.length());
    }
}

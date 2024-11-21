public class palindron_string {
    public static void main(String[] args) {
        String a = "123321";
        System.out.println(palim(a));
    }

    static boolean palim(String a){
        if(a == null || a.length() == 0){
            return true;
        }
        for(int i = 0; i < a.length(); i++) {
            int start = i;
            int end = a.length() - 1 - i;
            if(a.charAt(start) != a.charAt(end)){
                return false;
            }
        }
        return true;
    }
}

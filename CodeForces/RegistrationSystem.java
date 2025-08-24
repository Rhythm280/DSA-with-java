
import java.util.HashMap;
import java.util.Scanner;
// import java.util.HashSet;


public class RegistrationSystem {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        // HashSet<String> names = new HashSet<>();
        while(n-- > 0){
            String name = sc.next();
            if(!map.containsKey(name)) {
                map.put(name, 0);
                // names.add(name);
                System.out.println("OK");
            } else {
                int count = map.get(name) + 1;  // increment count for this user
                map.put(name, count);  // update count for future duplicates
                String newName = name + count;  // generate new username
                System.out.println(newName);

                // Also add the newName to map with count 0 (if it appears again)
                map.put(newName, 0);
            }
        }
        sc.close();
    }

    // public static String getname(String name, int count) {
    //         StringBuilder str = new StringBuilder();
    //         for(int i = 0; i < name.length(); i++) {
    //             char ch = name.charAt(i);
    //             if(ch >= 'a' && ch <= 'z') {
    //                 str.append(ch);
    //             }
    //         }
    //         return str.toString() + count;
    //     }
}

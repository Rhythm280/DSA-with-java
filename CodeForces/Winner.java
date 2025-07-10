import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Winner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int players = sc.nextInt(); 
        HashMap<String, Integer> list = new HashMap<>();
        List<String[]> rounds = new ArrayList<>();
        while(players >= 0) {
            String player = sc.nextLine();
            int score = playerScore(player);
            String p = playerName(player);
            if(list.containsKey(p)) {
                list.put(p, list.get(p) + score);
            } else {
                list.put(p, score);
            }
            rounds.add(new String[]{p, String.valueOf(score)});
            players--;
        }

        int max = Collections.max(list.values());

        // Step 3: Get all candidates
        Set<String> candidates = new HashSet<>();
        for (Map.Entry<String, Integer> entry : list.entrySet()) {
            if (entry.getValue() == max) {
                candidates.add(entry.getKey());
            }
        }

        // Step 4: Re-calculate running totals to find first to reach max
        Map<String, Integer> runningTotal = new HashMap<>();
        for (String[] round : rounds) {
            String name = round[0];
            int score = Integer.parseInt(round[1]);
            runningTotal.put(name, runningTotal.getOrDefault(name, 0) + score);
            if (candidates.contains(name) && runningTotal.get(name) >= max) {
                System.out.println(name);
                return;
            }
        }
    }

    public static int playerScore(String player) {
        int score = 0;
        boolean isNegative = false;
        for(int i = 0; i < player.length(); i++) {
            char ch = player.charAt(i);
            if(ch == '-') isNegative = true;
            if(ch >= '0' && ch <= '9') {
                score = score * 10 + (ch - '0');
            }
        }
        return isNegative ? -score : score;
    }

    public static String playerName(String player) {
        StringBuilder name = new StringBuilder();
        for(int i = 0; i < player.length(); i++) {
            char ch = player.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                name.append(ch);
            }
        }
        return name.toString();
    }

    // public static String findWinner(LinkedHashMap<String, Integer> list) {
    //     int maxValue = Integer.MIN_VALUE;
    //     String maxKey = null;
    //     for(Map.Entry<String, Integer> entry : list.entrySet()) {
    //         if(entry.getValue() > maxValue) {
    //             maxValue = entry.getValue();
    //             maxKey = entry.getKey();
    //         }
    //     }
    //     return maxKey;
    // }
}

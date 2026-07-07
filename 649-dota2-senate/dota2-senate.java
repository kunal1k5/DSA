import java.util.*;

class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> d = new LinkedList<>();
        Queue<Integer> r = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {   // Uppercase R
                r.offer(i);
            } else {                         // D
                d.offer(i);
            }
        }

        while (!r.isEmpty() && !d.isEmpty()) {
            int rTurn = r.poll();
            int dTurn = d.poll();

            if (rTurn < dTurn) {
                r.offer(rTurn + n);
            } else {
                d.offer(dTurn + n);
            }
        }

        return r.isEmpty() ? "Dire" : "Radiant";
    }
}
package t07_collections.stackqueue;

import java.util.Collections;
import java.util.Stack;
//LIFO (last in, first out)

public class MainStack {
    public static void main(String[] args) {
        //Stack
        Stack<String> wiiGames = new Stack<>();
        wiiGames.push("Skylanders");
        wiiGames.push("WiiPlayMotion");
        wiiGames.push("MarioKart");
        wiiGames.push("WiiSports");

        System.out.println(wiiGames.peek());
        for (String wiiGame : wiiGames) {
            System.out.println(wiiGame);
        }

        String wiiSports = wiiGames.pop();
        System.out.println(wiiGames);
        wiiGames.push(wiiSports);
        System.out.println(wiiGames);

    }
}

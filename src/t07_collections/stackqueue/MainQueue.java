package t07_collections.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        //Queue
        Queue<String> downloads = new LinkedList<>();
        downloads.add("CSGO");
        downloads.add("AmongUs");
        downloads.add("Dark Souls");


        System.out.println(downloads);
        downloads.poll();

        System.out.println(downloads);
        downloads.poll();

        System.out.println(downloads);
        downloads.poll();

        System.out.println(downloads);
    }
}

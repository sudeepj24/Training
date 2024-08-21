package java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> team = new ArrayList<String>();

        team.add("Aishwarya");
        team.add("Anjali");
        team.add("Shrey");
        team.add("Sudeep");
        team.add("Siddhi");
        team.add("Anshika");

        System.out.println("Team Members: " + team);

        // Display using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = team.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Display using Normal For Loop
        System.out.println("Using Normal For Loop:");
        for (int i = 0; i < team.size(); i++) {
            System.out.println(team.get(i));
        }

        // Display using Enhanced For Loop
        System.out.println("Using Enhanced For Loop:");
        for (String member : team) {
            System.out.println(member);
        }
    }
}
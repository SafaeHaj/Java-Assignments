package practice.collections;
import java.util.Stack;

public class StackUse {
    public static void main(String[] args) {
        Stack<String> iliadEvents = new Stack<>();

        iliadEvents.push("The Wrath of Achilles");
        iliadEvents.push("The Quarrel between Agamemnon and Achilles");
        iliadEvents.push("That One chapter about Diomedes being cool and Athena giving him a thumbs up");
        iliadEvents.push("Patroclus being Awesome");
        iliadEvents.push("The Death of Patroclus (of awesomeness)");
        iliadEvents.push("Achilles' Return to Battle");
        iliadEvents.push("The Death of Hector");
        iliadEvents.push("The Fall of Troy");

        while (!iliadEvents.isEmpty()) {
            String event = iliadEvents.pop();
            System.out.println(event);
        }
    }
}

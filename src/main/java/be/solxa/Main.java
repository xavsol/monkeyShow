package be.solxa;

import be.solxa.monkeyshow.model.*;

public class Main {
    public static void main(String[] args) {
        // Create spectator
        Spectator spectator = new Spectator("John");

        // Create first monkey and add tricks
        Monkey monkey1 = new Monkey("Charlie");
        monkey1.addTrick(new Trick("Walking on hands", TrickType.ACROBATIC));
        monkey1.addTrick(new Trick("Somersault", TrickType.ACROBATIC));
        monkey1.addTrick(new Trick("Playing drums", TrickType.MUSICAL));

        // Create second monkey and add tricks
        Monkey monkey2 = new Monkey("Lucy");
        monkey2.addTrick(new Trick("Playing trumpet", TrickType.MUSICAL));
        monkey2.addTrick(new Trick("Rope climbing", TrickType.ACROBATIC));
        monkey2.addTrick(new Trick("Balancing act", TrickType.ACROBATIC));

        // Create trainers with their monkeys
        Trainer trainer1 = new Trainer("Mike", monkey1);
        Trainer trainer2 = new Trainer("Sarah", monkey2);

        // Let trainers request all tricks from their monkeys
        System.out.println("=== MONKEY SHOW STARTS ===");

        // First trainer's show
        trainer1.requestAllTricks(spectator);

        // Second trainer's show
        trainer2.requestAllTricks(spectator);

        System.out.println("=== MONKEY SHOW ENDS ===");
    }
}
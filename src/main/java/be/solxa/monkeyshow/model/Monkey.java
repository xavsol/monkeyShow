package be.solxa.monkeyshow.model;

import java.util.ArrayList;
import java.util.List;

public final class Monkey {
    private final String name;
    private final List<Trick> tricks;

    public Monkey(String name) {
        this.name = name;
        this.tricks = new ArrayList<>();
    }

    public void addTrick(Trick trick) {
        tricks.add(trick);
    }

    public void performTrick(int index, Spectator spectator) {
        if (index >= 0 && index < tricks.size()) {
            Trick trick = tricks.get(index);
            System.out.println("Monkey " + name + " performs " + trick.type().getName() + " trick '" + trick.name() + "'");

            if (spectator != null) {
                spectator.react(this, trick);
            }

        } else {
            throw new IndexOutOfBoundsException("Monkey " + name + " doesn't know this trick");
        }
    }

    public int getTrickCount() {
        return tricks.size();
    }

    public String getName() {
        return name;
    }
}

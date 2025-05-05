package be.solxa.monkeyshow.model;

public record Trainer(String name, Monkey monkey) {

    public void requestTrick(int index, Spectator spectator) {
        System.out.println("Trainer " + name + " asks monkey " + monkey.getName() + " to perform a trick");
        monkey.performTrick(index, spectator);
    }

    public void requestAllTricks(Spectator spectator) {
        System.out.println("\nTrainer " + name + " asks monkey " + monkey.getName() + " to perform all tricks:");
        for (int i = 0; i < monkey.getTrickCount(); i++) {
            requestTrick(i, spectator);
        }
    }
}

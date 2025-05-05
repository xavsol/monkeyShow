package be.solxa.monkeyshow.model;

public record Spectator(String name) {

    public void react(Monkey monkey, Trick trick) {
        switch (trick.type()) {
            case ACROBATIC -> applaud(monkey, trick);
            case MUSICAL -> whistle(monkey, trick);
        }
    }

    private void applaud(Monkey monkey, Trick trick) {
        System.out.println("Spectator " + name + " applauds during the acrobatic trick '" +
                trick.name() + "' performed by monkey " + monkey.getName());
    }

    private void whistle(Monkey monkey, Trick trick) {
        System.out.println("Spectator " + name + " whistles during the musical trick '" +
                trick.name() + "' performed by monkey " + monkey.getName());
    }
}

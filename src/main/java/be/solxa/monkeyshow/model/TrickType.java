package be.solxa.monkeyshow.model;

public enum TrickType {
    ACROBATIC("acrobatic"),
    MUSICAL("musical");

    private final String name;

    TrickType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

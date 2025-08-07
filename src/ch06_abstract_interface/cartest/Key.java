package ch06_abstract_interface.cartest;

public enum Key {
    KEY("열쇠키"),
    SMART("스마트키");

    private final String keyName;

    Key(String keyName) {
        this.keyName = keyName;
    }

    public String getKeyName() {
        return keyName;
    }
}

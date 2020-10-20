package User;

public enum ForUser {
    VASYA("VASYA"),
    PETYA("PETYA"),
    VALERA("VALERA"),
    SOMEONE("SOMEONE"),
    ALEXANDR("ALEXANDR");
    private final String name;
    private ForUser(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

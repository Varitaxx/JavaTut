package _test.grundklassen;

public class Mitarbeiter {
    String name;
    int alter;
    int jahresgehalt;
    String passwort;

    public Mitarbeiter() {
    }

    public Mitarbeiter(String name, int alter, int jahresgehalt, String passwort) {
        this.name = name;
        this.alter = alter;
        this.jahresgehalt = jahresgehalt;
        this.passwort = passwort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getJahresgehalt() {
        return jahresgehalt;
    }

    public void setJahresgehalt(int jahresgehalt) {
        this.jahresgehalt = jahresgehalt;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }
}

package t06_fallunterscheidungen;

public class SwitchCase {
    public static void main(String[] args) {
        int geburtsjahr = 2013;

        switch(geburtsjahr){
            case 2010:
                System.out.println("Person war in Gruppe A");
                break;
            case 2011:
                System.out.println("Person war in Gruppe B");
                break;
            case 2012:
                System.out.println("Person war in Gruppe C");
                break;
            case 2013:
                System.out.println("Person war in Gruppe D");
                break;
            case 2014:
                System.out.println("Person war in Gruppe E");
                break;
            default:
                System.out.println("Person war zu jung/alt für alle Gruppen");
                break;

        }
    }
}

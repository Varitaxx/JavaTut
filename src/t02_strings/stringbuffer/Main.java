package t02_strings.stringbuffer;

public class Main {
    public static void main(String[] args) {

        //StringBuffer = modifizierbarer String

        //StringBuffer buffer = new StringBuffer();//Kapazität = 16
        StringBuffer buffer = new StringBuffer("Willkommen hier auf dem Kanal von ITCademy");
        //buffer.append(" zm Buffer Tutorial");
        //buffer.insert(0, "Herzlich ");


        int capacity = buffer.capacity();


        System.out.println(buffer.toString() + " mit einer Kapazität von: " + capacity);
    }
}

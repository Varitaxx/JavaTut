package _falconbyte.objektinteraktionen;

public class TennisTurnier {
    private TennisSpieler s1;
    private TennisSpieler s2;
    private TennisSpieler s3;

    public TennisTurnier(){
        s1 = new TennisSpieler("Boris", 4);
        s2 = new TennisSpieler("Björn", 10);
        s3 = new TennisSpieler("Rafael", 7);


        duellStarten(s1, s2);
        duellStarten(s3, s2);
        duellStarten(s1, s3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }

    public void duellStarten(TennisSpieler s1, TennisSpieler s2){
        s1.erhoeheSpieleUm1();
        s2.erhoeheSpieleUm1();

        if(s1.getItn() > s2.getItn()){
            s1.erhoeheSiegeUm1();
            s2.erhoeheNiederlagenUm1();
        }
        else if (s1.getItn() < s2.getItn()) {
            s1.erhoeheNiederlagenUm1();
            s2.erhoeheSiegeUm1();
        }
        else {
            //Zufallsgenerator
        }
    }

    public static void main(String[] args) {
        TennisTurnier t1 = new TennisTurnier();


    }
}

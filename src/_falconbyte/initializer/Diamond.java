package _falconbyte.initializer;

public class Diamond {
    public static int solution;

    public Diamond(){
        solution++;
    }

    {
        solution +=4;
    }
    static{
        solution +=2;
    }
    {
        solution -=3;
    }
}

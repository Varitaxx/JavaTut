package _falconbyte.rekursiv;

public class Rekursiv {
    public static int i = 0;

    public static void main(String[] args) {
        int result = sum(6);
        //rekursiveMethode();
        System.out.println(result);


    }

    public static void rekursiveMethode(){
        i++;
        System.out.println(i + " ");

        if(i < 10){
            rekursiveMethode();//Rekursion
        }
    }

    public static int sum(int n){
        if(n > 0){
            return n + sum(n-1);//Rekursion
        }else {
            return 0;
        }
    }


}

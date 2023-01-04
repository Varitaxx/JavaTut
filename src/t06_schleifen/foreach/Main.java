package t06_schleifen.foreach;

public class Main {
    public static void main(String[] args) {
        //For-each

        //int[]numbers = {123, 456, 124567, 45698,335};
        String[]words = {"Under", "my", "umbrella", "ella", "eh", "eh"};

        // for (int i = 0; i < numbers.length; i++)

        //for(int i : numbers){
        //    System.out.println(i);
       // }

        // Hier mal veranschaulicht: Es werden nur Kopien des Arraysinhalts verwendet
        // Hier wird ständig Default ausgegeben.
        for (String word : words){
            word = "Default";
            System.out.println(word);
        }
        // Daher wird hier auch nix verändert, also obiges "Original" ausgegeben
        for(String word : words){
            System.out.println(word);

        }
    }
}

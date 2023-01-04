package t02_strings;

public class StringSplitJoin {
    public static void main(String[] args) {
        String input = "Apfel:Birne:Kiwi:Zitrone";
        System.out.println(input);
        String result;
        String[] obstarray = input.split(":");

        for(String obst : obstarray){
            System.out.println(" - " + obst.trim());
        }

        //result = String.join(":","Apfel", "Birne","Kiwi","Zitrone");
        result = String.join(":",obstarray);
        System.out.println(result);

    }
}

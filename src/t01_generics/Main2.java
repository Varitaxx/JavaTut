package t01_generics;

public class Main2 {
    public static void main(String[] args) {
        GenClass<Double> generic = new GenClass<>();
        generic.setObjekt1(15.3);
        System.out.println(generic.getObjekt1());
        System.out.println(generic.getObjekt1().getClass());
        GenClass<String> wort = new GenClass<>();
        wort.setObjekt1("Rudine");
        wort.setObjekt2("Sternchen");
        System.out.println(wort.getObjekt1() + " " + wort.getObjekt2());
        System.out.println(wort.getObjekt1().getClass() + " + " + wort.getObjekt2().getClass());



    }
}

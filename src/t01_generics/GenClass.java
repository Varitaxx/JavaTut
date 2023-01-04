package t01_generics;

public class GenClass <T> {
    T objekt1;
    T objekt2;

    public GenClass() {
    }

    public GenClass(T objekt1, T objekt2) {
        this.objekt1 = objekt1;
        this.objekt2 = objekt2;
    }

    public T getObjekt1() {
        return objekt1;
    }

    public void setObjekt1(T objekt1) {
        this.objekt1 = objekt1;
    }

    public T getObjekt2() {
        return objekt2;
    }

    public void setObjekt2(T objekt2) {
        this.objekt2 = objekt2;
    }
}

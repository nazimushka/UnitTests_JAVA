import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> intnum1 = List.of(12, 9, 10, 11, 13);
        List<Integer> intnum2 = List.of(0, 2, 5, 7, 7);
        NumberList<Integer> listnum1 = new NumberList<>(intnum1);
        NumberList<Integer> listnum2 = new NumberList<>(intnum2);
        ListComp<Integer> comparatorInt = new ListComp<>();
        comparatorInt.compareAndPrint(listnum1, listnum2);

        List<Double> doublenum1 = List.of(1.2, 2.3, 3.2, 4.3, 5.2);
        List<Double> doublenum2 = List.of(6.1, 7.2, 8.1, 9.2, 10.1);
        NumberList<Double> listnum3 = new NumberList<>(doublenum1);
        NumberList<Double> listnum4 = new NumberList<>(doublenum2);
        ListComp<Double> comparatorDbl = new ListComp<>();
        comparatorDbl.compareAndPrint(listnum3, listnum4);

        List<Integer> intnum3 = List.of(1, 2, 3, 4, 5);
        List<Integer> intnum4 = List.of(5, 4, 3, 2, 1);
        NumberList<Integer> listnum5 = new NumberList<>(intnum3);
        NumberList<Integer> listnum6 = new NumberList<>(intnum4);
        comparatorInt.compareAndPrint(listnum5, listnum6);

        List<Double> doublenum3 = List.of(1.2, 2.2, 3.2, 4.2, 5.2);
        List<Double> doublenum4 = List.of(5.3, 4.3, 3.3, 2.3, 1.3);
        NumberList<Double> listnum7 = new NumberList<>(doublenum3);
        NumberList<Double> listnum8 = new NumberList<>(doublenum4);
        comparatorDbl.compareAndPrint(listnum7, listnum8);

    }
}

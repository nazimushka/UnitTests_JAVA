
class ListComp<T extends Number> {

  public void compareAndPrint(NumberList<T> list1, NumberList<T> list2) {
    int comparisonResult = list1.compareTo(list2);

    if (comparisonResult > 0) {
      System.out.println("Первый список имеет большее среднее значение");
    } else if (comparisonResult < 0) {
      System.out.println("Второй список имеет большее среднее значение");
    } else {
      System.out.println("Средние значения равны");
    }
  }
}

import java.util.List;

class NumberList<T extends Number> implements Comparable<NumberList<T>> {
    private List<T> numbers;

    public NumberList(List<T> numbers) {
        this.numbers = numbers;
    }

    public double calculateAverage() {
        if (numbers.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (T number : numbers) {
            sum += number.doubleValue();
        }
        return sum / numbers.size();
    }

    @Override
    public int compareTo(NumberList<T> other) {
        double average1 = this.calculateAverage();
        double average2 = other.calculateAverage();

        return Double.compare(average1, average2);
    }
}
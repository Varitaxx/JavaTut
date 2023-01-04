package t07_collections.vergleichen;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
    public static final StringLengthComparator ASC = new StringLengthComparator(true);
    public static final StringLengthComparator DESC = new StringLengthComparator(false);

    private final boolean ascending;

    private StringLengthComparator(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(String o1, String o2) {
        int result = Integer.compare(o1.length(), o2.length());
        return ascending ? result : -result;
    }
}

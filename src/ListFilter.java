import java.util.ArrayList;
import java.util.List;

public class ListFilter {

    public ListFilter() {}

    /**
     * Takes in a list of objects with mixed strings and integers
     * and returns a filtered list with just the numeric values.
     * @param list List with mixed string and integers values.
     * @return Filtered list with just numeric values.
     */
    public List<Object> filterListByNumericValues(List<Object> list) {

        List<Object> numbers = new ArrayList<>();

        for (Object value : list) {
            if (value instanceof Number) {
                numbers.add(value);
            }
        }

        return numbers;
    }

    /**
     * Takes in a list of objects with mixed strings and integers
     * and returns a filtered list with just the string values.
     * @param list List with mixed string and integers values.
     * @return Filtered list with just string values.
     */
    public List<Object> filterListByStringValues(List<Object> list) {

        List<Object> numbers = new ArrayList<>();

        for (Object value : list) {
            if (!(value instanceof Number)) {
                numbers.add(value);
            }
        }

        return numbers;
    }
}

import java.util.ArrayList;
import java.util.List;

public class ListFilter {

    // Example usage
    // List<Object> ee = new ArrayList<>(Arrays.asList(1, 2, "a", "b", 6, "x", 19));
    // filterList(ee)

    public ListFilter() {

    }

    public List<Object> filterList(List<Object> list) {

        List<Object> numbers = new ArrayList<>();

        for (Object value : list) {
            if (value instanceof Number) {
                numbers.add(value);
            }
        }

        return numbers;
    }
}

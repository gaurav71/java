package lambdas;

import java.util.ArrayList;
import java.util.List;

public class EnhancedList {
    private List<Integer> data;

    EnhancedList() {
        this.data = new ArrayList<>();
    }

    EnhancedList(List<Integer> data) {
        this.data = data;
    }

    public List<Integer> getData() {
        return data;
    }

    public void forEach(Consumer consumer) {
        for (int i=0; i<data.size(); i++) {
            consumer.accept(data.get(i));
        }
    }

    public List<Integer> filter(Predicate predicate) {
        List<Integer> filteredList = new ArrayList<>();

        for (int i=0; i<data.size(); i++) {
            if (predicate.test((data.get(i)))) {
                filteredList.add(data.get(i));
            }
        }

        return filteredList;
    }

    public List<Integer> map(Function function) {
        List<Integer> result = new ArrayList<>();

        for (int i=0; i<data.size(); i++) {
            result.add(function.apply((data.get(i))));
        }

        return result;
    }
}

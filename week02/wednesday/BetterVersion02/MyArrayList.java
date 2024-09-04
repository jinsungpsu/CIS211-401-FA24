import java.util.ArrayList;

public class MyArrayList implements List {

    private ArrayList<String> students = new ArrayList<>();

    @Override
    public void add(String it) {
        students.add(it);
    }

    @Override
    public String get(int index) {
        return students.get(index);
    }

    @Override
    public String toString() {
        return "MyArrayList{" + students.toString() +
                '}';
    }
}

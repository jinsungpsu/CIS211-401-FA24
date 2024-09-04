public class MyArrayList implements List {
    private String student1;
    private String student2;

    @Override
    public void add(String it) {
        if (student1 == null) {
            student2 = it;
        }
        student1 = it;
    }

    @Override
    public String get(int index) {
        if (index == 0) {
            return student1;
        } else if (index ==1) {
            return student2;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "student1='" + student1 + '\'' +
                ", student2='" + student2 + '\'' +
                '}';
    }
}

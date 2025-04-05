public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list2 = new MyArrayList<>();

        list2.add("One");
        list2.add("Two");
        list2.add("Three");
        list2.add("Four");
        list2.add(1, "No");

        System.out.println(list2.indexOf("No"));

    }
}
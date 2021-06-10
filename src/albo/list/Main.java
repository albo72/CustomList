package albo.list;

public class Main {

    public static void main(String[] args) {
        CustomList<String> customList = new CustomList(new String[]{"First", "Second", "Third"});

        for (String s : customList) {
            System.out.println(s);
        }

        CustomList<Integer> customList2 = new CustomList(new Integer[]{1, 2, 3, 4, 5, 6});
        for (int i : customList2) {
            System.out.println(i);
        }
    }
}
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("a");
        nameList.add("b");
        nameList.add("c");
        nameList.add("d");
        nameList.add("e");
        nameList.add("f");

        nameList.remove(3);

        System.out.println(nameList.size());
        System.out.println(nameList);

        ArrayList<Integer> numList = new ArrayList<>();

        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);

        for(int num:numList){
            System.out.println(num * num);
        }
    }
}

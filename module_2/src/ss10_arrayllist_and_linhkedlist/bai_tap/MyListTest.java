package ss10_arrayllist_and_linhkedlist.bai_tap;

public class MyListTest {
    public static void main(String[] args) {
        MyLists<Integer> integerMyLists = new MyLists<>(5);
        integerMyLists.add(0,17);
        integerMyLists.add(1,16);
        integerMyLists.add(2,15);
        integerMyLists.add(3,14);
        integerMyLists.add(4,0);
        integerMyLists.add(5,13);

        System.out.println(integerMyLists.contains(17));
        System.out.print("[");
        for (int i = 0; i < integerMyLists.size(); i++){
            System.out.print(integerMyLists.get(i) + ",");
        }
        System.out.print("]\n");
        System.out.println("array size = " + integerMyLists.size());

        integerMyLists.add(6,1);
        System.out.println(integerMyLists.get(6));
        System.out.println("size = " + integerMyLists.size());

        System.out.println("------------------------------------");
        integerMyLists.clear();
        System.out.println("array size = " + integerMyLists.size());
        for (int i = 0; i < integerMyLists.size();i++){
            System.out.println(integerMyLists.get(i));
        }

    }
}

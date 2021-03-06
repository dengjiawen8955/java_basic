package Java学习.Java高级.泛型;

import java.util.ArrayList;

/**
 * 题目：
 * 一个大集合中存在一定的int数字，写出一个方法，筛选出其中的偶数并放到一个新的集合中
 */
public class 泛型用法2Collection集合 {
    private <Integer> ArrayList getEventNumberArrayList(ArrayList<Integer> arrayList) {
        ArrayList<Integer> eventNumberArrayList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {

            if ((int) arrayList.get(i) % 2 == 0) {
                eventNumberArrayList.add(arrayList.get(i));
            }
        }
        return eventNumberArrayList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        ArrayList eventNumberArrayList = new 泛型用法2Collection集合().getEventNumberArrayList(arrayList);
        System.out.println(eventNumberArrayList);
    }
}

package linked_list;

/**
 * Created by gorobec on 08.05.16.
 */
public class TestMyLL {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.add(5));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.add(7));
        System.out.println(list.size());
        System.out.println(list.add(13));
        System.out.println(list.size());
        System.out.println("Contains 7? - " + list.contains(7));


        System.out.print("List: ");

        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i) + " ");
        }
        System.out.println();
/*
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.remove(1));
        System.out.println("Contains 7? - " + list.contains(7));*/

        Object[] array = list.toArray();
        for (Object o : array) {
            System.out.println(o);
        }


    }
}

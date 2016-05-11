package linked_list;

/**
 * Created by gorobec on 08.05.16.
 */
public class MyLinkedList implements MyList{

    private int size;
    private Node head;
    private Node tail;


    @Override
    public boolean add(Object o) {
        if(head == null){
            head = tail = new Node(o);
            size++;
            return true;
        } else {
            Node tmp = new Node(o);
            tail.next = tmp;
            tmp.previous = tail;
            tail = tail.next;
            size++;
            return  true;
        }
    }

    @Override
    public void add(int index, Object o) {

    }

    @Override
    public void clear() {
        tail = null;
        while (head != null){
            head.previous = null;
            head = head.next;
            size--;
        }
    }

    @Override
    public boolean contains(Object o) {
        Node iterator = head;
        while(iterator != null){
            if(iterator.value.equals(o)){
                return true;
            } else {
                iterator = iterator.next;
            }
        }

        return false;
    }

    @Override
    public Object get(int index) {
        int position = 0;
        Node tmp = head;
        while (position != index){
            tmp = tmp.next;
            position++;
        }
        return tmp.value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Object remove(int index) {
        int position = 0;
        Node tmp = head;
        while (position != index){
            tmp = tmp.next;
            position++;
        }
        tmp.previous.next = tmp.next;
        tmp.next.previous = tmp.previous;
        size--;
        return tmp.value;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int position = 0;
        Node tmp = head;
        while (position != size){
            array[position] = tmp.value;
            tmp = tmp.next;
            position++;
        }
        return array;
    }


    private class Node {
        Object value;
        Node next;
        Node previous;

        public Node() {

        }


        public Node(Object value) {
            this.value = value;
        }
    }
}

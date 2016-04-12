package data_structures;

/**
 * Created by gorobec on 12.04.16.
 */
public class MyArrayList {
    private static final int START_CAPACITY = 10;
    private Object[] elementData;
    private int capacity = 10;
    private int size = 0;


    public MyArrayList(){
        this.elementData = new Object[START_CAPACITY];
        this.capacity = START_CAPACITY;
    }

    public MyArrayList(int capacity){
        this.elementData = new Object[capacity];
        this.capacity = capacity;
    }

    public boolean add(Object obj){
        if(isFull()){
            resizeElementData();
        }
        elementData[size] = obj;
        size++;
        return true;
    }

    private void resizeElementData() {
        int newCapacity = (capacity * 3) / 2 + 1;
        Object[] newElementData = new Object[newCapacity];
        System.arraycopy(elementData, 0, newElementData, 0, capacity);
        elementData = newElementData;
        capacity = newCapacity;
    }

    private boolean isFull() {
        if(capacity - size == 1){
            return true;
        }
        return false;
    }
//todo
    public boolean add(int index, Object obj){
        return true;
    }

//todo add Exception
    public Object get(int index){
        if(index > size){
            System.err.println("IndexOutOfBoundsException");
            return null;
        }
        return elementData[index];
    }


    public boolean remove(int index){
        return false;
    }
    public boolean remove(Object obj){
        return false;
    }

//    todo
    public Object set(int index, Object obj){
        Object tmp = elementData[index];
        elementData[index] = obj;
        return tmp;
    }

    public void clear(){
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
    }
    public boolean contains(Object obj){
        return  false;
    }
    public int size(){
        return this.size;
    }
}

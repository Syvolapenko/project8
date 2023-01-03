package M9H1;

import M9H1.MyArrayList;

public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
        myArrayList.add(4);
        myArrayList.add(3);
        myArrayList.add(2);
        myArrayList.add(1);
        myArrayList.add(5);
myArrayList.remove(3);
myArrayList.clear();
myArrayList.add(34);


        System.out.println(myArrayList);

        }
    }

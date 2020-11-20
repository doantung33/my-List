public class MyLinkedListTest {
    public static void  main (String[]args){
        MyLinkedList myLinkedList=new MyLinkedList(0);
        myLinkedList.add(11,8);
        myLinkedList.addFirst(13);
        myLinkedList.addFirst(12);
        myLinkedList.add(9,7);
        myLinkedList.add(3,6);
        myLinkedList.printList();
    }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ArrLinkLists {
    ArrayList<Integer> arrayList;
    LinkedList<Integer> linkedList;

    private void createArrayList(){
        arrayList = new ArrayList<>(1000000);
        for(int i = 0; i< 1000000;i++)
        {
            arrayList.add(i);
        }
    }

    private void createLinkedList(){
        linkedList = new LinkedList<>();
        for(int i = 0; i< 1000000;i++)
        {
            linkedList.add(i);
        }
    }
    private int findRandomElemInArr(){
        return arrayList.get(new Random().nextInt(1000000));
    }

    private int findRandomEleminLink(){
        return linkedList.get(new Random().nextInt(1000000));
    }

    public void checkCreatingTime(){
        System.out.println("Time to create ArrayList:");
        long time = System.currentTimeMillis();
        createArrayList();
        System.out.println(System.currentTimeMillis()-time);
        System.out.println("Time to create LinkedList:");
        time = System.currentTimeMillis();
        createLinkedList();
        System.out.println(System.currentTimeMillis()-time);

    }

    public void checkFindingTime(){
        System.out.println("Time to find elem in ArrayList:");
        long time = System.currentTimeMillis();
        findRandomElemInArr();
        System.out.println(System.currentTimeMillis()-time);
        System.out.println("Time to find elem in LinkedList:");
        time = System.currentTimeMillis();
        findRandomEleminLink();
        System.out.println(System.currentTimeMillis()-time);;
    }


}

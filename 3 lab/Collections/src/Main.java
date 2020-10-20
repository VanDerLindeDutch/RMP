

import java.sql.Array;
import java.util.*;

import User.*;
public class Main {
    public static void main(String[] args) {
        /*FrequencyDict fDict = new FrequencyDict("o.txt");
        for(Map.Entry<String, Integer> i: fDict.getDict().entrySet()){
            System.out.print(i + " ");
        }*/
        //-----------------------------------------------------------
      /*  List<Integer> list = new ArrayList<>(Arrays.asList(1,2,34,3,4,5,4,4,4));
        System.out.println(DropDuplicate.drop(list));
        ArrLinkLists arrLinkLists = new ArrLinkLists();
        arrLinkLists.checkCreatingTime();
        arrLinkLists.checkFindingTime();*/
        //-----------------------------------------------------------------
        /*UserMap userMap = new UserMap();
        System.out.println(userMap);
        System.out.println(userMap.getScore());*/
        /*Integer[][] a = new Integer[][]{{0,1,3,5,5,6},{2,3,4},{4,5,6}};
        MyIter2<Integer> myIter = new MyIter2<>(a);
        while(myIter.hasNext()){
            System.out.println(myIter.next());
        }
        System.out.println(ArrayToMap.arrayToMap(a[0]));*/
        Map<String, Integer> map = new HashMap<>();
        map.put("s",1);
        map.put("a",1);
        map.put("q",2);
        System.out.println(SwitchKeysAndValues.switchKandV(map));

    }
}

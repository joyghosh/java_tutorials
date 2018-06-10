package concepts;

import java.util.*;

/**
 * Created by joyghosh on 08/06/18.
 */
public class IteratorTutorial {

    public static void main(String[] args){
//        iteratorUsage();
        listModifications();
    }

    public static void iteratorUsage(){
        Map<String, Integer> frequency = new HashMap<>();
        frequency.put("A",1);
        frequency.put("B",2);
        frequency.put("C",3);
        frequency.put("D",4);
        frequency.put("E",5);
        frequency.put("F",6);
        frequency.put("G",7);

        Iterator<String> itr = frequency.keySet().iterator();
//        System.out.println(itr);

        while(itr.hasNext()){
            itr.next();
            System.out.println(frequency.keySet());
            System.out.println(frequency.values());
            itr.remove();
        }

        System.out.println(frequency.keySet());
        System.out.println(frequency.values());
    }

    public static void listModifications(){
        List<String> strings = new ArrayList<>();
        strings.add("Q");
        strings.add("W");
        strings.add("E");
        strings.add("R");
        strings.add("T");
        strings.add("Y");

//        for(String s:strings){
//            if(s.equals("T")){
//                strings.add("U");
//            }
//            System.out.println(s);
//        }

//        for(int i=0; i<strings.size(); i++){
//            String s = strings.get(i);
//            if(s.equals("T")){
//                strings.add("U");
//            }
//            System.out.println(s);
//        }

        Iterator<String> itr = strings.iterator();
        while(itr.hasNext()){
            String s = itr.next();
            if(s.equals("T")){
                itr.remove();
            }
            System.out.println(s);
        }

        System.out.println(strings);
    }

    public static void wildCards(){
        List<?> list = new ArrayList<>();
//        list.add("A");
    }
}

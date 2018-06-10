package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joyghosh on 09/06/18.
 */
public class GenericsTutorial {

    public static void main(String[] args){
        generalUsage();
    }

    public static void generalUsage(){
        List list = new ArrayList();
        list.add(1);
        Object o = list.get(0);
        String foo = (String) o;
        System.out.println(foo);
    }
}

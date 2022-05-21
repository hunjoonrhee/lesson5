package collectionsExample;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();

        names.add("Joon");
        names.add("Eunjoo");
        names.add("Bongsoo");
        names.add("Insun");
        names.add("Dayoung");
        names.add("Seoyoon");
        names.add("Ahchung");

        Collections.sort(names);
        for(String name:names){
            System.out.println(name);
        }

    }
}

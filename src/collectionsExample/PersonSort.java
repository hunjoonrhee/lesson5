package collectionsExample;

import java.util.ArrayList;
import java.util.Collections;

public class PersonSort {
    public static void main(String[] args){
        ArrayList<Person> people = new ArrayList<Person>();

        people.add(new Person("Joon"));
        people.add(new Person("Eunjoo"));
        people.add(new Person("Bongsoo"));
        people.add(new Person("Insun"));
        people.add(new Person("Dayoung"));
        people.add(new Person("Seoyoon"));
        people.add(new Person("Ahchung"));

        for (Person person:people){
            System.out.println(person.name);
        }

        Collections.sort(people);
        System.out.println("------------sorted----------------");

        for (Person person:people){
            System.out.println(person.name);
        }

    }
}

package collectionsExample;

public class Person implements Comparable<Person>{
    public String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.name);
    }
}

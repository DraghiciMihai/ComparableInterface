public class Person implements Comparable <Person> {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int compareTo(Person itemToBeCompared) {
        if (itemToBeCompared.getAge() > this.getAge())
            return -1;
        else if (itemToBeCompared.getAge() < this.getAge())
            return 1;
        else return 0;
    }

    public int getAge() {
        return age;
    }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> people;

    public Employees() {
        people = new ArrayList<>();
    }

    public void add(Person person) {
        people.add(person);
    }

    public void add(List<Person> people) {
        this.people.addAll(people);
    }

    public void fire(Education education) {
        Iterator<Person> iter = people.iterator();
        while (iter.hasNext()) {
            if (iter.next().getEducation() == education) {
                iter.remove();
            }
        }
    }

    public void print() {
        Iterator<Person> iter = people.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iter = people.iterator();
        while (iter.hasNext()) {
            Person person = iter.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }
}

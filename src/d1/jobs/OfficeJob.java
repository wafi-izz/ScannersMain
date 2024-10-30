package d1.jobs;

import java.util.ArrayList;

public abstract class OfficeJob implements Job {
    int salary;
    String startShift;
    String endShift;

    ArrayList<Person> people;

    public OfficeJob(){
        people = new ArrayList<>();
    }

    @Override
    public void salary(int salary) {
        this.salary = salary;
    }

    @Override
    public void startShift(String shift) {
        this.startShift = shift;
    }

    @Override
    public void endShift(String shift) {
        this.endShift = shift;
    }

    @Override
    public void printJobDescription() {
        System.out.println("salary: " + salary);
        System.out.println("start work time: " + startShift);
        System.out.println("end work time: " + endShift);
    }

    @Override
    public void printWorkers() {
        System.out.println("people: " + people);
    }

    @Override
    public void hirePerson(Person person) {
        people.add(person);
    }

    @Override
    public void firePerson(Person person) {
        people.remove(person);
    }
}

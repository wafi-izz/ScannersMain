package d1.jobs;

public interface Job {
    void salary(int salary);
    void startShift(String shift);
    void endShift(String shift);
    void printJobDescription();// will print the salary and other data we have
    void printWorkers();
    void hirePerson(Person person);
    void firePerson(Person person);

}


/*
 * Create Job Interface which have salary, startShift, endShift, printJobDescription,
 * printWorkers, hirePerson, firePerson functions.

 */
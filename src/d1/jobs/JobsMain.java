package d1.jobs;

public class JobsMain {
    public static void main(String[] args) {
        Job coder = new SoftwareEngineer();

        coder.salary(5000);
        coder.startShift("09:00");
        coder.endShift("05:00");

        //creating person
        Person p1 = new Person();
        p1.name = "john";
        p1.age = 20;

        Person p2 = new Person();
        p2.name = "edina";
        p2.age = 20;

        coder.hirePerson(p1);
        coder.hirePerson(p2);

        coder.printJobDescription();
        coder.printWorkers();

        coder.firePerson(p2);
        coder.printWorkers();



    }
}























/*
* 1 create a Job interface
* 2 create two abstract classes OfficeJob and OutSideJob -> these two classes will implement the interface Job
* */




/*
* Create Job Interface which have salary, startShift, endShift, printJobDescription,
* printWorkers, hirePerson, firePerson functions.

*
*
*
*
Create Person class without inheriting anything and have basic peson information(then you will store person list in the abstract classes)

Create OfficeJob abstract class implement Job
implement necessarry functions from interface and create required fields

Create OutsideJob abstract class implement Job
implement necessarry functions from interface and create required fields



Create SoftwareEngineer extends OfficeJob
implement necessarry functions from abstract class and create required fields

Create TaxiDriver extends OutsideJob
implement necessarry functions from abstract class and create required fields


Write your main class to have 1 SoftwareEngineer job and 1 TaxiDriver  job

also create 10 people and assign these people to jobs.
* */
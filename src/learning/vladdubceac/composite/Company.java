package learning.vladdubceac.composite;

public class Company {

    public static void main(String[] args) {
    Employee dev1 = new Developer(100,"Vlad","Developer");
    Employee dev2 = new Developer(101,"Mira", "Entry Developer");

    Directory engDirectory = new Directory();
    engDirectory.addEmployee(dev1);
    engDirectory.addEmployee(dev2);

    Employee man1 = new Manager(200, "Jennifer","SEO Manager");
    Employee man2 = new Manager(201,"Ian","Mira's Manager");

    Directory accDirectory = new Directory();
    accDirectory.addEmployee(man1);
    accDirectory.addEmployee(man2);

    Directory companyDirectory = new Directory();
    companyDirectory.addEmployee(engDirectory);
    companyDirectory.addEmployee(accDirectory);
    companyDirectory.showEmployeeDetails();
    }
}

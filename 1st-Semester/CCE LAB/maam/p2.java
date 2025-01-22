class Member {
    String name;
    int age;
    String number;
    String address;
    int salary;

    public void printSalary()
    {
        System.out.println(salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

class Ans {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "XYZ";
        employee.age = 30;
        employee.number = "1234567890";
        employee.address = "12aa";
        employee.salary = 10000;
        employee.specialization = "Mehedi";

        Manager manager = new Manager();
        manager.name = "abc";
        manager.age = 35;
        manager.number = "9876***";
        manager.address = "agshsk";
        manager.salary = 20000;

        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.number);
        System.out.println("Address: " + employee.address);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Specializatiomn: " + employee.specialization);

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.number);
        System.out.println("Address: " + manager.address);
        System.out.println("Salary: " + manager.salary);

    }
}

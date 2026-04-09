//OOP s
// Class --> User Defined Data type
// Object--> Instance of class
// Encapsulation--> Wrapping of data member and member function into single unit (class)
// Inheritance--> 
//Polymorphism--> One name different forms Method Overloading
class Person{
    private String name;// attribute // datamember
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person name="+name+"age="+age;
    }
    Person(){// Default Constructor

    }
    Person(int age1, String name1){// Parameterized COnstructor
        this.age=age1;
        name=name1;
        this.setName(name);
    }
    Person(String name){
        this.name=name;
    }
}
class Employee extends Person{
    private int employeeId;
    Employee(int employeeId,int age,String name){
        super(age, name);
        this.employeeId=employeeId;
    }
    @Override
    public String toString() {
       
        return "Employee empId="+employeeId+"name="+super.getName()+"age="+super.getAge();
    }
    
}
class ClassDemo{
    public static void main(String args[]){
        int age=10;
        Person p=new Person(30,"Vinay");//Default Consturctor
        // p.setName("Vinay");
        // p.setAge(30);
        System.out.println(p);
        Employee employee=new Employee(1, 20, "John");
        System.out.print(employee);
    }
}
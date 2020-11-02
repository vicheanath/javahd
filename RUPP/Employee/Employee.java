class Employee{
    int id;
    String name;
    char sex;
    int age;
    float salary;
    int rate;
    float hours;
    void totalincome(){
        return salary * hours;
    }
    void taxpayment(){
        return totalincom * 0.3;
    }
    public static void main(String[] args) {
        
        Employee E = new Employee();

        E.id = 1;
        E.name = "Vichea";
        E.sex = "F";
        E.age = 18;
        E.salary = 210.50;
        E.rate = 5;
        E.hours = 5.5;
        System.out.println("ID :" + E.id);
        System.out.println("name :" + E.name);
        System.out.println("sex :" + E.sex);
        System.out.println("age :" + E.age);
        System.out.println("salary :" + E.salary);
        System.out.println("rate :" + E.rate);
        System.out.println("hours :" + E.hours);
        System.out.println("totalincome :" + E.totalincome());
        System.out.println("taxpayment :" + E.taxpayment());
    }
}
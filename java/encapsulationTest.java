class Person{
    private String name;
    private int age;

    public Person(){

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
}

public class encapsulationTest{
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Mike");
        p.setAge(20);
        System.out.println("Name: " + p.getName() +", Age: " + p.getAge());
    }
}
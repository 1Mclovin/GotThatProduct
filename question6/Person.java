package question6;

public class Person {
    private String name = "Bob";
    private int age = 29;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        return age;
    }

    // my method
    public void speach(){
        System.out.println("whatever sound a person makes");
    }

}

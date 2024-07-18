package POO;

public class Students{
    private String name;
    private int age;
    private String color;
    private String sex;

    public Students(String name, int age, String color, String sex){
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
    }

    public String getName(){
        return this.name;
    }

    public void eatin(){
        System.out.printf("%s eating\n", this.name);
    }
    public void running(){
        System.out.printf("%s is running\n", this.name);
    }
    public void drinking(){
        System.out.printf("%s drinking\n", this.name);
    }

}
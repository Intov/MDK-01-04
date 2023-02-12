public class Person {
    String fullName;
    int age;
    public  void talk(){
        System.out.println("Говорит " + fullName);
    }
    public void move(){
        System.out.println("Идет" + fullName);
    }
    public Person(){

    }
    public Person(String fullName,int age){
        this.age = age;
        this.fullName = fullName;
    }
}

import java.util.Arrays;

public class Phone {
    int number;
    int weight;
    String model;
    public static void receiveCall(String Name){
        System.out.println ("Звонит {" + Name + "}");
    }
    public  Phone(int number, String model, int weight){
        this(number, model);
        this.weight = weight;
    }
    public Phone(int number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(){

    }
    public int getNumber(){
        return number;
    }
    public static void receiveCall(String Name,int phoneNumber){
        System.out.println("Вам звонит - " + Name + " Номер - " + phoneNumber);
    }
    public static void sendMesssage(int ... number){
        System.out.println(Arrays.toString(number));
    }
}

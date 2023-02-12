public class Main {
    public static void main(String[] args) {
        //# 1
        Phone phoneOne = new Phone(89042425, " Sumsung Galaxy A72 ", 414);
        Phone phoneTwo = new Phone(89042512," IPhone XR ");
        Phone phoneThree = new Phone();

        System.out.println(phoneOne.number + phoneOne.model + phoneOne.weight);
        System.out.println(phoneTwo.number + phoneTwo.model + phoneTwo.weight);
        System.out.println(phoneThree.number + phoneThree.model + phoneThree.weight);

          phoneOne.receiveCall("Женя");
        phoneOne.getNumber();
        phoneTwo.receiveCall("Сережа");
        phoneTwo.getNumber();
        phoneThree.receiveCall("Даниил");
        phoneThree.getNumber();

        Phone.receiveCall("Alegra", 89124201);
        Phone.sendMesssage(521125, 51251515 ,215235,7426734);
    }
}
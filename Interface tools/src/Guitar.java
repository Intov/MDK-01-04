import java.net.NetworkInterface;

public class Guitar implements tools{
    private String numberOfStrings;
    public Guitar(String numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }

    public String getNumberOfStrings() {
        return numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара со следующими характеристиками, " + getNumberOfStrings());
    }
}

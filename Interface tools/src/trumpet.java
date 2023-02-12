public class trumpet implements tools{
    private String diameter;
    public trumpet(String diameter){
        this.diameter = diameter;
    }
    @Override
    public void play() {
        System.out.println("Играет труба со следующими характеристиками, " + diameter);
    }
}

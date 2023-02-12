public class drums implements tools{
    private String size;
    public drums(String size ){
        this.size = size;
    }
    @Override
    public void play() {
        System.out.println("Играют барабаны со следующими характеристиками, " + size);
    }
}

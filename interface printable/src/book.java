public class  book implements printable{
    private String name;
    public book(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public void print() {
        System.out.println("Книга " + getName());
    }
    public static void printBooks(printable[] printables){
        for (printable printable : printables){
            if(printable instanceof book){
                printable.print();
            }
        }
    }
}

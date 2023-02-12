public class magazine implements printable{
    private String name;
    public void print(){
        System.out.println("Журнал " + name );
    }
    public magazine(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public static void printMagazines(printable[] printables){
        for (printable printable : printables){
            if(printable instanceof magazine){
                printable.print();
            }
        }
    }

}

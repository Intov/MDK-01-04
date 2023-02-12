public class VremenaGoda {
    public static void main(String[] args) {
    }
    public enum Season{
        SUMMER(20){
            public String getDescription(){
                return "Теплое время года";

            }
        },
        WINTER(-10),SPRING(5),AUTUMN(0);
        public int temp;

        public String getDescription() {
            return "Холодное время года";
        }

        Season(int temp){
            this.temp = temp;
        }
    }
    public static void printAllSeason(){
        for (Season SeasonAll : Season.values()){
            System.out.println(SeasonAll);
            System.out.println(SeasonAll.temp);
            System.out.println(SeasonAll.getDescription());
        }
    }
    public static void print(VremenaGoda.Season Season){
        switch(Season)

        {
            case SUMMER:
                System.out.println("Лето мое любимое время года.");
                break;
            case WINTER:
                System.out.println("Зима мое любиоме время года");
                break;
            case AUTUMN:
                System.out.println("Осень мое любимое время года");
                break;
            case SPRING:
                System.out.println("Весна мое любимое время года");
                break;
        }
    }
}
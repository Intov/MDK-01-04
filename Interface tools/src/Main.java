public class Main {
    public static void main(String[] args) {
        Guitar HeritageCherrySunbustGibsonLesPaulStandart = new Guitar("6 струн");
        drums Djembe = new drums("220 x 120 - size");
        trumpet Boston = new trumpet("50");
        tools [] arrayOfTools = {HeritageCherrySunbustGibsonLesPaulStandart, Djembe, Boston};
        for(tools tools : arrayOfTools){
            tools.play();
        }
    }
}
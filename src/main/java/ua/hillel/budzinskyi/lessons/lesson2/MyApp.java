package ua.hillel.budzinskyi.lessons.lesson2;

public class MyApp {
    public static void main(String[] args) {
        double coordinates =  28.468217;
        double coordinates2 = 49.233083;
        char specSymbol='\u003B';
        char specSymbol2='\u00B0';

        System.out.print("Longitude: "+coordinates+specSymbol);
        System.out.println(" Latitude: "+coordinates2+".");
        System.out.println("DMS Lat: 49" + specSymbol2 + "13'58.01'' N; DMS Long 28"+ specSymbol2 + "28'51.49'' E");


    }
}

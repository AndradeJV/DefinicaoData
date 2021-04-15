public class Main {
    public static void main(String[] args){

        Data imprimeData = new Data(04, 05, 2005);
        DataExtensa imprimeDataExtensa = new DataExtensa(04, 05, 2005);

        System.out.printf("Data base: ");  
        imprimeData.displayData();

        System.out.printf("Data por extenso: ");
        imprimeDataExtensa.displayDataPorExtenso();
    }
}
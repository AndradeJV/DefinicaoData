public class Data {
    
    private int dia;
    private int mes;
    private int ano;

    public Data(int diaData, int mesData, int anoData) {  
        this.dia = diaData;
        this.mes = mesData;
        this.ano = anoData;
    }  
    public void setDia(int diaData) {  
        this.dia = diaData;  
    }  
    public int getDia() {  
        return this.dia;  
    }  

    public void setMes(int mesData) {  
        this.mes = mesData;  
    }  
    public int getMes() {  
        return this.mes;  
    }  
    public void setAno(int anoData) {  
        this.ano = anoData;  
    }  
    public int getAno() {  
        return this.ano;  
    }  
    public void displayData() {  
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);  
    }  

}

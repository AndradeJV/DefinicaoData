public class DataExtensa extends Data{
    public DataExtensa(int diaExtenso, int mesExtenso, int anoExtenso){
        super(diaExtenso, mesExtenso, anoExtenso);
    }

    public String converterMesPorExtenso(int mes) {
        String meses[] = {"janeiro", "fevereiro", "março", "abril", 
        "maio", "junho", "julho", "agosto",
        "setembro", "outubro", "novembro", "dezembro"};

        return meses[mes - 1];
    }
    
    public void displayDataPorExtenso(){
        int mes = this.getMes();
        String mesConvertido = converterMesPorExtenso(mes);
        System.out.println(this.getDia() + " de " + mesConvertido + " de " + this.getAno());
    }
}

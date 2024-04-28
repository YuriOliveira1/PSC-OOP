public class Veiculo {

    @SuppressWarnings("unused")
    private String modelo;
    @SuppressWarnings("unused")
    private String marca;
    @SuppressWarnings("unused")
    private String cor;
    @SuppressWarnings("unused")
    private String placa;

    public Veiculo(String modelo, String marca, String cor, String placa){
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
    }
}

class Moto extends Veiculo{

    private int cc;
    private double preco = 3;

    public Moto(String modelo, String marca, String cor, String placa, int cc) {
        super(modelo, marca, cor, placa);
        this.cc = cc;
    }
    
    public double valorPedagio(int cc){
        if (cc < 150) {
            preco += 1.5;
        } else if (cc > 150 && cc <= 250) {
            preco += 2.5;
        } else if (cc > 250 && cc <= 450) {
            preco += 3.5;
        } else if (cc > 450 && cc <= 750) {
            preco += 5;
        } else if (cc > 1000) {
            preco += 7;
        }
        return preco;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
}

class Carro extends Veiculo{

    private int passageiros;
    private int preco = 6;
    public Carro(String modelo, String marca, String cor, String placa, int passageiros) {
        super(modelo, marca, cor, placa);
        this.passageiros = passageiros;
    }
    
    public double valorPedagio(int passageiros){
        if (passageiros == 2) {
            preco += 1;
        } else if (passageiros == 3) {
            preco += 2;
        } else if (passageiros == 4) {
            preco += 3;
        } else if (passageiros > 4) {
            preco += 10;
        }
        return preco;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }
}

class Caminhao extends Veiculo{

    private int carga;
    private int preco = 8;

    public Caminhao(String modelo, String marca, String cor, String placa, int carga) {
        super(modelo, marca, cor, placa);
        this.carga = carga;
    }

    
    public double valorPedagio(int carga){

        if (carga > 0 && carga <= 250) {
            preco += 2;
        } else if (carga > 250 && carga <= 500) {
            preco += 4;
        } else if (carga > 750 && carga <= 100) {
            preco += 8;
        } else if (carga > 1000) {
            preco += 12;
        }
        return preco;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

}

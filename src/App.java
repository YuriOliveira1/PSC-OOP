import java.util.Scanner;

public class App {
    public static void formulario(Scanner reader, String tipo) {
        System.out.print("Modelo: ");
        String modelo = reader.nextLine();
        reader.nextLine();

        System.out.print("Marca: ");
        String marca = reader.nextLine();

        System.out.print("Cor: ");
        String cor = reader.nextLine();

        System.out.print("Placa: ");
        String placa = reader.nextLine();

        if (tipo.equals("Carro")) {
            System.out.println("Passageiros: ");
            int passageiros = reader.nextInt();
            Carro carro = new Carro(modelo, marca, cor, placa, passageiros);
            System.out.println("Preço: " + carro.valorPedagio(passageiros));

        } else if (tipo.equals("Moto")) {
            System.out.println("CC: ");
            int cc = reader.nextInt();
            Moto moto = new Moto(modelo, marca, cor, placa, cc);
            System.out.println("Preço: " + moto.valorPedagio(cc));

        } else if (tipo.equals("Caminhão")) {
            System.out.println("Carga: ");
            int carga = reader.nextInt();
            Caminhao caminhao = new Caminhao(modelo, marca, cor, placa, carga);
            System.out.println("Preço: " + caminhao.valorPedagio(carga));
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("1 - Carro"); // Passageiros
        System.out.println("2 - Moto"); // CC
        System.out.println("3 - Caminhão"); // Carga em KG
        System.out.print("Opção: ");
        int options = reader.nextInt();

        switch (options) {
            case 1:
                formulario(reader, "Carro");
                break;
            case 2:
                formulario(reader, "Moto");
                break;
            case 3:
                formulario(reader, "Caminhão");
                break;
            default:
                break;
        }

        reader.close();
    }
}
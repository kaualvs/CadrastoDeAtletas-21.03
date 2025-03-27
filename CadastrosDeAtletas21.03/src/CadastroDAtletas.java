import java.util.Scanner;

public class CadastroDAtletas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Cadastro
        System.out.println("Cadastros de atletas");
//Nome
        System.out.println("Nome do atleta");
        String nome = scanner.nextLine();
//Idade
        System.out.println("Idade do atleta");
        int idade = scanner.nextInt();
//Categoria
        String categoria;
        if (idade <= 10) {categoria = "Infantil";}
        else if (idade <= 15) {categoria = "Juvenil";}
        else if (idade <= 19) {categoria = "Júnior";}
        else if (idade <= 40) {categoria = "Adulto";}
        else {categoria = "Master";}
//Exibir
        System.out.println("Nome do atleta: " + nome);
        System.out.println("Idade do atleta: " + idade);
        System.out.println("Categoria do atleta: " + categoria);


        scanner.close();
    }
}

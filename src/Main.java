import br.com.petshop.Pet;
import br.com.petshop.Servicos;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String codUsuario;
        System.out.println("Usuário:");
        codUsuario = sc.nextLine();

        List < Pet > pets = new ArrayList < Pet > ();

        boolean sair = false;

        do {
            System.out.println("# MENU PRINCIPAL");
            if (codUsuario.equals("admin")) {
                System.out.println("1.Cadastrar Pet\n2.Exibir Pets\n3.Serviços\n0.Sair");
            } else {
                System.out.println("1.Exibir Pets\n2.Serviços\n0.Sair");
            }
            System.out.println("Escolha uma opção:");
            int opcao = sc.nextInt();

            if (codUsuario.equals("admin")) {
                switch (opcao) {
                    case 1:
                        cadastrarPet(pets);
                        break;
                    case 2:
                        exibirPetsCadastrados(pets);
                        break;
                    case 3:
                        Servicos.servicosPet();
                        break;
                    case 0:
                        sair = true;
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } else {
                switch (opcao) {
                    case 1:
                        exibirPetsCadastrados(pets);
                        break;
                    case 2:
                        Servicos.servicosPet();
                        break;
                    case 0:
                        sair = true;
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }
        } while (!sair);
        System.out.println("Sistema finalizado!");
    }

    public static void cadastrarPet(List < Pet > pets) {

        int limitePets = 1;

        if (pets.size() < limitePets) {
            Scanner sc = new Scanner(System.in);
            Pet pet = new Pet();
            System.out.println("Nome:");
            pet.setNome(sc.nextLine());
            System.out.println("Espécie:");
            pet.setEspecie(sc.nextLine());
            System.out.println("Raça:");
            pet.setRaca(sc.nextLine());
            System.out.println("Idade:");
            pet.setIdade(sc.nextInt());
            sc.nextLine();
            System.out.println("Sexo:");
            pet.setSexo(sc.nextLine());
            pets.add(pet);
        } else {
            System.out.println("*** PetShop cheio, tente mais tarde! ***");
        }

    }

    public static void exibirPetsCadastrados(List < Pet > pets) {
        if (pets.isEmpty()) {
            System.out.println("*** PetShop vazio! ***");
        } else {
            int seqCadastro = 0;
            for (Pet pet: pets) {
                seqCadastro++;
                System.out.println(String.format("Pet %d: %s", seqCadastro, pet.getNome()));
            }
        }
    }
}
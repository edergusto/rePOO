import br.com.petshop.Pet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<Pet> pets = new ArrayList<Pet>();
        boolean sair = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------- UniPetShop ---------------");
        do{
            System.out.println("-                   MENU                  -");
            System.out.println("1. Cadastrar Pet | 2. Exibir Pets | 3. Sair");
            int escolha = sc.nextInt();
            switch (escolha){
                case 1:
                    cadastrarPet(pets);
                    break;
                case 2:
                    exibirPetsCadastradas(pets);
                    break;
                case 3:
                    System.out.println();
                    sair = true;
                    break;
            }
        }while (!sair);
    }

    public static void cadastrarPet(List<Pet> pets){
        Scanner sc = new Scanner(System.in);
        Pet pet = new Pet();
        System.out.println("Nome:");
        pet.nome = sc.nextLine();
        System.out.println("Peso:");
        pet.peso = sc.nextFloat();
        System.out.println("Raça:");
        pet.raca = sc.nextLine();
        System.out.println("Idade:");
        pet.idade = sc.nextInt();
        System.out.println("Cadastrado!");
        pets.add(pet);
    }

    public static void exibirPetsCadastradas(List<Pet> pets){
        for (Pet pet : pets){
            System.out.println(pet.nome);
        }
    }
}

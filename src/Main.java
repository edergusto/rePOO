import br.com.petshop.Pet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<Pet> pets = new ArrayList<Pet>();
        boolean sair = false;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("---------------- UniPetShop ---------------");
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
    }

    public static void exibirPetsCadastradas(List<Pet> pets){
        System.out.println("------------------- Pets ------------------");
        int seqCadastro = 0;
        for (Pet pet : pets){
            seqCadastro++;
            System.out.println(String.format("Pet %d: %s", seqCadastro, pet.getNome()));
        }
        System.out.println("-------------------------------------------");
    }
}

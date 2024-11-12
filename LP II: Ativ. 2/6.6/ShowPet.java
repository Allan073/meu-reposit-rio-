public class ShowPet {
    public static void main(String[] args) {
        Gato cat = new Gato("Bara");
        Cachorro dog = new Cachorro("Bere");
        Cachorrao dog2 = new Cachorrao("Berezão");

        System.out.println(cat.getNome());
        cat.fazerSom();
        System.out.println(dog.getNome());
        dog.fazerSom();
        System.out.println(dog2.getNome());
        dog2.fazerSom();
    }
}

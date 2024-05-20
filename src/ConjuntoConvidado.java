import java.util.HashSet;

public class ConjuntoConvidado {
    static HashSet<Convidado> listaConvidados = new HashSet<>();

    public static void main(String[] args) {
        // Adicionando convidados ao conjunto
        adicionarConvidado("Alice", 3908);
        adicionarConvidado("Bob", 2438);
        adicionarConvidado("Charlie", 1483);
        adicionarConvidado("David", 1236);

        System.out.println("----------------------------------------------");
        exibirConvidados();
        System.out.println("Quantidade de convidados: " + contarConvidados());
        System.out.println("----------------------------------------------");
        removerConvidadoPorCodigoConvite(1236);
        removerConvidadoPorCodigoConvite(3908);
        exibirConvidados();
        System.out.println("Quantidade de convidados: " + contarConvidados());
        System.out.println("----------------------------------------------");


    }

    static void adicionarConvidado(String nome, int codigoConvite) {
        listaConvidados.add(new Convidado(nome, codigoConvite));
    }

    static void removerConvidadoPorCodigoConvite(int codigoConvite) {
        listaConvidados.removeIf(convidado -> convidado.getCodigoConvite() == codigoConvite);
    }

    static int contarConvidados() {
        return listaConvidados.size();
    }

    static void exibirConvidados(){
        listaConvidados.forEach(System.out::println);
    }
}
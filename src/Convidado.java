public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoCovite) {
        setNome(nome);
        setCodigoConvite(codigoCovite);
    }

    @Override
    public String toString() {
        return "{ Convidado: "+getNome()+" | Codigo: "+getCodigoConvite()+" }";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public void setCodigoConvite(int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }
}

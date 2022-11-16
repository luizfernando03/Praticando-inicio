public class Professor {
    public static void main(String[] args) {
        AugumaCoisa bola = new AugumaCoisa("bola");



    }
}
class AugumaCoisa{
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AugumaCoisa(String nome) {
        this.nome = nome;
    }
}

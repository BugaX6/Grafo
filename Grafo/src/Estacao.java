import java.util.Objects;

public class Estacao {
    private String nome;
    private String linha;

    public Estacao(String nome, String linha) {
        this.nome = nome;
        this.linha = linha;
    }

    //getters para acessar as informações das estações
    public String getNome() {
        return nome;
    }

    public String getLinha() {
        return linha;
    }

    @Override
    public String toString(){
        return nome + ": " + " Linha:  " + linha;
    }

    //Comparando se duas estações são iguais, considerando o nome e a linha
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Estacao other = (Estacao) o;
        return nome.equals(other.nome) && linha.equals(other.linha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

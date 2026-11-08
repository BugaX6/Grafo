import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public class GrafoMetro {

    private Map<Estacao, List<Estacao>> mapaMetro;

    public GrafoMetro() {
        this.mapaMetro = new HashMap<>();
    }

    public void adicionarEstacao(Estacao estacao) {
        mapaMetro.putIfAbsent(estacao, new ArrayList<>());
    }

    public void adicionarConexao(Estacao origem, Estacao destino) {
        adicionarEstacao(origem);
        adicionarEstacao(destino);


        mapaMetro.get(origem).add(destino);
        mapaMetro.get(destino).add(origem);
    }

    public void imprimirMapa(){
        for(Estacao estacao : mapaMetro.keySet()){
            System.out.print(estacao.getNome() + " Faz fronteira com: ");
            //Ver qual estação está conectada a qual estação
            List<Estacao> conexoes = mapaMetro.get(estacao);
            for(Estacao conexao : conexoes){
                System.out.print(conexao + " ");
            }
            System.out.println();
        }
    }
    public List<Estacao> buscarMenorCaminho(Estacao origem, Estacao destino) {
        if (!mapaMetro.containsKey(origem) || !mapaMetro.containsKey(destino)) {
            return new ArrayList<>();
        }

        Queue<Estacao> fila = new LinkedList<>();
        Set<Estacao> visitados = new HashSet<>();
        Map<Estacao, Estacao> historicoPassos = new HashMap<>();
        fila.add(origem);
        visitados.add(origem);
        while (!fila.isEmpty()) {
            Estacao atual = fila.poll();
            if (atual.equals(destino)) {
                return reconstruirRota(historicoPassos, destino);
            }
            for (Estacao vizinho : mapaMetro.get(atual)) {
                if (!visitados.contains(vizinho)) {
                    visitados.add(vizinho);
                    historicoPassos.put(vizinho, atual);
                    fila.add(vizinho);
                }
            }
        }
        return new ArrayList<>();
    }

    private List<Estacao> reconstruirRota(Map<Estacao, Estacao> historicoPassos, Estacao destino) {
        List<Estacao> rota = new ArrayList<>();
        Estacao passoAtual = destino;
        while (passoAtual != null) {
            rota.add(passoAtual);
            passoAtual = historicoPassos.get(passoAtual);
        }
        Collections.reverse(rota);
        return rota;
    }
    public Set<Estacao> getEstacoes() {
        return mapaMetro.keySet();
    }
}

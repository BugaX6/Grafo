import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TelaMetro extends JFrame {

    private GrafoMetro mapa;
    private JComboBox<Estacao> comboOrigem;
    private JComboBox<Estacao> comboDestino;
    private JTextArea areaResultado;

    public TelaMetro(GrafoMetro mapa) {
        this.mapa = mapa;

        setTitle("Simulador de Rotas - Metrô SP");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        List<Estacao> listaEstacoes = new ArrayList<>(mapa.getEstacoes());
        listaEstacoes.sort(Comparator.comparing(Estacao::getNome));

        Estacao[] arrayEstacoes = listaEstacoes.toArray(new Estacao[0]);

        JPanel painelSuperior = new JPanel(new GridLayout(3, 2, 5, 5));
        painelSuperior.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        comboOrigem = new JComboBox<>(arrayEstacoes);
        comboDestino = new JComboBox<>(arrayEstacoes);
        JButton btnBuscar = new JButton("Calcular Menor Rota");

        painelSuperior.add(new JLabel("Selecione a Origem:"));
        painelSuperior.add(comboOrigem);
        painelSuperior.add(new JLabel("Selecione o Destino:"));
        painelSuperior.add(comboDestino);
        painelSuperior.add(new JLabel(""));
        painelSuperior.add(btnBuscar);
        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        areaResultado.setLineWrap(true);
        areaResultado.setWrapStyleWord(true);
        areaResultado.setFont(new Font("Arial", Font.BOLD, 14));


        JScrollPane painelRolagem = new JScrollPane(areaResultado);
        painelRolagem.setBorder(BorderFactory.createTitledBorder("Resultado da Busca"));
        add(painelSuperior, BorderLayout.NORTH);
        add(painelRolagem, BorderLayout.CENTER);
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executarBusca();
            }
        });
    }

    private void executarBusca() {
        Estacao origem = (Estacao) comboOrigem.getSelectedItem();
        Estacao destino = (Estacao) comboDestino.getSelectedItem();

        if (origem == null || destino == null) return;

        List<Estacao> rota = mapa.buscarMenorCaminho(origem, destino);

        if (rota.isEmpty()) {
            areaResultado.setText("Nenhum caminho encontrado entre " + origem.getNome() + " e " + destino.getNome());
        } else {
            StringBuilder texto = new StringBuilder();
            texto.append("Trajeto: ").append(rota.size()).append(" estações.\n\n");

            for (int i = 0; i < rota.size(); i++) {
                texto.append(rota.get(i).getNome());
                if (i < rota.size() - 1) {
                    texto.append(" -> ");
                }
            }
            areaResultado.setText(texto.toString());
        }
    }
}
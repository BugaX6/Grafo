import java.util.List;

public class Main {
    public static void main(String[] args) {

        GrafoMetro mapa = new GrafoMetro();
        // ================================================================================
        //linha 4 - amarela
        // ================================================================================
        Estacao vilaSonia = new Estacao("Vila Sônia", "Amarela");
        Estacao saoPauloMorumbi = new Estacao("São Paulo - Morumbi", "Amarela");
        Estacao butanta = new Estacao("Butantã", "Amarela");
        ////baldeação entre a linha amarela para linha esmeralda
        Estacao pinheiros = new Estacao("Pinheiros", "Amarela/Esmeralda");
        Estacao fariaLima = new Estacao("Faria Lima", "Amarela");
        Estacao fradiqueCoutinho = new Estacao("Fradique Coutinho", "Amarela");
        Estacao oscarFreire = new Estacao("Oscar Freire", "Amarela");
        Estacao paulista = new Estacao("Paulista", "Amarela");
        Estacao higienopolisMackenzie = new Estacao("Higienópolis - Mackenzie", "Amarela");
        Estacao republica = new Estacao("República", "Amarela");
        Estacao luz = new Estacao("Luz", "Amarela");

        // ================================================================================
        //linha 9 - esmeralda
        // ================================================================================
        Estacao osasco = new Estacao("Osasco", "Esmeralda");
        Estacao presidenteAltino = new Estacao("Presidente Altino", "Esmeralda");
        Estacao ceasa = new Estacao("Ceasa", "Esmeralda");
        Estacao vilaLobosJaguare = new Estacao("Vila Lobos - Jaguaré", "Esmeralda");
        Estacao cidadeUniversitaria = new Estacao("Cidade Universitária", "Esmeralda");
        // Pinheiros já foi criado na Linha Amarela
        Estacao hebraicaReboucas = new Estacao("Hebraica - Rebouças", "Esmeralda");
        Estacao cidadeJardim = new Estacao("Cidade Jardim", "Esmeralda");
        Estacao vilaOlimpia = new Estacao("Vila Olímpia", "Esmeralda");
        Estacao berrini = new Estacao("Berrini", "Esmeralda");
        Estacao morumbiEsmeralda = new Estacao("Morumbi - Claro", "Esmeralda");
        Estacao granjaJulieta = new Estacao("Granja Julieta", "Esmeralda");
        Estacao joaoDias = new Estacao("João Dias", "Esmeralda");
        //baldeação entre a linha esmeralda para linha lilás
        Estacao santoAmaro = new Estacao("Santo Amaro", "Esmeralda/Lilás");
        Estacao socorro = new Estacao("Socorro", "Esmeralda");
        Estacao jurubatuba = new Estacao("Jurubatuba - Senac", "Esmeralda");
        Estacao autodromo = new Estacao("Autódromo", "Esmeralda");
        Estacao primaveraInterlagos = new Estacao("Primavera - Interlagos", "Esmeralda");
        Estacao grajau = new Estacao("Grajaú", "Esmeralda");
        Estacao mendesVilaNatal = new Estacao("Bruno Covas - Mendes - Vila Natal", "Esmeralda");
        Estacao varginha = new Estacao("Varginha", "Esmeralda");

        // ================================================================================
        //linha 5 - lilás
        // ================================================================================
        Estacao capaoRedondo = new Estacao("Capão Redondo", "Lilás");
        Estacao campoLimpo = new Estacao("Campo Limpo", "Lilás");
        Estacao vilaDasBelezas = new Estacao("Vila das Belezas", "Lilás");
        Estacao giovanniGronchi = new Estacao("Giovanni Gronchi", "Lilás");
        // Santo Amaro já foi criado na Linha Esmeralda
        Estacao largoTreze = new Estacao("Largo Treze", "Lilás");
        Estacao adolfoPinheiro = new Estacao("Adolfo Pinheiro", "Lilás");
        Estacao altoDaBoaVista = new Estacao("Alto da Boa Vista", "Lilás");
        Estacao borbaGato = new Estacao("Borba Gato", "Lilás");
        Estacao brooklin = new Estacao("Brooklin", "Lilás");
        Estacao campoBelo = new Estacao("Campo Belo", "Lilás");
        Estacao eucaliptos = new Estacao("Eucaliptos", "Lilás");
        Estacao moema = new Estacao("Moema", "Lilás");
        Estacao aacdServidor = new Estacao("AACD - Servidor", "Lilás");
        Estacao hospitalSaoPaulo = new Estacao("Hospital São Paulo", "Lilás");
        Estacao santaCruz = new Estacao("Santa Cruz", "Lilás");
        Estacao chacaraKlabin = new Estacao("Chácara Klabin", "Lilás");

        // ====================================================
        //linha 4 - amarela
        // ====================================================
        mapa.adicionarConexao(vilaSonia, saoPauloMorumbi);
        mapa.adicionarConexao(saoPauloMorumbi, butanta);
        mapa.adicionarConexao(butanta, pinheiros);
        mapa.adicionarConexao(pinheiros, fariaLima);
        mapa.adicionarConexao(fariaLima, fradiqueCoutinho);
        mapa.adicionarConexao(fradiqueCoutinho, oscarFreire);
        mapa.adicionarConexao(oscarFreire, paulista);
        mapa.adicionarConexao(paulista, higienopolisMackenzie);
        mapa.adicionarConexao(higienopolisMackenzie, republica);
        mapa.adicionarConexao(republica, luz);

        // ====================================================
        // Linha 9 - esmeralda
        // ====================================================
        mapa.adicionarConexao(osasco, presidenteAltino);
        mapa.adicionarConexao(presidenteAltino, ceasa);
        mapa.adicionarConexao(ceasa, vilaLobosJaguare);
        mapa.adicionarConexao(vilaLobosJaguare, cidadeUniversitaria);
        mapa.adicionarConexao(cidadeUniversitaria, pinheiros);
        mapa.adicionarConexao(pinheiros, hebraicaReboucas);
        mapa.adicionarConexao(hebraicaReboucas, cidadeJardim);
        mapa.adicionarConexao(cidadeJardim, vilaOlimpia);
        mapa.adicionarConexao(vilaOlimpia, berrini);
        mapa.adicionarConexao(berrini, morumbiEsmeralda);
        mapa.adicionarConexao(morumbiEsmeralda, granjaJulieta);
        mapa.adicionarConexao(granjaJulieta, joaoDias);
        mapa.adicionarConexao(joaoDias, santoAmaro);
        mapa.adicionarConexao(santoAmaro, socorro);
        mapa.adicionarConexao(socorro, jurubatuba);
        mapa.adicionarConexao(jurubatuba, autodromo);
        mapa.adicionarConexao(autodromo, primaveraInterlagos);
        mapa.adicionarConexao(primaveraInterlagos, grajau);
        mapa.adicionarConexao(grajau, mendesVilaNatal);
        mapa.adicionarConexao(mendesVilaNatal, varginha);

        // ====================================================
        //linha 5 - lilás
        // ====================================================
        mapa.adicionarConexao(capaoRedondo, campoLimpo);
        mapa.adicionarConexao(campoLimpo, vilaDasBelezas);
        mapa.adicionarConexao(vilaDasBelezas, giovanniGronchi);
        mapa.adicionarConexao(giovanniGronchi, santoAmaro);
        mapa.adicionarConexao(santoAmaro, largoTreze);
        mapa.adicionarConexao(largoTreze, adolfoPinheiro);
        mapa.adicionarConexao(adolfoPinheiro, altoDaBoaVista);
        mapa.adicionarConexao(altoDaBoaVista, borbaGato);
        mapa.adicionarConexao(borbaGato, brooklin);
        mapa.adicionarConexao(brooklin, campoBelo);
        mapa.adicionarConexao(campoBelo, eucaliptos);
        mapa.adicionarConexao(eucaliptos, moema);
        mapa.adicionarConexao(moema, aacdServidor);
        mapa.adicionarConexao(aacdServidor, hospitalSaoPaulo);
        mapa.adicionarConexao(hospitalSaoPaulo, santaCruz);
        mapa.adicionarConexao(santaCruz, chacaraKlabin);


        // =======================================================
        //imprimindo o mapa do metrô de SP
        // =======================================================
        System.out.println("--- MAPA DO METRÔ DE SP ---");
        System.out.println("LINHAS AMARELA, ESMERALDA E LILÁS");
        mapa.imprimirMapa();

        javax.swing.SwingUtilities.invokeLater(() -> {
            TelaMetro tela = new TelaMetro(mapa);
            tela.setVisible(true);
        });
    }
} 
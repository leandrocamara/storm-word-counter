package com.leandro.camara;

import com.leandro.camara.bolt.WordCounterBolt;
import com.leandro.camara.spout.WordReaderSpout;
import org.apache.storm.Config;
import org.apache.storm.LocalCluster;
import org.apache.storm.topology.TopologyBuilder;

/**
 * Classe responsável pela inicialização do Topologia 'Word Counter'.
 *
 * @author Leandro Câmara
 */
public class WordCounterTopology {

    /**
     * Método responsável pela execução da Topologia 'Yahoo Finance'.
     *
     * @param args Parâmetros
     */
    public static void main(String[] args) throws Exception {
        LocalCluster cluster = new LocalCluster();
        try {
            TopologyBuilder builder = getTopologyBuilder();
            cluster.submitTopology("wordCounterTopology", getConfig(), builder.createTopology());
            Thread.sleep(50000);
        } catch (Exception e) {
            cluster.shutdown();
        }
    }

    /**
     * Retorna o Topologia com o mapeamento dos 'Spouts' e 'Bolts'.
     *
     * @return
     */
    private static TopologyBuilder getTopologyBuilder() {
        TopologyBuilder builder = new TopologyBuilder();
        builder.setSpout("wordReaderSpout", new WordReaderSpout());
        builder.setBolt("wordCounterBolt", new WordCounterBolt()).shuffleGrouping("wordReaderSpout");

        return builder;
    }

    /**
     * Retorna as configurações a serem utilizadas na topologia.
     *
     * @return
     */
    private static Config getConfig() {
        Config config = new Config();
        config.setDebug(true);
        config.put("readFile", "/home/leandro/Documents/sample.txt");
        config.put("resultDirectory", "/home/leandro/Documents/output/");

        return config;
    }
}

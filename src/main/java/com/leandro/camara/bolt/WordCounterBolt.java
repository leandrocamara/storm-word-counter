package com.leandro.camara.bolt;

import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.BasicOutputCollector;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseBasicBolt;
import org.apache.storm.tuple.Tuple;

import java.util.Map;

/**
 * Classe de representação ao Bolt do 'Word Counter'.
 */
public class WordCounterBolt extends BaseBasicBolt {

    /**
     * Caso necessário, prepara informações relevantes e compartilhadas entre os 'Bolts'.
     *
     * @param topoConf
     * @param context
     */
    @Override
    public void prepare(Map<String, Object> topoConf, TopologyContext context) {}

    /**
     * Método responsável pela execução do 'Bolt'.
     *
     * @param tuple
     * @param basicOutputCollector
     */
    public void execute(Tuple tuple, BasicOutputCollector basicOutputCollector) {

    }

    /**
     * Define os campos das tuplas (resultantes).
     *
     * @param outputFieldsDeclarer
     */
    public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {

    }
}

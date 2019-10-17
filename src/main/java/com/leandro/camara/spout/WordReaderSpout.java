package com.leandro.camara.spout;

import org.apache.storm.spout.SpoutOutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichSpout;

import java.util.Map;

/**
 * Classe de representação ao Spout do 'Word Reader'.
 */
public class WordReaderSpout extends BaseRichSpout {

    /**
     * @param map
     * @param topologyContext
     * @param spoutOutputCollector
     */
    public void open(Map<String, Object> map, TopologyContext topologyContext, SpoutOutputCollector spoutOutputCollector) {

    }

    /**
     * Método responsável pela obtenção dos dados, a serem transmitidos por meio de tuplas.
     */
    public void nextTuple() {

    }

    /**
     * Define os campos das tuplas (resultantes).
     *
     * @param outputFieldsDeclarer
     */
    public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {

    }
}

package com.example.producer.client.kafka.producer

import java.util.Properties

import org.apache.commons.lang3.RandomStringUtils
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerConfig, ProducerRecord, RecordMetadata}

object IncrementalKeyProducer extends App {
  val properties: Properties = new Properties()
  properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092")
  properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.IntegerSerializer")
  properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer")

  val producer: KafkaProducer[Int, String] = new KafkaProducer[Int, String](properties)

  for (i <- Range(1, 100)) {
    val value: String = RandomStringUtils.randomAlphabetic(5)
    val record: ProducerRecord[Int, String] = new ProducerRecord("s1", i, value)

    val metadata: RecordMetadata = producer.send(record).get()
    println("partition: " + metadata.partition() +
      ", topic: " + metadata.topic() +
      ", offset: " + metadata.offset() +
      ", key: " + i +
      ", value: " + value)
  }
}

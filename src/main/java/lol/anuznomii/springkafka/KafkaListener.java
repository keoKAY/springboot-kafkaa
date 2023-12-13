package lol.anuznomii.springkafka;


import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = "topic1", groupId = "group_id")
    void listener(String data){
        System.out.println("Listener Received:"+data + " =><= ");
    }
}

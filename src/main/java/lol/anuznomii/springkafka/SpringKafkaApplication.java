package lol.anuznomii.springkafka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringKafkaApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner (KafkaTemplate<String, String> kafkaTemplate){
        return args -> {
            for(int i =0; i < 10; i++){
                kafkaTemplate.send("topic1", "Hello World :) "+i);
            }

        };
    }

}

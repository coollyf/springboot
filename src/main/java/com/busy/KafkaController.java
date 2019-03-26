package com.busy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.kafka.core.KafkaTemplate;
/**
 * Created by acer on 2018/6/11.
 */
@RestController
@RequestMapping("kafka")
public class KafkaController {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping("send")
    public String send(String msg){
        kafkaTemplate.send("yun", msg);
        return "success";
    }

}

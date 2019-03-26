package com.busy;

import com.sun.org.apache.regexp.internal.RE;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by acer on 2018/5/30.
 */
@RestController
@RequestMapping("/busy/")
public class Controller {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);
    @Value("${name}")
    private String name;
    @Value("${age}")
    private int age;
    @RequestMapping(value = "say",method = RequestMethod.GET)
    public String say(){
        logger.info("sakdjhkajhsdkjhaslkdjhlakjshdlka============");
        return "hello world2211 "+name+age;

    }
}

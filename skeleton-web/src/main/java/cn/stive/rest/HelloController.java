package cn.stive.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

import cn.stive.domain.Leads;
import cn.stive.service.HelloService;

/**
 * @author lixiaotian
 */
@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/hello")
    @ResponseBody
    public String test()
    {
        ValueOperations<String, Leads> valueOperations = redisTemplate.opsForValue();


        return "hello, world! This com from spring!";
    }


}

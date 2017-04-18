package cn.stive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author lixiaotian
 */
@Service
public class HelloService {
    public String test(){
        return "hello world!";
    }
}

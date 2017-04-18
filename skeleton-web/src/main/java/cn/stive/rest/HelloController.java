package cn.stive.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

import cn.stive.domain.TestBean;
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
        ValueOperations<String, TestBean> valueOperations = redisTemplate.opsForValue();
        TestBean testBean = new TestBean();
        testBean.setTest1("asefafeaefe");
        testBean.setTest2(204393L);
        testBean.setTest3("ajflkfsjklef");
        testBean.setTest4("aawefwefw");
        testBean.setTest5(2949393);
        testBean.setTest6((short) 29);
        testBean.setTest7(true);
        testBean.setTest8("afjweofjweflk");
        testBean.setTest9(new Date());
        testBean.setTest10(new Date());

        for(int i = 1 ; i < 10000; i++){
            System.out.print("put redis success !");
            valueOperations.set("test:"+i, testBean);
        }

        return "success";

    }


}

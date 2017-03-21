package cn.weeego.mapper;

import cn.weeego.test.Example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by liuf on 2017/3/21.
 */
@IntegrationTest
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Example.class)
public class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;
    @Resource
    private UserRepository userRepository;

    @Test
    public void findUsername() throws Exception {
        String username = studentMapper.findUsername(1);
        System.out.println(username);
    }

    @Test
    public void findUsernames() {
        List<Map<String, Object>> names = userRepository.findAll();
        System.out.println(names);
    }

}
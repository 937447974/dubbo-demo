import com.dubbo.ConsumerApplication;
import com.dubbo.LoginService;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @title:
 * @time: 2021/12/11 2:50 下午
 * @author: 阳君
 * @version: 1.0
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ConsumerApplication.class)
public class ServiceTest {

    @DubboReference
    LoginService loginService;

    @Test
    public void test() {
        val data = loginService.login("admin", "password");
        log.info("test {}", data);
    }

}

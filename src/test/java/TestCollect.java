import com.edwin.library.util.config.ConfigUtil;
import com.edwin.library.util.lambda.LambdaUtil;
import domain.App;
import org.junit.Test;

/**
 * @author zyc
 * @date 2021/11/30 10:53
 */
public class TestCollect {

    @Test
    public void test () {
        System.out.println(ConfigUtil.getAsString("web.project.test"));
        System.out.println(LambdaUtil.getFieldName(App::getAppId));
    }
}
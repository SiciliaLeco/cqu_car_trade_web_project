import org.cqu.AllMapperApplication;
import org.cqu.mapper.BuyerMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest(classes = {AllMapperApplication.class})
@RunWith(SpringRunner.class)
public class MapperTest {
    @Autowired
    private BuyerMapper buyerMapper;

    @Test
    public void test(){
        System.out.println(buyerMapper.selectByPrimaryKey("13500000000"));
        System.out.println(100);
    }
}

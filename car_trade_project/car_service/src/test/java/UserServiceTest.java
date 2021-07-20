//import org.apache.dubbo.config.annotation.Reference;
//import org.cqu.car.CarApplication;
//import org.cqu.car.mapper.CarMapper;
//import org.cqu.car.service.CarService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@SpringBootTest(classes = {CarApplication.class})
//@RunWith(SpringRunner.class)
//public class UserServiceTest {
//    //自动注入一个业务接口对
//    @Autowired
//    private CarMapper carMapper;
//
//    @Reference
//    private CarService carService;
//
//    @Test
//    public void test(){
//        System.out.println(carMapper.selectByPrimaryKey(352).getCname());
//        System.out.println(carService.getCarName(352));
//        System.out.println(100);
//    }
//
//}

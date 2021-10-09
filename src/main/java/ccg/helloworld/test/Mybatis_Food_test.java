package ccg.helloworld.test;

import ccg.helloworld.dao.FoodDao;
import ccg.helloworld.domain.Food;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;


public class Mybatis_Food_test {

    private InputStream is;
    private SqlSession sqlSession;
    private FoodDao dao;

    /**
     * 方法创建前执行该方法
     * @throws Exception
     */
    @Before
    public void init() throws Exception{
        //1.加载配置
        is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.获取factory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3.获取sqlsession
        sqlSession = sqlSessionFactory.openSession();
        //4.获取代理对象
        dao = sqlSession.getMapper(FoodDao.class);
    }

    /**
     * 方法结束后执行该方法
     * @throws Exception
     */
    @After
    public void destroy() throws Exception{
        sqlSession.commit();
        is.close();
        sqlSession.close();
    }

    /**
     * 测试findall方法
     */
    @Test
    public void test_FoodFindAll(){

        List<Food> all = dao.findAll();
        for (Food food : all) {
            System.out.println(food);
        }
    }

    /**
     * 测试savefood方法
     */
    @Test
    public void test_FoodSaveFood(){
        Food food = new Food();
        food.setFood_name("饭3");
        food.setFood_details("饭3的详情");
        food.setFood_address("饭3的地址");
        food.setSmall_imgs("small_imgs/");
        food.setBig_imgs("big_imgs/");
        food.setMaking_method("饭3的制作方法");
        food.setFood_material("饭3的材料");
        food.setCid(3);
        food.setTime(50);
        food.setEnergy(200);
        food.setSalt(3.5);
        dao.saveFoot(food);
    }



}

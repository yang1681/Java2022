import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        //1.加载类路径下的配置文件
//       ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.文件系统下加载配置文件
        ApplicationContext ctx1=new FileSystemXmlApplicationContext("F:\\IntelliJ IDEA 2022.2.3\\IdeaProjects\\Spring\\spring_09_datasource\\src\\main\\resources\\applicationContext.xml");
//        DataSource dataSource=(DataSource) ctx.getBean("dataSource");
//        System.out.println(dataSource);


//        BookDao bookDao=(BookDao)ctx1.getBean("bookDao");
        BookDao bookDao= ctx1.getBean(BookDao.class);
        bookDao.save();

    }

}

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppForBeanFactory {
    public static void main(String[] args) {
        Resource resources= new ClassPathResource("applicationContext.xml");

        XmlBeanFactory bf= new XmlBeanFactory(resources);
//        BookDao bookDao=bf.getBean()
//        bookDao.save();
    }
}

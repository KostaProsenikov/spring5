import com.java.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
//        load the spring config file
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        retrieve a bean from spring container
        Coach theCoach = ctx.getBean("myCoach", Coach.class);
        Coach trackCoach = ctx.getBean("trackCoach", Coach.class);
//        call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyFortune());
//        close the context
        ctx.close();
    }
}

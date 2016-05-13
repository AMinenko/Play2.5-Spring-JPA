import com.anmi.config.CommonConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.guice.module.SpringModule;


public class Module extends SpringModule {

    private GenericApplicationContext ctx;

    public Module() {
        super(new AnnotationConfigApplicationContext(CommonConfig.class));
    }

    protected Class[] getConfigs() {
        return new Class[] {CommonConfig.class};
    }



}

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by housh on 2017/2/24.
 */
public class text implements FactoryBean<Object> {
    public Object getObject() throws Exception {
        return null;

    }

    public Class<?> getObjectType() {
        return null;
    }

    public boolean isSingleton() {
        return false;
    }
}

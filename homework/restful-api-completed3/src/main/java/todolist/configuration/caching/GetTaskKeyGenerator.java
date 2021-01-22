package todolist.configuration.caching;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class GetTaskKeyGenerator implements KeyGenerator {

    @Override
    public Object generate(Object target, Method method, Object... params) {
        // getTask_{taskId}
        return method.getName() + "_" + params[0];
    }

}

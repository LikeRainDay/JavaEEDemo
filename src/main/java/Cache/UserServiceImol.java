package Cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by housh on 2017/2/26.
 */
@Service("userService")
@Cacheable(value = "users")  //value 指定的对应的缓存区
public class UserServiceImol {


}

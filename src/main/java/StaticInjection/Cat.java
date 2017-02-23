package StaticInjection;

/**
 * Created by housh on 2017/2/23.
 */
public class Cat implements Being {
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void testBeing() {
        System.out.println(msg + ",猫喜欢吃老鼠");
    }
}

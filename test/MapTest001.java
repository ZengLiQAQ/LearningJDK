import java.util.HashMap;
import java.util.Map;

/**
 * @创建人: zengli
 * @描述
 */
public class MapTest001 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        for(int i = 0; i < 10; i++){
            map.put(i,i);
        }
    }
}

package yangguohao.java;

import java.util.HashMap;

/**
 * @author Mr.Yang
 * @date 2020/02/24
 **/
public class DebugTest {
    public static void main(String[] args) {
        for (int i = 0; i < 60; i++) {
            System.out.println("i = " + i);
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("name","tom");
        map.put("age","12");
        map.put("school","Tsinghua");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("school");
        System.out.println(map);
    }
}

package net.cc.helloworld.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhonghua.zhi
 * Created by 2018/2/24 - 下午12:26
 * ************************************
 * Project Name first
 * Package Name net.cc.helloworld.Date
 */
public class DemoDate {

    private static final String DEFAULT_SYS_PATTERN = "yyyy-MM-dd HH:mm:ss E";

    public static void getSystemDate() {

        SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_SYS_PATTERN);
        System.out.println(sdf.format(new Date()).toString());
    }
}
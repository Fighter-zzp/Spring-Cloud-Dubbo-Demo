package com.zzp.spring.cloud.dubbo.business.controller.fallback;

import com.zzp.spring.cloud.dubbo.provider.domain.TabAdmin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdminControllerFallback {
    private static final Logger logger = LoggerFactory.getLogger(AdminControllerFallback.class);

    public static TabAdmin adminFallback(){
        var tabAdmin = new TabAdmin();
        tabAdmin.setName("用户不存在");
        tabAdmin.setSex("无法识别");
        tabAdmin.setAge(0);
        return tabAdmin;
    }
}

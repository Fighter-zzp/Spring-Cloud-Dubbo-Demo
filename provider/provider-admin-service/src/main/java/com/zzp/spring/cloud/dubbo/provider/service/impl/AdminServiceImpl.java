package com.zzp.spring.cloud.dubbo.provider.service.impl;

import com.zzp.spring.cloud.dubbo.provider.api.AdminService;
import com.zzp.spring.cloud.dubbo.provider.domain.TabAdmin;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class AdminServiceImpl implements AdminService {
    @Override
    public TabAdmin adminInfo() {
        var tabAdmin = new TabAdmin();
        tabAdmin.setName("zzp");
        tabAdmin.setSex("male");
        tabAdmin.setAge(18);
        return tabAdmin;
    }
}

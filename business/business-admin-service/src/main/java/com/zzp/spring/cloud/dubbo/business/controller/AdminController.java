package com.zzp.spring.cloud.dubbo.business.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.zzp.spring.cloud.dubbo.business.controller.fallback.AdminControllerFallback;
import com.zzp.spring.cloud.dubbo.provider.api.AdminService;
import com.zzp.spring.cloud.dubbo.provider.domain.TabAdmin;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Reference(version = "1.0.0")
    private AdminService adminService;

    @GetMapping("/admin")
    @SentinelResource(value = "admin", fallback = "adminFallback", fallbackClass = AdminControllerFallback.class)
    public TabAdmin admin(){
        return adminService.adminInfo();
    }
}

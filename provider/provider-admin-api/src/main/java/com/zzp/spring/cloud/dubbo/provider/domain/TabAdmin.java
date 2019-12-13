package com.zzp.spring.cloud.dubbo.provider.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class TabAdmin implements Serializable {
    private static final long serialVersionUID = -2825145798436535926L;
    private String name;
    private String sex;
    private Integer age;
}

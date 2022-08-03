package com.futao.base.api.dto;

import lombok.*;

import java.io.Serializable;

/**
 * @author futao
 * @since 2022/8/3
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserAddress implements Serializable {
    private Integer id;
    private String userId;
    private Boolean isDefault;
    private String username;
    private String phone;
    private String address;
}

package com.futao.base.api.dto;

import com.futao.base.api.service.ValidService;
import lombok.*;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

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
    /**
     * 只有在Update的时候才校验
     */
    @NotNull(message = "id不可为空", groups = ValidService.Update.class)
    private Integer id;
    private String userId;
    private Boolean isDefault;
    private String username;
    private String phone;
    private String address;
    @NotEmpty(message = "爱好不可为空")
    private List<String> hobbyList;
    @NotNull
    @Max(value = 200, message = "最大200岁")
    private Integer age;
}

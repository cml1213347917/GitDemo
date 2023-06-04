package com.cml.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data@AllArgsConstructor@NoArgsConstructor
@ApiModel("用户实体类")
public class User implements Serializable {
    @ApiModelProperty("用户id")
    private  Integer uid;
    @ApiModelProperty("用户名")
    private  String username;
    @ApiModelProperty("用户密码")
    private  String password;
}

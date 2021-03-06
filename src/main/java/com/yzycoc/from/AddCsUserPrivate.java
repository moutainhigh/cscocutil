package com.yzycoc.from;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program: cscocutil
 * @description: 新增用户信息
 * @author: yzy
 * @create: 2020-12-16 19:41
 * @Version 1.0
 **/
@Data
@ApiModel(value="新增机器人用户信息", description="新增机器人用户信息")
public class AddCsUserPrivate {

    @ApiModelProperty(value ="robot号码")
    private String robotNumber;
    @ApiModelProperty(value = "操作用户号码")
    private String userNumber;
    @ApiModelProperty(value = "好友添加验证")
    private String msg;

}

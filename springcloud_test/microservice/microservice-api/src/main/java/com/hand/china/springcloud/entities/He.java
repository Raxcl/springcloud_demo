package com.hand.china.springcloud.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain=true)
public class He implements Serializable //必须序列化
{
    private String  first_name;   //名
    private String  Last_name;   //姓
    private String  email;   //电子邮件
    private String  sex;   //性别
    private String  phone_num;   //电话号码
    private String  department_code;   //部门编号
    private String  department_name;   //部门名称
    private String  province;   //省
    private String  city;   //市
    private String  address;   //详细地址
    private String  job_name;   //工作名字







}

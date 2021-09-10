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
public class Emp implements Serializable //必须序列化
{
    private Long  employee_id;   //主键
    private String  employee_num;   //人员编号
    private String  first_name;   //名
    private String  Last_name;   //姓
    private String  sex;   //性别
    private String  phone_num;   //电话号码
    private String  email;   //电子邮件
    private Date hire_date;   //入职日期
    private Long  department_id;   //部门ID(hand_departments.department_id)
    private String  status_code;   //员工状态



    public Emp(String Last_name)
    {
        super();
        this.Last_name = Last_name;
    }


}

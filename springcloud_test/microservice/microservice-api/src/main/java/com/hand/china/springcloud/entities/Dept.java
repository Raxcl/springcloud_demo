package com.hand.china.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@SuppressWarnings("serial")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable //必须序列化
{
    private Long  department_id;   //主键
    private String  department_code;   //部门编号
    private String  department_name;   //部门名称
    private Long  manager_id;   //部门主管id(hand_employee.employee_id)
    private Long  location_id;   //部门地址id

    public Dept(String department_name)
    {
        super();
        this.department_name = department_name;
    }
}
package com.hand.china.springcloud.service;

import com.hand.china.springcloud.entities.Emp;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component//不要忘记添加
public class EmpClientServiceFallbackFactory implements FallbackFactory<EmpClientService>
{
    @Override
    public EmpClientService create(Throwable throwable)
    {
        return new EmpClientService() {
            @Override
            public Emp get(long id)
            {
                return new Emp().setEmployee_id(id)
                        .setLast_name("该ID："+id+"没有没有对应的信息，Consumer客户端提供的降级信息，此刻服务Provider已经关闭");
            }

            @Override
            public List<Emp> list()
            {
                return null;
            }

            @Override
            public boolean add(Emp emp)
            {
                return false;
            }
        };
    }
}


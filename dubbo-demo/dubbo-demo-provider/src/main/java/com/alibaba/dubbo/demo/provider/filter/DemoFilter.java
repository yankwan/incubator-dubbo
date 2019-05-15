package com.alibaba.dubbo.demo.provider.filter;

import com.alibaba.dubbo.demo.provider.DemoDao;
import com.alibaba.dubbo.rpc.*;

public class DemoFilter implements Filter {

    private DemoDao demoDao;

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        return invoker.invoke(invocation);
    }

    public DemoFilter setDemoDao(DemoDao demoDao) {
        this.demoDao = demoDao;
        return this;
    }


}

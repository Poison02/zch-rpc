package cdu.zch.core.proxy.jdk;

import cdu.zch.core.client.RpcReferenceWrapper;
import cdu.zch.core.proxy.ProxyFactory;

import java.lang.reflect.Proxy;

/**
 * @author Zch
 * @date 2023/7/9
 **/
public class JDKProxyFactory implements ProxyFactory {
    @Override
    public <T> T getProxy(RpcReferenceWrapper rpcReferenceWrapper) {
        return (T) Proxy.newProxyInstance(rpcReferenceWrapper.getAimClass().getClassLoader(), new Class[]{rpcReferenceWrapper.getAimClass()},
                new JDKClientInvocationHandler(rpcReferenceWrapper));
    }
}

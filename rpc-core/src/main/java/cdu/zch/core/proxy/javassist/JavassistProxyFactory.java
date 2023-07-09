package cdu.zch.core.proxy.javassist;


import cdu.zch.core.client.RpcReferenceWrapper;
import cdu.zch.core.proxy.ProxyFactory;

public class JavassistProxyFactory implements ProxyFactory {

    public JavassistProxyFactory() {
    }

    @Override
    public <T> T getProxy(RpcReferenceWrapper rpcReferenceWrapper) throws Throwable {
        return (T) ProxyGenerator.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                rpcReferenceWrapper.getAimClass(), new JavassistInvocationHandler(rpcReferenceWrapper));
    }
}

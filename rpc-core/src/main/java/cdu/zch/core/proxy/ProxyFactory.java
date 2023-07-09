package cdu.zch.core.proxy;

import cdu.zch.core.client.RpcReferenceWrapper;

/**
 * @author Zch
 * @date 2023/7/9
 **/
public interface ProxyFactory {

    <T> T getProxy(RpcReferenceWrapper rpcReferenceWrapper) throws Throwable;

}

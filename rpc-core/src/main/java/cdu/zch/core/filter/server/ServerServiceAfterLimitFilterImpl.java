package cdu.zch.core.filter.server;

import cdu.zch.core.annotations.SPI;
import cdu.zch.core.common.RpcInvocation;
import cdu.zch.core.common.ServerServiceSemaphoreWrapper;
import cdu.zch.core.filter.IServerFilter;

import static cdu.zch.core.cache.CommonServerCache.SERVER_SERVICE_SEMAPHORE_MAP;

@SPI("after")
public class ServerServiceAfterLimitFilterImpl implements IServerFilter {

    @Override
    public void doFilter(RpcInvocation rpcInvocation) {
        String serviceName = rpcInvocation.getTargetServiceName();
        ServerServiceSemaphoreWrapper serverServiceSemaphoreWrapper = SERVER_SERVICE_SEMAPHORE_MAP.get(serviceName);
        serverServiceSemaphoreWrapper.getSemaphore().release();
    }
}

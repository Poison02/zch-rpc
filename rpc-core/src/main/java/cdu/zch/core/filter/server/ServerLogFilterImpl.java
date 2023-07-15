package cdu.zch.core.filter.server;

import cdu.zch.core.annotations.SPI;
import cdu.zch.core.common.RpcInvocation;
import cdu.zch.core.filter.IServerFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SPI("before")
public class ServerLogFilterImpl implements IServerFilter {

    private static Logger logger = LoggerFactory.getLogger(ServerLogFilterImpl.class);

    @Override
    public void doFilter(RpcInvocation rpcInvocation) {
        logger.info(rpcInvocation.getAttachments().get("c_app_name") + " do invoke -----> " + rpcInvocation.getTargetServiceName() + "#" + rpcInvocation.getTargetMethod());
    }
}

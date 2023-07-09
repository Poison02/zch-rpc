package cdu.zch.core.filter;

import cdu.zch.core.common.RpcInvocation;

public interface IServerFilter extends IFilter {

    void doFilter(RpcInvocation rpcInvocation);
}

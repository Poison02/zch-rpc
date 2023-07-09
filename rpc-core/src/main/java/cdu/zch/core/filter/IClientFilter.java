package cdu.zch.core.filter;

import cdu.zch.core.common.ChannelFutureWrapper;
import cdu.zch.core.common.RpcInvocation;

import java.util.List;

public interface IClientFilter extends IFilter {

    void doFilter(List<ChannelFutureWrapper> src, RpcInvocation rpcInvocation);
}

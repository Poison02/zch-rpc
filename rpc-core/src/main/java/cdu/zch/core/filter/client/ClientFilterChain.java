package cdu.zch.core.filter.client;

import cdu.zch.core.common.ChannelFutureWrapper;
import cdu.zch.core.common.RpcInvocation;
import cdu.zch.core.filter.IClientFilter;

import java.util.ArrayList;
import java.util.List;

public class ClientFilterChain {

    private static List<IClientFilter> iClientFilterList = new ArrayList<>();

    public void addClientFilter(IClientFilter iClientFilter) {
        iClientFilterList.add(iClientFilter);
    }

    public void doFilter(List<ChannelFutureWrapper> src, RpcInvocation rpcInvocation) {
        for (IClientFilter iClientFilter : iClientFilterList) {
            iClientFilter.doFilter(src, rpcInvocation);
        }
    }
}

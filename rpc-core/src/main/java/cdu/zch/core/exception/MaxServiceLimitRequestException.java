package cdu.zch.core.exception;

import cdu.zch.core.common.RpcInvocation;

public class MaxServiceLimitRequestException extends IRpcException {

    public MaxServiceLimitRequestException(RpcInvocation rpcInvocation) {
        super(rpcInvocation);
    }
}

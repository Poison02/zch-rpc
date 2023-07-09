package cdu.zch.core.exception;

import cdu.zch.core.common.RpcInvocation;

public class IRpcException extends RuntimeException {

    private RpcInvocation rpcInvocation;

    public IRpcException(RpcInvocation rpcInvocation) {
        this.rpcInvocation = rpcInvocation;
    }

    public RpcInvocation getRpcInvocation() {
        return rpcInvocation;
    }

    public void setRpcInvocation(RpcInvocation rpcInvocation) {
        this.rpcInvocation = rpcInvocation;
    }
}

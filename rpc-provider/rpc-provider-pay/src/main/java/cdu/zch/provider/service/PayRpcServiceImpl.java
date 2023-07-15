package cdu.zch.provider.service;

import cdu.zch.interfaces.pay.PayRpcService;
import cdu.zch.spring.common.IRpcService;

import java.util.List;

@IRpcService
public class PayRpcServiceImpl implements PayRpcService {
    @Override
    public boolean doPay() {
        return false;
    }

    @Override
    public List<String> getPayHistoryByGoodNo(String goodNo) {
        return null;
    }
}

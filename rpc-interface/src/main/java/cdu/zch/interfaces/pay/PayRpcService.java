package cdu.zch.interfaces.pay;

import java.util.List;

public interface PayRpcService {

    boolean doPay();

    List<String> getPayHistoryByGoodNo(String goodNo);
}

package cdu.zch.core.router;

import cdu.zch.core.common.ChannelFutureWrapper;
import cdu.zch.core.registry.URL;

public interface IRouter {

    /**
     * 刷新路由数组
     * @param selector
     */
    void refreshRouteArr(Selector selector);

    /**
     * 获取请求到连接通道
     * @param selector
     * @return
     */
    ChannelFutureWrapper select(Selector selector);

    /**
     * 更新权重信息
     * @param url
     */
    void updateWeight(URL url);
}

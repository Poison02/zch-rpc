package cdu.zch.core.router;

import cdu.zch.core.common.ChannelFutureWrapper;
import cdu.zch.core.registry.URL;

public interface IRouter {

    void refreshRouteArr(Selector selector);

    ChannelFutureWrapper select(Selector selector);

    void updateWeight(URL url);
}

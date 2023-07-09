package cdu.zch.core.event;

import cdu.zch.core.registry.URL;

import static cdu.zch.core.cache.CommonServerCache.PROVIDER_URL_SET;
import static cdu.zch.core.cache.CommonServerCache.REGISTRY_SERVICE;

public class ServiceDestroyListener implements IRpcListener<IRpcDestroyEvent> {

    @Override
    public void callBack(Object t) {
        for (URL url : PROVIDER_URL_SET) {
            REGISTRY_SERVICE.unRegister(url);
        }
    }
}

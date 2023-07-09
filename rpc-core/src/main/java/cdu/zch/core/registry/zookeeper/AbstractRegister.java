package cdu.zch.core.registry.zookeeper;

import cdu.zch.core.registry.RegistryService;
import cdu.zch.core.registry.URL;

import java.util.List;
import java.util.Map;

import static cdu.zch.core.cache.CommonClientCache.SUBSCRIBE_SERVICE_LIST;
import static cdu.zch.core.cache.CommonServerCache.PROVIDER_URL_SET;

public abstract class AbstractRegister implements RegistryService {

    @Override
    public void register(URL url) {
        PROVIDER_URL_SET.add(url);
    }

    @Override
    public void unRegister(URL url) {
        PROVIDER_URL_SET.remove(url);
    }

    @Override
    public void subscribe(URL url) {
        SUBSCRIBE_SERVICE_LIST.add(url);
    }

    @Override
    public void unSubscribe(URL url) {
        SUBSCRIBE_SERVICE_LIST.remove(url.getServiceName());
    }

    /**
     * 扩展方法
     */
    public abstract void doAfterSubscribe(URL url);

    public abstract void doBeforeSubscribe(URL url);

    public abstract List<String> getProviderIps(String serviceName);

    public abstract Map<String, String> getServiceWeightMap(String serviceName);
}

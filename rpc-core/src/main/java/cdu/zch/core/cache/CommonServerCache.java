package cdu.zch.core.cache;

import cdu.zch.core.common.ServerServiceSemaphoreWrapper;
import cdu.zch.core.config.ServerConfig;
import cdu.zch.core.dispatcher.ServerChannelDispatcher;
import cdu.zch.core.filter.server.ServerAfterFilterChain;
import cdu.zch.core.filter.server.ServerBeforeFilterChain;
import cdu.zch.core.registry.URL;
import cdu.zch.core.registry.zookeeper.AbstractRegister;
import cdu.zch.core.serialize.SerializeFactory;
import cdu.zch.core.server.ServiceWrapper;
import io.netty.util.internal.ConcurrentSet;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class CommonServerCache {

    public static final Map<String,Object> PROVIDER_CLASS_MAP = new ConcurrentHashMap<>();
    public static final Set<URL> PROVIDER_URL_SET = new ConcurrentSet<>();
    public static AbstractRegister REGISTRY_SERVICE;
    public static SerializeFactory SERVER_SERIALIZE_FACTORY;
    public static ServerConfig SERVER_CONFIG;
    public static ServerBeforeFilterChain SERVER_BEFORE_FILTER_CHAIN;
    public static ServerAfterFilterChain SERVER_AFTER_FILTER_CHAIN;
    public static final Map<String, ServiceWrapper> PROVIDER_SERVICE_WRAPPER_MAP = new ConcurrentHashMap<>();
    public static Boolean IS_STARTED = false;
    public static ServerChannelDispatcher SERVER_CHANNEL_DISPATCHER = new ServerChannelDispatcher();
    public static final Map<String, ServerServiceSemaphoreWrapper> SERVER_SERVICE_SEMAPHORE_MAP = new ConcurrentHashMap<>(64);
}

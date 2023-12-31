package cdu.zch.core.cache;


import cdu.zch.core.common.ChannelFuturePollingRef;
import cdu.zch.core.common.ChannelFutureWrapper;
import cdu.zch.core.common.RpcInvocation;
import cdu.zch.core.config.ClientConfig;
import cdu.zch.core.filter.client.ClientFilterChain;
import cdu.zch.core.registry.URL;
import cdu.zch.core.registry.zookeeper.AbstractRegister;
import cdu.zch.core.router.IRouter;
import cdu.zch.core.serialize.SerializeFactory;
import cdu.zch.core.spi.ExtensionLoader;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

public class CommonClientCache {

    public static BlockingQueue<RpcInvocation> SEND_QUEUE = new ArrayBlockingQueue(100);
    public static Map<String,Object> RESP_MAP = new ConcurrentHashMap<>();
    // 客户端订阅的服务
    public static List<URL> SUBSCRIBE_SERVICE_LIST = new ArrayList<>();
    public static Map<String, Map<String,String>> URL_MAP = new ConcurrentHashMap<>();
    public static Set<String> SERVER_ADDRESS = new HashSet<>();
    // 远程调用map -> key:需要调用的serviceName value:与多个服务提供者建立的连接
    // 当客户端需要调用指定serviceName时，可以根据不同策略从多个服务提供者中选择一个
    public static Map<String, List<ChannelFutureWrapper>> CONNECT_MAP = new ConcurrentHashMap<>();
    // 随机请求的map
    public static Map<String, ChannelFutureWrapper[]> SERVICE_ROUTER_MAP = new ConcurrentHashMap<>();
    public static ChannelFuturePollingRef CHANNEL_FUTURE_POLLING_REF = new ChannelFuturePollingRef();
    public static IRouter IROUTER;
    public static SerializeFactory CLIENT_SERIALIZE_FACTORY;
    public static ClientConfig CLIENT_CONFIG;
    public static ClientFilterChain CLIENT_FILTER_CHAIN;
    public static AbstractRegister ABSTRACT_REGISTER;
    public static ExtensionLoader EXTENSION_LOADER = new ExtensionLoader();
}

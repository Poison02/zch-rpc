package cdu.zch.interfaces.common;

import java.util.List;

/**
 * @author Zch
 * @date 2023/7/9
 **/
public interface DataService {

    /**
     * 发送数据
     *
     * @param body
     */
    String sendData(String body);

    /**
     * 获取数据
     *
     * @return
     */
    List<String> getList();

    /**
     * 异常测试方法
     */
    String testErrorV2();

}

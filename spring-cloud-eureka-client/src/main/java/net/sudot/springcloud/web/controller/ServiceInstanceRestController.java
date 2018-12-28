package net.sudot.springcloud.web.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 服务实例控制器
 *
 * @author tangjialin on 2018-12-28.
 */
@RestController
public class ServiceInstanceRestController {

    @Resource
    private DiscoveryClient discoveryClient;

    /**
     * 获取服务实例
     *
     * @param applicationName 服务名称
     * @return 返回服务实例信息
     */
    @RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        return this.discoveryClient.getInstances(applicationName);
    }
}
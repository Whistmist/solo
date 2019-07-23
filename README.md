# solo
SpringBoot、Dubbo、Zookeeper整合：
    pom文件spring版本号为 ：1.5.21.RELEASE (天坑)具体原因还未找到
    Provider : 1、导入依赖  2、在配置application.properties配置扫描包和dubbo的注册中心地址
               3、发布服务 : @service(com.alibaba.dubbo.config.annotation.Service)发布服务
    Consumer : 1、导入依赖  2、在配置application.properties配置dubbo的注册中心地址
               3、引用服务 @Reference(com.alibaba.dubbo.config.annotation.Reference)
SpringCloud-Eureka注册中心：1、配置Eureka注册中心并在启动时加入注解@EnableEurekaServer
                           2、创建provider 
                           3、创建consumer并在启动时加入注解@EnableDiscoveryClient 
                                @LoadBalanced
                                public RestTemplate restTemplate(){
                                     return new RestTemplate();}

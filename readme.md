- demo: https://github.com/apache/dubbo-samples
- 基础版：https://github.com/apache/dubbo-samples/tree/master/dubbo-samples-basic
- springboot版本：https://github.com/apache/dubbo-samples/tree/master/dubbo-samples-spring-boot
- dubbo文档：https://dubbo.apache.org/zh/docs3-v2/java-sdk/advanced-features-and-usage/

### features

- 本地存根：在调用生产者之前之后进行一些参数，类似于aop的around
- 本地伪装：当调用失败的时候，改写返回值，类似于aop的afterthrowing
- 分组：隔离不同的环境
- 参数校验 JSR303
- 集群容错
    - 故障转移
    - 快速失败
- 泛化调用：
    - 生产者不需要改动
    - 消费者可以不依赖api jar包，但是还是需要知道service的全路径，方法名，参数类型等
- 隐式传参
    - 可以在具体service中通过RpcContext设置attachment
    - 也可以通过SPI、Filter的方式
    - 可以使用这种方式来传递当前登录的用户信息
        - 搭配mybatis-plus自动填充效果更佳
- 直连提供者：
    - 绕过注册中心
- 调用触发事件通知
    - 消费者可以在调用前、调用后、异常时，通过onInvoke, onReturn, onThrow注册事件通知
    - 类似于AOP
- 多注册中心

package event.base;

/**
 * @author Chen Yixing
 * @date 2021/4/13 13:39
 */
public interface ApplicationEventPublisher {

    /**
     * 事件分发
     *
     * @author Chen Yixing
     * @date 2021-04-13 15:50:07
     * @param event 事件
     **/
    void publishEvent(Object event);

    /**
     * 注册监听器
     *
     * @author Chen Yixing
     * @date 2021-04-13 15:50:20
     * @param applicationListener   监听器
     **/
    void registerListener(ApplicationListener applicationListener);
}

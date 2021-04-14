package event.base;

import java.util.EventListener;

/**
 * 事件监听器（观察者）
 *
 * @author Chen Yixing
 * @date 2021-04-13 15:46:44
 **/
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    /**
     * 处理事件
     *
     * @author Chen Yixing
     * @date 2021-04-13 15:46:13
     * @param event 事件
     **/
    void onApplicationEvent(E event);
}
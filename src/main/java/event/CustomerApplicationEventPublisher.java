package event;

import event.base.ApplicationEvent;
import event.base.ApplicationEventPublisher;
import event.base.ApplicationListener;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

/**
 * @author Chen Yixing
 * @date 2021/4/13 13:40
 */
public class CustomerApplicationEventPublisher implements ApplicationEventPublisher {
    Map<Class, List<ApplicationListener>> eventListenerMap = new HashMap<Class, List<ApplicationListener>>();

    @Override
    public void registerListener(ApplicationListener applicationListener) {
        // 获取监听器上的泛型类型，并依次组装进 eventListenerMap 中去
        Type[] applicationTypes = applicationListener.getClass().getGenericInterfaces();
        for(Type applicationType : applicationTypes) {
            Type[] eventTypes = ((ParameterizedType) applicationType).getActualTypeArguments();
            for(Type eventType : eventTypes) {
                Class eventClass = (Class) eventType;
                List<ApplicationListener> applicationListenerList = eventListenerMap.computeIfAbsent(eventClass, arg -> new ArrayList<>());
                applicationListenerList.add(applicationListener);
            }
        }
    }

    @Override
    public void publishEvent(Object event) {
        ApplicationEvent applicationEvent = (ApplicationEvent) event;

        // 1 根据event类型，获取对应的listener
        List<ApplicationListener> applicationListenerList = eventListenerMap.get(applicationEvent.getClass());

        // 2 调用listener的事件回调函数
        for(ApplicationListener applicationListener : applicationListenerList) {
            applicationListener.onApplicationEvent(applicationEvent);
        }
    }
}

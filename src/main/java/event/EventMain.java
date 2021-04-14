package event;

import event.base.ApplicationEvent;
import event.base.ApplicationListener;


/**
 * @author Chen Yixing
 * @date 2021/4/13 13:43
 */
public class EventMain {
    public static void main(String[] args) {
        CustomerApplicationEventPublisher publisher = new CustomerApplicationEventPublisher();

        ApplicationListener listener1 = new CustomerApplicationListener1();
        ApplicationListener listener2 = new CustomerApplicationListener2();

        publisher.registerListener(listener1);
        publisher.registerListener(listener2);

        ApplicationEvent event1 = new CustomerApplicationEvent1("event1");
        ApplicationEvent event2 = new CustomerApplicationEvent2("event2");

        publisher.publishEvent(event1);
        publisher.publishEvent(event2);

        System.out.println("-----------------------------------");
    }
}

package event;

import event.base.ApplicationEvent;

/**
 * @author Chen Yixing
 * @date 2021/4/13 13:35
 */
public class CustomerApplicationEvent1 extends ApplicationEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public CustomerApplicationEvent1(Object source) {
        super(source);
    }
}

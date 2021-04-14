package event;

import event.base.ApplicationListener;

/**
 * @author Chen Yixing
 * @date 2021/4/13 13:36
 */
public class CustomerApplicationListener2 implements ApplicationListener<CustomerApplicationEvent2> {

    @Override
    public void onApplicationEvent(CustomerApplicationEvent2 event) {
        System.out.println("CustomerApplicationListener2:>> " + event);
    }
}

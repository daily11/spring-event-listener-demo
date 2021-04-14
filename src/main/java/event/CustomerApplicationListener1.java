package event;

import event.base.ApplicationListener;

/**
 * @author Chen Yixing
 * @date 2021/4/13 13:36
 */
public class CustomerApplicationListener1 implements ApplicationListener<CustomerApplicationEvent1> {

    @Override
    public void onApplicationEvent(CustomerApplicationEvent1 event) {
        System.out.println("CustomerApplicationListener1:>> " + event);
    }
}

package biz.xsoftware.test;

import biz.xsoftware.impl.usersvc.BusinessLogic;
import biz.xsoftware.impl.usersvc.OrdersController;
import biz.xsoftware.orders.api.OrdersService;
import junit.framework.TestCase;

public class FeatureTest extends TestCase {


    protected OrdersService ordersSvc;

    protected MockCacheService mockCacheSvc;

    @Override
    protected void setUp() throws Exception {
        BusinessLogic logic = new BusinessLogic(mockCacheSvc);
        ordersSvc = new OrdersController(logic);
    }
}

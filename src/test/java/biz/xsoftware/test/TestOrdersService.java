package biz.xsoftware.test;

import biz.xsoftware.caching.api.CachedResponse;
import biz.xsoftware.caching.api.CachingRequest;
import biz.xsoftware.orders.api.OrderRequest;
import biz.xsoftware.orders.api.OrderResponse;
import biz.xsoftware.orders.api.OrdersService;
import biz.xsoftware.test.FeatureTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TestOrdersService extends FeatureTest {

	@Override
	protected void tearDown() throws Exception {
		
	}

	@Test
	public void testFetchOrder() throws ExecutionException, InterruptedException, TimeoutException {

		//Create a mock response for mockCacheSvc variable here
		//populate mock with a response for later here

		//create a OrderRequest here and invoke ordersSvc
		//call the service here ordersSvc.readOrder(request).get(5, TimeUnit.SECONDS);
		//make sure you assigned the response to a variable

		//validate the OrderResponse returned here

		// go to the mockCacheSvc and grab the request it received here
		//validate the correct request was sent to mockCacheSvc

	}

}

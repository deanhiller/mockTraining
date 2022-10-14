package biz.xsoftware.orders.api;


import java.util.concurrent.CompletableFuture;

public interface OrdersService
{


	public CompletableFuture<OrderResponse> readOrder(OrderRequest request);
}

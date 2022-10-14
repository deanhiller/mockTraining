package biz.xsoftware.test;

import biz.xsoftware.caching.api.CachedResponse;
import biz.xsoftware.caching.api.CachingRequest;
import biz.xsoftware.caching.api.CachingService;
import org.webpieces.mock.MockSuperclass;

import java.util.concurrent.CompletableFuture;

public class MockCacheService2 extends MockSuperclass implements CachingService {
    @Override
    public CompletableFuture<CachedResponse> fetchCached(CachingRequest request) {
        return (CompletableFuture<CachedResponse>) calledMethod(CacheMethods.FETCH_CACHED, request);
    }
}

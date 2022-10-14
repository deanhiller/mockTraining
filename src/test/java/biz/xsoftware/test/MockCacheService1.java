package biz.xsoftware.test;

import biz.xsoftware.caching.api.CachedResponse;
import biz.xsoftware.caching.api.CachingRequest;
import biz.xsoftware.caching.api.CachingService;

import java.util.concurrent.CompletableFuture;

public class MockCacheService1 implements CachingService {
    @Override
    public CompletableFuture<CachedResponse> fetchCached(CachingRequest request) {
        return null;
    }
}

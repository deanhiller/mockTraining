package biz.xsoftware.caching.api;

import java.util.concurrent.CompletableFuture;

public interface CachingService {

    public CompletableFuture<CachedResponse> fetchCached(CachingRequest request);
}

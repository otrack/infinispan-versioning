package org.infinispan.versioning;

import org.infinispan.Cache;
import org.infinispan.configuration.cache.ConfigurationBuilder;
import org.infinispan.versioning.impl.VersionedCacheashMapImpl;
import org.infinispan.versioning.utils.version.VersionGenerator;
import org.testng.annotations.Test;


/**
 *
 * @author Pierre Sutra
 * @since 7.0
 */
@Test(groups = "functional", testName = "VersionedCacheHashMapTest")
public class VersionedCacheHashMapTest extends VersionedCacheAbstractTest {

    @Override
    protected boolean isTransactional() {
        return false;
    }

    @Override
    protected void setBuilder(ConfigurationBuilder builder) {
    }

    @Override
    protected <K, V> VersionedCache<K, V> getCache(Cache cache, VersionGenerator generator, String name) {
        return new VersionedCacheashMapImpl<K, V>(cache,generator,name);
    }

}

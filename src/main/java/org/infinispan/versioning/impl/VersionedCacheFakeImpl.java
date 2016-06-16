package org.infinispan.versioning.impl;

import org.infinispan.Cache;
import org.infinispan.versioning.utils.version.Version;
import org.infinispan.versioning.utils.version.VersionGenerator;

import java.util.*;

public class VersionedCacheFakeImpl<K,V> extends VersionedCacheAbstractImpl<K,V> {

	public VersionedCacheFakeImpl(Cache cache,
                                  VersionGenerator generator, String cacheName) {
		super(cache, generator, cacheName);
	}

	@Override
	public boolean containsKey(Object arg0) {
		return false;
	}

	@Override
	public boolean containsValue(Object arg0) {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return  true;
	}

	@Override
	public Set<K> keySet() {
		return new TreeSet<K>();
	}

	@Override
	protected SortedMap<Version, V> versionMapGet(K key) {		
		return new TreeMap<Version,V>();
	}

	@Override
	protected void versionMapPut(K key, V value, Version version) {
	}

    @Override
    public void putAll(K k, Map<Version,V> map){
    }

}

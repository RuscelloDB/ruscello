package com.ruscello.storage;

import com.ruscello.storage.lmdb.LmdbConfiguration;
import com.ruscello.storage.rocksdb.RocksdbConfiguration;

public class Configuration implements RuscelloConfiguration, RocksdbConfiguration, LmdbConfiguration {

    @Override
    public String dataDir() {
        return null;
    }

    @Override
    public String loggingDir() {
        return null;
    }

    @Override
    public String storageEngine() {
        return null;
    }

    @Override
    public int maxKeySize() {
        return 0;
    }

    @Override
    public String path() {
        return null;
    }
}

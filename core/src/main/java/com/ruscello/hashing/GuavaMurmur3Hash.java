package com.ruscello.hashing;

import static com.google.common.hash.Hashing.murmur3_128;
import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * 128-bit murmur3 algorithm, x64 variant (little-endian)
 */
public class GuavaMurmur3Hash implements Hasher {

    @Override
    public String hash(String s) {
        return murmur3_128().hashString(s, UTF_8).toString();
    }

    @Override
    public String hash(byte[] data) {
        return murmur3_128().hashBytes(data).toString();
    }

    @Override
    public String hash(byte[] data, int offset, int len, int seed) {
        return murmur3_128(seed).hashBytes(data, offset, len).toString();
    }
}

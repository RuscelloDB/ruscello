package com.ruscello.hashing;

public interface Hasher {
    // EventStore has a lowHasher and a highHasher and then does the following to create hash
    // lowHasher.hash(streamId) << 32 | highHasher.hash(streamId)

//    TODO: understand why an unsigned int is returned instead of the hashed string
//    uint Hash(String s);
//    uint Hash(byte[] data);
//    uint Hash(byte[] data, int offset, uint len, uint seed);

    String hash(String s);
    String hash(byte[] data);
    String hash(byte[] data, int offset, int len, int seed);
}

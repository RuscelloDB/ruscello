# Potential ADR docs that I might need


Spring vs Dropwizard vs Jersey

EventBus vs Mbassador vs ?

Disruptor vs SEDA (Staged Event Driven Architecture)

Atom Feed

Configuration file format: yaml (yml) vs toml vs no config file and just
command line args and env variables similar to cockroachdb (?)

Key space design- Do we want to use a single keyspace for everything or split
between multiple keyspaces? Pros vs Cons of each?  

Replication - how should we handle replication? First thought is using
the Raft consensus protocol via one of the existing java
implementations ex Apache Ratis, CopyCat, libraft, atomix, scalecube
raft

GDPR - how can we support 
key management system.  
Key per stream.  
Do we need a way to only encrypt certain fields or whole payload?  
Deleting from projections  

Shell vs CLI vs Both
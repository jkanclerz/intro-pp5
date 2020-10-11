package pl.jkanclerz.ccc.factory;

import java.util.UUID;

class Worker {
    Product doWork() {
        return new Product(UUID.randomUUID());
    }
}

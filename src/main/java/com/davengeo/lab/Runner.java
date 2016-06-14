/*
 * Copyright (c) 2016 Proximus.
 * me@davengeo.com
 */
package com.davengeo.lab;

import com.davengeo.lab.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.RemoteCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Runner implements CommandLineRunner {

  @Autowired
  RemoteCacheManager remoteCacheManager;

  @Override
  public void run(String... strings) throws Exception {
    final RemoteCache<String, Customer> repo = remoteCacheManager.getCache("CUSTOMER");

    repo.put("uno", new Customer("a", "b"));
    log.info("uno has been put");
    final Customer uno = repo.get("uno");
    log.info("{}:{}", uno.getName(), uno.getUuid());
  }


}

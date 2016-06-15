/*
 * Made in 2016.
 * http://www.apache.org/licenses/LICENSE-2.0
 * me@davengeo.com
 */

/*
 * Made in 2016.
 * http://www.apache.org/licenses/LICENSE-2.0
 * me@davengeo.com
 */
package com.davengeo.lab;

import com.davengeo.lab.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.RemoteCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
@Slf4j
public class RunnerTwo implements CommandLineRunner {

  @Autowired
  RemoteCacheManager remoteCacheManager;

  @Override
  public void run(String... strings) throws Exception {
    final RemoteCache<String, Customer> repo = remoteCacheManager.getCache("CUSTOMER");
    final Customer uno = repo.get("uno");
    log.info("{}:{}", uno.getName(), uno.getUuid());
  }
}

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
package com.davengeo.lab.conf;


import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.client.hotrod.configuration.ConfigurationBuilder;
import org.infinispan.commons.marshall.jboss.GenericJBossMarshaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
@EnableConfigurationProperties(RemoteGridProperties.class)
public class RemoteGrid {

  @Autowired
  RemoteGridProperties properties;

  @Bean
  protected RemoteCacheManager remoteCacheManager() throws IOException {
    ConfigurationBuilder cb
      = new ConfigurationBuilder();

    cb.marshaller(new GenericJBossMarshaller())
      .classLoader(this.getClass().getClassLoader())
      .forceReturnValues(false)
      .tcpNoDelay(true)
      .connectionPool()
      .testOnBorrow(false)
      .testOnReturn(false)
      .testWhileIdle(true)
      .addServer()
      .host(properties.getHostname())
      .port(11222 + properties.getOffset());

    RemoteCacheManager remoteCacheManager = new RemoteCacheManager(cb.build());
    if (!remoteCacheManager.isStarted()) {
      remoteCacheManager.start();
    }
    return remoteCacheManager;
  }

}

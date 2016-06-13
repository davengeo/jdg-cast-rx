/*
 * Copyright (c) 2016 Proximus.
 * me@davengeo.com
 */
package com.davengeo.lab.conf;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "data-grid", ignoreUnknownFields = true)
public class RemoteGridProperties {

  private String hostname;
  private int offset;
}

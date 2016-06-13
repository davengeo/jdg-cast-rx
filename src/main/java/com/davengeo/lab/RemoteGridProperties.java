/*
 * Copyright (c) 2016 Proximus.
 * me@davengeo.com
 */
package com.davengeo.lab;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "data-grid", ignoreUnknownFields = true)
public class RemoteGridProperties {

  String hostname;
  int offset;

  public int getOffset() {
    return offset;
  }

  public void setOffset(int offset) {
    this.offset = offset;
  }

  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }



}

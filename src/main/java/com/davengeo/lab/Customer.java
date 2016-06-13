/*
 * Copyright (c) 2016 Proximus.
 * me@davengeo.com
 */
package com.davengeo.lab;

import org.infinispan.commons.marshall.SerializeWith;

import java.io.Serializable;

@SerializeWith(CustomerExternalizer.class)
public class Customer implements Serializable {

  String uuid;
  String name;

  public Customer(String uuid, String name) {
    this.uuid = uuid;
    this.name = name;
  }


  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}

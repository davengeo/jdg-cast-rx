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
package com.davengeo.lab.model;

import lombok.Data;
import org.infinispan.commons.marshall.SerializeWith;

import java.io.Serializable;

@Data
@SerializeWith(CustomerExternalizer.class)
public class Customer implements Serializable {

  private String uuid;
  private String name;

  public Customer(String uuid, String name) {
    this.uuid = uuid;
    this.name = name;
  }

}

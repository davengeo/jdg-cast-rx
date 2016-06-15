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

import org.infinispan.commons.marshall.AdvancedExternalizer;
import org.infinispan.commons.util.Util;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Set;

public class CustomerExternalizer implements AdvancedExternalizer<Customer> {

  @Override
  public void writeObject(ObjectOutput output, Customer customer) throws IOException {
    output.writeObject(customer.getUuid());
    output.writeObject(customer.getName());
  }

  @Override
  public Customer readObject(ObjectInput input) throws IOException, ClassNotFoundException {
    return new Customer((String) input.readObject(),
                        (String) input.readObject());
  }

  @SuppressWarnings("unchecked")
  @Override
  public Set<Class<? extends Customer>> getTypeClasses() {
    return Util.<Class<? extends Customer>>asSet(Customer.class);
  }

  @Override
  public Integer getId() {
    return 2346;
  }
}

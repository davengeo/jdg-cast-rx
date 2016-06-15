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

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "data-grid", ignoreUnknownFields = true)
public class RemoteGridProperties {

  private String hostname;
  private int offset;
}

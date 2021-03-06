/*
 * Copyright © 2013-2019 camunda services GmbH and various authors (info@camunda.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.engine.test.api.identity;

import org.camunda.bpm.engine.authorization.Permission;
import org.camunda.bpm.engine.authorization.Resource;

public enum TestPermissions implements Permission {
  NONE("NONE", 0),
  ALL("ALL", Integer.MAX_VALUE),
  READ("READ", 2),
  UPDATE("UPDATE", 4),
  CREATE("CREATE", 4),
  DELETE("DELETE", 16),
  ACCESS("ACCESS", 32);

  private TestPermissions(String name, int value) {
    this.name = name;
    this.value = value;
  }

  String name;
  int value;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getValue() {
    return value;
  }

  public Resource[] getTypes() {
    return new Resource[] { TestResource.RESOURCE1, TestResource.RESOURCE2 };
  }

}

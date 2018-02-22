/**
 * GENERATED CODE - DO NOT EDIT OR CHECK IN TO SOURCE CODE CONTROL
 *
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * Licensed to The Symphony Software Foundation (SSF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 *----------------------------------------------------------------------------------------------------
 * Generated from
 *    Input source         file:/home/jose/projects/SupportPortalPodDiscoveryServices/discoveryservice-client/src/main/canon/podservice.json
 *    Template groupId     org.symphonyoss.s2.canon
 *           artifactId    canon-template-java
 *    Template name        template/java/Model/_ModelServlet.java.ftl
 *    At                   2018-02-22 17:08:03 BRT
 *----------------------------------------------------------------------------------------------------
 */

package org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.canon;

  
  
import javax.annotation.concurrent.Immutable;

import org.symphonyoss.s2.canon.runtime.ModelServlet;
import org.symphonyoss.s2.common.http.IUrlPathServlet;
import org.symphonyoss.s2.fugue.di.Cardinality;
import org.symphonyoss.s2.fugue.di.ComponentDescriptor;

import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.IPodservice;

@Immutable
public class PodserviceModelServlet extends ModelServlet<IPodservice>
{
  private static final long serialVersionUID = 1L;
  
  private IPodservice model_;

  public PodserviceModelServlet(
    IPodserviceEntityHandler ...handlers)
  {
    for(IPodserviceEntityHandler handler : handlers)
      register(handler);
  }
  
  @Override
  public IPodservice getModel()
  {
    return model_;
  }

  @Override
  public ComponentDescriptor getComponentDescriptor()
  {
    return super.getComponentDescriptor()
        .addDependency(IPodservice.class, (v) -> model_ = v)
        .addDependency(IPodserviceEntityHandler.class, (v) -> register(v), Cardinality.oneOrMore)
        .addProvidedInterface(IUrlPathServlet.class);
  }
 
  @Override
  public String getUrlPath()
  {
    return "/podservice/v2/*";
  }

}
/*----------------------------------------------------------------------------------------------------
 * End of template template/java/Model/_ModelServlet.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */
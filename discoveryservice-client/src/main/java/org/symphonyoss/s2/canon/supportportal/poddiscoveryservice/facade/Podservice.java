/**
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
 * Proforma generated from
 *		Template groupId		 org.symphonyoss.s2.canon
 *           artifactId canon-template-java
 *		Template name		   proforma/java/Model/_.java.ftl
 *		Template version	   1.0
 *  At                  2018-02-21 14:57:46 BRT
 *----------------------------------------------------------------------------------------------------
 */

package org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade;


import com.google.common.base.Charsets;
import com.google.protobuf.ByteString;
import java.util.Collection;
import java.util.TreeMap;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.canon.PodProvider;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.canon.PodState;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.canon.PodserviceModel;
import org.symphonyoss.s2.common.exception.BadFormatException;
import org.symphonyoss.s2.common.fault.ProgramFault;
import org.symphonyoss.s2.fugue.di.ComponentDescriptor;

public class Podservice extends PodserviceModel implements IPodservice
{

  private TreeMap<PodName, Pod> presenceMap_ = new TreeMap<>();

  @Override
  public ComponentDescriptor getComponentDescriptor()
  {
    return super.getComponentDescriptor()
        .addStart(() -> initialize());
  }

  @Override
  public synchronized Collection<Pod> getAllPods()
  {
    return presenceMap_.values();
  }

  private void initialize()
  {
    /* Load presence data for known users */

    try
    {
      Pod.Factory.Builder podserviceBuilder = getPodFactory().newBuilder();
      PodName podName;

      podName = PodName.newBuilder().build("clientdefault1");

      podserviceBuilder.withName(podName);
      podserviceBuilder.withClient("Client Default");
      podserviceBuilder.withState(PodState.active);
      podserviceBuilder.withVersion("1.52");
      podserviceBuilder.withCeServiceVersion("1.52");
      podserviceBuilder.withKmVersion("1.52");
      podserviceBuilder.withProvider(PodProvider.aws);
      podserviceBuilder.withVanity("clientdefault1");

      presenceMap_.put(podName, podserviceBuilder.build());

      podName = PodName.newBuilder().build("clientdefault2");

      podserviceBuilder.withName(podName);
      podserviceBuilder.withClient("Client Default");
      podserviceBuilder.withState(PodState.active);
      podserviceBuilder.withVersion("1.52");
      podserviceBuilder.withCeServiceVersion("1.52");
      podserviceBuilder.withKmVersion("1.52");
      podserviceBuilder.withProvider(PodProvider.aws);
      podserviceBuilder.withVanity("clientdefault2");
      presenceMap_.put(podName, podserviceBuilder.build());
    }
    catch(BadFormatException e)
    {
      throw new ProgramFault(e);
    }
  }
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Model/_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */
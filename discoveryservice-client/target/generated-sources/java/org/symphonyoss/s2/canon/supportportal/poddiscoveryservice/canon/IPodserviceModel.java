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
 *    Template name        template/java/Model/I_Model.java.ftl
 *    At                   2018-02-22 17:08:03 BRT
 *----------------------------------------------------------------------------------------------------
 */

package org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.canon;

import org.symphonyoss.s2.common.exception.BadFormatException;

import org.symphonyoss.s2.common.dom.json.ImmutableJsonObject;

import org.symphonyoss.s2.canon.runtime.IModel;
import org.symphonyoss.s2.canon.runtime.Entity;

import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.PodList;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.Pod;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.PodPage;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.CursorInfo;

public interface IPodserviceModel extends IModel
{
  PodList.Factory getPodListFactory();
  Pod.Factory getPodFactory();
  PodPage.Factory getPodPageFactory();
  CursorInfo.Factory getCursorInfoFactory();
}
/*----------------------------------------------------------------------------------------------------
 * End of template template/java/Model/I_Model.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */
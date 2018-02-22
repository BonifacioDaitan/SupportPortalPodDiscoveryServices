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
 *    Template name        template/java/Path/I_PathHandler.java.ftl
 *    At                   2018-02-22 17:08:03 BRT
 *----------------------------------------------------------------------------------------------------
 */

package org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.canon;

  
  
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.symphonyoss.s2.canon.runtime.exception.JapiException;
import org.symphonyoss.s2.canon.runtime.IEntityHandler;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.ByteString;
  
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.CursorLimit;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.Cursor;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.PodPage;

/**
 * Path name=Pods
 *
 * Fetch all pods .
 *
 * Path					/pods
 * Bind Path			pods
 */
public interface IPodsPathHandler extends IPodserviceEntityHandler
{
  /**
   * get /pods
   * No summary given.
   * 
   * @param cursor                    No summary given.
   * @param limit                     No summary given.
   * @return A PodPage
   * @throws JapiException                    If the method cannot be called
   */
  @Nonnull PodPage handleGet(
    @Nullable Cursor                    cursor,
    @Nullable CursorLimit               limit	
    ) throws JapiException;
    
}
/*----------------------------------------------------------------------------------------------------
 * End of template template/java/Path/I_PathHandler.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */
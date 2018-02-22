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
 *    Template name        template/java/Path/_PathHandler.java.ftl
 *    At                   2018-02-22 17:08:03 BRT
 *----------------------------------------------------------------------------------------------------
 */

package org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.canon;

  
  
import javax.annotation.concurrent.Immutable;

import java.io.IOException;

import java.util.Iterator;
import java.util.List;


import org.symphonyoss.s2.common.exception.BadFormatException;

import org.symphonyoss.s2.canon.runtime.PathHandler;
import org.symphonyoss.s2.canon.runtime.ModelRegistry;
import org.symphonyoss.s2.canon.runtime.exception.BadRequestException;
import org.symphonyoss.s2.canon.runtime.exception.JapiException;
import org.symphonyoss.s2.canon.runtime.exception.NoSuchRecordException;
import org.symphonyoss.s2.canon.runtime.exception.PermissionDeniedException;
import org.symphonyoss.s2.canon.runtime.exception.ServerErrorException;
import org.symphonyoss.s2.canon.runtime.http.ParameterLocation;
import org.symphonyoss.s2.canon.runtime.http.RequestContext;

import org.symphonyoss.s2.fugue.di.ComponentDescriptor;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.ByteString;
  
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.CursorLimit;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.Cursor;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.PodPage;

import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.IPodservice;

/**
 * Path name=Pods
 *
 * Fetch all pods .
 *
 * Path					/pods
 * Bind Path			pods
 */
@Immutable
public abstract class PodsPathHandler extends PathHandler<IPodservice> implements IPodsPathHandler
{
  private IPodservice model_;
  
  public PodsPathHandler()
  {
    super(0, new String[] {
        "/pods"      }
    );
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
        .addProvidedInterface(IPodsPathHandler.class)
        .addProvidedInterface(IPodserviceEntityHandler.class);
  }

  @Override
  public String getPath()
  {
    return "/podservice/v2/pods";
  }

  @Override
  public void handle(RequestContext context, List<String> pathParams) throws IOException, JapiException
  {
    switch(context.getMethod())
    {
      case Post:
      case Put:
      case Delete:
      case Options:
      case Head:
      case Trace:
        unsupportedMethod(context);
        break;
        
      case Get:
        doGet(context, pathParams);
        break;
        
    }
  }

  private void doGet(RequestContext context, List<String> pathParams) throws IOException, JapiException
  {
    Iterator<String> it = pathParams.iterator();
    

    ByteString                cursorValue = context.getParameterAsByteString("cursor", ParameterLocation.Query, false);
    Cursor                    cursor = null; 
    
    if(cursorValue != null)
    {
      try
      {
        cursor = Cursor.newBuilder().build(cursorValue);
      }
      catch(BadFormatException e)
      {
        context.error("Parameter \"cursor\" has invalid value \"%s\" (%s)", cursorValue, e.getMessage());
      }
    }


    Integer                   limitValue = context.getParameterAsInteger("limit", ParameterLocation.Query, false);
    CursorLimit               limit = null; 
    
    if(limitValue != null)
    {
      try
      {
        limit = CursorLimit.newBuilder().build(limitValue);
      }
      catch(BadFormatException e)
      {
        context.error("Parameter \"limit\" has invalid value \"%s\" (%s)", limitValue, e.getMessage());
      }
    }


  
    if(context.preConditionsAreMet())
    {
      try
      {
        PodPage response =
          handleGet(
            cursor,
            limit  
          );
        if(response == null)
        {
          throw new ServerErrorException("Required return value is null");        
        }
        else
        {
          context.sendOKResponse(response);
        }
      }
      catch(PermissionDeniedException | ServerErrorException e)
      {
        throw e;
      }
      catch(JapiException | RuntimeException e)
      {
        throw new ServerErrorException(e);
      }
    }
  }


}
/*----------------------------------------------------------------------------------------------------
 * End of template template/java/Path/_PathHandler.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */
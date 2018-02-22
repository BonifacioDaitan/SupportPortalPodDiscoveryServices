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
 *    Template name        template/java/Path/_AsyncPathHandler.java.ftl
 *    At                   2018-02-22 17:08:03 BRT
 *----------------------------------------------------------------------------------------------------
 */

package org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.canon;

  
  
import java.io.IOException;
import java.io.StringReader;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import javax.servlet.AsyncContext;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;

import org.symphonyoss.s2.common.dom.json.ImmutableJsonObject;
import org.symphonyoss.s2.common.dom.json.JsonValue;
import org.symphonyoss.s2.common.exception.BadFormatException;

import org.symphonyoss.s2.canon.runtime.AsyncPathHandler;
import org.symphonyoss.s2.canon.runtime.IConsumer;
import org.symphonyoss.s2.canon.runtime.EmptyRequestManager;
import org.symphonyoss.s2.canon.runtime.PayloadOnlyRequestManager;
import org.symphonyoss.s2.canon.runtime.PayloadResponseRequestManager;
import org.symphonyoss.s2.canon.runtime.ResponseOnlyRequestManager;
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
public abstract class PodsAsyncPathHandler extends AsyncPathHandler<IPodservice> implements IPodsAsyncPathHandler
{
  private IPodservice model_;
  
  public PodsAsyncPathHandler(
    ExecutorService processExecutor,
    ExecutorService responseExecutor)
  {
    super(processExecutor, responseExecutor, 0, new String[] {
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
        .addProvidedInterface(IPodsAsyncPathHandler.class)
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
      ServletInputStream in = context.getRequest().getInputStream();
      ServletOutputStream out = context.getResponse().getOutputStream();
      AsyncContext async=context.getRequest().startAsync();

        final Cursor                    finalCursor = cursor; 
        final CursorLimit               finalLimit = limit; 
      
      // Method has no Payload but does have a Response
      ResponseOnlyRequestManager<PodPage> manager =
        new ResponseOnlyRequestManager<PodPage>(in, out, async, getProcessExecutor(), getResponseExecutor())
      {
        @Override
        public void handle(IConsumer<PodPage> consumer) throws JapiException
        {
          handleGet(consumer,
            finalCursor,
            finalLimit
          );
        }
      };
      
      out.setWriteListener(manager);
      
      manager.start();
    }
  }
}
/*----------------------------------------------------------------------------------------------------
 * End of template template/java/Path/_AsyncPathHandler.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */
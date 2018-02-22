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
 *    Template name        template/java/Object/_Entity.java.ftl
 *    At                   2018-02-22 17:08:03 BRT
 *----------------------------------------------------------------------------------------------------
 */

package org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.canon;

  
  
import javax.annotation.concurrent.Immutable;

import com.google.protobuf.ByteString;

import org.symphonyoss.s2.canon.runtime.IEntity;
import org.symphonyoss.s2.canon.runtime.CanonRuntime;
import org.symphonyoss.s2.canon.runtime.Entity;
import org.symphonyoss.s2.canon.runtime.EntityFactory;

import org.symphonyoss.s2.common.dom.IBooleanProvider;
import org.symphonyoss.s2.common.dom.IStringProvider;
import org.symphonyoss.s2.common.dom.IIntegerProvider;
import org.symphonyoss.s2.common.dom.ILongProvider;
import org.symphonyoss.s2.common.dom.IFloatProvider;
import org.symphonyoss.s2.common.dom.IDoubleProvider;
import org.symphonyoss.s2.common.dom.IByteStringProvider;
import org.symphonyoss.s2.common.dom.json.IJsonDomNode;
import org.symphonyoss.s2.common.dom.json.IImmutableJsonDomNode;
import org.symphonyoss.s2.common.dom.json.ImmutableJsonArray;
import org.symphonyoss.s2.common.dom.json.ImmutableJsonObject;
import org.symphonyoss.s2.common.dom.json.MutableJsonArray;
import org.symphonyoss.s2.common.dom.json.MutableJsonObject;

import org.symphonyoss.s2.common.exception.BadFormatException;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.ByteString;
  
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.CursorInfo;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.Pod;

import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.IPodservice;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.IPodserviceModelEntity;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.IPodPage;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.PodPage;

/**
 * Object ObjectSchema(PodPage)
 * Generated from ObjectSchema(PodPage) at #/components/schemas/PodPage
 */
@Immutable
@SuppressWarnings("unused")
public abstract class PodPageEntity extends Entity
 implements IPodPage, IPodserviceModelEntity
{
  public static final String TYPE_ID = "https://github.com/bruceskingle/canon/blob/master/canon-test/src/main/resources/test/podService.json#/components/schemas/PodPage";

  private final PodPage.Factory           canonFactory_;

  private final List<Pod>                  data_;
  private final CursorInfo                 cursors_;

  protected PodPageEntity(PodPage.Factory canonFactory, IPodPageEntity canonOther)
  {
    super(canonOther.getJsonObject());
    
    canonFactory_ = canonFactory;

    data_ = ImmutableList.copyOf(canonOther.getData());


    cursors_ = canonOther.getCursors();

  }
  
  protected PodPageEntity(PodPage.Factory canonFactory, ImmutableJsonObject canonJsonObject) throws BadFormatException
  {
    super(canonJsonObject);
    
    if(canonJsonObject == null)
      throw new BadFormatException("canonJsonObject is required");
  
    canonFactory_ = canonFactory;

    IImmutableJsonDomNode typeNode = canonJsonObject.get(CanonRuntime.JSON_TYPE);
    if(!(typeNode instanceof IStringProvider && TYPE_ID.equals(((IStringProvider)typeNode).asString())))
    {
      throw new BadFormatException("_type attribute must be \"" + TYPE_ID + "\"");
    }
    
    if(canonJsonObject.containsKey("data"))
    {
      IJsonDomNode  node = canonJsonObject.get("data");
      if(node instanceof ImmutableJsonArray)
      {
        data_ = canonFactory_.getModel().getPodFactory().newInstanceList((ImmutableJsonArray)node);
      }
      else
      {
        throw new BadFormatException("data must be an array not " + node.getClass().getName());
      }
    }
    else
    {
      data_ = null;
    }
    if(canonJsonObject.containsKey("cursors"))
    {
      IJsonDomNode  node = canonJsonObject.get("cursors");
      if(node instanceof ImmutableJsonObject)
      {
        cursors_ = canonFactory.getModel().getCursorInfoFactory().newInstance((ImmutableJsonObject)node);
      }
      else
      {
        throw new BadFormatException("cursors must be an Object node not " + node.getClass().getName());
      }
    }
    else
    {
      cursors_ = null;
    }
  }
  
  @Override
  public List<Pod> getData()
  {
    return data_;
  }
    
  
  @Override
  public CursorInfo getCursors()
  {
    return cursors_;
  }
    


  @Override
  public boolean equals(Object obj)
  {
    if(obj instanceof PodPageEntity)
      return serialize().equals(((PodPageEntity)obj).serialize());
    
    return false;
  }
  
  public static abstract class Factory extends EntityFactory<PodPage, IPodservice>
  {
    private IPodservice model_;
    
    public Factory(IPodservice model)
    {
      model_ = model;
    }
    
    @Override
    public IPodservice getModel()
    {
      return model_;
    }
    
    public static abstract class Builder extends EntityFactory.Builder implements IPodPageEntity
    {
      private List<Pod>                  data__ = new LinkedList<>();
      private CursorInfo                 cursors__;
      
      protected Builder()
      {
      }
      
      protected Builder(Builder initial)
      {
        data__.addAll(initial.data__);
        cursors__ = initial.cursors__;
      }
      
      @Override
      public List<Pod> getData()
      {
        return data__;
      }

      public PodPage.Factory.Builder withData(List<Pod> data)
      {
        data__.addAll(data);
        return (PodPage.Factory.Builder)this;
      }
      
      @Override
      public CursorInfo getCursors()
      {
        return cursors__;
      }

      public PodPage.Factory.Builder withCursors(CursorInfo cursors)
      {
        cursors__ = cursors;
        return (PodPage.Factory.Builder)this;
      }
    
      @Override 
      public ImmutableJsonObject getJsonObject()
      {
        MutableJsonObject jsonObject = new MutableJsonObject();
        
        jsonObject.addIfNotNull(CanonRuntime.JSON_TYPE, TYPE_ID);
    
        if(data__ != null)
        {
          jsonObject.addCollectionOfDomNode("data", data__);

        }
    
        if(cursors__ != null)
        {
          jsonObject.addIfNotNull("cursors", cursors__.getJsonObject());
        }
    
        return jsonObject.immutify();
      }
          
      public abstract PodPage build();
    }
  }
}
/*----------------------------------------------------------------------------------------------------
 * End of template template/java/Object/_Entity.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */
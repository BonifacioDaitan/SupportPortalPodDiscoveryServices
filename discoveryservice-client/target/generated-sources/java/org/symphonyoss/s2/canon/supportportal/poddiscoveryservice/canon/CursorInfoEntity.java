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

import com.google.protobuf.ByteString;
  
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.Cursor;

import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.IPodservice;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.IPodserviceModelEntity;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.ICursorInfo;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.CursorInfo;

/**
 * Object ObjectSchema(CursorInfo)
 *
 * Links to the next and prev pages.
 * Generated from ObjectSchema(CursorInfo) at #/components/schemas/CursorInfo
 */
@Immutable
@SuppressWarnings("unused")
public abstract class CursorInfoEntity extends Entity
 implements ICursorInfo, IPodserviceModelEntity
{
  public static final String TYPE_ID = "https://github.com/bruceskingle/canon/blob/master/canon-test/src/main/resources/test/podService.json#/components/schemas/CursorInfo";

  private final CursorInfo.Factory        canonFactory_;

  private final Cursor                     previous_;
  private final Cursor                     next_;

  protected CursorInfoEntity(CursorInfo.Factory canonFactory, ICursorInfoEntity canonOther)
  {
    super(canonOther.getJsonObject());
    
    canonFactory_ = canonFactory;

    previous_ = canonOther.getPrevious();


    next_ = canonOther.getNext();

  }
  
  protected CursorInfoEntity(CursorInfo.Factory canonFactory, ImmutableJsonObject canonJsonObject) throws BadFormatException
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
    
    if(canonJsonObject.containsKey("previous"))
    {
      IJsonDomNode  node = canonJsonObject.get("previous");
      if(node instanceof IByteStringProvider)
      {
        ByteString value = ((IByteStringProvider)node).asByteString();

        try
        {
          previous_ = Cursor.newBuilder().build(value);
        }
        catch(RuntimeException e)
        {
          throw new BadFormatException("Value \"" + value + "\" for previous is not a valid value", e);
        }
      }
      else
      {
          throw new BadFormatException("previous must be an instance of ByteString not " + node.getClass().getName());
      }     
    }
    else
    {
      previous_ = null;
    }
    if(canonJsonObject.containsKey("next"))
    {
      IJsonDomNode  node = canonJsonObject.get("next");
      if(node instanceof IByteStringProvider)
      {
        ByteString value = ((IByteStringProvider)node).asByteString();

        try
        {
          next_ = Cursor.newBuilder().build(value);
        }
        catch(RuntimeException e)
        {
          throw new BadFormatException("Value \"" + value + "\" for next is not a valid value", e);
        }
      }
      else
      {
          throw new BadFormatException("next must be an instance of ByteString not " + node.getClass().getName());
      }     
    }
    else
    {
      next_ = null;
    }
  }
  
  @Override
  public Cursor getPrevious()
  {
    return previous_;
  }
    
  
  @Override
  public Cursor getNext()
  {
    return next_;
  }
    


  @Override
  public boolean equals(Object obj)
  {
    if(obj instanceof CursorInfoEntity)
      return serialize().equals(((CursorInfoEntity)obj).serialize());
    
    return false;
  }
  
  public static abstract class Factory extends EntityFactory<CursorInfo, IPodservice>
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
    
    public static abstract class Builder extends EntityFactory.Builder implements ICursorInfoEntity
    {
      private Cursor                     previous__;
      private Cursor                     next__;
      
      protected Builder()
      {
      }
      
      protected Builder(Builder initial)
      {
        previous__ = initial.previous__;
        next__ = initial.next__;
      }
      
      @Override
      public Cursor getPrevious()
      {
        return previous__;
      }

      public CursorInfo.Factory.Builder withPrevious(Cursor previous)
      {
        previous__ = previous;
        return (CursorInfo.Factory.Builder)this;
      }
      
      public CursorInfo.Factory.Builder withPrevious(ByteString previous) throws BadFormatException
      {
        previous__ = Cursor.newBuilder().build(previous);
        return (CursorInfo.Factory.Builder)this;
      }
      
      @Override
      public Cursor getNext()
      {
        return next__;
      }

      public CursorInfo.Factory.Builder withNext(Cursor next)
      {
        next__ = next;
        return (CursorInfo.Factory.Builder)this;
      }
      
      public CursorInfo.Factory.Builder withNext(ByteString next) throws BadFormatException
      {
        next__ = Cursor.newBuilder().build(next);
        return (CursorInfo.Factory.Builder)this;
      }
    
      @Override 
      public ImmutableJsonObject getJsonObject()
      {
        MutableJsonObject jsonObject = new MutableJsonObject();
        
        jsonObject.addIfNotNull(CanonRuntime.JSON_TYPE, TYPE_ID);
    
        if(previous__ != null)
        {
          jsonObject.addIfNotNull("previous", previous__.getValue());
        }
    
        if(next__ != null)
        {
          jsonObject.addIfNotNull("next", next__.getValue());
        }
    
        return jsonObject.immutify();
      }
          
      public abstract CursorInfo build();
    }
  }
}
/*----------------------------------------------------------------------------------------------------
 * End of template template/java/Object/_Entity.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */
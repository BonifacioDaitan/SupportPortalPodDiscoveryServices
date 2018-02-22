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
import java.util.Set;
import java.util.HashSet;
import com.google.common.collect.ImmutableSet;
  
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.canon.PodState;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.PodName;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.canon.PodProvider;

import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.IPodservice;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.IPodserviceModelEntity;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.IPod;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.Pod;

/**
 * Object ObjectSchema(Pod)
 * Generated from ObjectSchema(Pod) at #/components/schemas/Pod
 */
@Immutable
@SuppressWarnings("unused")
public abstract class PodEntity extends Entity
 implements IPod, IPodserviceModelEntity
{
  public static final String TYPE_ID = "https://github.com/bruceskingle/canon/blob/master/canon-test/src/main/resources/test/podService.json#/components/schemas/Pod";

  private final Pod.Factory               canonFactory_;

  private final PodName                    name_;
  private final String                     version_;
  private final String                     kmVersion_;
  private final String                     ceServiceVersion_;
  private final String                     vanity_;
  private final String                     client_;
  private final PodProvider                provider_;
  private final PodState                   state_;

  protected PodEntity(Pod.Factory canonFactory, IPodEntity canonOther)
  {
    super(canonOther.getJsonObject());
    
    canonFactory_ = canonFactory;

    name_ = canonOther.getName();


    version_ = canonOther.getVersion();


    kmVersion_ = canonOther.getKmVersion();


    ceServiceVersion_ = canonOther.getCeServiceVersion();


    vanity_ = canonOther.getVanity();


    client_ = canonOther.getClient();


    provider_ = canonOther.getProvider();


    state_ = canonOther.getState();

  }
  
  protected PodEntity(Pod.Factory canonFactory, ImmutableJsonObject canonJsonObject) throws BadFormatException
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
    
    if(canonJsonObject.containsKey("name"))
    {
      IJsonDomNode  node = canonJsonObject.get("name");
      if(node instanceof IStringProvider)
      {
        String value = ((IStringProvider)node).asString();

        try
        {
          name_ = PodName.newBuilder().build(value);
        }
        catch(RuntimeException e)
        {
          throw new BadFormatException("Value \"" + value + "\" for name is not a valid value", e);
        }
      }
      else
      {
          throw new BadFormatException("name must be an instance of String not " + node.getClass().getName());
      }     
    }
    else
    {
      name_ = null;
    }
    if(canonJsonObject.containsKey("version"))
    {
      IJsonDomNode  node = canonJsonObject.get("version");
      if(node instanceof IStringProvider)
      {
        String version = ((IStringProvider)node).asString();
        version_ = version;
      }
      else
      {
          throw new BadFormatException("version must be an instance of String not " + node.getClass().getName());
      }
    }
    else
    {
      version_ = null;
    }
    if(canonJsonObject.containsKey("kmVersion"))
    {
      IJsonDomNode  node = canonJsonObject.get("kmVersion");
      if(node instanceof IStringProvider)
      {
        String kmVersion = ((IStringProvider)node).asString();
        kmVersion_ = kmVersion;
      }
      else
      {
          throw new BadFormatException("kmVersion must be an instance of String not " + node.getClass().getName());
      }
    }
    else
    {
      kmVersion_ = null;
    }
    if(canonJsonObject.containsKey("ceServiceVersion"))
    {
      IJsonDomNode  node = canonJsonObject.get("ceServiceVersion");
      if(node instanceof IStringProvider)
      {
        String ceServiceVersion = ((IStringProvider)node).asString();
        ceServiceVersion_ = ceServiceVersion;
      }
      else
      {
          throw new BadFormatException("ceServiceVersion must be an instance of String not " + node.getClass().getName());
      }
    }
    else
    {
      ceServiceVersion_ = null;
    }
    if(canonJsonObject.containsKey("vanity"))
    {
      IJsonDomNode  node = canonJsonObject.get("vanity");
      if(node instanceof IStringProvider)
      {
        String vanity = ((IStringProvider)node).asString();
        vanity_ = vanity;
      }
      else
      {
          throw new BadFormatException("vanity must be an instance of String not " + node.getClass().getName());
      }
    }
    else
    {
      vanity_ = null;
    }
    if(canonJsonObject.containsKey("client"))
    {
      IJsonDomNode  node = canonJsonObject.get("client");
      if(node instanceof IStringProvider)
      {
        String client = ((IStringProvider)node).asString();
        client_ = client;
      }
      else
      {
          throw new BadFormatException("client must be an instance of String not " + node.getClass().getName());
      }
    }
    else
    {
      client_ = null;
    }
    if(canonJsonObject.containsKey("provider"))
    {
      IJsonDomNode  node = canonJsonObject.get("provider");
      if(node instanceof IStringProvider)
      {
        String value = ((IStringProvider)node).asString();

        try
        {
          provider_ = PodProvider.valueOf(value);
        }
        catch(RuntimeException e)
        {
          throw new BadFormatException("Value \"" + value + "\" for provider is not a valid value", e);
        }
      }
      else
      {
          throw new BadFormatException("provider must be an instance of String not " + node.getClass().getName());
      }     
    }
    else
    {
      provider_ = null;
    }
    if(canonJsonObject.containsKey("state"))
    {
      IJsonDomNode  node = canonJsonObject.get("state");
      if(node instanceof IStringProvider)
      {
        String value = ((IStringProvider)node).asString();

        try
        {
          state_ = PodState.valueOf(value);
        }
        catch(RuntimeException e)
        {
          throw new BadFormatException("Value \"" + value + "\" for state is not a valid value", e);
        }
      }
      else
      {
          throw new BadFormatException("state must be an instance of String not " + node.getClass().getName());
      }     
    }
    else
    {
      state_ = null;
    }
  }
  
  @Override
  public PodName getName()
  {
    return name_;
  }
    
  
  @Override
  public String getVersion()
  {
    return version_;
  }
    
  
  @Override
  public String getKmVersion()
  {
    return kmVersion_;
  }
    
  
  @Override
  public String getCeServiceVersion()
  {
    return ceServiceVersion_;
  }
    
  
  @Override
  public String getVanity()
  {
    return vanity_;
  }
    
  
  @Override
  public String getClient()
  {
    return client_;
  }
    
  
  @Override
  public PodProvider getProvider()
  {
    return provider_;
  }
    
  
  @Override
  public PodState getState()
  {
    return state_;
  }
    


  @Override
  public boolean equals(Object obj)
  {
    if(obj instanceof PodEntity)
      return serialize().equals(((PodEntity)obj).serialize());
    
    return false;
  }
  
  public static abstract class Factory extends EntityFactory<Pod, IPodservice>
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
    
    public static abstract class Builder extends EntityFactory.Builder implements IPodEntity
    {
      private PodName                    name__;
      private String                     version__;
      private String                     kmVersion__;
      private String                     ceServiceVersion__;
      private String                     vanity__;
      private String                     client__;
      private PodProvider                provider__;
      private PodState                   state__;
      
      protected Builder()
      {
      }
      
      protected Builder(Builder initial)
      {
        name__ = initial.name__;
        version__ = initial.version__;
        kmVersion__ = initial.kmVersion__;
        ceServiceVersion__ = initial.ceServiceVersion__;
        vanity__ = initial.vanity__;
        client__ = initial.client__;
        provider__ = initial.provider__;
        state__ = initial.state__;
      }
      
      @Override
      public PodName getName()
      {
        return name__;
      }

      public Pod.Factory.Builder withName(PodName name)
      {
        name__ = name;
        return (Pod.Factory.Builder)this;
      }
      
      public Pod.Factory.Builder withName(String name) throws BadFormatException
      {
        name__ = PodName.newBuilder().build(name);
        return (Pod.Factory.Builder)this;
      }
      
      @Override
      public String getVersion()
      {
        return version__;
      }

      public Pod.Factory.Builder withVersion(String version)
      {
        version__ = version;
        return (Pod.Factory.Builder)this;
      }
      
      @Override
      public String getKmVersion()
      {
        return kmVersion__;
      }

      public Pod.Factory.Builder withKmVersion(String kmVersion)
      {
        kmVersion__ = kmVersion;
        return (Pod.Factory.Builder)this;
      }
      
      @Override
      public String getCeServiceVersion()
      {
        return ceServiceVersion__;
      }

      public Pod.Factory.Builder withCeServiceVersion(String ceServiceVersion)
      {
        ceServiceVersion__ = ceServiceVersion;
        return (Pod.Factory.Builder)this;
      }
      
      @Override
      public String getVanity()
      {
        return vanity__;
      }

      public Pod.Factory.Builder withVanity(String vanity)
      {
        vanity__ = vanity;
        return (Pod.Factory.Builder)this;
      }
      
      @Override
      public String getClient()
      {
        return client__;
      }

      public Pod.Factory.Builder withClient(String client)
      {
        client__ = client;
        return (Pod.Factory.Builder)this;
      }
      
      @Override
      public PodProvider getProvider()
      {
        return provider__;
      }

      public Pod.Factory.Builder withProvider(PodProvider provider) throws BadFormatException
      {
        provider__ = provider;
        return (Pod.Factory.Builder)this;
      }
      
      public Pod.Factory.Builder withProvider(String provider) throws BadFormatException
      {
        provider__ = PodProvider.valueOf(provider);
        return (Pod.Factory.Builder)this;
      }
      
      @Override
      public PodState getState()
      {
        return state__;
      }

      public Pod.Factory.Builder withState(PodState state) throws BadFormatException
      {
        state__ = state;
        return (Pod.Factory.Builder)this;
      }
      
      public Pod.Factory.Builder withState(String state) throws BadFormatException
      {
        state__ = PodState.valueOf(state);
        return (Pod.Factory.Builder)this;
      }
    
      @Override 
      public ImmutableJsonObject getJsonObject()
      {
        MutableJsonObject jsonObject = new MutableJsonObject();
        
        jsonObject.addIfNotNull(CanonRuntime.JSON_TYPE, TYPE_ID);
    
        if(name__ != null)
        {
          jsonObject.addIfNotNull("name", name__.getValue());
        }
    
        if(version__ != null)
        {
          jsonObject.addIfNotNull("version", version__);
        }
    
        if(kmVersion__ != null)
        {
          jsonObject.addIfNotNull("kmVersion", kmVersion__);
        }
    
        if(ceServiceVersion__ != null)
        {
          jsonObject.addIfNotNull("ceServiceVersion", ceServiceVersion__);
        }
    
        if(vanity__ != null)
        {
          jsonObject.addIfNotNull("vanity", vanity__);
        }
    
        if(client__ != null)
        {
          jsonObject.addIfNotNull("client", client__);
        }
    
        if(provider__ != null)
        {
          jsonObject.addIfNotNull("provider", provider__.toString());
        }
    
        if(state__ != null)
        {
          jsonObject.addIfNotNull("state", state__.toString());
        }
    
        return jsonObject.immutify();
      }
          
      public abstract Pod build();
    }
  }
}
/*----------------------------------------------------------------------------------------------------
 * End of template template/java/Object/_Entity.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */
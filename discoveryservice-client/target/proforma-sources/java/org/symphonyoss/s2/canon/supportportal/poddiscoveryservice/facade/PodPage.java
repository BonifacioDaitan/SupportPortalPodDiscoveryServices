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
 *		Template name		   proforma/java/Object/_.java.ftl
 *		Template version	   1.0
 *  At                  2018-02-22 17:08:03 BRT
 *----------------------------------------------------------------------------------------------------
 */

package org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade;

  
  
import javax.annotation.concurrent.Immutable;

import com.google.protobuf.ByteString;

import org.symphonyoss.s2.common.dom.json.ImmutableJsonObject;

import org.symphonyoss.s2.common.exception.BadFormatException;

import java.util.Iterator;
import java.util.List;
import com.google.protobuf.ByteString;
  
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.CursorInfo;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.Pod;

import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.canon.PodPageEntity;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.canon.IPodPageEntity;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.canon.PodserviceModel;

/**
 * Facade for Object ObjectSchema(PodPage)
 * Generated from ObjectSchema(PodPage) at #/components/schemas/PodPage
 */
@Immutable
public class PodPage extends PodPageEntity implements IPodPage
{
  private PodPage(PodPage.Factory canonFactory, IPodPageEntity canonOther)
  {
    super(canonFactory, canonOther);
  }
  

  private PodPage(PodPage.Factory canonFactory, ImmutableJsonObject canonJsonObject) throws BadFormatException
  {
    super(canonFactory, canonJsonObject);
  }
  
  public static class Factory extends PodPageEntity.Factory
  {
    public Factory(IPodservice model)
    {
      super(model);
    }
    
    @Override
    public PodPage newInstance(ImmutableJsonObject jsonObject) throws BadFormatException
    {
      return new PodPage(this, jsonObject);
    }
    
    /**
     * Create a new builder with all fields initialized to default values.
     * 
     * @return A new builder.
     */
    public Builder newBuilder()
    {
      return new Builder(this);
    }
    
    /**
     * Create a new builder with all fields initialized from the given builder.
     * Values are copied so that subsequent changes to initial will not be reflected in
     * the returned builder.
     * 
     * @param initial A builder whose values are copied into a new builder.
     * 
     * @return A new builder.
     */
    public Builder newBuilder(Builder initial)
    {
      return new Builder(this, initial);
    }
  
  
    public static class Builder extends PodPageEntity.Factory.Builder
    {
      Factory factory_;
      
      private Builder(Factory factory)
      {
        factory_ = factory;
      }
      
      private Builder(Factory factory, Builder initial)
      {
        super(initial);
        factory_ = factory;
      }
    
      @Override
      public PodPage build()
      {
        /*
         * This is where you would place hand written code to enforce further constraints
         * on the values of fields in the object, such as constraints across multiple fields.
         */
         
        return new PodPage(factory_, this);
      }
    }
  }
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */
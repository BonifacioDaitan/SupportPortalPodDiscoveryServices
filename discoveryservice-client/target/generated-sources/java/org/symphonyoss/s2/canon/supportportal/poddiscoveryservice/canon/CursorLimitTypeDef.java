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
 *    Template name        template/java/TypeDef/_TypeDef.java.ftl
 *    At                   2018-02-22 17:08:03 BRT
 *----------------------------------------------------------------------------------------------------
 */

package org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.canon;

  
  
import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import com.google.protobuf.ByteString;

import org.symphonyoss.s2.common.dom.IBooleanProvider;
import org.symphonyoss.s2.common.dom.IStringProvider;
import org.symphonyoss.s2.common.dom.IIntegerProvider;
import org.symphonyoss.s2.common.dom.ILongProvider;
import org.symphonyoss.s2.common.dom.IFloatProvider;
import org.symphonyoss.s2.common.dom.IDoubleProvider;
import org.symphonyoss.s2.common.dom.IByteStringProvider;
import org.symphonyoss.s2.common.dom.json.IJsonDomNode;

import org.symphonyoss.s2.common.exception.BadFormatException;

import org.symphonyoss.s2.canon.runtime.TypeDef;
import org.symphonyoss.s2.canon.runtime.IntegerTypeDefBuilder;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.CursorLimit;

/**
 * A cursor limit, the max number of records to return.
 * Generated from TypeDef(CursorLimit,type=Integer) at #/components/schemas/CursorLimit
 */
@Immutable
public class CursorLimitTypeDef extends TypeDef implements IIntegerProvider, Comparable<CursorLimitTypeDef>
{
  private @Nonnull Integer value_;

  protected CursorLimitTypeDef(@Nonnull Integer value) throws BadFormatException
  {
    if(value == null)
      throw new BadFormatException("value is required.");
      
    value_ = value;
  }

  protected CursorLimitTypeDef(@Nonnull IJsonDomNode node) throws BadFormatException
  {
    if(node == null)
      throw new BadFormatException("value is required.");

    if(node instanceof IIntegerProvider)
    {
      Integer value = ((IIntegerProvider)node).asInteger();
      value_ = value;
    }
    else
    {
      throw new BadFormatException("value must be an instance of Integer not " + node.getClass().getName());
    }
  }
  
  public @Nonnull Integer getValue()
  {
    return value_;
  }
  
  public @Nonnull Integer asInteger()
  {
    return value_;
  }
  
  @Override
  public String toString()
  {
    return value_.toString();
  }

  @Override
  public int hashCode()
  {
    return value_.hashCode();
  }

  @Override
  public boolean equals(Object obj)
  {
    if(obj instanceof CursorLimitTypeDef)
    {
      return value_.equals(((CursorLimitTypeDef)obj).value_);
    }
    
    return false;
  }

  @Override
  public int compareTo(CursorLimitTypeDef other)
  {
    return value_.compareTo(other.value_);
  }
  
  public static abstract class Builder extends IntegerTypeDefBuilder<CursorLimit>
  {
  }
}

/*----------------------------------------------------------------------------------------------------
 * End of template template/java/TypeDef/_TypeDef.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */
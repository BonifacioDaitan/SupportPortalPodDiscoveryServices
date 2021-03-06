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
 *		Template name		   proforma/java/TypeDef/_.java.ftl
 *		Template version	   1.0
 *  At                  2018-02-22 17:08:03 BRT
 *----------------------------------------------------------------------------------------------------
 */

package org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade;

  
  
import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import com.google.protobuf.ByteString;

import org.symphonyoss.s2.common.exception.BadFormatException;

import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.canon.CursorTypeDef;

/**
 * Facade for
 * An opaque token returned by the server to allow the next page to be requested.
 * Formatted as Base64 encoded bytes
 * Generated from TypeDef(Cursor,type=String) at #/components/schemas/Cursor
 */
@Immutable
public class Cursor extends CursorTypeDef
{
  private static Builder theBuilder = new Builder();
  
  private Cursor(@Nonnull ByteString value) throws BadFormatException
  {
    super(value);
  }
  
  public static Builder newBuilder()
  {
    /* The generated version of this builder is stateless and so it is safe to return a 
     * reference to a shared instance, if you add functionality to this builder which is
     * not thread safe then you need to change this to return new Builder();
     */
    return theBuilder;
  }
  
  public static class Builder extends CursorTypeDef.Builder
  {
    private Builder()
    {
    }
    
    @Override
    public Cursor build(@Nonnull ByteString value) throws BadFormatException
    {
      return new Cursor(value);
    }
    
    @Override
    public ByteString toValue(Cursor instance)
    {
      return instance.getValue();
    }
  }
}

/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/TypeDef/_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */
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
 *    Template name        template/java/Operation/${parent.camelCapitalizedName}${camelCapitalizedName}HttpRequest.java.ftl
 *    At                   2018-02-22 17:08:03 BRT
 *----------------------------------------------------------------------------------------------------
 */

package org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.canon;

  
  
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.concurrent.Immutable;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;

import org.symphonyoss.s2.common.dom.json.ImmutableJsonArray;
import org.symphonyoss.s2.common.exception.BadFormatException;

import org.symphonyoss.s2.canon.runtime.IEntity;
import org.symphonyoss.s2.canon.runtime.JsonArrayParser;
import org.symphonyoss.s2.canon.runtime.exception.BadRequestException;
import org.symphonyoss.s2.canon.runtime.http.ParameterLocation;
import org.symphonyoss.s2.canon.runtime.http.RequestContext;
import org.symphonyoss.s2.canon.runtime.http.client.HttpParameter;

/* ====================================================================================================
 * Field Ref(cursor,uri=#/components/schemas/Cursor)
 *    field.name                    cursor
 *    field.camelName               cursor
 *    field.camelCapitalizedName    Cursor
 *    field.snakeName               cursor
 *    field.snakeCapitalizedName    Cursor
 *    field.elementType             Ref
 *    field.description             NULL
 *    field.baseSchema              String(Cursor)
 *    field.component               TypeDef(Cursor,type=String)
 *    field.elementSchema           String(Cursor)
 *    field.elementComponent        TypeDef(Cursor,type=String)
 *    field.canFailValidation       false
 *    field.format                  
 *    field.hasByteString           true
 *    field.hasCollections          false
 *    field.hasList                 false
 *    field.hasSet                  false
 *    field.isArraySchema           false
 *    field.isObjectSchema          false
 *    field.isComponent             true
 *    field.isTypeDef               true
 *
 *    javaClassName                 Cursor
 *    javaFullyQualifiedClassName   org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.Cursor
 *    javaFieldClassName            ByteString
 *    javaElementClassName          Cursor
 *    javaElementFieldClassName     ByteString
 *    fieldType                     Cursor
 *    fieldFQType                   org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.Cursor
 *    fieldCardinality              
 *    fieldBaseType                 ByteString
 *    fieldElementType              Cursor
 *    fieldElementFromBaseValue     Cursor.newBuilder().build(X)
 *    fieldBaseValueFromElement     X.getValue()
 *    fieldElementFQBuilder           
 *    fieldJsonFromElement          X
 *    isGenerated                   false
 *    isExternal                    false
 *    requiresChecks                true
 *    javaTypeCopy(X)               X
 *    javaBuilderTypeCopy(X)         = X
 *    javaGetValue(X)               X.getValue()
 *    javaConstructType(X)          Cursor.newBuilder().build(X)
 *    javaBuilderTypeNew            
 *    addJsonNode                   addIfNotNull
 *    javaCardinality               
 * ==================================================================================================*/
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.Cursor;
/* ====================================================================================================
 * Field Ref(limit,uri=#/components/schemas/CursorLimit)
 *    field.name                    limit
 *    field.camelName               limit
 *    field.camelCapitalizedName    Limit
 *    field.snakeName               limit
 *    field.snakeCapitalizedName    Limit
 *    field.elementType             Ref
 *    field.description             NULL
 *    field.baseSchema              Integer(CursorLimit,minimum=0,maximum=50)
 *    field.component               TypeDef(CursorLimit,type=Integer)
 *    field.elementSchema           Integer(CursorLimit,minimum=0,maximum=50)
 *    field.elementComponent        TypeDef(CursorLimit,type=Integer)
 *    field.canFailValidation       true
 *    field.format                  
 *    field.hasByteString           false
 *    field.hasCollections          false
 *    field.hasList                 false
 *    field.hasSet                  false
 *    field.isArraySchema           false
 *    field.isObjectSchema          false
 *    field.isComponent             true
 *    field.isTypeDef               true
 *
 *    javaClassName                 CursorLimit
 *    javaFullyQualifiedClassName   org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.CursorLimit
 *    javaFieldClassName            Integer
 *    javaElementClassName          CursorLimit
 *    javaElementFieldClassName     Integer
 *    fieldType                     CursorLimit
 *    fieldFQType                   org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.CursorLimit
 *    fieldCardinality              
 *    fieldBaseType                 Integer
 *    fieldElementType              CursorLimit
 *    fieldElementFromBaseValue     CursorLimit.newBuilder().build(X)
 *    fieldBaseValueFromElement     X.getValue()
 *    fieldElementFQBuilder           
 *    fieldJsonFromElement          X
 *    isGenerated                   false
 *    isExternal                    false
 *    requiresChecks                true
 *    javaTypeCopy(X)               X
 *    javaBuilderTypeCopy(X)         = X
 *    javaGetValue(X)               X.getValue()
 *    javaConstructType(X)          CursorLimit.newBuilder().build(X)
 *    javaBuilderTypeNew            
 *    addJsonNode                   addIfNotNull
 *    javaCardinality               
 * ==================================================================================================*/
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.CursorLimit;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.PodPage;

@Immutable
public class PodsGetHttpRequest extends PodsGetHttpRequestOrBuilder
{
  private final Cursor              cursor_;
  private final CursorLimit         limit_;
  private final HttpUriRequest      japiRequest_;
  
    private PodPage                   japiResult_;
  
  public PodsGetHttpRequest(PodsGetHttpRequestOrBuilder other)
  {
    super(other.getJapiClient());
    cursor_ = other.getCursor();
    limit_ = other.getLimit();
    
    RequestBuilder builder = RequestBuilder.get()
      .setUri(
        String.format("%s/pods",
          getJapiClient().getUri()
        )
      );
    if(cursor_ != null)
/* ====================================================================================================
 * Field Ref(cursor,uri=#/components/schemas/Cursor)
 *    field.name                    cursor
 *    field.camelName               cursor
 *    field.camelCapitalizedName    Cursor
 *    field.snakeName               cursor
 *    field.snakeCapitalizedName    Cursor
 *    field.elementType             Ref
 *    field.description             NULL
 *    field.baseSchema              String(Cursor)
 *    field.component               TypeDef(Cursor,type=String)
 *    field.elementSchema           String(Cursor)
 *    field.elementComponent        TypeDef(Cursor,type=String)
 *    field.canFailValidation       false
 *    field.format                  
 *    field.hasByteString           true
 *    field.hasCollections          false
 *    field.hasList                 false
 *    field.hasSet                  false
 *    field.isArraySchema           false
 *    field.isObjectSchema          false
 *    field.isComponent             true
 *    field.isTypeDef               true
 *
 *    javaClassName                 Cursor
 *    javaFullyQualifiedClassName   org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.Cursor
 *    javaFieldClassName            ByteString
 *    javaElementClassName          Cursor
 *    javaElementFieldClassName     ByteString
 *    fieldType                     Cursor
 *    fieldFQType                   org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.Cursor
 *    fieldCardinality              
 *    fieldBaseType                 ByteString
 *    fieldElementType              Cursor
 *    fieldElementFromBaseValue     Cursor.newBuilder().build(X)
 *    fieldBaseValueFromElement     X.getValue()
 *    fieldElementFQBuilder           
 *    fieldJsonFromElement          X
 *    isGenerated                   false
 *    isExternal                    false
 *    requiresChecks                true
 *    javaTypeCopy(X)               X
 *    javaBuilderTypeCopy(X)         = X
 *    javaGetValue(X)               X.getValue()
 *    javaConstructType(X)          Cursor.newBuilder().build(X)
 *    javaBuilderTypeNew            
 *    addJsonNode                   addIfNotNull
 *    javaCardinality               
 * ==================================================================================================*/
      builder.addParameter("cursor", asString(cursor_.getValue()));
    if(limit_ != null)
/* ====================================================================================================
 * Field Ref(limit,uri=#/components/schemas/CursorLimit)
 *    field.name                    limit
 *    field.camelName               limit
 *    field.camelCapitalizedName    Limit
 *    field.snakeName               limit
 *    field.snakeCapitalizedName    Limit
 *    field.elementType             Ref
 *    field.description             NULL
 *    field.baseSchema              Integer(CursorLimit,minimum=0,maximum=50)
 *    field.component               TypeDef(CursorLimit,type=Integer)
 *    field.elementSchema           Integer(CursorLimit,minimum=0,maximum=50)
 *    field.elementComponent        TypeDef(CursorLimit,type=Integer)
 *    field.canFailValidation       true
 *    field.format                  
 *    field.hasByteString           false
 *    field.hasCollections          false
 *    field.hasList                 false
 *    field.hasSet                  false
 *    field.isArraySchema           false
 *    field.isObjectSchema          false
 *    field.isComponent             true
 *    field.isTypeDef               true
 *
 *    javaClassName                 CursorLimit
 *    javaFullyQualifiedClassName   org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.CursorLimit
 *    javaFieldClassName            Integer
 *    javaElementClassName          CursorLimit
 *    javaElementFieldClassName     Integer
 *    fieldType                     CursorLimit
 *    fieldFQType                   org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.CursorLimit
 *    fieldCardinality              
 *    fieldBaseType                 Integer
 *    fieldElementType              CursorLimit
 *    fieldElementFromBaseValue     CursorLimit.newBuilder().build(X)
 *    fieldBaseValueFromElement     X.getValue()
 *    fieldElementFQBuilder           
 *    fieldJsonFromElement          X
 *    isGenerated                   false
 *    isExternal                    false
 *    requiresChecks                true
 *    javaTypeCopy(X)               X
 *    javaBuilderTypeCopy(X)         = X
 *    javaGetValue(X)               X.getValue()
 *    javaConstructType(X)          CursorLimit.newBuilder().build(X)
 *    javaBuilderTypeNew            
 *    addJsonNode                   addIfNotNull
 *    javaCardinality               
 * ==================================================================================================*/
      builder.addParameter("limit", asString(limit_.getValue()));
    japiRequest_ = builder.build();
  }
  
  @Override
  public Cursor getCursor()
  {
    return cursor_;
  }
  
  @Override
  public CursorLimit getLimit()
  {
    return limit_;
  }
  
  public @Nonnull PodPage execute(CloseableHttpClient httpClient) throws IOException
  {
    CloseableHttpResponse response = httpClient.execute(japiRequest_);
    try
    {
      HttpEntity entity = response.getEntity();
      
      System.err.println("Entity is streaming=" + entity.isStreaming());
      
      
      JsonArrayParser arrayParser = new JsonArrayParser()
      {
        
        @Override
        protected void handle(String input)
        {
          try
          {
            IEntity result = getJapiClient().getRegistry().parseOne(new StringReader(input));
            
            if(result instanceof PodPage)
            {
              japiResult_ = (PodPage) result;
            }
          }
          catch (BadFormatException | IOException e)
          {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
      };
      
      InputStream in = entity.getContent();
      byte[]      buf = new byte[1024];
      
      try
      {
        int nbytes;
        
        while((nbytes= in.read(buf)) != -1)
        {
          arrayParser.process(buf, nbytes);
        }
      }
      finally
      {
        arrayParser.close();
        in.close();
      }
      
    }
    finally
    {
      response.close();
    }
  
  return japiResult_;
  }
}
/*----------------------------------------------------------------------------------------------------
 * End of template template/java/Operation/${parent.camelCapitalizedName}${camelCapitalizedName}HttpRequest.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */
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
 *    Template name        template/java/Operation/${parent.camelCapitalizedName}${camelCapitalizedName}HttpRequestOrBuilder.java.ftl
 *    At                   2018-02-22 17:08:03 BRT
 *----------------------------------------------------------------------------------------------------
 */

package org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.canon;

  
  
import javax.annotation.concurrent.Immutable;

import org.symphonyoss.s2.common.dom.json.JsonArray;

import org.symphonyoss.s2.canon.runtime.http.client.HttpRequestOrBuilder;

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
  
@Immutable
public abstract class PodsGetHttpRequestOrBuilder extends HttpRequestOrBuilder<PodserviceHttpModelClient>
{
  public PodsGetHttpRequestOrBuilder(PodserviceHttpModelClient japiClient)
  {
    super(japiClient);
  }
  
  
  public abstract Cursor getCursor();
  
  public abstract CursorLimit getLimit();
}
/*----------------------------------------------------------------------------------------------------
 * End of template template/java/Operation/${parent.camelCapitalizedName}${camelCapitalizedName}HttpRequestOrBuilder.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */
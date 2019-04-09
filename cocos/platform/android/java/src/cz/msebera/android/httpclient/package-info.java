/*
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */

/**
 * Core HTTP component APIs and primitives.
 * <p>
 * These deal with the fundamental things required for using the
 * HTTP protocol, such as representing a
 * {@link cz.msebera.android.httpclient.HttpMessage message} including it's
 * {@link cz.msebera.android.httpclient.Header headers} and optional
 * {@link cz.msebera.android.httpclient.HttpEntity entity}, and
 * {@link cz.msebera.android.httpclient.HttpConnection connections}
 * over which messages are sent. In order to prepare messages
 * before sending or after receiving, there are interceptors for
 * {@link cz.msebera.android.httpclient.HttpRequestInterceptor requests} and
 * {@link cz.msebera.android.httpclient.HttpResponseInterceptor responses}.
 * </p>
 */
package cz.msebera.android.httpclient;

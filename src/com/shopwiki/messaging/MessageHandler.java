/*
 * Copyright [2012] [ShopWiki]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.shopwiki.messaging;

import org.codehaus.jackson.type.TypeReference;

import com.rabbitmq.client.AMQP.BasicProperties;

/**
 * @owner rstewart
 */
public interface MessageHandler<T> {

    // TODO: WHY doesn't this work ???
    //private final TypeReference<T> typeRef = new TypeReference<T>() { };
    // ...oh Well, make them implement one more method.
    TypeReference<T> getMessageType();

    void handleMessage(T message, BasicProperties properties);
}

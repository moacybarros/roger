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

import java.util.LinkedHashMap;

import org.codehaus.jackson.type.TypeReference;

/**
 * Mainly for debugging.
 * Better to make your own class extending BasicJsonMessage.
 *
 * @owner rstewart
 */
public class MapMessage extends LinkedHashMap<String,Object> {

    private static final long serialVersionUID = 2223888156798485002L;

    public static final TypeReference<MapMessage> TYPE_REF = new TypeReference<MapMessage>() { };

    @Override
    public String toString() {
        return MessagingUtil.prettyPrintMessage(this);
    }
}

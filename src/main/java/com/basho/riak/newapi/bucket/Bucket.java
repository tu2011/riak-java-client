/*
 * This file is provided to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.basho.riak.newapi.bucket;

import com.basho.riak.newapi.RiakException;
import com.basho.riak.newapi.IRiakObject;
import com.basho.riak.newapi.operations.DeleteObject;
import com.basho.riak.newapi.operations.FetchObject;
import com.basho.riak.newapi.operations.StoreObject;

/**
 * @author russell
 * 
 */
public interface Bucket extends BucketProperties {

    String getName();

    StoreObject<IRiakObject> store(String key, String value);

    <T> StoreObject<T> store(T o);

    <T> StoreObject<T> store(String key, T o);

    FetchObject<IRiakObject> fetch(String key);

    <T> FetchObject<T> fetch(String key, Class<T> type);

    <T> FetchObject<T> fetch(T o);

    <T> DeleteObject delete(T o);

    DeleteObject delete(String key);

    Iterable<String> keys() throws RiakException;
}

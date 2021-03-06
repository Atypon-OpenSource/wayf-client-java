/*
 * Copyright 2017 Atypon Systems, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.atypon.wayf.service.v1;

public interface WayfService {
    String PUBLISHER_API_TOKEN_HEADER = "Authorization";

    String LOCAL_ID_URL_PARAM = "localId";
    String IDP_ID = "id";

    String REGISTER_LOCAL_ID_URL = "/1/device/{localId}";
    String DEVICE_HISTORY_URL = "/1/device/{localId}/history";
    String ADD_IDENTITY_PROVIDER_USAGE_URL = "/1/device/{localId}/history/idp";
    String REMOVE_IDENTITY_PROVIDER_OPTION = "/1/device/{localId}/history/idp/{id}";

}

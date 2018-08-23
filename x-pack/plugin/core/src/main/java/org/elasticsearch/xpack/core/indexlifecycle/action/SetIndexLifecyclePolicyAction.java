/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */

package org.elasticsearch.xpack.core.indexlifecycle.action;

import org.elasticsearch.action.Action;
import org.elasticsearch.xpack.core.indexlifecycle.SetIndexLifecyclePolicyRequest;
import org.elasticsearch.xpack.core.indexlifecycle.SetIndexLifecyclePolicyResponse;
import org.elasticsearch.client.ElasticsearchClient;

public class SetIndexLifecyclePolicyAction
        extends Action<SetIndexLifecyclePolicyRequest, SetIndexLifecyclePolicyResponse, SetIndexLifecyclePolicyActionRequestBuilder> {

    public static final SetIndexLifecyclePolicyAction INSTANCE = new SetIndexLifecyclePolicyAction();
    public static final String NAME = "indices:admin/ilm/set_index_policy";

    protected SetIndexLifecyclePolicyAction() {
        super(NAME);
    }

    @Override
    public SetIndexLifecyclePolicyResponse newResponse() {
        return new SetIndexLifecyclePolicyResponse();
    }

    @Override
    public SetIndexLifecyclePolicyActionRequestBuilder newRequestBuilder(final ElasticsearchClient client) {
        return new SetIndexLifecyclePolicyActionRequestBuilder(client, INSTANCE);
    }

}

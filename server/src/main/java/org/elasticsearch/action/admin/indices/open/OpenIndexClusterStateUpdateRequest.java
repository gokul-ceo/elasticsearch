/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the "Elastic License
 * 2.0", the "GNU Affero General Public License v3.0 only", and the "Server Side
 * Public License v 1"; you may not use this file except in compliance with, at
 * your election, the "Elastic License 2.0", the "GNU Affero General Public
 * License v3.0 only", or the "Server Side Public License, v 1".
 */
package org.elasticsearch.action.admin.indices.open;

import org.elasticsearch.action.support.ActiveShardCount;
import org.elasticsearch.cluster.metadata.ProjectId;
import org.elasticsearch.core.TimeValue;
import org.elasticsearch.index.Index;

import java.util.Objects;

/**
 * Cluster state update request that allows to open one or more indices
 */
public record OpenIndexClusterStateUpdateRequest(
    TimeValue masterNodeTimeout,
    TimeValue ackTimeout,
    ProjectId projectId,
    ActiveShardCount waitForActiveShards,
    Index[] indices
) {
    public OpenIndexClusterStateUpdateRequest {
        Objects.requireNonNull(masterNodeTimeout);
        Objects.requireNonNull(ackTimeout);
        Objects.requireNonNull(projectId);
        Objects.requireNonNull(waitForActiveShards);
        Objects.requireNonNull(indices);
    }
}

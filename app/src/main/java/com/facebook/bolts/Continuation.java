package com.facebook.bolts;

/* JADX INFO: loaded from: classes4.dex */
public interface Continuation<TTaskResult, TContinuationResult> {
    TContinuationResult then(Task<TTaskResult> task) throws Exception;
}

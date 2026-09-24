package androidx.work.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface ExecutionListener {
    void onExecuted(String workSpecId, boolean needsReschedule);
}

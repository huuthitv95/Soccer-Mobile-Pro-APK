package com.vungle.ads.internal.task;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;

/* JADX INFO: compiled from: JobRunner.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m43475d2 = {"Lcom/vungle/ads/internal/task/JobRunner;", "", "cancelPendingJob", "", ViewHierarchyConstants.TAG_KEY, "", "execute", "jobInfo", "Lcom/vungle/ads/internal/task/JobInfo;", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public interface JobRunner {
    void cancelPendingJob(String tag);

    void execute(JobInfo jobInfo);
}

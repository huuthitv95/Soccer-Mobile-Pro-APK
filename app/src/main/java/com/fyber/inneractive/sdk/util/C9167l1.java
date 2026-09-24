package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.l1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9167l1 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final EnumC9164k1 f21462a;

    /* JADX INFO: renamed from: b */
    public final Uri f21463b;

    /* JADX INFO: renamed from: c */
    public final List f21464c;

    public C9167l1(EnumC9164k1 enumC9164k1, Uri uri, List list) {
        this.f21462a = enumC9164k1;
        this.f21463b = uri;
        this.f21464c = list;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f21462a.mPriority.compareTo(((C9167l1) obj).f21462a.mPriority);
    }
}

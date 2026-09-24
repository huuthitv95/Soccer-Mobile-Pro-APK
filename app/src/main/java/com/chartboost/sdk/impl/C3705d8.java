package com.chartboost.sdk.impl;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.d8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3705d8 implements InterfaceC3682c8 {

    /* JADX INFO: renamed from: a */
    public final File f13804a;

    /* JADX INFO: renamed from: b */
    public final File f13805b;

    /* JADX INFO: renamed from: c */
    public final File f13806c;

    public C3705d8(Context context, File precacheDirectory, File precacheQueueDirectory, File precachingInternalDirectory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(precacheDirectory, "precacheDirectory");
        Intrinsics.checkNotNullParameter(precacheQueueDirectory, "precacheQueueDirectory");
        Intrinsics.checkNotNullParameter(precachingInternalDirectory, "precachingInternalDirectory");
        this.f13804a = precacheDirectory;
        this.f13805b = precacheQueueDirectory;
        this.f13806c = precachingInternalDirectory;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3705d8(Context context, File file, File file2, File file3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        file = (i & 2) != 0 ? AbstractC3749f6.m17632b(context) : file;
        this(context, file, (i & 4) != 0 ? AbstractC3749f6.m17633c(context) : file2, (i & 8) != 0 ? new File(file, "exoplayer-cache") : file3);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3682c8
    /* JADX INFO: renamed from: a */
    public File mo17046a() {
        return this.f13805b;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3682c8
    /* JADX INFO: renamed from: a */
    public File mo17047a(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new File(mo17049c(), id);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3682c8
    /* JADX INFO: renamed from: b */
    public File mo17048b() {
        return this.f13806c;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3682c8
    /* JADX INFO: renamed from: c */
    public File mo17049c() {
        return this.f13804a;
    }
}

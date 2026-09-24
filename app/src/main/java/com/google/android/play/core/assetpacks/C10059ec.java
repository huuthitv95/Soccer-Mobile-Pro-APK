package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.play.core.assetpacks.internal.C10116o;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.ec */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10059ec {

    /* JADX INFO: renamed from: a */
    private static final C10116o f22334a = new C10116o("PackageStateCache");

    /* JADX INFO: renamed from: b */
    private final Context f22335b;

    /* JADX INFO: renamed from: c */
    private int f22336c = -1;

    C10059ec(Context context) {
        this.f22335b = context;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m22675a() {
        if (this.f22336c == -1) {
            try {
                this.f22336c = this.f22335b.getPackageManager().getPackageInfo(this.f22335b.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                f22334a.m22750b("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f22336c;
    }
}

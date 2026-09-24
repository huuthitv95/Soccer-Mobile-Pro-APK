package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.p */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10136p {

    /* JADX INFO: renamed from: a */
    private final Context f22469a;

    public C10136p(Context context) {
        this.f22469a = context;
    }

    /* JADX INFO: renamed from: b */
    static String m22792b(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    final Context m22793a() {
        return this.f22469a;
    }
}

package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.assetpacks.internal.C10087ag;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.d */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10029d {

    /* JADX INFO: renamed from: a */
    private static InterfaceC9948a f22228a;

    /* JADX INFO: renamed from: a */
    static synchronized InterfaceC9948a m22628a(Context context) {
        if (f22228a == null) {
            C10006cd c10006cd = new C10006cd(null);
            c10006cd.m22613b(new C10136p(C10087ag.m22706a(context)));
            f22228a = c10006cd.m22612a();
        }
        return f22228a;
    }
}

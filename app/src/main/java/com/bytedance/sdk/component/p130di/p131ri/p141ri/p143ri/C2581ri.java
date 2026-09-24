package com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri;

import android.content.Context;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ri.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2581ri extends C2580lr {

    /* JADX INFO: renamed from: ri */
    private static volatile C2581ri f7220ri;

    private C2581ri(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: ri */
    public static C2581ri m9484ri(Context context) {
        if (f7220ri == null) {
            synchronized (C2581ri.class) {
                if (f7220ri == null) {
                    f7220ri = new C2581ri(context);
                }
            }
        }
        return f7220ri;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.C2580lr
    /* JADX INFO: renamed from: ri */
    public /* bridge */ /* synthetic */ C2580lr.lr mo9475ri() {
        return super.mo9475ri();
    }
}

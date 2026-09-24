package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.assetpacks.internal.C10086af;
import com.google.android.play.core.assetpacks.internal.C10098ar;
import com.google.android.play.core.assetpacks.internal.InterfaceC10099as;
import com.google.android.play.core.assetpacks.internal.InterfaceC10102av;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.s */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10139s implements InterfaceC10099as {

    /* JADX INFO: renamed from: a */
    private final InterfaceC10102av f22471a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC10102av f22472b;

    public C10139s(InterfaceC10102av interfaceC10102av, InterfaceC10102av interfaceC10102av2) {
        this.f22471a = interfaceC10102av;
        this.f22472b = interfaceC10102av2;
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10102av
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo22526a() {
        Object objMo22526a = this.f22471a.mo22526a();
        Context contextM22795b = ((C10141u) this.f22472b).m22795b();
        C10130l c10130l = (C10130l) objMo22526a;
        C10086af.m22705a(contextM22795b.getPackageManager(), new ComponentName(contextM22795b.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        C10086af.m22705a(contextM22795b.getPackageManager(), new ComponentName(contextM22795b.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
        C10098ar.m22721a(c10130l);
        return c10130l;
    }
}

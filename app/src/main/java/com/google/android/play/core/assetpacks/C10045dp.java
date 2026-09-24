package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.assetpacks.internal.C10097aq;
import com.google.android.play.core.assetpacks.internal.C10101au;
import com.google.android.play.core.assetpacks.internal.InterfaceC10099as;
import com.google.android.play.core.assetpacks.internal.InterfaceC10102av;
import java.io.File;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.dp */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10045dp implements InterfaceC10099as {

    /* JADX INFO: renamed from: a */
    private final InterfaceC10102av f22287a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC10102av f22288b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC10102av f22289c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC10102av f22290d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC10102av f22291e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC10102av f22292f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC10102av f22293g;

    public C10045dp(InterfaceC10102av interfaceC10102av, InterfaceC10102av interfaceC10102av2, InterfaceC10102av interfaceC10102av3, InterfaceC10102av interfaceC10102av4, InterfaceC10102av interfaceC10102av5, InterfaceC10102av interfaceC10102av6, InterfaceC10102av interfaceC10102av7) {
        this.f22287a = interfaceC10102av;
        this.f22288b = interfaceC10102av2;
        this.f22289c = interfaceC10102av3;
        this.f22290d = interfaceC10102av4;
        this.f22291e = interfaceC10102av5;
        this.f22292f = interfaceC10102av6;
        this.f22293g = interfaceC10102av7;
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10102av
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo22526a() {
        String str = (String) this.f22287a.mo22526a();
        Object objMo22526a = this.f22288b.mo22526a();
        Object objMo22526a2 = this.f22289c.mo22526a();
        Context contextM22795b = ((C10141u) this.f22290d).m22795b();
        Object objMo22526a3 = this.f22291e.mo22526a();
        return new C10044do(str != null ? new File(contextM22795b.getExternalFilesDir(null), str) : contextM22795b.getExternalFilesDir(null), (C9977bb) objMo22526a, (C10017co) objMo22526a2, contextM22795b, (C10059ec) objMo22526a3, C10097aq.m22720c(C10101au.m22722a(this.f22292f)), (C10057ea) this.f22293g.mo22526a());
    }
}

package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Df */
/* JADX INFO: loaded from: classes6.dex */
public final class C11405Df {

    /* JADX INFO: renamed from: a */
    private final String f24225a;

    /* JADX INFO: renamed from: b */
    private final String f24226b;

    /* JADX INFO: renamed from: c */
    private final boolean f24227c;

    /* JADX INFO: renamed from: d */
    private final Boolean f24228d;

    public C11405Df(String str, boolean z, Boolean bool, String str2) {
        this.f24225a = str2;
        this.f24226b = str;
        this.f24227c = z;
        this.f24228d = bool;
    }

    /* JADX INFO: renamed from: a */
    public final String m25633a() {
        return this.f24225a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m25635b() {
        return Intrinsics.areEqual(this.f24228d, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m25634a(NetworkSettings networkSettings, IronSource.EnumC12328a adUnit) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        String str = this.f24226b;
        if (str == null || str.length() == 0) {
            return true;
        }
        C11459Gf c11459Gf = C11459Gf.f24392a;
        return Intrinsics.areEqual(c11459Gf.m25935a(networkSettings), this.f24226b) && c11459Gf.m25942a(networkSettings, adUnit) == this.f24227c;
    }

    public /* synthetic */ C11405Df(String str, boolean z, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? null : str2);
    }
}

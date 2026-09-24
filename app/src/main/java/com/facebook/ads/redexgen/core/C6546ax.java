package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ax */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6546ax implements InterfaceC6071TC {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ C6537ao A01;

    public C6546ax(C6537ao c6537ao, AdvertisingId advertisingId) {
        this.A01 = c6537ao;
        this.A00 = advertisingId;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6071TC
    public final boolean AAX() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6071TC
    public final String getId() {
        return this.A00.getId();
    }
}

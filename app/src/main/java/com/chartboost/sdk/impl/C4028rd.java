package com.chartboost.sdk.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.rd */
/* JADX INFO: loaded from: classes3.dex */
public final class C4028rd {

    /* JADX INFO: renamed from: a */
    public boolean f16173a;

    /* JADX INFO: renamed from: b */
    public final ConnectivityManager f16174b;

    /* JADX INFO: renamed from: c */
    public a f16175c;

    /* JADX INFO: renamed from: d */
    public final b f16176d;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.rd$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo18031a();

        /* JADX INFO: renamed from: b */
        void mo18033b();
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.rd$b */
    public static final class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001d  */
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            boolean z;
            a aVar;
            Intrinsics.checkNotNullParameter(network, "network");
            NetworkCapabilities networkCapabilities = C4028rd.this.f16174b.getNetworkCapabilities(network);
            C4028rd c4028rd = C4028rd.this;
            if (networkCapabilities != null) {
                z = networkCapabilities.hasCapability(12);
            }
            c4028rd.f16173a = z;
            if (!C4028rd.this.f16173a || (aVar = C4028rd.this.f16175c) == null) {
                return;
            }
            aVar.mo18031a();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            C4028rd.this.f16173a = false;
            a aVar = C4028rd.this.f16175c;
            if (aVar != null) {
                aVar.mo18033b();
            }
        }
    }

    public C4028rd(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f16174b = (ConnectivityManager) systemService;
        this.f16176d = new b();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19335a(C4028rd c4028rd, a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        c4028rd.m19339a(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002e  */
    /* JADX INFO: renamed from: a */
    public final void m19339a(a aVar) {
        boolean z;
        this.f16175c = aVar;
        this.f16174b.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), this.f16176d);
        NetworkCapabilities networkCapabilities = this.f16174b.getNetworkCapabilities(this.f16174b.getActiveNetwork());
        if (networkCapabilities != null) {
            z = networkCapabilities.hasCapability(12);
        }
        this.f16173a = z;
        if (!z || aVar == null) {
            return;
        }
        aVar.mo18031a();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19340a() {
        return this.f16173a;
    }

    /* JADX INFO: renamed from: b */
    public final void m19341b() {
        this.f16174b.unregisterNetworkCallback(this.f16176d);
        this.f16175c = null;
    }
}

package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.security.ProviderInstaller;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ef */
/* JADX INFO: loaded from: classes3.dex */
public final class C3735ef implements ProviderInstaller.ProviderInstallListener {

    /* JADX INFO: renamed from: a */
    public final Context f14082a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3945ni f14083b;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ef$a */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m17568a() {
            try {
                ProviderInstaller.installIfNeededAsync(C3735ef.this.f14082a, C3735ef.this);
            } catch (Exception e) {
                C4048sb.m19410b("ProviderInstaller", e);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17568a();
            return Unit.INSTANCE;
        }
    }

    public C3735ef(Context context, InterfaceC3945ni uiPoster) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        this.f14082a = context;
        this.f14083b = uiPoster;
    }

    /* JADX INFO: renamed from: a */
    public final void m17566a() {
        if (m17567b()) {
            this.f14083b.mo18805a(new a());
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17567b() {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f14082a) == 0;
        } catch (Exception e) {
            C4048sb.m19410b("GoogleApiAvailability error", e);
            return false;
        }
    }

    @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
    public void onProviderInstallFailed(int i, Intent intent) {
        C4048sb.m19417e("ProviderInstaller onProviderInstallFailed: " + i + " ProviderInstaller is unable to install an updated Provider, your device's security provider might be vulnerable to known exploits. Your app should behave as if all HTTP communication is unencrypted.", null, 2, null);
    }

    @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
    public void onProviderInstalled() {
        C4048sb.m19411b("ProviderInstaller onProviderInstalled", (Throwable) null, 2, (Object) null);
    }
}

package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.internal.AbstractC10115n;
import com.google.android.play.core.assetpacks.internal.C10097aq;
import com.google.android.play.core.assetpacks.internal.C10116o;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.bb */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9977bb extends AbstractC10115n {

    /* JADX INFO: renamed from: c */
    private final C10034de f22045c;

    /* JADX INFO: renamed from: d */
    private final C10014cl f22046d;

    /* JADX INFO: renamed from: e */
    private final C9999bx f22047e;

    /* JADX INFO: renamed from: f */
    private final C10017co f22048f;

    /* JADX INFO: renamed from: g */
    private final C10057ea f22049g;

    /* JADX INFO: renamed from: h */
    private final Handler f22050h;

    /* JADX INFO: renamed from: i */
    private final C10097aq f22051i;

    /* JADX INFO: renamed from: j */
    private final C10097aq f22052j;

    /* JADX INFO: renamed from: k */
    private final C10097aq f22053k;

    C9977bb(Context context, C10034de c10034de, C10014cl c10014cl, C10097aq c10097aq, C10017co c10017co, C9999bx c9999bx, C10097aq c10097aq2, C10097aq c10097aq3, C10057ea c10057ea) {
        super(new C10116o("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f22050h = new Handler(Looper.getMainLooper());
        this.f22045c = c10034de;
        this.f22046d = c10014cl;
        this.f22051i = c10097aq;
        this.f22048f = c10017co;
        this.f22047e = c9999bx;
        this.f22052j = c10097aq2;
        this.f22053k = c10097aq3;
        this.f22049g = c10057ea;
    }

    /* JADX INFO: renamed from: a */
    final /* synthetic */ void m22531a(Bundle bundle) {
        if (this.f22045c.m22649p(bundle)) {
            this.f22046d.m22622a();
        }
    }

    /* JADX INFO: renamed from: b */
    final /* synthetic */ void m22532b(Bundle bundle, AssetPackState assetPackState) {
        if (this.f22045c.m22648o(bundle)) {
            m22534d(assetPackState);
            ((InterfaceC10145y) this.f22051i.mo22526a()).mo22521f();
        }
    }

    @Override // com.google.android.play.core.assetpacks.internal.AbstractC10115n
    /* JADX INFO: renamed from: c */
    protected final void mo22533c(Context context, Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra == null) {
            this.f22407a.m22750b("Empty bundle received from broadcast.", new Object[0]);
            return;
        }
        ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.size() != 1) {
            this.f22407a.m22750b("Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        final AssetPackState assetPackStateM22477b = AssetPackState.m22477b(bundleExtra, stringArrayList.get(0), this.f22048f, this.f22049g, new InterfaceC9980be() { // from class: com.google.android.play.core.assetpacks.bd
            @Override // com.google.android.play.core.assetpacks.InterfaceC9980be
            /* JADX INFO: renamed from: a */
            public final int mo22535a(int i, String str) {
                return i;
            }
        });
        this.f22407a.m22749a("ListenerRegistryBroadcastReceiver.onReceive: %s", assetPackStateM22477b);
        PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
        if (pendingIntent != null) {
            this.f22047e.m22610b(pendingIntent);
        }
        ((Executor) this.f22053k.mo22526a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.az
            @Override // java.lang.Runnable
            public final void run() {
                this.f22034a.m22532b(bundleExtra, assetPackStateM22477b);
            }
        });
        ((Executor) this.f22052j.mo22526a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.ba
            @Override // java.lang.Runnable
            public final void run() {
                this.f22043a.m22531a(bundleExtra);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    final void m22534d(final AssetPackState assetPackState) {
        this.f22050h.post(new Runnable() { // from class: com.google.android.play.core.assetpacks.ay
            @Override // java.lang.Runnable
            public final void run() {
                this.f22032a.m22746i(assetPackState);
            }
        });
    }
}

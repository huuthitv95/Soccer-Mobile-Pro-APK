package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.p278ui.controller.InterfaceC9125c;
import com.fyber.inneractive.sdk.util.C9142d0;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.EnumC9150g;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.g0 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC8466g0 extends InterfaceC9125c {
    /* JADX INFO: renamed from: a */
    C9142d0 mo20884a(C9152g1 c9152g1, EnumC9150g enumC9150g);

    /* JADX INFO: renamed from: a */
    C9142d0 mo20885a(String str, C9152g1 c9152g1, boolean z);

    /* JADX INFO: renamed from: a */
    void mo20886a(int i, boolean z);

    /* JADX INFO: renamed from: a */
    void mo20887a(View view);

    /* JADX INFO: renamed from: a */
    void mo20888a(View view, String str);

    /* JADX INFO: renamed from: a */
    void mo20889a(String str, String str2);

    /* JADX INFO: renamed from: a */
    void mo20890a(boolean z);

    /* JADX INFO: renamed from: a */
    void mo20891a(boolean z, Orientation orientation);

    /* JADX INFO: renamed from: c */
    void mo20892c();

    /* JADX INFO: renamed from: e */
    void mo20893e();

    /* JADX INFO: renamed from: f */
    void mo20894f();

    /* JADX INFO: renamed from: g */
    void mo20895g();

    /* JADX INFO: renamed from: h */
    void mo20896h();

    /* JADX INFO: renamed from: i */
    void mo20897i();

    /* JADX INFO: renamed from: j */
    void mo20898j();

    /* JADX INFO: renamed from: o */
    EnumC8253m mo20899o();

    void onPlayerError();

    void onProgress(int i, int i2);
}

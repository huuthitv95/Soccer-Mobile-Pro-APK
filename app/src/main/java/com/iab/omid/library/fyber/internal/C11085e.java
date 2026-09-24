package com.iab.omid.library.fyber.internal;

import android.view.View;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.fyber.weakreference.C11119a;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.internal.e */
/* JADX INFO: loaded from: classes6.dex */
public class C11085e {

    /* JADX INFO: renamed from: a */
    private final C11119a f23117a;

    /* JADX INFO: renamed from: b */
    private final String f23118b;

    /* JADX INFO: renamed from: c */
    private final FriendlyObstructionPurpose f23119c;

    /* JADX INFO: renamed from: d */
    private final String f23120d;

    public C11085e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f23117a = new C11119a(view);
        this.f23118b = view.getClass().getCanonicalName();
        this.f23119c = friendlyObstructionPurpose;
        this.f23120d = str;
    }

    /* JADX INFO: renamed from: a */
    public String m23996a() {
        return this.f23120d;
    }

    /* JADX INFO: renamed from: b */
    public FriendlyObstructionPurpose m23997b() {
        return this.f23119c;
    }

    /* JADX INFO: renamed from: c */
    public C11119a m23998c() {
        return this.f23117a;
    }

    /* JADX INFO: renamed from: d */
    public String m23999d() {
        return this.f23118b;
    }
}

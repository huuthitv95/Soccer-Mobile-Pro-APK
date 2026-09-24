package com.iab.omid.library.chartboost.internal;

import android.view.View;
import com.iab.omid.library.chartboost.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.chartboost.weakreference.C11067a;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.internal.e */
/* JADX INFO: loaded from: classes6.dex */
public class C11033e {

    /* JADX INFO: renamed from: a */
    private final C11067a f22982a;

    /* JADX INFO: renamed from: b */
    private final String f22983b;

    /* JADX INFO: renamed from: c */
    private final FriendlyObstructionPurpose f22984c;

    /* JADX INFO: renamed from: d */
    private final String f22985d;

    public C11033e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f22982a = new C11067a(view);
        this.f22983b = view.getClass().getCanonicalName();
        this.f22984c = friendlyObstructionPurpose;
        this.f22985d = str;
    }

    /* JADX INFO: renamed from: a */
    public String m23739a() {
        return this.f22985d;
    }

    /* JADX INFO: renamed from: b */
    public FriendlyObstructionPurpose m23740b() {
        return this.f22984c;
    }

    /* JADX INFO: renamed from: c */
    public C11067a m23741c() {
        return this.f22982a;
    }

    /* JADX INFO: renamed from: d */
    public String m23742d() {
        return this.f22983b;
    }
}

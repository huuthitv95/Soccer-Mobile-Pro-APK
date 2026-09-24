package com.iab.omid.library.mmadbridge.internal;

import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.weakreference.C11221a;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.internal.e */
/* JADX INFO: loaded from: classes6.dex */
public class C11187e {

    /* JADX INFO: renamed from: a */
    private final C11221a f23387a;

    /* JADX INFO: renamed from: b */
    private final String f23388b;

    /* JADX INFO: renamed from: c */
    private final FriendlyObstructionPurpose f23389c;

    /* JADX INFO: renamed from: d */
    private final String f23390d;

    public C11187e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f23387a = new C11221a(view);
        this.f23388b = view.getClass().getCanonicalName();
        this.f23389c = friendlyObstructionPurpose;
        this.f23390d = str;
    }

    /* JADX INFO: renamed from: a */
    public String m24502a() {
        return this.f23390d;
    }

    /* JADX INFO: renamed from: b */
    public FriendlyObstructionPurpose m24503b() {
        return this.f23389c;
    }

    /* JADX INFO: renamed from: c */
    public C11221a m24504c() {
        return this.f23387a;
    }

    /* JADX INFO: renamed from: d */
    public String m24505d() {
        return this.f23388b;
    }
}

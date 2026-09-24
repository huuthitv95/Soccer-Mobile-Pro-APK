package com.iab.omid.library.applovin.internal;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.applovin.weakreference.C10965a;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.internal.e */
/* JADX INFO: loaded from: classes6.dex */
public class C10931e {

    /* JADX INFO: renamed from: a */
    private final C10965a f22712a;

    /* JADX INFO: renamed from: b */
    private final String f22713b;

    /* JADX INFO: renamed from: c */
    private final FriendlyObstructionPurpose f22714c;

    /* JADX INFO: renamed from: d */
    private final String f22715d;

    public C10931e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f22712a = new C10965a(view);
        this.f22713b = view.getClass().getCanonicalName();
        this.f22714c = friendlyObstructionPurpose;
        this.f22715d = str;
    }

    /* JADX INFO: renamed from: a */
    public String m23239a() {
        return this.f22715d;
    }

    /* JADX INFO: renamed from: b */
    public FriendlyObstructionPurpose m23240b() {
        return this.f22714c;
    }

    /* JADX INFO: renamed from: c */
    public C10965a m23241c() {
        return this.f22712a;
    }

    /* JADX INFO: renamed from: d */
    public String m23242d() {
        return this.f22713b;
    }
}

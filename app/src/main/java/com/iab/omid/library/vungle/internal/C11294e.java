package com.iab.omid.library.vungle.internal;

import android.view.View;
import com.iab.omid.library.vungle.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.vungle.weakreference.C11331a;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.internal.e */
/* JADX INFO: loaded from: classes6.dex */
public class C11294e {

    /* JADX INFO: renamed from: a */
    private final C11331a f23675a;

    /* JADX INFO: renamed from: b */
    private final String f23676b;

    /* JADX INFO: renamed from: c */
    private final FriendlyObstructionPurpose f23677c;

    /* JADX INFO: renamed from: d */
    private final String f23678d;

    public C11294e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f23675a = new C11331a(view);
        this.f23676b = view.getClass().getCanonicalName();
        this.f23677c = friendlyObstructionPurpose;
        this.f23678d = str;
    }

    /* JADX INFO: renamed from: a */
    public String m25018a() {
        return this.f23678d;
    }

    /* JADX INFO: renamed from: b */
    public FriendlyObstructionPurpose m25019b() {
        return this.f23677c;
    }

    /* JADX INFO: renamed from: c */
    public C11331a m25020c() {
        return this.f23675a;
    }

    /* JADX INFO: renamed from: d */
    public String m25021d() {
        return this.f23676b;
    }
}

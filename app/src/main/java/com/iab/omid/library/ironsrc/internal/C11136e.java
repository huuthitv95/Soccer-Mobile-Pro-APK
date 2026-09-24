package com.iab.omid.library.ironsrc.internal;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.ironsrc.weakreference.C11170a;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.internal.e */
/* JADX INFO: loaded from: classes6.dex */
public class C11136e {

    /* JADX INFO: renamed from: a */
    private final C11170a f23252a;

    /* JADX INFO: renamed from: b */
    private final String f23253b;

    /* JADX INFO: renamed from: c */
    private final FriendlyObstructionPurpose f23254c;

    /* JADX INFO: renamed from: d */
    private final String f23255d;

    public C11136e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f23252a = new C11170a(view);
        this.f23253b = view.getClass().getCanonicalName();
        this.f23254c = friendlyObstructionPurpose;
        this.f23255d = str;
    }

    /* JADX INFO: renamed from: a */
    public String m24249a() {
        return this.f23255d;
    }

    /* JADX INFO: renamed from: b */
    public FriendlyObstructionPurpose m24250b() {
        return this.f23254c;
    }

    /* JADX INFO: renamed from: c */
    public C11170a m24251c() {
        return this.f23252a;
    }

    /* JADX INFO: renamed from: d */
    public String m24252d() {
        return this.f23253b;
    }
}

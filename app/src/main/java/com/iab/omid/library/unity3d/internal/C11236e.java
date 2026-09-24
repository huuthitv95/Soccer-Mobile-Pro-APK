package com.iab.omid.library.unity3d.internal;

import android.view.View;
import com.iab.omid.library.unity3d.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.unity3d.weakreference.C11267a;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.internal.e */
/* JADX INFO: loaded from: classes6.dex */
public class C11236e {

    /* JADX INFO: renamed from: a */
    private final C11267a f23523a;

    /* JADX INFO: renamed from: b */
    private final String f23524b;

    /* JADX INFO: renamed from: c */
    private final FriendlyObstructionPurpose f23525c;

    /* JADX INFO: renamed from: d */
    private final String f23526d;

    public C11236e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f23523a = new C11267a(view);
        this.f23524b = view.getClass().getCanonicalName();
        this.f23525c = friendlyObstructionPurpose;
        this.f23526d = str;
    }

    /* JADX INFO: renamed from: a */
    public String m24758a() {
        return this.f23526d;
    }

    /* JADX INFO: renamed from: b */
    public FriendlyObstructionPurpose m24759b() {
        return this.f23525c;
    }

    /* JADX INFO: renamed from: c */
    public C11267a m24760c() {
        return this.f23523a;
    }

    /* JADX INFO: renamed from: d */
    public String m24761d() {
        return this.f23524b;
    }
}

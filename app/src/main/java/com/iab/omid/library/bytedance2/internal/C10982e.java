package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.weakreference.C11015a;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.internal.e */
/* JADX INFO: loaded from: classes6.dex */
public class C10982e {

    /* JADX INFO: renamed from: a */
    private final C11015a f22847a;

    /* JADX INFO: renamed from: b */
    private final String f22848b;

    /* JADX INFO: renamed from: c */
    private final FriendlyObstructionPurpose f22849c;

    /* JADX INFO: renamed from: d */
    private final String f22850d;

    public C10982e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f22847a = new C11015a(view);
        this.f22848b = view.getClass().getCanonicalName();
        this.f22849c = friendlyObstructionPurpose;
        this.f22850d = str;
    }

    /* JADX INFO: renamed from: a */
    public String m23492a() {
        return this.f22850d;
    }

    /* JADX INFO: renamed from: b */
    public FriendlyObstructionPurpose m23493b() {
        return this.f22849c;
    }

    /* JADX INFO: renamed from: c */
    public C11015a m23494c() {
        return this.f22847a;
    }

    /* JADX INFO: renamed from: d */
    public String m23495d() {
        return this.f22848b;
    }
}

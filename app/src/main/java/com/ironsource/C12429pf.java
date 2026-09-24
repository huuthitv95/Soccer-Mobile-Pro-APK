package com.ironsource;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: renamed from: com.ironsource.pf */
/* JADX INFO: loaded from: classes6.dex */
public final class C12429pf implements InterfaceC12108b4 {

    /* JADX INFO: renamed from: a */
    private Activity f31726a;

    /* JADX INFO: renamed from: b */
    private Context f31727b;

    @Override // com.ironsource.InterfaceC12108b4
    /* JADX INFO: renamed from: a */
    public Activity mo26309a() {
        return this.f31726a;
    }

    @Override // com.ironsource.InterfaceC12108b4
    /* JADX INFO: renamed from: b */
    public Context mo26312b() {
        return this.f31727b;
    }

    @Override // com.ironsource.InterfaceC12108b4
    /* JADX INFO: renamed from: a */
    public void mo26310a(Activity activity) {
        this.f31726a = activity;
    }

    @Override // com.ironsource.InterfaceC12108b4
    /* JADX INFO: renamed from: a */
    public void mo26311a(Context context) {
        this.f31727b = context;
    }
}

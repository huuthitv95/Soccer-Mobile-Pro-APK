package com.ironsource.adqualitysdk.sdk.p286i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hr */
/* JADX INFO: loaded from: classes6.dex */
public final class C12015hr {

    /* JADX INFO: renamed from: ﻛ */
    private List<List<Field>> f29211;

    /* JADX INFO: renamed from: ﾇ */
    private int f29212;

    public C12015hr() {
        ArrayList arrayList = new ArrayList();
        this.f29211 = arrayList;
        int i = (-1) + 1;
        this.f29212 = i;
        arrayList.add(i, new ArrayList());
    }

    /* JADX INFO: renamed from: ﻛ */
    final void m30316(Field field) {
        this.f29211.get(this.f29212).add(field);
    }

    /* JADX INFO: renamed from: ﾇ */
    final void m30318(Field field) {
        this.f29211.get(this.f29212).remove(field);
    }

    /* JADX INFO: renamed from: ｋ */
    final void m30317() {
        int i = this.f29212 + 1;
        this.f29212 = i;
        this.f29211.add(i, new ArrayList());
    }

    /* JADX INFO: renamed from: ﾒ */
    final void m30319() {
        this.f29211.remove(this.f29212);
        this.f29212--;
    }

    /* JADX INFO: renamed from: ﻐ */
    final List<List<Field>> m30315() {
        return this.f29211;
    }
}

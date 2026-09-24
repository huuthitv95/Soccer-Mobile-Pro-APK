package com.fyber.inneractive.sdk.flow.endcard;

import android.os.Build;
import com.fyber.inneractive.sdk.model.vast.EnumC8300i;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.m */
/* JADX INFO: loaded from: classes4.dex */
public final class C8107m {

    /* JADX INFO: renamed from: a */
    public final ArrayList f18036a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f18037b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public int f18038c = -1;

    /* JADX INFO: renamed from: d */
    public final C8089g f18039d = new C8089g();

    /* JADX INFO: renamed from: a */
    public final AbstractC8084b m20530a() {
        int i = this.f18038c;
        if (i >= 0) {
            return (AbstractC8084b) this.f18036a.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC8084b m20531a(EnumC8300i enumC8300i) {
        for (AbstractC8084b abstractC8084b : this.f18037b) {
            if (abstractC8084b.mo20513i() == enumC8300i) {
                return abstractC8084b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m20532a(AbstractC8084b abstractC8084b) {
        if (((abstractC8084b instanceof C8109o) || (abstractC8084b instanceof C8086d)) && this.f18036a.contains(abstractC8084b)) {
            return;
        }
        this.f18036a.add(abstractC8084b);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f18036a.sort(this.f18039d);
        } else {
            Collections.sort(this.f18036a, this.f18039d);
        }
    }
}

package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.web.AbstractC9239i0;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.mraid.f */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8328f {

    /* JADX INFO: renamed from: a */
    public String f18600a;

    /* JADX INFO: renamed from: b */
    public final Map f18601b;

    /* JADX INFO: renamed from: c */
    public final AbstractC9239i0 f18602c;

    /* JADX INFO: renamed from: d */
    public final C9152g1 f18603d;

    public AbstractC8328f(Map map, AbstractC9239i0 abstractC9239i0, C9152g1 c9152g1) {
        this.f18601b = map;
        this.f18603d = c9152g1;
        this.f18602c = abstractC9239i0;
    }

    /* JADX INFO: renamed from: a */
    public final int m20720a(String str) {
        String str2 = (String) this.f18601b.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str2, 10);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo20721a();

    /* JADX INFO: renamed from: b */
    public abstract boolean mo20717b();
}

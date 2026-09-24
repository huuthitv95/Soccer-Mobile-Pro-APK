package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.AbstractC7945a;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.response.b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9084b {

    /* JADX INFO: renamed from: a */
    public AbstractC9087e f21280a;

    /* JADX INFO: renamed from: b */
    public String f21281b;

    /* JADX INFO: renamed from: c */
    public InterfaceC9092j f21282c;

    /* JADX INFO: renamed from: d */
    public boolean f21283d = true;

    /* JADX INFO: renamed from: a */
    public abstract AbstractC9087e mo21885a();

    /* JADX INFO: renamed from: a */
    public final AbstractC9087e m21886a(String str) throws Exception {
        this.f21283d = str != null;
        AbstractC9087e abstractC9087e = this.f21280a;
        abstractC9087e.getClass();
        abstractC9087e.f21303c = System.currentTimeMillis();
        this.f21282c.mo20335a(this);
        String strMo20333a = this.f21282c.mo20333a();
        this.f21280a.f21308h = strMo20333a;
        C8028r0 c8028r0M20382a = AbstractC7945a.m20382a(this.f21281b);
        IAlog.m21945a("%sGot unit config for unitId: %s from config manager", IAlog.m21943a(this), this.f21281b);
        IAlog.m21945a("%s%s", IAlog.m21943a(this), c8028r0M20382a);
        if (this.f21283d) {
            mo21887a(str, c8028r0M20382a);
        } else if (this instanceof C9094l) {
            mo21887a(strMo20333a, c8028r0M20382a);
        } else {
            C9090h c9090h = new C9090h(strMo20333a);
            if (c9090h.f21334a) {
                String str2 = c9090h.f21335b;
                if (str2 == null || TextUtils.isEmpty(str2.trim())) {
                    throw new Exception("empty ad content detected. failing fast.");
                }
                mo21887a(str2, c8028r0M20382a);
            }
        }
        return this.f21280a;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo21887a(String str, C8028r0 c8028r0);

    /* JADX INFO: renamed from: b */
    public boolean mo21888b() {
        return this instanceof C9085c;
    }
}

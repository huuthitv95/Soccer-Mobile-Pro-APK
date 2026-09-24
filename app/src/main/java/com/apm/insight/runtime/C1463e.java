package com.apm.insight.runtime;

import com.apm.insight.C1390e;
import com.apm.insight.entity.Header;

/* JADX INFO: renamed from: com.apm.insight.runtime.e */
/* JADX INFO: compiled from: ConfigPropGetter.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1463e {

    /* JADX INFO: renamed from: b */
    private static final C1463e f852b = new C1463e() { // from class: com.apm.insight.runtime.e.1

        /* JADX INFO: renamed from: a */
        private Header f854a = null;

        @Override // com.apm.insight.runtime.C1463e
        /* JADX INFO: renamed from: b */
        public final Object mo1634b(String str) {
            if (this.f854a == null) {
                this.f854a = Header.m1064b(C1390e.m1032g());
            }
            return this.f854a.m1076f().opt(str);
        }
    };

    /* JADX INFO: renamed from: a */
    private C1463e f853a;

    C1463e() {
        this(f852b);
    }

    private C1463e(C1463e c1463e) {
        this.f853a = c1463e;
    }

    /* JADX INFO: renamed from: a */
    public Object mo1525a(String str) {
        C1463e c1463e = this.f853a;
        if (c1463e != null) {
            return c1463e.mo1525a(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public Object mo1634b(String str) {
        C1463e c1463e = this.f853a;
        if (c1463e != null) {
            return c1463e.mo1634b(str);
        }
        return null;
    }
}

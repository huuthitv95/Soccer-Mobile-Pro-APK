package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.config.global.AbstractC8004p;
import com.fyber.inneractive.sdk.config.global.C7999k;
import com.fyber.inneractive.sdk.config.global.InterfaceC8002n;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.global.features.i */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7981i extends AbstractC8004p {

    /* JADX INFO: renamed from: b */
    public String f17757b;

    /* JADX INFO: renamed from: c */
    public HashMap f17758c = new HashMap();

    /* JADX INFO: renamed from: d */
    public HashMap f17759d = new HashMap();

    public AbstractC7981i(String str) {
        this.f17757b = str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x002d A[RETURN] */
    @Override // com.fyber.inneractive.sdk.config.global.AbstractC8004p, com.fyber.inneractive.sdk.config.global.InterfaceC8002n
    /* JADX INFO: renamed from: a */
    public final Integer mo20416a(String str) {
        Integer numMo20416a;
        Iterator it = this.f17759d.keySet().iterator();
        while (it.hasNext()) {
            numMo20416a = ((C7999k) this.f17759d.get((String) it.next())).mo20416a(str);
            if (numMo20416a != null) {
                if (numMo20416a == null) {
                    return super.mo20416a(str);
                }
                return numMo20416a;
            }
        }
        numMo20416a = null;
        if (numMo20416a == null) {
            return super.mo20416a(str);
        }
        return numMo20416a;
    }

    @Override // com.fyber.inneractive.sdk.config.global.AbstractC8004p, com.fyber.inneractive.sdk.config.global.InterfaceC8002n
    /* JADX INFO: renamed from: a */
    public final String mo20417a(String str, String str2) {
        String strMo20419b;
        Iterator it = this.f17759d.keySet().iterator();
        do {
            if (!it.hasNext()) {
                strMo20419b = null;
                break;
            }
            strMo20419b = ((C7999k) this.f17759d.get((String) it.next())).mo20419b(str);
        } while (strMo20419b == null);
        if (strMo20419b != null) {
            return strMo20419b;
        }
        InterfaceC8002n interfaceC8002n = this.f17772a;
        return interfaceC8002n != null ? interfaceC8002n.mo20417a(str, str2) : str2;
    }

    /* JADX INFO: renamed from: a */
    public final void m20418a(AbstractC7981i abstractC7981i) {
        abstractC7981i.f17757b = this.f17757b;
        abstractC7981i.f17772a = this.f17772a;
        abstractC7981i.f17758c = new HashMap(this.f17758c);
        abstractC7981i.f17759d = new HashMap(this.f17759d);
    }

    /* JADX INFO: renamed from: b */
    public abstract AbstractC7981i mo20413b();

    @Override // com.fyber.inneractive.sdk.config.global.AbstractC8004p, com.fyber.inneractive.sdk.config.global.InterfaceC8002n
    /* JADX INFO: renamed from: b */
    public final String mo20419b(String str) {
        return mo20417a(str, null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x002d A[RETURN] */
    @Override // com.fyber.inneractive.sdk.config.global.AbstractC8004p, com.fyber.inneractive.sdk.config.global.InterfaceC8002n
    /* JADX INFO: renamed from: c */
    public final Boolean mo20420c(String str) {
        Boolean boolMo20420c;
        Iterator it = this.f17759d.keySet().iterator();
        while (it.hasNext()) {
            boolMo20420c = ((C7999k) this.f17759d.get((String) it.next())).mo20420c(str);
            if (boolMo20420c != null) {
                if (boolMo20420c == null) {
                    return super.mo20420c(str);
                }
                return boolMo20420c;
            }
        }
        boolMo20420c = null;
        if (boolMo20420c == null) {
            return super.mo20420c(str);
        }
        return boolMo20420c;
    }

    public final String toString() {
        return String.format("id: %s, params: %s exp: %s", this.f17757b, this.f17772a, this.f17758c);
    }
}

package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.global.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C7969c implements InterfaceC7970d {

    /* JADX INFO: renamed from: a */
    public final HashSet f17748a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final boolean f17749b;

    public C7969c(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                long jOptLong = jSONArray.optLong(i);
                if (jOptLong != 0) {
                    this.f17748a.add(Long.valueOf(jOptLong));
                }
            }
        }
        this.f17749b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC7970d
    /* JADX INFO: renamed from: a */
    public final boolean mo20412a(C7971e c7971e) {
        if (this.f17748a.isEmpty() || c7971e.f17750a == null) {
            return false;
        }
        Iterator it = this.f17748a.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).equals(c7971e.f17750a)) {
                return !this.f17749b;
            }
        }
        return this.f17749b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "demand", this.f17748a, Boolean.valueOf(this.f17749b));
    }
}

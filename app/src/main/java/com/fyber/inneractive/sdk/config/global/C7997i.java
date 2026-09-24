package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.global.i */
/* JADX INFO: loaded from: classes4.dex */
public final class C7997i implements InterfaceC7970d {

    /* JADX INFO: renamed from: a */
    public final HashSet f17764a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final boolean f17765b;

    public C7997i(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                long jOptLong = jSONArray.optLong(i);
                if (jOptLong != 0) {
                    this.f17764a.add(Long.valueOf(jOptLong));
                }
            }
        }
        this.f17765b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC7970d
    /* JADX INFO: renamed from: a */
    public final boolean mo20412a(C7971e c7971e) {
        if (this.f17764a.isEmpty() || c7971e.f17751b == null) {
            return false;
        }
        Iterator it = this.f17764a.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).equals(c7971e.f17751b)) {
                return !this.f17765b;
            }
        }
        return this.f17765b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "pub_id", this.f17764a, Boolean.valueOf(this.f17765b));
    }
}

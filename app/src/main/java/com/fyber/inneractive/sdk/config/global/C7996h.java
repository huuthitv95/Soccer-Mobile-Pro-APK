package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.global.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C7996h implements InterfaceC7970d {

    /* JADX INFO: renamed from: a */
    public final HashSet f17762a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final boolean f17763b;

    public C7996h(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    this.f17762a.add(strOptString);
                }
            }
        }
        this.f17763b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC7970d
    /* JADX INFO: renamed from: a */
    public final boolean mo20412a(C7971e c7971e) {
        if (this.f17762a.isEmpty() || c7971e.f17752c == null) {
            return false;
        }
        Iterator it = this.f17762a.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(c7971e.f17752c.value())) {
                return !this.f17763b;
            }
        }
        return this.f17763b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "placement_type", this.f17762a, Boolean.valueOf(this.f17763b));
    }
}

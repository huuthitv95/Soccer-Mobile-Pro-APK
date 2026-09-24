package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.global.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C7968b {

    /* JADX INFO: renamed from: a */
    public String f17744a;

    /* JADX INFO: renamed from: b */
    public int f17745b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f17746c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f17747d = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static void m20411a(C7968b c7968b, JSONObject jSONObject, boolean z) {
        InterfaceC7970d c7969c;
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                next.getClass();
                next.hashCode();
                switch (next) {
                    case "demand":
                        c7969c = new C7969c(jSONObject.getJSONArray(next), z);
                        break;
                    case "pub_id":
                        c7969c = new C7997i(jSONObject.getJSONArray(next), z);
                        break;
                    case "placement_type":
                        c7969c = new C7996h(jSONObject.getJSONArray(next), z);
                        break;
                    case "os":
                        c7969c = new C7972f(z, jSONObject.getString(next));
                        break;
                    case "sdk":
                        c7969c = new C7998j(z, jSONObject.getString(next));
                        break;
                    default:
                        c7969c = null;
                        break;
                }
                if (c7969c != null) {
                    c7968b.f17747d.add(c7969c);
                } else {
                    IAlog.m21945a("b: Unsupported filter type: " + next, new Object[0]);
                }
            }
        }
    }

    public final String toString() {
        return String.format("experiment: id=%s, variants=%s, filters=%s", this.f17744a, this.f17746c, this.f17747d);
    }
}

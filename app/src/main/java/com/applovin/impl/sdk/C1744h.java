package com.applovin.impl.sdk;

import com.applovin.impl.AbstractC1482a3;
import com.applovin.impl.AbstractC1617m1;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.sdk.h */
/* JADX INFO: loaded from: classes3.dex */
public class C1744h {

    /* JADX INFO: renamed from: a */
    private final Map f2962a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Object f2963b = new Object();

    /* JADX INFO: renamed from: c */
    private final Map f2964c = new HashMap();

    /* JADX INFO: renamed from: d */
    private final Object f2965d = new Object();

    /* JADX INFO: renamed from: com.applovin.impl.sdk.h$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private long f2966a;

        /* JADX INFO: renamed from: b */
        private final JSONObject f2967b;

        /* JADX INFO: renamed from: c */
        private final ArrayDeque f2968c;

        private b(AbstractC1482a3 abstractC1482a3, c cVar) {
            JSONObject jSONObject = new JSONObject();
            this.f2967b = jSONObject;
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f2968c = arrayDeque;
            m4670a(cVar);
            JsonUtils.putString(jSONObject, "ad_unit_id", abstractC1482a3.getAdUnitId());
            JsonUtils.putString(jSONObject, FirebaseAnalytics.Param.AD_FORMAT, abstractC1482a3.getFormat().getLabel());
            JsonUtils.putString(jSONObject, "network_name", abstractC1482a3.m3200c());
            JsonUtils.putString(jSONObject, "adapter_class", abstractC1482a3.m3196b());
            JsonUtils.putString(jSONObject, "adapter_version", abstractC1482a3.m1815A());
            JsonUtils.putString(jSONObject, "bcode", abstractC1482a3.m1817C());
            JsonUtils.putString(jSONObject, CampaignEx.JSON_KEY_CREATIVE_ID, abstractC1482a3.getCreativeId());
            JsonUtils.putString(jSONObject, "operation", arrayDeque.toString());
        }

        /* JADX INFO: renamed from: a */
        private String m4668a(String str) {
            return JsonUtils.getString(this.f2967b, str, "");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m4670a(c cVar) {
            this.f2966a = System.currentTimeMillis();
            this.f2968c.add(cVar);
            JsonUtils.putString(this.f2967b, "operation", cVar.toString());
        }

        /* JADX INFO: renamed from: a */
        public JSONObject m4671a() {
            return this.f2967b;
        }

        /* JADX INFO: renamed from: b */
        public String m4672b() {
            return JsonUtils.getString(this.f2967b, "bcode", "");
        }

        /* JADX INFO: renamed from: c */
        public c m4673c() {
            return (c) this.f2968c.getLast();
        }

        public String toString() {
            return "AdInfo{states='" + this.f2968c.toString() + "', adUnitId='" + m4668a("ad_unit_id") + "', format='" + m4668a(FirebaseAnalytics.Param.AD_FORMAT) + "', adapterName='" + m4668a("network_name") + "', adapterClass='" + m4668a("adapter_class") + "', adapterVersion='" + m4668a("adapter_version") + "', bCode='" + m4672b() + "', creativeId='" + m4668a(CampaignEx.JSON_KEY_CREATIVE_ID) + "', updated=" + this.f2966a + AbstractJsonLexerKt.END_OBJ;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.h$c */
    public enum c {
        LOADING("loading"),
        LOAD("load"),
        SHOW("show"),
        HIDE(MessengerShareContentUtility.SHARE_BUTTON_HIDE),
        CLICK("click"),
        DESTROY("destroy"),
        SHOW_ERROR("show_error");


        /* JADX INFO: renamed from: a */
        private final String f2977a;

        c(String str) {
            this.f2977a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f2977a;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.h$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo4592a(b bVar);
    }

    public C1744h() {
        m4664a();
    }

    /* JADX INFO: renamed from: a */
    private Set m4661a(c cVar) {
        synchronized (this.f2963b) {
            Set set = (Set) this.f2962a.get(cVar);
            if (AbstractC1617m1.m3172a(set)) {
                return set;
            }
            return new HashSet();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4662a(b bVar, c cVar) {
        Iterator it = m4663b(cVar).iterator();
        while (it.hasNext()) {
            ((d) it.next()).mo4592a(bVar);
        }
    }

    /* JADX INFO: renamed from: b */
    private Set m4663b(c cVar) {
        HashSet hashSet;
        synchronized (this.f2963b) {
            hashSet = new HashSet(m4661a(cVar));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    public void m4664a() {
        synchronized (this.f2963b) {
            for (c cVar : c.values()) {
                this.f2962a.put(cVar, new HashSet());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4665a(AbstractC1482a3 abstractC1482a3, c cVar) {
        synchronized (this.f2965d) {
            String strM1817C = abstractC1482a3.m1817C();
            b bVar = (b) this.f2964c.get(strM1817C);
            if (bVar == null) {
                if (cVar == c.DESTROY) {
                    return;
                }
                bVar = new b(abstractC1482a3, cVar);
                this.f2964c.put(strM1817C, bVar);
            } else if (bVar.m4673c() == cVar) {
                return;
            } else {
                bVar.m4670a(cVar);
            }
            if (cVar == c.DESTROY) {
                this.f2964c.remove(strM1817C);
            }
            m4662a(bVar, cVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4666a(d dVar) {
        synchronized (this.f2963b) {
            Iterator it = this.f2962a.keySet().iterator();
            while (it.hasNext()) {
                m4661a((c) it.next()).remove(dVar);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4667a(d dVar, Set set) {
        synchronized (this.f2963b) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                m4661a((c) it.next()).add(dVar);
            }
        }
    }
}

package com.applovin.impl.sdk.network;

import android.text.TextUtils;
import com.applovin.impl.AbstractRunnableC1601k5;
import com.applovin.impl.C1831z4;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1750n;
import com.applovin.impl.sdk.C1768p;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.sdk.network.c */
/* JADX INFO: loaded from: classes3.dex */
public class C1764c extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: g */
    private final C1763b f3204g;

    /* JADX INFO: renamed from: h */
    private final C1768p f3205h;

    /* JADX INFO: renamed from: i */
    private AtomicBoolean f3206i;

    /* JADX INFO: renamed from: j */
    private boolean f3207j;

    C1764c(C1763b c1763b, C1748l c1748l) {
        super("PersistentPostbackQueueSaveTask", c1748l);
        this.f3206i = new AtomicBoolean();
        this.f3207j = false;
        this.f3204g = c1763b;
        this.f3205h = c1748l.m4782Q();
    }

    /* JADX INFO: renamed from: a */
    private void m5074a(List list) {
        if (!(this.f3207j && list.isEmpty()) && this.f3206i.compareAndSet(false, true)) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1765d c1765d = (C1765d) it.next();
                try {
                    jSONArray.put(c1765d.m5092q());
                } catch (Throwable th) {
                    C1768p.m5164c("PersistentPostbackQueueSaveTask", "Unable to serialize postback to JSON: " + c1765d, th);
                    this.f1969a.m4764E().m4329a("PersistentPostbackQueueSaveTask", "serializePostback", th);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pb", jSONArray);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
                C1750n c1750nM4771I = this.f1969a.m4771I();
                if (c1750nM4771I.m4979a((InputStream) byteArrayInputStream, c1750nM4771I.m4971a("persistent_postback_cache.json", C1748l.m4756p()), true)) {
                    if (C1768p.m5160a()) {
                        this.f3205h.m5171a("PersistentPostbackQueueSaveTask", "Exported postback queue to disk.");
                    }
                } else if (C1768p.m5160a()) {
                    this.f3205h.m5174b("PersistentPostbackQueueSaveTask", "Unable to export postback queue to disk.");
                }
            } catch (Throwable th2) {
                C1768p.m5164c("PersistentPostbackQueueSaveTask", "Unable to export postbacks to disk: " + jSONArray, th2);
                this.f1969a.m4764E().m4329a("PersistentPostbackQueueSaveTask", "serializePostbackQueue", th2);
            }
            this.f3206i.set(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public List m5075a(int i) throws Throwable {
        ArrayList arrayList = new ArrayList();
        C1750n c1750nM4771I = this.f1969a.m4771I();
        if (!c1750nM4771I.m4981b("persistent_postback_cache.json", C1748l.m4756p())) {
            C1768p.m5167h("PersistentPostbackQueueSaveTask", "Postbacks queue file does not exist.");
            return arrayList;
        }
        File fileM4971a = c1750nM4771I.m4971a("persistent_postback_cache.json", C1748l.m4756p());
        String strM4986f = c1750nM4771I.m4986f(fileM4971a);
        if (TextUtils.isEmpty(strM4986f)) {
            C1768p.m5167h("PersistentPostbackQueueSaveTask", "Postbacks queue file has no content.");
            return arrayList;
        }
        boolean z = false;
        try {
            JSONArray jSONArray = new JSONObject(strM4986f).getJSONArray("pb");
            if (C1768p.m5160a()) {
                this.f3205h.m5171a("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s)...");
            }
            arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
            Integer num = (Integer) this.f1969a.m4801a(C1831z4.f3753K2);
            for (int i2 = 0; i2 < jSONArray.length() && arrayList.size() < i; i2++) {
                try {
                    C1765d c1765d = new C1765d(jSONArray.getJSONObject(i2), this.f1969a);
                    if (c1765d.m5078c() < num.intValue()) {
                        arrayList.add(c1765d);
                    } else {
                        C1768p.m5167h("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + c1765d);
                    }
                } catch (Throwable th) {
                    C1768p.m5164c("PersistentPostbackQueueSaveTask", "Unable to deserialize postback from json", th);
                    this.f1969a.m4764E().m4329a("PersistentPostbackQueueSaveTask", "deserializePostback", th);
                }
            }
            if (C1768p.m5160a()) {
                this.f3205h.m5171a("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
            }
        } catch (Throwable th2) {
            try {
                C1768p.m5164c("PersistentPostbackQueueSaveTask", "Failed to load postback queue", th2);
                try {
                    this.f1969a.m4764E().m4329a("PersistentPostbackQueueSaveTask", "deserializePostbackQueue", th2);
                    if (((Boolean) this.f1969a.m4801a(C1831z4.f3783O0)).booleanValue()) {
                        c1750nM4771I.m4976a(fileM4971a, "removeAfterDeserializationFail");
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z = true;
                    if (z && ((Boolean) this.f1969a.m4801a(C1831z4.f3783O0)).booleanValue()) {
                        c1750nM4771I.m4976a(fileM4971a, "removeAfterDeserializationFail");
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        this.f3207j = arrayList.isEmpty();
        return arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        m5074a(this.f3204g.m5072d());
    }
}

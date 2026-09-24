package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Jb */
/* JADX INFO: loaded from: classes6.dex */
public class C11509Jb {

    /* JADX INFO: renamed from: a */
    private String f24767a;

    public C11509Jb(String str) {
        this.f24767a = str;
    }

    /* JADX INFO: renamed from: a */
    private C12601x8 m26208a() throws Exception {
        C12601x8 c12601x8 = new C12601x8(this.f24767a, "metadata.json");
        if (!c12601x8.exists()) {
            m26209a(c12601x8);
        }
        return c12601x8;
    }

    /* JADX INFO: renamed from: b */
    synchronized JSONObject m26214b() throws Exception {
        return new JSONObject(IronSourceStorageUtils.readFile(m26208a()));
    }

    /* JADX INFO: renamed from: a */
    private void m26209a(C12601x8 c12601x8) throws Exception {
        IronSourceStorageUtils.saveFile(new JSONObject().toString().getBytes(), c12601x8.getPath());
    }

    /* JADX INFO: renamed from: b */
    synchronized boolean m26215b(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObjectM26214b;
        jSONObjectM26214b = m26214b();
        JSONObject jSONObjectOptJSONObject = jSONObjectM26214b.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectOptJSONObject.putOpt(next, jSONObject.opt(next));
            }
        } else {
            jSONObjectM26214b.putOpt(str, jSONObject);
        }
        return m26210a(jSONObjectM26214b);
    }

    /* JADX INFO: renamed from: a */
    private boolean m26210a(JSONObject jSONObject) throws Exception {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), m26208a().getPath()) != 0;
    }

    /* JADX INFO: renamed from: a */
    synchronized boolean m26212a(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObjectM26214b;
        jSONObjectM26214b = m26214b();
        jSONObjectM26214b.put(str, jSONObject);
        return m26210a(jSONObjectM26214b);
    }

    /* JADX INFO: renamed from: a */
    synchronized boolean m26211a(String str) throws Exception {
        JSONObject jSONObjectM26214b = m26214b();
        if (!jSONObjectM26214b.has(str)) {
            return true;
        }
        jSONObjectM26214b.remove(str);
        return m26210a(jSONObjectM26214b);
    }

    /* JADX INFO: renamed from: a */
    boolean m26213a(ArrayList<C12601x8> arrayList) throws Exception {
        Iterator<C12601x8> it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!m26211a(it.next().getName())) {
                z = false;
            }
        }
        return z;
    }
}

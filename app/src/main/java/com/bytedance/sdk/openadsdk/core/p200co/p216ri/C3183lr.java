package com.bytedance.sdk.openadsdk.core.p200co.p216ri;

import android.text.TextUtils;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.xha.C2739lr;
import com.bytedance.sdk.component.xha.p170lr.AbstractC2740ik;
import com.bytedance.sdk.component.xha.p170lr.C2742lr;
import com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.p200co.p215mj.C3180ri;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.utils.dzy;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3183lr {

    /* JADX INFO: renamed from: ri */
    private static volatile C3183lr f10541ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.ri.lr$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo13182ri(int i, String str, String str2);

        /* JADX INFO: renamed from: ri */
        void mo13183ri(JSONObject jSONObject, String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m13299lr() {
        int iM14844fi = C3299nr.m14639ka().m14844fi();
        if (iM14844fi <= 0) {
            iM14844fi = 100;
        }
        List<C3184ri> listM13293lr = C3182ik.m13292ri().m13293lr();
        if (listM13293lr == null || listM13293lr.isEmpty() || iM14844fi >= listM13293lr.size()) {
            if (listM13293lr == null) {
                return;
            }
            listM13293lr.size();
            return;
        }
        int size = (int) (listM13293lr.size() - (iM14844fi * 0.75f));
        if (size <= 0) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (C3184ri c3184ri : listM13293lr) {
            treeMap.put(c3184ri.m13319ka(), c3184ri);
        }
        HashSet hashSet = new HashSet();
        int i = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i < size) {
                i++;
                C3184ri c3184ri2 = (C3184ri) entry.getValue();
                if (c3184ri2 != null) {
                    hashSet.add(c3184ri2.m13324ri());
                }
            }
        }
        m13312ri(hashSet);
    }

    /* JADX INFO: renamed from: lr */
    private void m13300lr(String str, String str2, String str3, String str4, String str5) {
        C3184ri c3184ri = new C3184ri();
        c3184ri.m13316ik(str).m13314fi(str3).m13318ka(str4).m13320lr(str2).m13323ri(str5).m13322ri(Long.valueOf(System.currentTimeMillis()));
        C3182ik.m13292ri().m13296ri(c3184ri);
        m13299lr();
    }

    /* JADX INFO: renamed from: ri */
    public static C3183lr m13301ri() {
        if (f10541ri == null) {
            synchronized (C3183lr.class) {
                if (f10541ri == null) {
                    f10541ri = new C3183lr();
                }
            }
        }
        return f10541ri;
    }

    /* JADX INFO: renamed from: ri */
    private C3184ri m13302ri(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return C3182ik.m13292ri().m13294ri(str, str2);
    }

    /* JADX INFO: renamed from: ri */
    private void m13305ri(final C3184ri c3184ri) {
        c3184ri.m13322ri(Long.valueOf(System.currentTimeMillis()));
        dzy.m16410ri(new AbstractRunnableC2676ik("updateTmplTime") { // from class: com.bytedance.sdk.openadsdk.core.co.ri.lr.4
            @Override // java.lang.Runnable
            public void run() {
                C3182ik.m13292ri().m13296ri(c3184ri);
            }
        }, 10);
    }

    /* JADX INFO: renamed from: ri */
    private void m13306ri(final String str, final String str2, final String str3, final String str4, final ri riVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            if (riVar != null) {
                riVar.mo13182ri(1, "template url or id  or md5 is empty", "net");
            }
        } else {
            C2742lr c2742lrM10410ik = C2751lr.m10463lr().m10466ik().m10410ik();
            c2742lrM10410ik.m10365ik(str);
            c2742lrM10410ik.m10373ri(7);
            c2742lrM10410ik.m10371lr("load_ug_t");
            c2742lrM10410ik.m10392ri(new AbstractC2746ri() { // from class: com.bytedance.sdk.openadsdk.core.co.ri.lr.3
                @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
                /* JADX INFO: renamed from: ri */
                public void mo10425ri(AbstractC2740ik abstractC2740ik, C2739lr c2739lr) {
                    if (c2739lr == null) {
                        return;
                    }
                    if (!c2739lr.m10354di()) {
                        ri riVar2 = riVar;
                        if (riVar2 != null) {
                            riVar2.mo13182ri(3, "net code error code is " + c2739lr.m10359ri() + " message is " + c2739lr.m10358lr(), "net");
                            return;
                        }
                        return;
                    }
                    String strM10357ka = c2739lr.m10357ka();
                    if (TextUtils.isEmpty(strM10357ka)) {
                        ri riVar3 = riVar;
                        if (riVar3 != null) {
                            riVar3.mo13182ri(3, "net data is null", "net");
                            return;
                        }
                        return;
                    }
                    C3182ik.m13292ri().m13296ri(new C3184ri().m13323ri(str2).m13320lr(str3).m13316ik(str).m13314fi(str4).m13318ka(strM10357ka).m13322ri(Long.valueOf(System.currentTimeMillis())));
                    C3183lr.this.m13299lr();
                    if (riVar != null) {
                        try {
                            riVar.mo13183ri(new JSONObject(strM10357ka), "net");
                        } catch (JSONException unused) {
                            riVar.mo13182ri(2, "parse json exception data is".concat(String.valueOf(strM10357ka)), "net");
                        }
                    }
                }

                @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
                /* JADX INFO: renamed from: ri */
                public void mo10423ri(AbstractC2740ik abstractC2740ik, IOException iOException) {
                    ri riVar2 = riVar;
                    if (riVar2 != null) {
                        riVar2.mo13182ri(3, "net error " + iOException.getMessage(), "net");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m13307ri(String str, String str2, String str3, String str4, String str5) {
        if (m13302ri(str, str3) != null) {
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                return;
            }
            m13300lr(str2, str3, str5, str4, str);
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            m13306ri(str2, str, str3, str5, (ri) null);
        } else {
            m13300lr(str2, str3, str5, str4, str);
        }
    }

    /* JADX INFO: renamed from: ri */
    public String m13308ri(String str, String str2, String str3) {
        C3184ri c3184riM13302ri = m13302ri(str + "_" + str2, str3);
        if (c3184riM13302ri == null) {
            return null;
        }
        m13305ri(c3184riM13302ri);
        return c3184riM13302ri.m13315fi();
    }

    /* JADX INFO: renamed from: ri */
    public Set<C3184ri> m13309ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C3182ik.m13292ri().m13295ri(str);
    }

    /* JADX INFO: renamed from: ri */
    public void m13310ri(C3180ri c3180ri, String str) {
        if (c3180ri == null || TextUtils.isEmpty(c3180ri.m13276ri())) {
            return;
        }
        final String str2 = str + "_" + c3180ri.m13276ri();
        final String strM13270ik = c3180ri.m13270ik();
        final String strM13274lr = c3180ri.m13274lr();
        final String strM13272ka = c3180ri.m13272ka();
        String strM13268fi = c3180ri.m13268fi();
        if (TextUtils.isEmpty(strM13268fi)) {
            if (str.equals("ad")) {
                strM13268fi = C3304qt.m14669lr().m14689ka();
            } else if (str.equals("adv3")) {
                strM13268fi = C3304qt.m14669lr().m14689ka() + "_v3";
            }
        }
        final String str3 = strM13268fi;
        dzy.m16410ri(new AbstractRunnableC2676ik("saveUGenTemplate") { // from class: com.bytedance.sdk.openadsdk.core.co.ri.lr.1
            @Override // java.lang.Runnable
            public void run() {
                C3183lr.this.m13307ri(str2, strM13270ik, strM13274lr, strM13272ka, str3);
            }
        }, 10);
    }

    /* JADX INFO: renamed from: ri */
    public void m13311ri(String str, String str2, String str3, String str4, String str5, final ri riVar) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (riVar != null) {
                riVar.mo13182ri(1, "id  or md5 is empty", "net");
                return;
            }
            return;
        }
        String str6 = str + "_" + str3;
        C3184ri c3184riM13302ri = m13302ri(str6, str4);
        if (c3184riM13302ri == null || TextUtils.isEmpty(c3184riM13302ri.m13315fi())) {
            m13306ri(str2, str6, str4, str5, new ri() { // from class: com.bytedance.sdk.openadsdk.core.co.ri.lr.2
                @Override // com.bytedance.sdk.openadsdk.core.p200co.p216ri.C3183lr.ri
                /* JADX INFO: renamed from: ri */
                public void mo13182ri(int i, String str7, String str8) {
                    ri riVar2 = riVar;
                    if (riVar2 != null) {
                        riVar2.mo13182ri(i, str7, str8);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.p200co.p216ri.C3183lr.ri
                /* JADX INFO: renamed from: ri */
                public void mo13183ri(JSONObject jSONObject, String str7) {
                    ri riVar2 = riVar;
                    if (riVar2 != null) {
                        riVar2.mo13183ri(jSONObject, str7);
                    }
                }
            });
            return;
        }
        m13305ri(c3184riM13302ri);
        if (riVar != null) {
            try {
                riVar.mo13183ri(new JSONObject(c3184riM13302ri.m13315fi()), "local");
            } catch (JSONException unused) {
                riVar.mo13182ri(2, "parse json exception data is " + c3184riM13302ri.m13315fi(), "local");
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13312ri(Set<String> set) {
        try {
            C3182ik.m13292ri().m13297ri(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}

package com.bytedance.sdk.component.adexpress.p126ri.p128lr;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.p124ka.C2495ka;
import com.bytedance.sdk.component.adexpress.p126ri.p127ik.C2516ka;
import com.bytedance.sdk.component.adexpress.p126ri.p127ik.C2517lr;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.C2531ri;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.xha.C2739lr;
import com.bytedance.sdk.component.xha.p170lr.C2742lr;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class xha {

    /* JADX INFO: renamed from: ri */
    private static volatile xha f7015ri;

    /* JADX INFO: renamed from: lr */
    private AtomicBoolean f7016lr = new AtomicBoolean(false);

    private xha() {
    }

    /* JADX INFO: renamed from: ik */
    private JSONObject m9133ik(String str) {
        InterfaceC2528ik interfaceC2528ikM9166ik = C2531ri.m9163ri().m9166ik();
        if (interfaceC2528ikM9166ik == null) {
            return null;
        }
        C2742lr c2742lrXha = interfaceC2528ikM9166ik.xha();
        c2742lrXha.m10365ik(str);
        C2739lr c2739lrM10391ri = c2742lrXha.m10391ri();
        if (c2739lrM10391ri != null) {
            try {
                if (c2739lrM10391ri.m10354di() && c2739lrM10391ri.m10357ka() != null) {
                    return new JSONObject(c2739lrM10391ri.m10357ka());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: lr */
    private void m9134lr() {
        if (C2531ri.m9163ri().m9166ik() == null) {
            return;
        }
        int iMo9155ri = C2531ri.m9163ri().m9166ik().mo9155ri();
        if (iMo9155ri <= 0) {
            iMo9155ri = 100;
        }
        List<C2517lr> listM9068lr = C2519di.m9065ri().m9068lr();
        if (listM9068lr == null || listM9068lr.isEmpty() || iMo9155ri >= listM9068lr.size()) {
            if (listM9068lr == null) {
                return;
            }
            listM9068lr.size();
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (C2517lr c2517lr : listM9068lr) {
            treeMap.put(c2517lr.xha(), c2517lr);
        }
        HashSet hashSet = new HashSet();
        int size = (int) (listM9068lr.size() - (iMo9155ri * 0.75f));
        int i = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i < size) {
                i++;
                ((Long) entry.getKey()).longValue();
                C2517lr c2517lr2 = (C2517lr) entry.getValue();
                if (c2517lr2 != null) {
                    hashSet.add(c2517lr2.m9030lr());
                }
            }
        }
        m9143ri(hashSet);
        this.f7016lr.set(false);
    }

    /* JADX INFO: renamed from: lr */
    private void m9135lr(String str, String str2, String str3, String str4, String str5, String str6) {
        C2519di.m9065ri().m9071ri(new C2517lr().m9032ri(str).m9029lr(str2).m9025ik(str3).m9027ka(str4).m9023fi(str5).m9021di(str6).m9031ri(Long.valueOf(System.currentTimeMillis())), false);
        m9134lr();
    }

    /* JADX INFO: renamed from: ri */
    public static xha m9136ri() {
        if (f7015ri == null) {
            synchronized (xha.class) {
                if (f7015ri == null) {
                    f7015ri = new xha();
                }
            }
        }
        return f7015ri;
    }

    /* JADX INFO: renamed from: ri */
    private void m9138ri(String str, String str2, String str3) {
        JSONObject jSONObjectM9133ik;
        if (TextUtils.isEmpty(str) || (jSONObjectM9133ik = m9133ik(str)) == null) {
            return;
        }
        String strOptString = jSONObjectM9133ik.optString("md5");
        String strOptString2 = jSONObjectM9133ik.optString("version");
        String strOptString3 = jSONObjectM9133ik.optString("data");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3)) {
            return;
        }
        C2517lr c2517lrM9031ri = new C2517lr().m9032ri(str2).m9029lr(str3).m9025ik(strOptString).m9027ka(str).m9023fi(strOptString3).m9021di(strOptString2).m9031ri(Long.valueOf(System.currentTimeMillis()));
        C2519di.m9065ri().m9071ri(c2517lrM9031ri, false);
        m9134lr();
        if (C2524mj.m9128ri(strOptString2)) {
            c2517lrM9031ri.m9021di(strOptString2);
            C2520fi.m9074lr().m9083ri(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public synchronized void m9139ri(String str, String str2, String str3, String str4, String str5, String str6) throws Throwable {
        String str7;
        try {
            try {
                if (m9141ri(str) == null) {
                    str7 = str5;
                    if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                        m9138ri(str2, str6, str);
                    } else {
                        m9135lr(str6, str, str3, str2, str4, str7);
                    }
                } else {
                    if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                        return;
                    }
                    str7 = str5;
                    m9135lr(str6, str, str3, str2, str4, str7);
                }
                boolean zM9128ri = C2524mj.m9128ri(str7);
                if (!C2523lr.m9105fi() || zM9128ri) {
                    C2520fi.m9074lr().m9083ri(true);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: lr */
    public Set<String> m9140lr(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C2519di.m9065ri().m9069lr(str);
    }

    /* JADX INFO: renamed from: ri */
    public C2517lr m9141ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C2519di.m9065ri().m9070ri(str);
    }

    /* JADX INFO: renamed from: ri */
    public void m9142ri(C2516ka c2516ka, String str) {
        if (c2516ka == null) {
            return;
        }
        final String str2 = c2516ka.f6975ri;
        final String str3 = c2516ka.f6972ik;
        final String str4 = c2516ka.f6974lr;
        final String str5 = c2516ka.f6973ka;
        final String str6 = c2516ka.f6971fi;
        final String strMo9152mj = TextUtils.isEmpty(str) ? C2531ri.m9163ri().m9166ik() != null ? C2531ri.m9163ri().m9166ik().mo9152mj() : "" : str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        C2495ka.m8821ri(new AbstractRunnableC2676ik("saveTemplate") { // from class: com.bytedance.sdk.component.adexpress.ri.lr.xha.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                xha.this.m9139ri(str2, str3, str4, str5, str6, strMo9152mj);
            }
        }, 10);
    }

    /* JADX INFO: renamed from: ri */
    public void m9143ri(Set<String> set) {
        try {
            C2519di.m9065ri().m9072ri(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}

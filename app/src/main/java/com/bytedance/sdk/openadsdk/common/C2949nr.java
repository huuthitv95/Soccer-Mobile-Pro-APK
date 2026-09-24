package com.bytedance.sdk.openadsdk.common;

import android.text.TextUtils;
import com.bytedance.sdk.component.p130di.p131ri.xha.C2588ri;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.component.C2958di;
import com.bytedance.sdk.openadsdk.component.p182fi.C2963lr;
import com.bytedance.sdk.openadsdk.component.p184ka.C2976ri;
import com.bytedance.sdk.openadsdk.component.xha.C3087ri;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.tan.p263ka.C3535ri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.nr */
/* JADX INFO: loaded from: classes3.dex */
public class C2949nr {

    /* JADX INFO: renamed from: fi */
    private static volatile C2949nr f8855fi;

    /* JADX INFO: renamed from: ri */
    private final Map<String, List<C2963lr>> f8860ri = new ConcurrentHashMap();

    /* JADX INFO: renamed from: lr */
    private final Map<String, List<String>> f8859lr = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ik */
    private final Map<String, AdSlot> f8857ik = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ka */
    private final Object f8858ka = new Object();

    /* JADX INFO: renamed from: di */
    private final Runnable f8856di = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.nr.1
        @Override // java.lang.Runnable
        public void run() {
            C3087ri.m12360ri(2);
            C2588ri.m9552ri().postDelayed(C2949nr.this.f8856di, C3087ri.m12356qt());
        }
    };

    private C2949nr() {
    }

    /* JADX INFO: renamed from: lr */
    private C2963lr m11379lr(wjv wjvVar, C3289ri c3289ri) {
        if (wjvVar == null || wjvVar.m14388eb() == null || c3289ri == null) {
            return null;
        }
        String codeId = wjvVar.m14388eb().getCodeId();
        String strM14424jf = wjvVar.m14424jf();
        return new C2963lr(codeId, c3289ri.m14267sf(), wjvVar.cem(), System.currentTimeMillis(), wjvVar.m14456nm(), strM14424jf);
    }

    /* JADX INFO: renamed from: lr */
    private void m11380lr(AdSlot adSlot) {
        if (adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        String codeId = adSlot.getCodeId();
        if (TextUtils.isEmpty(codeId)) {
            return;
        }
        if (this.f8857ik.size() < C3087ri.m12348co() && !this.f8857ik.containsKey(codeId)) {
            this.f8857ik.put(codeId, adSlot);
            Objects.toString(this.f8857ik.keySet());
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m11381lr(String str) {
        C3535ri.m16072ri("tt_openad_material_cache_origin", "material".concat(String.valueOf(str)));
        C3535ri.m16072ri("tt_openad_material_cache_encrypt", "material".concat(String.valueOf(str)));
    }

    /* JADX INFO: renamed from: ri */
    public static C2949nr m11382ri() {
        if (f8855fi == null) {
            synchronized (C2949nr.class) {
                if (f8855fi == null) {
                    f8855fi = new C2949nr();
                }
            }
        }
        return f8855fi;
    }

    /* JADX INFO: renamed from: ri */
    private List<C2963lr> m11384ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strM16058lr = C3535ri.m16058lr("tt_openad_material_cache_origin", "material".concat(String.valueOf(str)), (String) null);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(strM16058lr)) {
            try {
                JSONArray jSONArray = new JSONArray(strM16058lr);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(C2963lr.m11498ri(jSONArray.getJSONObject(i)));
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ri */
    private List<C2963lr> m11385ri(List<C2963lr> list, AdSlot adSlot, List<String> list2) {
        if (adSlot == null || list == null || list.isEmpty() || list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C2963lr c2963lr : list) {
            if (c2963lr != null) {
                if (C3087ri.m12364ri(adSlot) && list2.contains(c2963lr.m11499di())) {
                    adSlot.getCodeId();
                    c2963lr.m11499di();
                } else {
                    arrayList.add(c2963lr);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ri */
    private void m11386ri(AdSlot adSlot, String str) {
        if (adSlot == null || TextUtils.isEmpty(str)) {
            return;
        }
        boolean z = adSlot.getCacheScene() != 0;
        String codeId = adSlot.getCodeId();
        if (TextUtils.isEmpty(codeId) || z || !C3087ri.m12364ri(adSlot)) {
            return;
        }
        List<String> arrayList = this.f8859lr.get(codeId);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
        this.f8859lr.put(codeId, arrayList);
    }

    /* JADX INFO: renamed from: ri */
    private void m11387ri(String str, AdSlot adSlot) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iM12348co = C3087ri.m12348co();
        if (!this.f8860ri.containsKey(str) && this.f8860ri.size() >= iM12348co) {
            Integer.valueOf(this.f8860ri.size());
            Integer.valueOf(iM12348co);
            return;
        }
        List<C2963lr> list = this.f8860ri.get(str);
        if (list == null || list.isEmpty()) {
            List<C2963lr> listM11384ri = m11384ri(str);
            if (listM11384ri == null) {
                listM11384ri = new ArrayList<>();
            }
            this.f8860ri.put(str, listM11384ri);
        }
        if (!this.f8859lr.containsKey(str)) {
            this.f8859lr.put(str, new ArrayList());
        }
        m11380lr(adSlot);
    }

    /* JADX INFO: renamed from: ri */
    private void m11388ri(String str, List<C2963lr> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (C2963lr c2963lr : list) {
            if (c2963lr != null) {
                try {
                    jSONArray.put(c2963lr.m11504ri());
                } catch (Exception unused) {
                }
            }
        }
        C3535ri.m16077ri("tt_openad_material_cache_origin", "material".concat(String.valueOf(str)), jSONArray.toString());
    }

    /* JADX INFO: renamed from: ri */
    private boolean m11389ri(List<C2963lr> list) {
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<C2963lr> it = list.iterator();
            while (it.hasNext()) {
                C2963lr next = it.next();
                if (next != null && jCurrentTimeMillis > next.m11501ik()) {
                    C2958di.m11449ri(C3299nr.m14642ri()).m11469ri(next.m11503lr());
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ri */
    private boolean m11390ri(List<C2963lr> list, AdSlot adSlot) {
        if (list != null && !list.isEmpty() && adSlot != null) {
            long jJbs = C3087ri.jbs();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator<C2963lr> it = list.iterator();
            while (it.hasNext()) {
                C2963lr next = it.next();
                if (next != null && jCurrentTimeMillis - next.m11502ka() > jJbs) {
                    it.remove();
                    C2976ri.m11572ri(next.m11503lr(), list.size(), adSlot.getCacheScene(), true);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ik */
    public Map<String, AdSlot> m11391ik() {
        return this.f8857ik;
    }

    /* JADX INFO: renamed from: ka */
    public void m11392ka() {
        C2588ri.m9552ri().postDelayed(this.f8856di, C3087ri.m12356qt());
    }

    /* JADX INFO: renamed from: lr */
    public void m11393lr() {
        try {
            synchronized (this.f8858ka) {
                this.f8860ri.clear();
                this.f8859lr.clear();
                C3535ri.m16071ri("tt_openad_material_cache_origin");
                C3535ri.m16071ri("tt_openad_material_cache_encrypt");
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public C2963lr m11394ri(AdSlot adSlot) {
        if (adSlot == null) {
            return null;
        }
        String codeId = adSlot.getCodeId();
        if (TextUtils.isEmpty(codeId)) {
            return null;
        }
        synchronized (this.f8858ka) {
            m11387ri(codeId, adSlot);
            List<C2963lr> list = this.f8860ri.get(codeId);
            List<String> list2 = this.f8859lr.get(codeId);
            if (list != null && !list.isEmpty()) {
                boolean zM11389ri = m11389ri(list);
                if (list.isEmpty()) {
                    Integer.valueOf(list.size());
                    m11396ri(codeId, (String) null);
                    return null;
                }
                if (zM11389ri) {
                    m11388ri(codeId, list);
                }
                List<C2963lr> listM11385ri = m11385ri(list, adSlot, list2);
                if (listM11385ri != null && !listM11385ri.isEmpty()) {
                    Collections.sort(listM11385ri, C2963lr.f8958ri);
                    C2963lr c2963lr = listM11385ri.get(0);
                    if (C3087ri.m12364ri(adSlot) && list2 != null) {
                        if (list2.size() >= list.size()) {
                            return null;
                        }
                        list2.add(c2963lr.m11499di());
                    }
                    return c2963lr;
                }
                return null;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11395ri(wjv wjvVar, C3289ri c3289ri) {
        AdSlot adSlotM14388eb;
        if (wjvVar == null || c3289ri == null || (adSlotM14388eb = wjvVar.m14388eb()) == null || wjvVar.m14367bl() || !TextUtils.isEmpty(adSlotM14388eb.getBidAdm()) || wjvVar.m14573zm() == 2) {
            return;
        }
        String codeId = adSlotM14388eb.getCodeId();
        if (TextUtils.isEmpty(codeId)) {
            return;
        }
        synchronized (this.f8858ka) {
            int iM12348co = C3087ri.m12348co();
            if (!this.f8860ri.containsKey(codeId) && this.f8860ri.size() >= iM12348co) {
                Integer.valueOf(this.f8860ri.size());
                Integer.valueOf(iM12348co);
                return;
            }
            C2963lr c2963lrM11379lr = m11379lr(wjvVar, c3289ri);
            List<C2963lr> arrayList = this.f8860ri.get(codeId);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            m11389ri(arrayList);
            int iM12355mj = C3087ri.m12355mj();
            if (arrayList.size() >= iM12355mj) {
                if (m11390ri(arrayList, adSlotM14388eb) && arrayList.size() < iM12355mj) {
                    arrayList.add(c2963lrM11379lr);
                    m11388ri(codeId, arrayList);
                }
                return;
            }
            Integer.valueOf(arrayList.size());
            C2976ri.m11567ri(wjvVar, arrayList.size(), adSlotM14388eb.getCacheScene(), false);
            arrayList.add(c2963lrM11379lr);
            this.f8860ri.put(codeId, arrayList);
            m11386ri(adSlotM14388eb, wjvVar.m14424jf());
            m11388ri(codeId, arrayList);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11396ri(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f8858ka) {
            if (TextUtils.isEmpty(str2)) {
                this.f8860ri.remove(str);
                m11381lr(str);
                return;
            }
            List<C2963lr> list = this.f8860ri.get(str);
            if (list != null && !list.isEmpty()) {
                Iterator<C2963lr> it = list.iterator();
                while (it.hasNext()) {
                    C2963lr next = it.next();
                    if (next != null && str2.equals(next.m11499di())) {
                        Integer.valueOf(list.size());
                        it.remove();
                    }
                }
                if (list.isEmpty()) {
                    Integer.valueOf(list.size());
                    this.f8860ri.remove(str);
                    m11381lr(str);
                } else if (list.size() < C3087ri.m12355mj()) {
                    Integer.valueOf(list.size());
                    m11388ri(str, list);
                }
                List<String> list2 = this.f8859lr.get(str);
                if (list2 != null && !list2.isEmpty()) {
                    if (TextUtils.isEmpty(str2)) {
                        this.f8859lr.remove(str);
                    } else {
                        list2.remove(str2);
                        if (list2.isEmpty()) {
                            this.f8859lr.remove(str);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m11397ri(String str, int i, int i2) {
        Integer.valueOf(i);
        Integer.valueOf(i2);
        boolean z = true;
        if (!C3087ri.m12350fi()) {
            return i2 <= 0;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int iM12355mj = C3087ri.m12355mj();
        synchronized (this.f8858ka) {
            List<C2963lr> list = this.f8860ri.get(str);
            if (list != null && !list.isEmpty()) {
                int size = list.size();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jJbs = C3087ri.jbs();
                for (C2963lr c2963lr : list) {
                    if (c2963lr != null && (jCurrentTimeMillis / 1000 > c2963lr.m11501ik() || jCurrentTimeMillis - c2963lr.m11502ka() > jJbs)) {
                        size--;
                    }
                }
                if (i + size >= iM12355mj) {
                    z = false;
                }
                Integer.valueOf(list.size());
                Integer.valueOf(i);
                Integer.valueOf(size);
                Integer.valueOf(iM12355mj);
                return z;
            }
            Integer.valueOf(i);
            Integer.valueOf(iM12355mj);
            if (i >= iM12355mj) {
                z = false;
            }
            return z;
        }
    }
}

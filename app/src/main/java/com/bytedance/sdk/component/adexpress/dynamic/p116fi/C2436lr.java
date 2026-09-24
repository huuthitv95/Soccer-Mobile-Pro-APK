package com.bytedance.sdk.component.adexpress.dynamic.p116fi;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2470di;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2471fi;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.fi.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2436lr {

    /* JADX INFO: renamed from: di */
    private int f6567di;

    /* JADX INFO: renamed from: fi */
    private double f6568fi;
    private C2500aw jbs;

    /* JADX INFO: renamed from: mj */
    private String f6572mj;
    private double xha;

    /* JADX INFO: renamed from: ri */
    public Map<String, ik> f6573ri = new HashMap();

    /* JADX INFO: renamed from: lr */
    public Map<String, ik> f6571lr = new HashMap();

    /* JADX INFO: renamed from: ik */
    public Map<String, ik> f6569ik = new HashMap();

    /* JADX INFO: renamed from: ka */
    private double f6570ka = Math.random();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.fi.lr$ik */
    static class ik {

        /* JADX INFO: renamed from: lr */
        float f6574lr;

        /* JADX INFO: renamed from: ri */
        float f6575ri;

        public ik() {
        }

        public ik(float f, float f2) {
            this.f6575ri = f;
            this.f6574lr = f2;
        }

        public String toString() {
            return "UnitSize{width=" + this.f6575ri + ", height=" + this.f6574lr + AbstractJsonLexerKt.END_OBJ;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.fi.lr$lr */
    static class lr {

        /* JADX INFO: renamed from: fi */
        float f6576fi;

        /* JADX INFO: renamed from: ik */
        int f6577ik;

        /* JADX INFO: renamed from: ka */
        double f6578ka;

        /* JADX INFO: renamed from: lr */
        int f6579lr;

        /* JADX INFO: renamed from: ri */
        float f6580ri;

        lr() {
        }

        /* JADX INFO: renamed from: ri */
        static JSONObject m8407ri(lr lrVar) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fontSize", lrVar.f6580ri);
                jSONObject.put("letterSpacing", lrVar.f6579lr);
                jSONObject.put("lineHeight", lrVar.f6578ka);
                jSONObject.put("maxWidth", lrVar.f6576fi);
                jSONObject.put("fontWeight", lrVar.f6577ik);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.fi.lr$ri */
    static class ri implements Cloneable {

        /* JADX INFO: renamed from: ik */
        float f6581ik;

        /* JADX INFO: renamed from: lr */
        boolean f6582lr;

        /* JADX INFO: renamed from: ri */
        float f6583ri;

        ri() {
        }

        public Object clone() {
            try {
                return (ri) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }
    }

    public C2436lr(double d, int i, double d2, String str, C2500aw c2500aw) {
        this.f6568fi = d;
        this.f6567di = i;
        this.xha = d2;
        this.f6572mj = str;
        this.jbs = c2500aw;
    }

    /* JADX INFO: renamed from: di */
    private ik m8383di(C2475mj c2475mj, float f, float f2) {
        new ik();
        C2470di c2470diM8592fi = c2475mj.m8627qt().m8592fi();
        c2475mj.m8627qt().m8593ik();
        c2470diM8592fi.m8585xm();
        float fM8538nr = c2470diM8592fi.m8538nr();
        int iWhw = c2470diM8592fi.whw();
        double dSiy = c2470diM8592fi.siy();
        int iRzk = c2470diM8592fi.rzk();
        boolean zFeb = c2470diM8592fi.feb();
        boolean zM8549qh = c2470diM8592fi.m8549qh();
        int iZyn = c2470diM8592fi.zyn();
        lr lrVar = new lr();
        lrVar.f6580ri = fM8538nr;
        lrVar.f6579lr = iWhw;
        lrVar.f6577ik = iRzk;
        lrVar.f6578ka = dSiy;
        lrVar.f6576fi = f;
        return m8394ri(c2475mj.m8627qt().m8593ik(), lrVar, zFeb, zM8549qh, iZyn, c2475mj);
    }

    /* JADX INFO: renamed from: fi */
    private ik m8384fi(C2475mj c2475mj, float f, float f2) {
        String str = c2475mj.m8616ik() + "_" + f + "_" + f2;
        if (this.f6569ik.containsKey(str)) {
            return this.f6569ik.get(str);
        }
        ik ikVarM8383di = m8383di(c2475mj, f, f2);
        this.f6569ik.put(str, ikVarM8383di);
        return ikVarM8383di;
    }

    /* JADX INFO: renamed from: fi */
    private String m8385fi(C2475mj c2475mj) {
        return c2475mj.m8616ik();
    }

    /* JADX INFO: renamed from: ik */
    private ik m8386ik(List<C2475mj> list, float f, float f2) {
        float fMax;
        m8389ka(list);
        ik ikVar = new ik();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C2475mj c2475mj : list) {
            C2470di c2470diM8592fi = c2475mj.m8627qt().m8592fi();
            if (c2470diM8592fi.gcp() == 1 || c2470diM8592fi.gcp() == 2) {
                arrayList.add(c2475mj);
            }
            if (c2470diM8592fi.gcp() != 1 && c2470diM8592fi.gcp() != 2) {
                arrayList2.add(c2475mj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m8400ik((C2475mj) it.next(), f, f2);
        }
        if (arrayList2.size() <= 0) {
            return ikVar;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<C2475mj> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(m8400ik(it2.next(), f, f2).f6575ri));
        }
        ArrayList arrayList4 = new ArrayList();
        int i = 0;
        while (true) {
            fMax = 0.0f;
            if (i >= arrayList2.size()) {
                break;
            }
            C2475mj c2475mj2 = arrayList2.get(i);
            String strM8587zf = c2475mj2.m8627qt().m8592fi().m8587zf();
            float fM8625mj = c2475mj2.m8625mj();
            boolean zEquals = TextUtils.equals(strM8587zf, "flex");
            if (TextUtils.equals(strM8587zf, "auto")) {
                List<List<C2475mj>> listM8610bu = c2475mj2.m8610bu();
                if (listM8610bu == null || listM8610bu.size() <= 0) {
                    zEquals = false;
                    break;
                }
                Iterator<List<C2475mj>> it3 = listM8610bu.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        zEquals = false;
                        break;
                    }
                    if (m8393lr(it3.next())) {
                        zEquals = true;
                        break;
                    }
                }
            }
            ri riVar = new ri();
            if (!zEquals) {
                fM8625mj = ((Float) arrayList3.get(i)).floatValue();
            }
            riVar.f6583ri = fM8625mj;
            riVar.f6582lr = !zEquals;
            if (zEquals) {
                fMax = ((Float) arrayList3.get(i)).floatValue();
            }
            riVar.f6581ik = fMax;
            arrayList4.add(riVar);
            i++;
        }
        m8397ri(arrayList4, f, arrayList2);
        List<ri> listM8411ri = C2438qt.m8411ri(f, arrayList4);
        float f3 = 0.0f;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            f3 += listM8411ri.get(i2).f6583ri;
            if (((Float) arrayList3.get(i2)).floatValue() != listM8411ri.get(i2).f6583ri) {
                m8390ka(arrayList2.get(i2));
            }
        }
        Iterator<C2475mj> it4 = arrayList2.iterator();
        int i3 = 0;
        boolean z = false;
        while (it4.hasNext()) {
            i3++;
            if (!m8392lr(it4.next())) {
                z = false;
                break;
            }
            if (i3 == arrayList2.size()) {
                z = true;
            }
        }
        fMax = z ? f2 : 0.0f;
        ArrayList arrayList5 = new ArrayList();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            C2475mj c2475mj3 = arrayList2.get(i4);
            ik ikVarM8400ik = m8400ik(c2475mj3, listM8411ri.get(i4).f6583ri, f2);
            if (!m8392lr(c2475mj3)) {
                fMax = Math.max(fMax, ikVarM8400ik.f6574lr);
            }
            arrayList5.add(ikVarM8400ik);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            arrayList6.add(Float.valueOf(((ik) it5.next()).f6574lr));
        }
        if (!z) {
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                C2475mj c2475mj4 = arrayList2.get(i5);
                if (m8392lr(c2475mj4) && ((Float) arrayList6.get(i5)).floatValue() != fMax) {
                    m8390ka(c2475mj4);
                    m8400ik(c2475mj4, listM8411ri.get(i5).f6583ri, fMax);
                }
            }
        }
        ikVar.f6575ri = f3;
        ikVar.f6574lr = fMax;
        return ikVar;
    }

    /* JADX INFO: renamed from: ik */
    private void m8387ik(List<C2475mj> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f6571lr.remove(m8389ka(list));
        Iterator<C2475mj> it = list.iterator();
        while (it.hasNext()) {
            m8390ka(it.next());
        }
    }

    /* JADX INFO: renamed from: ik */
    private boolean m8388ik(C2475mj c2475mj) {
        List<List<C2475mj>> listM8610bu;
        if (!c2475mj.m8626nr() && TextUtils.equals(c2475mj.m8627qt().m8592fi().igq(), "auto") && (listM8610bu = c2475mj.m8610bu()) != null && listM8610bu.size() > 0) {
            if (listM8610bu.size() == 1) {
                Iterator<C2475mj> it = listM8610bu.get(0).iterator();
                while (it.hasNext()) {
                    if (!m8392lr(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<C2475mj>> it2 = listM8610bu.iterator();
            while (it2.hasNext()) {
                if (m8399ri(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ka */
    private String m8389ka(List<C2475mj> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String strM8616ik = list.get(i).m8616ik();
            if (i < list.size() - 1) {
                sb.append(strM8616ik);
                sb.append("-");
            } else {
                sb.append(strM8616ik);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ka */
    private void m8390ka(C2475mj c2475mj) {
        this.f6573ri.remove(m8385fi(c2475mj));
        List<List<C2475mj>> listM8610bu = c2475mj.m8610bu();
        if (listM8610bu == null || listM8610bu.size() <= 0) {
            return;
        }
        Iterator<List<C2475mj>> it = listM8610bu.iterator();
        while (it.hasNext()) {
            m8387ik(it.next());
        }
    }

    /* JADX INFO: renamed from: lr */
    private ik m8391lr(List<C2475mj> list, float f, float f2) {
        ik ikVarM8405ri = m8405ri(list);
        if (ikVarM8405ri != null && (ikVarM8405ri.f6575ri != 0.0f || ikVarM8405ri.f6574lr != 0.0f)) {
            return ikVarM8405ri;
        }
        ik ikVarM8386ik = m8386ik(list, f, f2);
        m8398ri(list, ikVarM8386ik);
        return ikVarM8386ik;
    }

    /* JADX INFO: renamed from: lr */
    private boolean m8392lr(C2475mj c2475mj) {
        if (c2475mj == null) {
            return false;
        }
        if (TextUtils.equals(c2475mj.m8627qt().m8592fi().igq(), "flex")) {
            return true;
        }
        return m8388ik(c2475mj);
    }

    /* JADX INFO: renamed from: lr */
    private boolean m8393lr(List<C2475mj> list) {
        List<List<C2475mj>> listM8610bu;
        Iterator<C2475mj> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().m8627qt().m8592fi().m8587zf(), "flex")) {
                return true;
            }
        }
        while (true) {
            boolean z = false;
            for (C2475mj c2475mj : list) {
                if (TextUtils.equals(c2475mj.m8627qt().m8592fi().m8587zf(), "auto") && (listM8610bu = c2475mj.m8610bu()) != null) {
                    Iterator<List<C2475mj>> it2 = listM8610bu.iterator();
                    int i = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            List<C2475mj> next = it2.next();
                            i++;
                            if (m8393lr(next)) {
                                if (i == next.size()) {
                                    z = true;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return z;
        }
    }

    /* JADX INFO: renamed from: ri */
    private ik m8394ri(String str, lr lrVar, boolean z, boolean z2, int i, C2475mj c2475mj) {
        return C2440sf.m8418ri(str, c2475mj.m8627qt().m8596lr(), lr.m8407ri(lrVar).toString(), z, z2, i, c2475mj, this.f6568fi, this.f6567di, this.xha, this.f6572mj, this.jbs);
    }

    /* JADX INFO: renamed from: ri */
    private void m8395ri(C2475mj c2475mj, ik ikVar) {
        this.f6573ri.put(m8385fi(c2475mj), ikVar);
    }

    /* JADX INFO: renamed from: ri */
    private void m8396ri(List<List<C2475mj>> list, float f, float f2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<C2475mj>> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (m8399ri(it.next(), false)) {
                z = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<C2475mj> list2 : list) {
            ri riVar = new ri();
            boolean zM8399ri = m8399ri(list2, !z);
            riVar.f6583ri = zM8399ri ? 1.0f : m8391lr(list2, f, f2).f6574lr;
            riVar.f6582lr = !zM8399ri;
            arrayList.add(riVar);
        }
        List<ri> listM8411ri = C2438qt.m8411ri(f2, arrayList);
        for (int i = 0; i < list.size(); i++) {
            if (((ri) arrayList.get(i)).f6583ri != listM8411ri.get(i).f6583ri) {
                List<C2475mj> list3 = list.get(i);
                m8387ik(list3);
                m8391lr(list3, f, listM8411ri.get(i).f6583ri);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m8397ri(List<ri> list, float f, List<C2475mj> list2) {
        float f2 = 0.0f;
        for (ri riVar : list) {
            if (riVar.f6582lr) {
                f2 += riVar.f6583ri;
            }
        }
        if (f2 > f) {
            int i = 0;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (list.get(i2).f6582lr && list2.get(i2).m8639uq()) {
                    i++;
                }
            }
            if (i > 0) {
                float fCeil = (float) (Math.ceil(((f2 - f) / i) * 1000.0f) / 1000.0d);
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    ri riVar2 = list.get(i3);
                    if (riVar2.f6582lr && list2.get(i3).m8639uq()) {
                        riVar2.f6583ri -= fCeil;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m8398ri(List<C2475mj> list, ik ikVar) {
        this.f6571lr.put(m8389ka(list), ikVar);
    }

    /* JADX INFO: renamed from: ri */
    private boolean m8399ri(List<C2475mj> list, boolean z) {
        for (C2475mj c2475mj : list) {
            C2470di c2470diM8592fi = c2475mj.m8627qt().m8592fi();
            String strIgq = c2470diM8592fi.igq();
            if (TextUtils.equals(strIgq, "flex") || (z && ((TextUtils.equals(c2470diM8592fi.m8587zf(), "flex") && TextUtils.equals(c2470diM8592fi.igq(), "scale") && C2471fi.f6753ri.get(c2475mj.m8627qt().m8596lr()).intValue() == 7) || TextUtils.equals(strIgq, "flex")))) {
                return true;
            }
        }
        Iterator<C2475mj> it = list.iterator();
        while (it.hasNext()) {
            if (m8388ik(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ik */
    public ik m8400ik(C2475mj c2475mj, float f, float f2) {
        if (c2475mj == null) {
            return null;
        }
        ik ikVarM8403ri = m8403ri(c2475mj);
        if (ikVarM8403ri != null && (ikVarM8403ri.f6575ri != 0.0f || ikVarM8403ri.f6574lr != 0.0f)) {
            return ikVarM8403ri;
        }
        ik ikVarM8401ka = m8401ka(c2475mj, f, f2);
        m8395ri(c2475mj, ikVarM8401ka);
        return ikVarM8401ka;
    }

    /* JADX INFO: renamed from: ka */
    public ik m8401ka(C2475mj c2475mj, float f, float f2) {
        float fMin;
        float f3;
        float f4;
        ik ikVar = new ik();
        float f5 = 0.0f;
        if (f2 <= 0.0f || f <= 0.0f) {
            ikVar.f6575ri = 0.0f;
            ikVar.f6574lr = 0.0f;
            return ikVar;
        }
        if (c2475mj.m8626nr()) {
            return m8404ri(c2475mj, f, f2);
        }
        float fM8625mj = c2475mj.m8625mj();
        float fJbs = c2475mj.jbs();
        float fM8640vr = c2475mj.m8640vr();
        float fSlm = c2475mj.slm();
        C2470di c2470diM8592fi = c2475mj.m8627qt().m8592fi();
        String strM8587zf = c2470diM8592fi.m8587zf();
        String strIgq = c2470diM8592fi.igq();
        float fMin2 = ((TextUtils.equals(strM8587zf, "flex") || TextUtils.equals(strM8587zf, "auto")) ? f : Math.min(fM8625mj, f)) - fM8640vr;
        if (TextUtils.equals(strIgq, "scale")) {
            fMin = Math.round(fMin2 / fJbs) + fSlm;
            if (fMin > f2) {
                fMin2 = Math.round((f2 - fSlm) * fJbs);
            }
        } else {
            fMin = (TextUtils.equals(strIgq, "auto") || TextUtils.equals(strIgq, "flex")) ? f2 : Math.min(fJbs, f2);
        }
        float f6 = fMin - fSlm;
        List<List<C2475mj>> listM8610bu = c2475mj.m8610bu();
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        for (List<C2475mj> list : listM8610bu) {
            float f7 = f5;
            float f8 = fM8640vr;
            ik ikVarM8391lr = m8391lr(list, fMin2, f6);
            if (m8393lr(list)) {
                f4 = f7 + 1.0f;
            } else {
                fMax = Math.max(fMax, ikVarM8391lr.f6575ri);
                f4 = f7;
            }
            float f9 = f4;
            float f10 = fMin2;
            fMax2 = c2475mj.m8627qt().m8596lr().equals("carousel") ? Math.max(c2475mj.jbs(), ikVarM8391lr.f6574lr) : fMax2 + ikVarM8391lr.f6574lr;
            fM8640vr = f8;
            f5 = f9;
            fMin2 = f10;
        }
        float f11 = f5;
        float f12 = fMin2;
        float f13 = fM8640vr;
        if (!TextUtils.equals(strM8587zf, "auto")) {
            f3 = f12;
        } else if (f11 == listM8610bu.size()) {
            f3 = f;
        } else {
            for (List<C2475mj> list2 : listM8610bu) {
                m8387ik(list2);
                m8391lr(list2, fMax, f6);
            }
            f3 = fMax;
        }
        if (TextUtils.equals(strIgq, "auto")) {
            if (fMax2 <= f2) {
                f6 = fMax2;
            } else {
                m8396ri(listM8610bu, f3, f6);
            }
        } else if ((TextUtils.equals(strIgq, "fixed") || TextUtils.equals(strIgq, "flex")) && f6 < fMax2) {
            m8396ri(listM8610bu, f3, f6);
        }
        ikVar.f6575ri = Math.min(f3 + f13, f);
        ikVar.f6574lr = Math.min(f6 + fSlm, f2);
        return ikVar;
    }

    /* JADX INFO: renamed from: lr */
    public ik m8402lr(C2475mj c2475mj, float f, float f2) {
        ik ikVar = new ik();
        if (c2475mj.m8627qt().m8592fi() == null) {
            return ikVar;
        }
        ik ikVarM8384fi = m8384fi(c2475mj, f, f2);
        float f3 = ikVarM8384fi.f6575ri;
        float f4 = ikVarM8384fi.f6574lr;
        ikVar.f6575ri = Math.min(f3, f);
        ikVar.f6574lr = Math.min(f4, f2);
        return ikVar;
    }

    /* JADX INFO: renamed from: ri */
    public ik m8403ri(C2475mj c2475mj) {
        return this.f6573ri.get(m8385fi(c2475mj));
    }

    /* JADX INFO: renamed from: ri */
    public ik m8404ri(C2475mj c2475mj, float f, float f2) {
        float f3;
        if ((!TextUtils.isEmpty(c2475mj.m8627qt().m8593ik()) || c2475mj.m8627qt().m8592fi().yjm() != null) && !TextUtils.equals(c2475mj.m8627qt().m8596lr(), "creative-playable-bait")) {
            float fM8625mj = c2475mj.m8625mj();
            float fJbs = c2475mj.jbs();
            C2470di c2470diM8592fi = c2475mj.m8627qt().m8592fi();
            String strM8587zf = c2470diM8592fi.m8587zf();
            String strIgq = c2470diM8592fi.igq();
            float fM8608aw = c2475mj.m8608aw();
            float fBgr = c2475mj.bgr();
            float fM8640vr = c2475mj.m8640vr();
            float fSlm = c2475mj.slm();
            if (TextUtils.equals(strM8587zf, "fixed")) {
                f = Math.min(fM8625mj, f);
                if (TextUtils.equals(strIgq, "auto")) {
                    f3 = m8402lr(c2475mj, f - fM8640vr, f2 - fSlm).f6574lr;
                    fJbs = f3 + fSlm;
                }
            } else if (TextUtils.equals(strM8587zf, "auto")) {
                ik ikVarM8402lr = m8402lr(c2475mj, f - fM8640vr, f2 - fSlm);
                f = ikVarM8402lr.f6575ri + fM8640vr;
                if (TextUtils.equals(strIgq, "auto")) {
                    f3 = ikVarM8402lr.f6574lr;
                    fJbs = f3 + fSlm;
                }
            } else if (!TextUtils.equals(strM8587zf, "flex")) {
                f = fM8625mj;
            } else if (TextUtils.equals(strIgq, "auto")) {
                f3 = m8402lr(c2475mj, f - fM8640vr, f2 - fSlm).f6574lr;
                fJbs = f3 + fSlm;
            }
            if (TextUtils.equals(strIgq, "scale")) {
                float fRound = Math.round((f - fM8608aw) / fJbs) + fBgr;
                if (fRound > f2) {
                    f = Math.round((f2 - fBgr) * fJbs) + fM8608aw;
                } else {
                    f2 = fRound;
                }
            } else if (TextUtils.equals(strIgq, "fixed")) {
                f2 = Math.min(fJbs + fBgr, f2);
            } else if (!TextUtils.equals(strIgq, "flex")) {
                f2 = fJbs;
            }
            ik ikVar = new ik();
            ikVar.f6575ri = f;
            ikVar.f6574lr = f2;
            return ikVar;
        }
        return new ik(0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: ri */
    public ik m8405ri(List<C2475mj> list) {
        return this.f6571lr.get(m8389ka(list));
    }

    /* JADX INFO: renamed from: ri */
    public void m8406ri() {
        this.f6569ik.clear();
        this.f6573ri.clear();
        this.f6571lr.clear();
    }
}

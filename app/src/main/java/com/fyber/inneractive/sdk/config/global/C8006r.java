package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.AbstractC8013k;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.AbstractC7981i;
import com.fyber.inneractive.sdk.config.global.features.C7974b;
import com.fyber.inneractive.sdk.config.global.features.C7975c;
import com.fyber.inneractive.sdk.config.global.features.C7976d;
import com.fyber.inneractive.sdk.config.global.features.C7977e;
import com.fyber.inneractive.sdk.config.global.features.C7978f;
import com.fyber.inneractive.sdk.config.global.features.C7979g;
import com.fyber.inneractive.sdk.config.global.features.C7980h;
import com.fyber.inneractive.sdk.config.global.features.C7982j;
import com.fyber.inneractive.sdk.config.global.features.C7983k;
import com.fyber.inneractive.sdk.config.global.features.C7984l;
import com.fyber.inneractive.sdk.config.global.features.C7985m;
import com.fyber.inneractive.sdk.config.global.features.C7986n;
import com.fyber.inneractive.sdk.config.global.features.C7987o;
import com.fyber.inneractive.sdk.config.global.features.C7990r;
import com.fyber.inneractive.sdk.config.global.features.C7991s;
import com.fyber.inneractive.sdk.config.global.features.C7994v;
import com.fyber.inneractive.sdk.config.global.features.InterfaceC7988p;
import com.fyber.inneractive.sdk.serverapi.AbstractC9113b;
import com.fyber.inneractive.sdk.util.EnumC9204x;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.InterfaceC9201w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.global.r */
/* JADX INFO: loaded from: classes4.dex */
public final class C8006r {

    /* JADX INFO: renamed from: a */
    public String f17775a = "";

    /* JADX INFO: renamed from: b */
    public final HashMap f17776b;

    /* JADX INFO: renamed from: c */
    public JSONArray f17777c;

    public C8006r() {
        HashMap map = new HashMap();
        map.put(C7994v.class, new C7994v());
        map.put(C7976d.class, new C7976d());
        map.put(C7985m.class, new C7985m());
        map.put(C7978f.class, new C7978f());
        map.put(C7984l.class, new C7984l());
        map.put(C7977e.class, new C7977e());
        map.put(C7991s.class, new C7991s());
        map.put(C7982j.class, new C7982j());
        map.put(C7990r.class, new C7990r());
        map.put(C7987o.class, new C7987o());
        map.put(C7975c.class, new C7975c());
        map.put(C7986n.class, new C7986n());
        map.put(C7974b.class, new C7974b());
        map.put(C7980h.class, new C7980h());
        map.put(C7983k.class, new C7983k());
        map.put(C7979g.class, new C7979g());
        this.f17776b = map;
        this.f17777c = null;
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((Class) entry.getKey(), ((AbstractC7981i) entry.getValue()).mo20413b());
        }
        this.f17776b = map2;
        IAlog.m21945a("%s: created. Supported features: %s", "SupportedFeaturesProvider", map2);
    }

    /* JADX INFO: renamed from: a */
    public static C8006r m20431a() {
        int i = AbstractC8013k.f17788a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.featuresConfig");
        boolean z = false;
        if (!TextUtils.isEmpty(property)) {
            try {
                IAConfigManager.f17654M.f17693y.f17742a = C8000l.m20429a(new JSONObject(property));
                z = true;
            } catch (Exception unused) {
                IAlog.m21945a("failed parsing local features json", new Object[0]);
            }
        }
        C8006r c8006r = new C8006r();
        if (z) {
            IAConfigManager iAConfigManager = IAConfigManager.f17654M;
            iAConfigManager.f17667K.m20434a(true, "");
            iAConfigManager.f17660D.m20646a(iAConfigManager.f17667K);
        }
        return c8006r;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC7981i m20432a(Class cls) {
        if (this.f17776b.containsKey(cls)) {
            AbstractC7981i abstractC7981i = (AbstractC7981i) this.f17776b.get(cls);
            if (cls.isInstance(abstractC7981i)) {
                return abstractC7981i;
            }
        }
        try {
            return (AbstractC7981i) cls.getConstructor(null).newInstance(null);
        } catch (Exception e) {
            IAlog.m21944a("Couldn't create a feature for %s", e, cls.getName());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20433a(C7971e c7971e) {
        for (AbstractC7981i abstractC7981i : this.f17776b.values()) {
            abstractC7981i.getClass();
            ArrayList arrayList = new ArrayList(abstractC7981i.f17758c.values());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C7968b c7968b = (C7968b) arrayList.get(size);
                ArrayList<InterfaceC7970d> arrayList2 = c7968b.f17747d;
                if (arrayList2 != null) {
                    for (InterfaceC7970d interfaceC7970d : arrayList2) {
                        if (interfaceC7970d.mo20412a(c7971e)) {
                            abstractC7981i.f17758c.remove(c7968b.f17744a);
                            abstractC7981i.f17759d.remove(c7968b.f17744a);
                            this.f17777c = null;
                            IAlog.m21945a("%s: Experiment %s filtered! after response %s", "SupportedFeaturesProvider", c7968b.f17744a, interfaceC7970d);
                            break;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01cd A[EDGE_INSN: B:109:0x01cd->B:60:0x01cd BREAK  A[LOOP:4: B:53:0x0197->B:58:0x01b8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x010c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0118  */
    /* JADX WARN: Code duplicated, block: B:55:0x019d  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b8 A[LOOP:4: B:53:0x0197->B:58:0x01b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX INFO: renamed from: a */
    public final void m20434a(boolean z, String str) {
        int iNextInt;
        Iterator it;
        int i;
        int i2;
        C7999k c7999k;
        int i3;
        Iterator it2;
        InterfaceC8002n interfaceC8002n;
        ?? r8;
        boolean zMo20714a;
        this.f17775a = str;
        C7967a c7967a = IAConfigManager.f17654M.f17693y;
        c7967a.f17743b = this;
        for (AbstractC7981i abstractC7981i : this.f17776b.values()) {
            boolean z2 = abstractC7981i instanceof InterfaceC7988p;
            if ((z2 && z) || (!z2 && !z)) {
                C8000l c8000l = c7967a.f17742a;
                if (abstractC7981i != null && c8000l != null) {
                    C8005q c8005q = (C8005q) c8000l.f17770a.get(abstractC7981i.f17757b);
                    int i4 = 2;
                    int i5 = 1;
                    int i6 = 0;
                    if (c8005q != null) {
                        abstractC7981i.f17772a = c8005q.f17772a;
                        IAlog.m21945a("%s: Feature before variant merge: %s", "a", abstractC7981i);
                        HashMap map = c8005q.f17774c;
                        Iterator it3 = map.keySet().iterator();
                        while (it3.hasNext()) {
                            C7968b c7968b = (C7968b) map.get((String) it3.next());
                            if (c7968b != null) {
                                int iNextInt2 = new Random().nextInt(100) + i5;
                                if (c7968b.f17745b < iNextInt2) {
                                    String str2 = c7968b.f17744a;
                                    Integer numValueOf = Integer.valueOf(iNextInt2);
                                    Integer numValueOf2 = Integer.valueOf(c7968b.f17745b);
                                    Object[] objArr = new Object[4];
                                    objArr[i6] = "a";
                                    objArr[i5] = str2;
                                    objArr[i4] = numValueOf;
                                    objArr[3] = numValueOf2;
                                    IAlog.m21945a("%s: Experiment '%s' filtered! rand: %d, with perc: %d", objArr);
                                    i4 = i4;
                                    i6 = i6;
                                } else {
                                    ArrayList arrayList = c7968b.f17747d;
                                    if (arrayList != null) {
                                        Iterator it4 = arrayList.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                i6 = i6;
                                                InterfaceC7970d interfaceC7970d = (InterfaceC7970d) it4.next();
                                                i4 = i4;
                                                try {
                                                    Long lValueOf = Long.valueOf(IAConfigManager.f17654M.f17672d);
                                                    C7971e c7971e = new C7971e();
                                                    c7971e.f17751b = lValueOf;
                                                    c7971e.f17752c = AbstractC9113b.m21905a(c7967a.f17743b.f17775a);
                                                    if (interfaceC7970d.mo20412a(c7971e)) {
                                                        String str3 = c7968b.f17744a;
                                                        Object[] objArr2 = new Object[3];
                                                        objArr2[i6] = "a";
                                                        objArr2[i5] = str3;
                                                        objArr2[i4] = interfaceC7970d;
                                                        IAlog.m21945a("%s: Experiment '%s' filtered! with %s", objArr2);
                                                    }
                                                } catch (NumberFormatException unused) {
                                                    Object[] objArr3 = new Object[i5];
                                                    objArr3[i6] = "a";
                                                    IAlog.m21945a("%s: invalid publisherId", objArr3);
                                                }
                                            } else {
                                                i4 = i4;
                                                i6 = i6;
                                                if (abstractC7981i instanceof C7994v) {
                                                    it2 = c7968b.f17746c.iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            C7999k c7999k2 = (C7999k) it2.next();
                                                            interfaceC8002n = c7999k2.f17772a;
                                                            if (interfaceC8002n == null && interfaceC8002n.mo20430a() != null && c7999k2.f17772a.mo20430a().containsKey("use_fmp_cache_mechanism")) {
                                                                InterfaceC9201w interfaceC9201w = (InterfaceC9201w) IAConfigManager.f17654M.f17663G.get(EnumC9204x.Video);
                                                                if (interfaceC9201w != null) {
                                                                    zMo20714a = interfaceC9201w.mo20714a();
                                                                } else {
                                                                    r8 = i6;
                                                                }
                                                                r8 = r8 == 0 ? zMo20714a : zMo20714a;
                                                            }
                                                        }
                                                    }
                                                }
                                                String str4 = c7968b.f17744a;
                                                Integer numValueOf3 = Integer.valueOf(iNextInt2);
                                                Integer numValueOf4 = Integer.valueOf(c7968b.f17745b);
                                                Object[] objArr4 = new Object[4];
                                                objArr4[i6] = "a";
                                                objArr4[i5] = str4;
                                                objArr4[i4] = numValueOf3;
                                                objArr4[3] = numValueOf4;
                                                IAlog.m21945a("%s: Experiment '%s' NOT filtered! rand: %d, with perc: %d", objArr4);
                                                ArrayList arrayList2 = c7968b.f17746c;
                                                iNextInt = new Random().nextInt(100) + i5;
                                                String str5 = c7968b.f17744a;
                                                Integer numValueOf5 = Integer.valueOf(iNextInt);
                                                Object[] objArr5 = new Object[3];
                                                objArr5[i6] = "a";
                                                objArr5[i5] = str5;
                                                objArr5[i4] = numValueOf5;
                                                IAlog.m21945a("%s: selectVariant for experiment '%s' generated random number: %d", objArr5);
                                                it = arrayList2.iterator();
                                                i = i6;
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        i2 = i5;
                                                        c7999k = null;
                                                        break;
                                                    }
                                                    c7999k = (C7999k) it.next();
                                                    i += c7999k.f17769c;
                                                    i3 = i4;
                                                    Object[] objArr6 = new Object[i3];
                                                    objArr6[i6] = "a";
                                                    objArr6[i5] = c7999k;
                                                    i2 = i5;
                                                    IAlog.m21945a("%s: selectVariant variant found: %s", objArr6);
                                                    if (i >= iNextInt) {
                                                        break;
                                                    }
                                                    String str6 = c7999k.f17768b;
                                                    Object[] objArr7 = new Object[i3];
                                                    objArr7[i6] = "a";
                                                    objArr7[i2] = str6;
                                                    IAlog.m21945a("%s: selectVariant variant '%s' percentage outside selected range", objArr7);
                                                    i5 = i2;
                                                    i4 = 2;
                                                }
                                                if (c7999k != null) {
                                                    String str7 = c7968b.f17744a;
                                                    Object[] objArr8 = new Object[3];
                                                    objArr8[i6] = "a";
                                                    objArr8[i2] = str7;
                                                    objArr8[2] = c7999k;
                                                    IAlog.m21945a("%s: experiment '%s' variant selected! %s", objArr8);
                                                } else {
                                                    String str8 = c7968b.f17744a;
                                                    Object[] objArr9 = new Object[2];
                                                    objArr9[i6] = "a";
                                                    objArr9[i2] = str8;
                                                    IAlog.m21945a("%s: experiment '%s' no variant was selected! using control group", objArr9);
                                                }
                                                abstractC7981i.f17758c.put(c7968b.f17744a, c7968b);
                                                if (c7999k != null) {
                                                    abstractC7981i.f17759d.put(c7968b.f17744a, c7999k);
                                                }
                                                i6 = i6;
                                                i5 = i2;
                                                i4 = 2;
                                            }
                                        }
                                    } else {
                                        i4 = i4;
                                        i6 = i6;
                                        if (abstractC7981i instanceof C7994v) {
                                            it2 = c7968b.f17746c.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    C7999k c7999k3 = (C7999k) it2.next();
                                                    interfaceC8002n = c7999k3.f17772a;
                                                    if (interfaceC8002n == null) {
                                                    }
                                                }
                                            }
                                        }
                                        String str9 = c7968b.f17744a;
                                        Integer numValueOf6 = Integer.valueOf(iNextInt2);
                                        Integer numValueOf7 = Integer.valueOf(c7968b.f17745b);
                                        Object[] objArr10 = new Object[4];
                                        objArr10[i6] = "a";
                                        objArr10[i5] = str9;
                                        objArr10[i4] = numValueOf6;
                                        objArr10[3] = numValueOf7;
                                        IAlog.m21945a("%s: Experiment '%s' NOT filtered! rand: %d, with perc: %d", objArr10);
                                        ArrayList arrayList3 = c7968b.f17746c;
                                        iNextInt = new Random().nextInt(100) + i5;
                                        String str10 = c7968b.f17744a;
                                        Integer numValueOf8 = Integer.valueOf(iNextInt);
                                        Object[] objArr11 = new Object[3];
                                        objArr11[i6] = "a";
                                        objArr11[i5] = str10;
                                        objArr11[i4] = numValueOf8;
                                        IAlog.m21945a("%s: selectVariant for experiment '%s' generated random number: %d", objArr11);
                                        it = arrayList3.iterator();
                                        i = i6;
                                        while (true) {
                                            if (it.hasNext()) {
                                                i2 = i5;
                                                c7999k = null;
                                                break;
                                            }
                                            c7999k = (C7999k) it.next();
                                            i += c7999k.f17769c;
                                            i3 = i4;
                                            Object[] objArr12 = new Object[i3];
                                            objArr12[i6] = "a";
                                            objArr12[i5] = c7999k;
                                            i2 = i5;
                                            IAlog.m21945a("%s: selectVariant variant found: %s", objArr12);
                                            if (i >= iNextInt) {
                                                break;
                                                break;
                                            }
                                            String str11 = c7999k.f17768b;
                                            Object[] objArr13 = new Object[i3];
                                            objArr13[i6] = "a";
                                            objArr13[i2] = str11;
                                            IAlog.m21945a("%s: selectVariant variant '%s' percentage outside selected range", objArr13);
                                            i5 = i2;
                                            i4 = 2;
                                        }
                                        if (c7999k != null) {
                                            String str12 = c7968b.f17744a;
                                            Object[] objArr14 = new Object[3];
                                            objArr14[i6] = "a";
                                            objArr14[i2] = str12;
                                            objArr14[2] = c7999k;
                                            IAlog.m21945a("%s: experiment '%s' variant selected! %s", objArr14);
                                        } else {
                                            String str13 = c7968b.f17744a;
                                            Object[] objArr15 = new Object[2];
                                            objArr15[i6] = "a";
                                            objArr15[i2] = str13;
                                            IAlog.m21945a("%s: experiment '%s' no variant was selected! using control group", objArr15);
                                        }
                                        abstractC7981i.f17758c.put(c7968b.f17744a, c7968b);
                                        if (c7999k != null) {
                                            abstractC7981i.f17759d.put(c7968b.f17744a, c7999k);
                                        }
                                        i6 = i6;
                                        i5 = i2;
                                        i4 = 2;
                                    }
                                }
                                i6 = i6;
                                i4 = i4;
                            }
                        }
                    }
                    Object[] objArr16 = new Object[i4];
                    objArr16[i6] = "a";
                    objArr16[i5] = abstractC7981i;
                    IAlog.m21945a("%s: Feature after variant merge: %s", objArr16);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final JSONArray m20435b() {
        JSONArray jSONArray = this.f17777c;
        if (jSONArray == null || jSONArray.length() == 0) {
            JSONArray jSONArrayM20428a = AbstractC7995g.m20428a(this.f17776b, false);
            this.f17777c = jSONArrayM20428a;
            IAlog.m21945a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArrayM20428a);
        }
        return this.f17777c;
    }
}

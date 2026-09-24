package com.bytedance.sdk.component.adexpress.dynamic.p116fi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.fi.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C2438qt {
    /* JADX INFO: renamed from: ri */
    public static float m8410ri(float f) {
        return (float) Math.ceil((f * 16.0f) / 16.0f);
    }

    /* JADX INFO: renamed from: ri */
    public static List<C2436lr.ri> m8411ri(float f, List<C2436lr.ri> list) {
        ArrayList<C2436lr.ri> arrayList = new ArrayList();
        Iterator<C2436lr.ri> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((C2436lr.ri) it.next().clone());
        }
        boolean z = true;
        int i = 0;
        int i2 = 0;
        for (C2436lr.ri riVar : arrayList) {
            if (riVar.f6582lr) {
                i = (int) (i + riVar.f6583ri);
            } else {
                i2 = (int) (i2 + riVar.f6583ri);
                z = false;
            }
        }
        if (!z || f <= i) {
            float f2 = i;
            float f3 = f < f2 ? f / f2 : 1.0f;
            float f4 = f > f2 ? (f - f2) / i2 : 0.0f;
            if (f4 > 1.0f) {
                ArrayList arrayList2 = new ArrayList();
                boolean z2 = false;
                for (C2436lr.ri riVar2 : arrayList) {
                    if (!riVar2.f6582lr && riVar2.f6581ik != 0.0f && riVar2.f6583ri * f4 > riVar2.f6581ik) {
                        riVar2.f6583ri = riVar2.f6581ik;
                        riVar2.f6582lr = true;
                        z2 = true;
                    }
                    arrayList2.add(riVar2);
                }
                if (z2) {
                    return m8411ri(f, arrayList2);
                }
            }
            int i3 = 0;
            for (C2436lr.ri riVar3 : arrayList) {
                if (riVar3.f6582lr) {
                    riVar3.f6583ri = m8410ri(riVar3.f6583ri * f3);
                } else {
                    riVar3.f6583ri = m8410ri(riVar3.f6583ri * f4);
                }
                i3 = (int) (i3 + riVar3.f6583ri);
            }
            float f5 = i3;
            if (f5 < f) {
                float f6 = f - f5;
                for (int size = 0; size < arrayList.size() && f6 > 0.0f; size = (size + 1) % arrayList.size()) {
                    C2436lr.ri riVar4 = (C2436lr.ri) arrayList.get(size);
                    if ((f < f2 && riVar4.f6582lr) || (f > f2 && !riVar4.f6582lr)) {
                        riVar4.f6583ri += 0.0625f;
                        f6 -= 0.0625f;
                    }
                }
            }
        }
        return arrayList;
    }
}

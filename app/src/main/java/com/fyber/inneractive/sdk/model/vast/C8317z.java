package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.model.vast.z */
/* JADX INFO: loaded from: classes4.dex */
public final class C8317z implements Comparable {

    /* JADX INFO: renamed from: a */
    public final Integer[] f18585a;

    /* JADX INFO: renamed from: b */
    public final String f18586b;

    public C8317z(String str) throws C8316y {
        this.f18585a = new Integer[0];
        if (TextUtils.isEmpty(str) || !str.matches("^[0-9.]+$")) {
            throw new C8316y();
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split("\\.")) {
            arrayList.add(Integer.valueOf(AbstractC9195v.m22022a(str2, 0)));
        }
        this.f18585a = (Integer[]) arrayList.toArray(new Integer[arrayList.size()]);
        this.f18586b = str;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C8317z c8317z) {
        if (c8317z == null) {
            return 1;
        }
        int iMax = Math.max(this.f18585a.length, c8317z.f18585a.length);
        int i = 0;
        while (i < iMax) {
            Integer[] numArr = this.f18585a;
            int iIntValue = numArr.length > i ? numArr[i].intValue() : 0;
            Integer[] numArr2 = c8317z.f18585a;
            int iIntValue2 = numArr2.length > i ? numArr2[i].intValue() : 0;
            if (iIntValue > iIntValue2) {
                return 1;
            }
            if (iIntValue2 > iIntValue) {
                return -1;
            }
            i++;
        }
        return 0;
    }

    public final String toString() {
        return this.f18586b;
    }
}

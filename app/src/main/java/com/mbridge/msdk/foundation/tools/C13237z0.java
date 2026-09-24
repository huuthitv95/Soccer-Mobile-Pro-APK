package com.mbridge.msdk.foundation.tools;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.z0 */
/* JADX INFO: compiled from: StringSetEncoder.java */
/* JADX INFO: loaded from: classes6.dex */
class C13237z0 implements FastKV.InterfaceC13170b<Set<String>> {

    /* JADX INFO: renamed from: a */
    static final C13237z0 f36412a = new C13237z0();

    private C13237z0() {
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.InterfaceC13170b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<String> mo37550a(byte[] bArr, int i, int i2) {
        int i3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i2 > 0) {
            C13184b0 c13184b0 = new C13184b0(bArr, i);
            int i4 = i + i2;
            while (true) {
                i3 = c13184b0.f36244b;
                if (i3 >= i4) {
                    break;
                }
                linkedHashSet.add(c13184b0.m37622e(c13184b0.m37624g()));
            }
            if (i3 != i4) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.InterfaceC13170b
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] mo37552a(Set<String> set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        int size = set.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int iM37605f = 0;
        int i = 0;
        for (String str : set) {
            if (str == null) {
                iM37605f += 5;
                iArr[i] = -1;
            } else {
                int iM37603b = C13184b0.m37603b(str);
                strArr[i] = str;
                iArr[i] = iM37603b;
                iM37605f += C13184b0.m37605f(iM37603b) + iM37603b;
            }
            i++;
        }
        C13184b0 c13184b0 = new C13184b0(iM37605f);
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = iArr[i2];
            c13184b0.m37626h(i3);
            if (i3 >= 0) {
                c13184b0.m37618c(strArr[i2]);
            }
        }
        return c13184b0.f36243a;
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.InterfaceC13170b
    /* JADX INFO: renamed from: a */
    public String mo37551a() {
        return "StringSet";
    }
}

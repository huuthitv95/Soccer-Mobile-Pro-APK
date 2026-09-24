package com.ironsource.adqualitysdk.sdk.p286i;

import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.em */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11929em extends AbstractC11928el {

    /* JADX INFO: renamed from: ｋ */
    private static long f28806 = 7639586790063372371L;

    public AbstractC11929em(AbstractC11919ec abstractC11919ec, AbstractC11919ec abstractC11919ec2, C11904do c11904do) {
        super(abstractC11919ec, abstractC11919ec2, c11904do);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11928el
    /* JADX INFO: renamed from: ﻐ */
    final boolean mo30175(String str, String str2) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m30176("焝䴑煞㔣嗍ꔅ\uec12蒅逾ᓺ萟\ua634돪瞗\ue683쟢튋元셧", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
        sb.append(str);
        sb.append(m30176("滿项滟\ue04b긹廱辧\ue73a输", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1).intern());
        sb.append(str2);
        throw new RuntimeException(sb.toString());
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11928el
    /* JADX INFO: renamed from: ﻐ */
    final boolean mo30174(Object obj, Object obj2) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m30176("焝䴑煞㔣嗍ꔅ\uec12蒅逾ᓺ萟\ua634돪瞗\ue683쟢튋元셧", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1).intern());
        sb.append(obj);
        sb.append(m30176("滿项滟\ue04b긹廱辧\ue73a输", View.combineMeasuredStates(0, 0) + 1).intern());
        sb.append(obj2);
        throw new RuntimeException(sb.toString());
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30176(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f28806, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f28806));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}

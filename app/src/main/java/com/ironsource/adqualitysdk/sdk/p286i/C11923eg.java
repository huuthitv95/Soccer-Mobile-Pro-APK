package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.eg */
/* JADX INFO: loaded from: classes6.dex */
public final class C11923eg extends AbstractC11925ei {

    /* JADX INFO: renamed from: ﻛ */
    private static int f28787 = 0;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28788 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static char[] f28789 = {'E', 1135, 2120, 3128, 4102, 5297, 6347, 7357, 8329, 9577, 10583, 11614, 12584, 13584, 14840, 15828, 16880, 17822, 19071, 20037, 21047, 22018, 23052, 24306, 25288, 26273, 27346, 28520, 29513, 30525, 31558, 32742, 33752, 34765, 35752, 36754, 37991, 38978, 39975, 40964, 42214, 43141, 47203, 48228, 45079, 46204, 43092, 44193, 41113, 42229, 39057, 40232, 37140, 38214, 35184, 36179, 33194, 34250, 63954, 65001, 62067, 62993, 60019, 60952, 57938, 59052, 55954, 57081, 53979, 55078, 51994, 53090, 49995, 51135, 15261, 16324, 13292, 14284, 11303, 8205, 9332, 6214, 7409};

    /* JADX INFO: renamed from: ﻐ */
    private static long f28786 = -3982388179973635043L;

    public C11923eg(AbstractC11919ec abstractC11919ec, AbstractC11919ec abstractC11919ec2, C11904do c11904do) {
        super(abstractC11919ec, abstractC11919ec2, c11904do);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11919ec
    /* JADX INFO: renamed from: ﾇ */
    public final C11908ds mo30123(C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        int i2 = f28787 + 13;
        f28788 = i2 % 128;
        int i3 = i2 % 2;
        C11908ds c11908dsM30156 = m30168().m30156(c11907dr, c11877co);
        Object obj = null;
        try {
            Object objM30066 = m30169().m30156(c11907dr, c11877co).m30066();
            if (objM30066 instanceof JSONObject) {
                C11908ds c11908ds = new C11908ds(((JSONObject) objM30066).opt((String) c11908dsM30156.m30066()));
                int i4 = f28788 + 107;
                f28787 = i4 % 128;
                if (i4 % 2 == 0) {
                    return c11908ds;
                }
                super.hashCode();
                throw null;
            }
            if (objM30066 instanceof JSONArray) {
                return new C11908ds(((JSONArray) objM30066).opt(c11908dsM30156.m30063().intValue()));
            }
            if (objM30066 instanceof Map) {
                return new C11908ds(((Map) objM30066).get(c11908dsM30156.m30066()));
            }
            if (objM30066 instanceof List) {
                return new C11908ds(((List) objM30066).get(c11908dsM30156.m30063().intValue()));
            }
            if (objM30066.getClass().isArray()) {
                return new C11908ds(((Object[]) objM30066)[c11908dsM30156.m30063().intValue()]);
            }
            String strM29666 = c11877co.m29666();
            StringBuilder sb = new StringBuilder();
            sb.append(m30165(TextUtils.indexOf("", ""), (char) ExpandableListView.getPackedPositionType(0L), TextUtils.lastIndexOf("", '0', 0, 0) + 43).intern());
            sb.append(this);
            sb.append(m30154());
            sb.append(m30165((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 47193), 41 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern());
            sb.append(objM30066);
            C11875cm.m29607(strM29666, sb.toString(), null);
            return new C11908ds(null);
        } catch (Exception e) {
            String strM29667 = c11877co.m29666();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m30165(TextUtils.getOffsetBefore("", 0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 42 - (KeyEvent.getMaxKeyCode() >> 16)).intern());
            sb2.append(this);
            sb2.append(m30154());
            C11875cm.m29607(strM29667, sb2.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30165(int i, char c, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f28789[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f28786)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}

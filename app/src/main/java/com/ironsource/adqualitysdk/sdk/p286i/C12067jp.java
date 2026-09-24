package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jp */
/* JADX INFO: loaded from: classes6.dex */
public final class C12067jp {

    /* JADX INFO: renamed from: ﱡ */
    private static int f29693 = 0;

    /* JADX INFO: renamed from: ﻏ */
    private static int f29694 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static C11903dn f29697;

    /* JADX INFO: renamed from: ﻐ */
    private final String f29698;

    /* JADX INFO: renamed from: ｋ */
    private final boolean f29699;

    /* JADX INFO: renamed from: ﾇ */
    private static char[] f29696 = {'W', 2104, 4312, 6465, 8477, 10676, 12889, 15041, 17051, 19212, 21452, 23445, 25657, 27866, 30050, 32028, 34210, 'E', 2095, 4296, 6520, 8454, 10737, 12871, 15077, 17026, 19232, 21441, 23435, 25653, 27863, 30065, 32083, 34234, 36446, 38570, 40595, 42795, 44929, 46985, 49214, 51418, 53571, 55579, 57770, 59995, 62131, 64198, 6551, 4554, 2367, 149, 14578, 12376, 11169, 8979, 23419, 21215, 18991, 16993, 32207, 30011, 27803, 25842, 40025, 38844, 36635, 2190, 211, 6188, 4493, 10732, 8521, 15028, 12816, 19042, 17370, 23332, 21367, 27860, 9334, 11307, 13522, 15714, 1293, 3502, 5698, 7929, 26255, 28475, 30674, 32655, AbstractJsonLexerKt.BEGIN_LIST, 2054, 4345, 6488, 8506, 10655, 12907, 15048, 17084, 19210, 21488, 23456, 25622, 27882, 30027, 32046, 28379, 26289, 32342, 30694, 20376, 18287, 23769, 21627, 11350, 9660, 15705, 13589, 2696, 596, 7132, 4994, 60167, 57565, 63614, 61468, 51641, 49483, 55642, 44773};

    /* JADX INFO: renamed from: ﻛ */
    private static long f29695 = 7240293159185942621L;

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ String m30720(C12067jp c12067jp) {
        int i = 2 % 2;
        int i2 = f29693 + 107;
        f29694 = i2 % 128;
        int i3 = i2 % 2;
        String strM30715 = c12067jp.m30715();
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        return strM30715;
    }

    public C12067jp(String str, boolean z) {
        this.f29698 = str;
        this.f29699 = z;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final void m30721(final WebView webView) {
        int i = 2 % 2;
        try {
            C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.jp.5
                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                /* JADX INFO: renamed from: ﻛ */
                public final void mo28224() {
                    final String strM30720 = C12067jp.m30720(C12067jp.this);
                    C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.jp.5.4
                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            C12084ki.m30901(webView, strM30720);
                        }
                    });
                }
            });
            int i2 = f29694 + 3;
            f29693 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 33 / 0;
            }
        } catch (Exception e) {
            String strIntern = m30718((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) View.MeasureSpec.getMode(0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 18).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m30718(MotionEvent.axisFromString("") + 18, (char) Color.alpha(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31).intern());
            sb.append(e.getLocalizedMessage());
            C12085l.m30929(strIntern, sb.toString());
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public static void m30716(C11903dn c11903dn) {
        int i = 2 % 2;
        int i2 = f29694 + 11;
        int i3 = i2 % 128;
        f29693 = i3;
        int i4 = i2 % 2;
        f29697 = c11903dn;
        int i5 = i3 + 65;
        f29694 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private String m30719() {
        String strReplace;
        int i = 2 % 2;
        int i2 = f29693 + 79;
        f29694 = i2 % 128;
        int i3 = i2 % 2;
        String strM30031 = f29697.m30031();
        try {
            String strReplace2 = strM30031.replace(m30718((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 48, (char) (6605 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19).intern(), m30717()).replace(m30718(66 - Process.getGidForName(""), (char) (TextUtils.getOffsetAfter("", 0) + 2261), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13).intern(), f29697.m30034());
            if (!this.f29699) {
                strReplace = strReplace2.replace(m30718(80 - ExpandableListView.getPackedPositionType(0L), (char) (9261 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), View.MeasureSpec.getSize(0) + 12).intern(), "");
            } else {
                int i4 = f29694 + 5;
                f29693 = i4 % 128;
                int i5 = i4 % 2;
                strReplace = strReplace2.replace(m30718(80 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 9262), TextUtils.lastIndexOf("", '0', 0) + 13).intern(), f29697.m30033());
            }
            strM30031 = strReplace;
            return strM30031.replace(m30718(92 - KeyEvent.keyCodeFromString(""), (char) (Process.myPid() >> 22), 15 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), this.f29698);
        } catch (Throwable th) {
            String strIntern = m30718(Process.myPid() >> 22, (char) (TextUtils.lastIndexOf("", '0', 0) + 1), View.getDefaultSize(0, 0) + 17).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m30718(108 - View.getDefaultSize(0, 0), (char) (ExpandableListView.getPackedPositionType(0L) + 28318), 24 - View.combineMeasuredStates(0, 0)).intern());
            sb.append(th.getLocalizedMessage());
            C12085l.m30929(strIntern, sb.toString());
            return strM30031;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private String m30715() {
        int i = 2 % 2;
        int i2 = f29694 + 101;
        f29693 = i2 % 128;
        int i3 = i2 % 2;
        String strM30484 = C12030if.m30484(m30719().getBytes());
        int i4 = f29694 + 115;
        f29693 = i4 % 128;
        int i5 = i4 % 2;
        return strM30484;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30717() {
        int i = 2 % 2;
        int i2 = f29693 + 79;
        f29694 = i2 % 128;
        int i3 = i2 % 2;
        String strM28561 = AbstractC11823ao.m28472().mo28487().m28561();
        int i4 = f29694 + 79;
        f29693 = i4 % 128;
        int i5 = i4 % 2;
        return strM28561;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30718(int i, char c, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f29696[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f29695)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}

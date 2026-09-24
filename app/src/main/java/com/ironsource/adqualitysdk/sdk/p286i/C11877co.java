package com.ironsource.adqualitysdk.sdk.p286i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.exoplayer2.C9415C;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co */
/* JADX INFO: loaded from: classes6.dex */
public class C11877co {

    /* JADX INFO: renamed from: ﬤ */
    private static int f28194 = 1;

    /* JADX INFO: renamed from: סּ */
    private static int f28195 = 0;

    /* JADX INFO: renamed from: ﭖ */
    private static int f28196 = 224;

    /* JADX INFO: renamed from: ﭴ */
    private static boolean f28197 = true;

    /* JADX INFO: renamed from: ﭸ */
    private static char[] f28198 = {306, 325, 333, 335, 340, 289, 324, 300, 329, 339, 334, 338, 270, 321, 332, 346, 271, 323, 342, 345, 326, 336, 294, 341, 301, 328, 256, 330, 304, 344, 298, 269, 322, 327, 302, 307, 293, 290};

    /* JADX INFO: renamed from: ﮉ */
    private static int f28199 = 82;

    /* JADX INFO: renamed from: ﮌ */
    private static boolean f28200 = true;

    /* JADX INFO: renamed from: ﮐ */
    private C12065jn f28201;

    /* JADX INFO: renamed from: ﱟ */
    private JSONObject f28202;

    /* JADX INFO: renamed from: ﱡ */
    private C12094u f28203;

    /* JADX INFO: renamed from: ﺙ */
    private AbstractC12059jh f28204 = null;

    /* JADX INFO: renamed from: ﻏ */
    private C11878cp f28205;

    /* JADX INFO: renamed from: ﻐ */
    private C11907dr f28206;

    /* JADX INFO: renamed from: ﻛ */
    private AbstractC11840be f28207;

    /* JADX INFO: renamed from: ｋ */
    private C11891db f28208;

    /* JADX INFO: renamed from: ﾇ */
    private InterfaceC11874cl f28209;

    /* JADX INFO: renamed from: ﾒ */
    private C12017ht f28210;

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ JSONObject m29629(C11877co c11877co, Activity activity, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f28195 + 115;
        f28194 = i3 % 128;
        int i4 = i3 % 2;
        JSONObject jSONObjectM29655 = c11877co.m29655(activity, bundle);
        int i5 = f28195 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f28194 = i5 % 128;
        int i6 = i5 % 2;
        return jSONObjectM29655;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ void m29630(C11877co c11877co, AbstractC12039io abstractC12039io, boolean z) {
        int i2 = 2 % 2;
        int i3 = f28194 + 41;
        f28195 = i3 % 128;
        int i4 = i3 % 2;
        c11877co.m29632(abstractC12039io, z);
        if (i4 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ void m29631(C11877co c11877co, String str, boolean z, boolean z2, List list) {
        int i2 = 2 % 2;
        int i3 = f28194 + 37;
        f28195 = i3 % 128;
        int i4 = i3 % 2;
        c11877co.m29633(str, z, z2, (List<Object>) list);
        if (i4 != 0) {
            throw null;
        }
        int i5 = f28195 + 23;
        f28194 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ boolean m29634(Activity activity, List list) {
        int i2 = 2 % 2;
        int i3 = f28195 + 77;
        f28194 = i3 % 128;
        int i4 = i3 % 2;
        boolean zM29663 = m29663(activity, list);
        int i5 = f28195 + 79;
        f28194 = i5 % 128;
        if (i5 % 2 != 0) {
            return zM29663;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ C11907dr m29636(C11877co c11877co) {
        int i2 = 2 % 2;
        int i3 = f28195 + 95;
        int i4 = i3 % 128;
        f28194 = i4;
        int i5 = i3 % 2;
        C11907dr c11907dr = c11877co.f28206;
        int i6 = i4 + 5;
        f28195 = i6 % 128;
        int i7 = i6 % 2;
        return c11907dr;
    }

    protected C11877co(C11878cp c11878cp, C11891db c11891db, AbstractC11840be abstractC11840be, C12017ht c12017ht, C11907dr c11907dr) {
        this.f28210 = c12017ht;
        C11907dr c11907dr2 = new C11907dr(new HashMap(), c11907dr, true);
        this.f28206 = c11907dr2;
        c11907dr2.m30054(m29679().m30351());
        c11907dr.m30053(c12017ht.m30353(), this);
        this.f28208 = c11891db;
        this.f28207 = abstractC11840be;
        this.f28209 = m29622();
        this.f28205 = c11878cp;
        this.f28203 = new C12094u();
        m29648(m29628((String) null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, (int[]) null, "\u0082\u0090\u0089\u008f\u008e\u0089\u0085\u0089\u008b\u0089\u008d\u008c\u0082\u008b\u0082\u0085\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), new ArrayList());
        m29623();
    }

    /* JADX INFO: renamed from: ﾇ */
    public final C11878cp m29676() {
        C11878cp c11878cp;
        int i2 = 2 % 2;
        int i3 = f28195;
        int i4 = i3 + 11;
        f28194 = i4 % 128;
        if (i4 % 2 == 0) {
            c11878cp = this.f28205;
            int i5 = 62 / 0;
        } else {
            c11878cp = this.f28205;
        }
        int i6 = i3 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f28194 = i6 % 128;
        if (i6 % 2 != 0) {
            return c11878cp;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final Context m29671() {
        int i2 = 2 % 2;
        int i3 = f28195 + 115;
        f28194 = i3 % 128;
        if (i3 % 2 == 0) {
            m29676().m29733();
            throw null;
        }
        Context contextM29733 = m29676().m29733();
        int i4 = f28194 + 5;
        f28195 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return contextM29733;
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m29673(InterfaceC12040ip interfaceC12040ip) {
        int i2 = 2 % 2;
        int i3 = f28194 + 11;
        f28195 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f28205.m29731().m28707(interfaceC12040ip);
            super.hashCode();
            throw null;
        }
        this.f28205.m29731().m28707(interfaceC12040ip);
        int i4 = f28195 + 65;
        f28194 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m29675(JSONObject jSONObject) {
        int i2 = 2 % 2;
        int i3 = f28195 + 93;
        f28194 = i3 % 128;
        int i4 = i3 % 2;
        this.f28202 = C12077jz.m30807(jSONObject, true);
    }

    /* JADX INFO: renamed from: ﮌ */
    private C11903dn m29626() {
        int i2 = 2 % 2;
        int i3 = f28194 + 5;
        f28195 = i3 % 128;
        int i4 = i3 % 2;
        C11903dn c11903dnM29732 = m29676().m29732();
        if (i4 != 0) {
            int i5 = 39 / 0;
        }
        return c11903dnM29732;
    }

    /* JADX INFO: renamed from: ｋ */
    public final JSONObject m29672() {
        int i2 = 2 % 2;
        int i3 = f28194 + 59;
        int i4 = i3 % 128;
        f28195 = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        JSONObject jSONObject = this.f28202;
        int i5 = i4 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f28194 = i5 % 128;
        int i6 = i5 % 2;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final C12017ht m29679() {
        int i2 = 2 % 2;
        int i3 = f28194 + 87;
        f28195 = i3 % 128;
        int i4 = i3 % 2;
        C12017ht c12017ht = this.f28210;
        if (i4 != 0) {
            int i5 = 89 / 0;
        }
        return c12017ht;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final AbstractC11840be m29670() {
        int i2 = 2 % 2;
        int i3 = f28194 + 95;
        int i4 = i3 % 128;
        f28195 = i4;
        int i5 = i3 % 2;
        AbstractC11840be abstractC11840be = this.f28207;
        int i6 = i4 + 101;
        f28194 = i6 % 128;
        int i7 = i6 % 2;
        return abstractC11840be;
    }

    /* JADX INFO: renamed from: ﺙ */
    public final C11891db m29668() {
        int i2 = 2 % 2;
        int i3 = f28194;
        int i4 = i3 + 39;
        f28195 = i4 % 128;
        int i5 = i4 % 2;
        C11891db c11891db = this.f28208;
        int i6 = i3 + 69;
        f28195 = i6 % 128;
        int i7 = i6 % 2;
        return c11891db;
    }

    /* JADX INFO: renamed from: ﮐ */
    public final InterfaceC11874cl m29665() {
        int i2 = 2 % 2;
        int i3 = f28194 + 101;
        f28195 = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f28209;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ */
    public final C11907dr m29669() {
        int i2 = 2 % 2;
        int i3 = f28195 + 45;
        f28194 = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f28206;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ */
    public final String m29666() {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m29676().m29739());
        sb.append(m29628((String) null, (KeyEvent.getMaxKeyCode() >> 16) + 127, (int[]) null, "\u0091").intern());
        sb.append(m29679().m30353());
        String string = sb.toString();
        int i3 = f28194 + 69;
        f28195 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 97 / 0;
        }
        return string;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final C11906dq m29678(String str) {
        int i2 = 2 % 2;
        int i3 = f28195;
        int i4 = i3 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f28194 = i4 % 128;
        int i5 = i4 % 2;
        if (str == null) {
            return null;
        }
        int i6 = i3 + 63;
        f28194 = i6 % 128;
        int i7 = i6 % 2;
        C11906dq c11906dqM30354 = m29679().m30354(str);
        int i8 = f28194 + 109;
        f28195 = i8 % 128;
        int i9 = i8 % 2;
        return c11906dqM30354;
    }

    /* JADX INFO: renamed from: ﭴ */
    private void m29623() {
        int i2 = 2 % 2;
        Iterator<C11905dp> it = m29679().m30355().iterator();
        while (!(!it.hasNext())) {
            C11905dp next = it.next();
            if (m29635(next)) {
                int i3 = f28194 + 11;
                f28195 = i3 % 128;
                int i4 = i3 % 2;
                m29660(next);
                if (i4 != 0) {
                    throw null;
                }
            }
            int i5 = f28194 + 115;
            f28195 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private JSONObject m29638(JSONObject jSONObject) {
        int i2 = 2 % 2;
        int i3 = f28195 + 61;
        f28194 = i3 % 128;
        int i4 = i3 % 2;
        JSONObject jSONObjectM29667 = m29667();
        C12077jz.m30802(jSONObjectM29667, jSONObject);
        int i5 = f28195 + 77;
        f28194 = i5 % 128;
        int i6 = i5 % 2;
        return jSONObjectM29667;
    }

    /* JADX INFO: renamed from: ﱡ */
    public final JSONObject m29667() {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C12035ik.f29413, m29676().m29740());
            jSONObject.put(C12035ik.f29365, m29676().m29736());
            jSONObject.put(C12035ik.f29369, m29676().m29742());
            int i3 = f28195 + 23;
            f28194 = i3 % 128;
            int i4 = i3 % 2;
            return jSONObject;
        } catch (JSONException e2) {
            String strIntern = m29628((String) null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), (int[]) null, "\u008c\u0082\u008b\u0082\u0085\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m29645("\u0007\u0010\u0016ￂ\f\u0015\u0011\u0010ￜￂ\uffe7\u0014\u0014\u0011\u0014ￂ\u0005\u0014\u0007\u0003\u0016\u000b\u0010\tￂ\u0007\u0018", 27 - Color.red(0), false, 9 - TextUtils.lastIndexOf("", '0'), Color.blue(0) + 176).intern());
            sb.append(e2.getLocalizedMessage());
            C12085l.m30929(strIntern, sb.toString());
            return jSONObject;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e1  */
    /* JADX INFO: renamed from: ﾒ */
    private void m29660(C11905dp c11905dp) {
        byte b2;
        int i2 = 2 % 2;
        String strM30044 = c11905dp.m30044();
        switch (strM30044.hashCode()) {
            case -1825565413:
                if (!strM30044.equals(m29628((String) null, 127 - Color.blue(0), (int[]) null, "\u0082\u008f\u0092\u0094\u0092\u0082\u0095\u0089\u0088\u0094\u0085\u0089\u0093\u0089\u0085\u0092\u008e").intern())) {
                    b2 = -1;
                } else {
                    int i3 = f28195 + 11;
                    f28194 = i3 % 128;
                    int i4 = i3 % 2;
                    b2 = 3;
                }
                break;
            case -1655966961:
                if (!strM30044.equals(m29645("\u0007￼\t￼\u0007\ufff6\ufff4\f", 8 - Drawable.resolveOpacity(0, 0), true, 7 - (ViewConfiguration.getScrollBarSize() >> 8), 191 - View.combineMeasuredStates(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    int i5 = f28194 + 41;
                    f28195 = i5 % 128;
                    if (i5 % 2 == 0) {
                        b2 = 0;
                    } else {
                        b2 = 1;
                    }
                }
                break;
            case -787751952:
                if (!strM30044.equals(m29645("\t\u0001\ufff6\u0000\ufffb\t", 7 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), true, 6 - (Process.myTid() >> 22), TextUtils.indexOf("", "") + 192).intern())) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 3619493:
                if (strM30044.equals(m29645("\ufffb\ufff7\t\b", 4 - (Process.myPid() >> 22), false, (KeyEvent.getMaxKeyCode() >> 16) + 3, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 191).intern())) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
                break;
            case 1144592183:
                if (!strM30044.equals(m29628((String) null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, (int[]) null, "\u008a\u0098\u0092\u0084\u0097\u0096\u0096\u008e").intern())) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            m29656(c11905dp);
            m29640(m29645("\u0007￼\t￼\u0007\ufff6\ufff4\f", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8, true, 7 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 192).intern(), c11905dp);
            return;
        }
        if (b2 == 1) {
            m29639(c11905dp);
            m29640(m29645("\ufffb\ufff7\t\b", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 4, false, TextUtils.getCapsMode("", 0, 0) + 3, 191 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), c11905dp);
            return;
        }
        if (b2 == 2) {
            m29647(c11905dp);
            m29640(m29645("\t\u0001\ufff6\u0000\ufffb\t", 6 - View.resolveSize(0, 0), true, 6 - (ViewConfiguration.getJumpTapTimeout() >> 16), Drawable.resolveOpacity(0, 0) + 192).intern(), c11905dp);
            return;
        }
        if (b2 == 3) {
            if (this.f28204 == null) {
                this.f28204 = m29637(m29646(c11905dp.m30041()));
                AbstractC12058jg.m30663().m30665(this.f28204);
                return;
            }
            return;
        }
        if (b2 != 4) {
            return;
        }
        this.f28201 = new C12065jn(m29657(m29646(c11905dp.m30041())));
        int i6 = f28194 + 47;
        f28195 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX INFO: renamed from: ﭖ */
    protected final void m29664() {
        int i2 = 2 % 2;
        int i3 = f28194 + 5;
        f28195 = i3 % 128;
        if (i3 % 2 == 0) {
            m29621();
            m29624();
            m29625();
            if (this.f28204 != null) {
                AbstractC12058jg.m30663().m30666(this.f28204);
                this.f28204 = null;
            }
            C12065jn c12065jn = this.f28201;
            if (c12065jn != null) {
                int i4 = f28194 + 5;
                f28195 = i4 % 128;
                if (i4 % 2 == 0) {
                    c12065jn.m30714();
                    this.f28201 = null;
                } else {
                    c12065jn.m30714();
                    this.f28201 = null;
                    throw null;
                }
            }
            this.f28209 = null;
            return;
        }
        m29621();
        m29624();
        m29625();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private void m29656(C11905dp c11905dp) {
        int i2 = 2 % 2;
        int i3 = f28194 + 47;
        f28195 = i3 % 128;
        InterfaceC12043is interfaceC12043is = null;
        if (i3 % 2 == 0) {
            JSONObject jSONObjectM29659 = m29659(c11905dp.m30045());
            if (jSONObjectM29659 != null) {
                final String strM30040 = c11905dp.m30040();
                if (!TextUtils.isEmpty(strM30040)) {
                    int i4 = f28194 + 101;
                    f28195 = i4 % 128;
                    int i5 = i4 % 2;
                    final C11906dq c11906dqM29678 = m29678(strM30040);
                    if (c11906dqM29678 != null) {
                        interfaceC12043is = new InterfaceC12043is() { // from class: com.ironsource.adqualitysdk.sdk.i.co.3

                            /* JADX INFO: renamed from: ﺙ */
                            private static int f28258 = 1;

                            /* JADX INFO: renamed from: ﻛ */
                            private static int f28259 = 150;

                            /* JADX INFO: renamed from: ﾒ */
                            private static int f28260;

                            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12043is
                            /* JADX INFO: renamed from: ﻐ */
                            public final List<WebView> mo29720(Object obj) {
                                int i6 = 2 % 2;
                                int i7 = f28258 + 99;
                                f28260 = i7 % 128;
                                int i8 = i7 % 2;
                                try {
                                    List<WebView> list = (List) c11906dqM29678.m30048(C11877co.m29636(C11877co.this), C11877co.this, Collections.singletonList(obj)).m30066();
                                    int i9 = f28258 + 81;
                                    f28260 = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        int i10 = 55 / 0;
                                    }
                                    return list;
                                } catch (Exception unused) {
                                    String strIntern = m29719("\u0004\uffe7\uffffￜ\u0000\u000f\n\b\u0000￭\r\u0000\t\u0000\u000f\u000e", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 16, true, 9 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION).intern();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(m29719("\u0013\u0013\u0010\u0013\uffc1\b\u0006\u0015\u0015\n\u000f\b\uffc1\u0018\u0006\u0003\ufff7\n\u0006\u0018\u0014\uffc1\u0007\u0013\u0010\u000e\uffc1￦", TextUtils.indexOf((CharSequence) "", '0', 0) + 29, false, 27 - KeyEvent.keyCodeFromString(""), TextUtils.getOffsetAfter("", 0) + 245).intern());
                                    sb.append(strM30040);
                                    C12085l.m30929(strIntern, sb.toString());
                                    return null;
                                }
                            }

                            /* JADX INFO: renamed from: ﾇ */
                            private static String m29719(String str, int i6, boolean z, int i7, int i8) {
                                String str2;
                                Object charArray = str;
                                if (str != null) {
                                    charArray = str.toCharArray();
                                }
                                char[] cArr = (char[]) charArray;
                                synchronized (C11889d.f28479) {
                                    char[] cArr2 = new char[i6];
                                    C11889d.f28481 = 0;
                                    while (C11889d.f28481 < i6) {
                                        C11889d.f28480 = cArr[C11889d.f28481];
                                        cArr2[C11889d.f28481] = (char) (C11889d.f28480 + i8);
                                        int i9 = C11889d.f28481;
                                        cArr2[i9] = (char) (cArr2[i9] - f28259);
                                        C11889d.f28481++;
                                    }
                                    if (i7 > 0) {
                                        C11889d.f28478 = i7;
                                        char[] cArr3 = new char[i6];
                                        System.arraycopy(cArr2, 0, cArr3, 0, i6);
                                        System.arraycopy(cArr3, 0, cArr2, i6 - C11889d.f28478, C11889d.f28478);
                                        System.arraycopy(cArr3, C11889d.f28478, cArr2, 0, i6 - C11889d.f28478);
                                    }
                                    if (z) {
                                        char[] cArr4 = new char[i6];
                                        C11889d.f28481 = 0;
                                        while (C11889d.f28481 < i6) {
                                            cArr4[C11889d.f28481] = cArr2[(i6 - C11889d.f28481) - 1];
                                            C11889d.f28481++;
                                        }
                                        cArr2 = cArr4;
                                    }
                                    str2 = new String(cArr2);
                                }
                                return str2;
                            }
                        };
                    } else {
                        String strM29666 = m29666();
                        StringBuilder sb = new StringBuilder();
                        sb.append(m29628((String) null, 127 - (ViewConfiguration.getTapTimeout() >> 16), (int[]) null, "\u009b\u008c\u0084\u0095\u009b\u008b\u0084\u0089\u0085\u0089\u008b\u0089\u0095\u0082\u0087\u009b\u0087\u0084\u009a\u0085\u0082\u0099").intern());
                        sb.append(strM30040);
                        sb.append(m29645("\b\u0011\u0017\u0010\u0006ￂ\u0010\u0011\u0016ￂ", 10 - TextUtils.getCapsMode("", 0, 0), false, 5 - TextUtils.getOffsetBefore("", 0), 175 - MotionEvent.axisFromString("")).intern());
                        C11875cm.m29607(strM29666, sb.toString(), null);
                    }
                }
                m29641(jSONObjectM29659, m29658(false), m29658(true), interfaceC12043is);
                return;
            }
            return;
        }
        m29659(c11905dp.m30045());
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private void m29641(JSONObject jSONObject, C12087n c12087n, C12087n c12087n2, InterfaceC12043is interfaceC12043is) {
        int i2 = 2 % 2;
        int i3 = f28195 + 49;
        f28194 = i3 % 128;
        int i4 = i3 % 2;
        this.f28203.m31021(jSONObject, m29627(c12087n, c12087n2), m29620(), interfaceC12043is);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private void m29639(C11905dp c11905dp) {
        int i2 = 2 % 2;
        JSONObject jSONObjectM29659 = m29659(c11905dp.m30045());
        if (jSONObjectM29659 != null) {
            int i3 = f28195 + 13;
            f28194 = i3 % 128;
            int i4 = i3 % 2;
            String strM30042 = c11905dp.m30042();
            C12093t c12093tM29643 = m29643(true);
            C12093t c12093tM29644 = m29643(false);
            if (!TextUtils.isEmpty(strM30042)) {
                int i5 = f28194 + 41;
                f28195 = i5 % 128;
                if (i5 % 2 == 0) {
                    final C11906dq c11906dqM29678 = m29678(strM30042);
                    if (c11906dqM29678 != null) {
                        m29661(jSONObjectM29659, c12093tM29644, c12093tM29643, new InterfaceC12042ir() { // from class: com.ironsource.adqualitysdk.sdk.i.co.9
                            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12042ir
                            /* JADX INFO: renamed from: ｋ */
                            public final boolean mo29721(View view) {
                                return c11906dqM29678.m30048(C11877co.m29636(C11877co.this), C11877co.this, Collections.singletonList(view)).m30065();
                            }
                        });
                        return;
                    }
                    String strM29666 = m29666();
                    StringBuilder sb = new StringBuilder();
                    sb.append(m29628((String) null, 127 - Color.blue(0), (int[]) null, "\u009b\u008c\u0084\u0095\u009b\u008b\u0084\u0089\u0085\u0089\u008b\u0089\u0095\u0082\u0087\u009b\u0087\u0084\u009a\u0085\u0082\u0099").intern());
                    sb.append(strM30042);
                    sb.append(m29645("\b\u0011\u0017\u0010\u0006ￂ\u0010\u0011\u0016ￂ", 9 - ExpandableListView.getPackedPositionChild(0L), false, 5 - (ViewConfiguration.getLongPressTimeout() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 176).intern());
                    C11875cm.m29607(strM29666, sb.toString(), null);
                    return;
                }
                m29678(strM30042);
                throw null;
            }
            m29649(jSONObjectM29659, c12093tM29644, c12093tM29643);
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private void m29647(C11905dp c11905dp) {
        int i2 = 2 % 2;
        int i3 = f28195 + 79;
        f28194 = i3 % 128;
        if (i3 % 2 != 0) {
            JSONObject jSONObjectM29659 = m29659(c11905dp.m30045());
            if (jSONObjectM29659 != null) {
                m29662(jSONObjectM29659, m29652(false), m29652(true));
            }
            int i4 = f28195 + 13;
            f28194 = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        m29659(c11905dp.m30045());
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private void m29640(String str, C11905dp c11905dp) {
        int i2 = 2 % 2;
        JSONObject jSONObjectM29659 = m29659(c11905dp.m30045());
        if (jSONObjectM29659 == null || !jSONObjectM29659.has(m29645("\uffffￛ￼\u000b￼\ufffa\u000b\u0000\u0006\u0005￫\u0010\u0007￼\u000b\u0006\f\ufffa", Color.green(0) + 18, false, 15 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 188).intern())) {
            return;
        }
        int i3 = f28194 + 101;
        f28195 = i3 % 128;
        int i4 = i3 % 2;
        C12063jl.b bVarM30706 = C12063jl.b.m30706(jSONObjectM29659.optString(m29645("\uffffￛ￼\u000b￼\ufffa\u000b\u0000\u0006\u0005￫\u0010\u0007￼\u000b\u0006\f\ufffa", TextUtils.getTrimmedLength("") + 18, false, 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 187 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), null));
        String strM29654 = m29654(str, jSONObjectM29659);
        if (bVarM30706 != null) {
            C12063jl.m30700().m30704(strM29654, bVarM30706);
            int i5 = f28194 + 15;
            f28195 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private void m29662(JSONObject jSONObject, C12095v c12095v, C12095v c12095v2) {
        int i2 = 2 % 2;
        int i3 = f28195 + 43;
        f28194 = i3 % 128;
        int i4 = i3 % 2;
        this.f28203.m31023(jSONObject, m29644(c12095v, c12095v2));
        if (i4 == 0) {
            int i5 = 88 / 0;
        }
    }

    /* JADX INFO: renamed from: ﮉ */
    private void m29625() {
        int i2 = 2 % 2;
        int i3 = f28194 + 87;
        f28195 = i3 % 128;
        int i4 = i3 % 2;
        this.f28203.m31024();
        int i5 = f28194 + 109;
        f28195 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    private void m29649(JSONObject jSONObject, C12093t c12093t, C12093t c12093t2) {
        int i2 = 2 % 2;
        int i3 = f28194 + 101;
        f28195 = i3 % 128;
        if (i3 % 2 != 0) {
            this.f28203.m31019(jSONObject, m29651(c12093t, c12093t2));
            int i4 = 44 / 0;
        } else {
            this.f28203.m31019(jSONObject, m29651(c12093t, c12093t2));
        }
        int i5 = f28194 + 23;
        f28195 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private void m29661(JSONObject jSONObject, C12093t c12093t, C12093t c12093t2, InterfaceC12042ir interfaceC12042ir) {
        int i2 = 2 % 2;
        int i3 = f28195 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f28194 = i3 % 128;
        if (i3 % 2 == 0) {
            this.f28203.m31022(jSONObject, m29651(c12093t, c12093t2), interfaceC12042ir);
            throw null;
        }
        this.f28203.m31022(jSONObject, m29651(c12093t, c12093t2), interfaceC12042ir);
        int i4 = f28194 + 7;
        f28195 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private static boolean m29635(C11905dp c11905dp) {
        int i2 = 2 % 2;
        List listMo28477 = AbstractC11823ao.m28472().mo28477();
        ISAdQualityAdType iSAdQualityAdTypeM30043 = c11905dp.m30043();
        if (listMo28477 != null) {
            int i3 = f28195 + 39;
            f28194 = i3 % 128;
            int i4 = i3 % 2;
            if (iSAdQualityAdTypeM30043 != ISAdQualityAdType.UNKNOWN) {
                if (listMo28477.contains(iSAdQualityAdTypeM30043)) {
                    return false;
                }
                int i5 = f28195 + 99;
                f28194 = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ﭸ */
    private void m29624() {
        int i2 = 2 % 2;
        int i3 = f28195 + 21;
        f28194 = i3 % 128;
        int i4 = i3 % 2;
        this.f28203.m31020();
        if (i4 == 0) {
            int i5 = 0 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a9  */
    /* JADX INFO: renamed from: ﾇ */
    private static String m29654(String str, JSONObject jSONObject) {
        byte b2;
        int i2 = 2 % 2;
        int iHashCode = str.hashCode();
        if (iHashCode != -1655966961) {
            b2 = 3;
            if (iHashCode != -787751952) {
                if (iHashCode == 3619493 && str.equals(m29645("\ufffb\ufff7\t\b", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, false, 3 - View.resolveSize(0, 0), Color.argb(0, 0, 0, 0) + 192).intern())) {
                    int i3 = f28195 + 17;
                    f28194 = i3 % 128;
                    int i4 = i3 % 2;
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(m29645("\t\u0001\ufff6\u0000\ufffb\t", (ViewConfiguration.getTouchSlop() >> 8) + 6, true, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7, (ViewConfiguration.getJumpTapTimeout() >> 16) + 192).intern())) {
                int i5 = f28195 + 63;
                f28194 = i5 % 128;
                if (i5 % 2 != 0) {
                    b2 = 2;
                }
            } else {
                b2 = -1;
            }
        } else if (str.equals(m29645("\u0007￼\t￼\u0007\ufff6\ufff4\f", 8 - Color.argb(0, 0, 0, 0), true, 7 - (ViewConfiguration.getScrollBarSize() >> 8), 192 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return jSONObject.optString(m29645("\uffff￼\u0000\b￼￩\u0014\u000f\u0004\u0011\u0004\u000f\ufffeￜ", 15 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), true, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2, TextUtils.lastIndexOf("", '0', 0) + 184).intern(), null);
        }
        if (b2 == 1) {
            return jSONObject.optString(m29645("\u0002\u0006\ufff3\u0001\ufffe\u0002\n\ufffe￫\u0010\u0010\ufffe\t￠\u0014", 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), true, 4 - ImageFormat.getBitsPerPixel(0), TextUtils.indexOf("", "", 0, 0) + 181).intern(), null);
        }
        if (b2 != 2) {
            return null;
        }
        return jSONObject.optString(m29645("\uffff\u0010\u0003\uffff\u0011\uffdd\u0006\ufffb\r\r￨\ufffb\u0007", (Process.myTid() >> 22) + 13, false, -TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 184).intern(), null);
    }

    /* JADX INFO: renamed from: ﻛ */
    private AbstractC12059jh m29637(final List<String> list) {
        int i2 = 2 % 2;
        AbstractC12059jh abstractC12059jh = new AbstractC12059jh() { // from class: com.ironsource.adqualitysdk.sdk.i.co.10

            /* JADX INFO: renamed from: ﮐ */
            private static int f28220 = 0;

            /* JADX INFO: renamed from: ﱡ */
            private static int f28221 = 1;

            /* JADX INFO: renamed from: ﺙ */
            private static char f28222 = 0;

            /* JADX INFO: renamed from: ﻐ */
            private static int f28223 = 0;

            /* JADX INFO: renamed from: ﻛ */
            private static long f28224 = -1704162739679618005L;

            /* JADX INFO: renamed from: ｋ */
            private static long f28225 = 4120896528516334686L;

            /* JADX INFO: renamed from: ﻐ */
            static /* synthetic */ void m29682(AnonymousClass10 anonymousClass10, String str, List list2) {
                int i3 = 2 % 2;
                int i4 = f28221 + 31;
                f28220 = i4 % 128;
                anonymousClass10.m29688(str, i4 % 2 != 0, list2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12061jj
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28395(Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28220 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                f28221 = i4 % 128;
                m29687(m29684("\uf42c\uf7ec\uf443蔔殩쏏봃\u173e蓰ﭨⱳ蚌ᔀ註鳕癔ꙉᦠ༥\ue52d㛮\ua958繧咐윔", i4 % 2 == 0 ? Drawable.resolveOpacity(1, 0) : Drawable.resolveOpacity(0, 0) + 1).intern(), activity);
                int i5 = f28220 + 55;
                f28221 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12061jj
            /* JADX INFO: renamed from: ｋ */
            public final void mo28396(Activity activity) {
                String strM29684;
                int i3 = 2 % 2;
                int i4 = f28220 + 13;
                f28221 = i4 % 128;
                if (i4 % 2 == 0) {
                    View.resolveSizeAndState(1, 1, 1);
                    strM29684 = m29684("쯺峤쮕ꆣ삡㸭馴\ueadc묦偡ࣄ筴⫗ℕ롣讑馚늟\u2b96ᣮथɍ嫀ꥻ\uf8d4錌쩤㦞澖", 0);
                } else {
                    strM29684 = m29684("쯺峤쮕ꆣ삡㸭馴\ueadc묦偡ࣄ筴⫗ℕ롣讑馚늟\u2b96ᣮथɍ嫀ꥻ\uf8d4錌쩤㦞澖", 1 - View.resolveSizeAndState(0, 0, 0));
                }
                m29687(strM29684.intern(), activity);
                int i5 = f28220 + 61;
                f28221 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                String strM29684;
                int i3 = 2 % 2;
                if (!(!C11877co.m29634(activity, list))) {
                    int i4 = f28220 + 17;
                    f28221 = i4 % 128;
                    if (i4 % 2 == 0) {
                        TextUtils.getCapsMode("", 0, 0);
                        strM29684 = m29684("殖糞毹뽲\ue09b筿蝥꾝\u1b4e灠ᘆ㸻誺Ĥꚟ컔㧷銐㕜嶟ꥂ", 0);
                    } else {
                        strM29684 = m29684("殖糞毹뽲\ue09b筿蝥꾝\u1b4e灠ᘆ㸻誺Ĥꚟ컔㧷銐㕜嶟ꥂ", 1 - TextUtils.getCapsMode("", 0, 0));
                    }
                    m29685(strM29684.intern(), activity, bundle);
                    int i5 = f28221 + 55;
                    f28220 = i5 % 128;
                    int i6 = i5 % 2;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                int i3 = 2 % 2;
                if (C11877co.m29634(activity, list)) {
                    int i4 = f28221 + 39;
                    f28220 = i4 % 128;
                    int i5 = i4 % 2;
                    m29687(m29686("䳇툃旃㮌뒒㱟市섓뎡\u2d2e㦀\ueb55㜙\uf095脕뺅ꆎ", (char) (25895 - AndroidCharacter.getMirror('0')), "䑞⩛嶏㤰", (-998852752) - KeyEvent.normalizeMetaState(0), "瀙皷\uf7c4ᕤ").intern(), activity);
                    int i6 = f28220 + 31;
                    f28221 = i6 % 128;
                    int i7 = i6 % 2;
                }
                int i8 = f28220 + 105;
                f28221 = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                char c2;
                int iIndexOf;
                int i3 = 2 % 2;
                if (!C11877co.m29634(activity, list)) {
                    return;
                }
                int i4 = f28220 + 101;
                f28221 = i4 % 128;
                if (i4 % 2 == 0) {
                    c2 = (char) ((SystemClock.uptimeMillis() > 1L ? 1 : (SystemClock.uptimeMillis() == 1L ? 0 : -1)) * 34178);
                    iIndexOf = 683706191 >>> TextUtils.indexOf((CharSequence) "", ' ', 1, 1);
                } else {
                    c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 34178);
                    iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 683706191;
                }
                m29687(m29686("\ue5b0\ue36d䴔\ue1b0\u20f5哈钂䝥쵾鵳\u202c鹨뾒걠\uf17a䁥䙨", c2, "䑞⩛嶏㤰", iIndexOf, "亍삇茨쎅").intern(), activity);
                int i5 = f28221 + 19;
                f28220 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28221 + 57;
                f28220 = i4 % 128;
                int i5 = i4 % 2;
                if (!(!C11877co.m29634(activity, list))) {
                    m29687(m29684("ﰸ\ue720ﱗ⢢筥냛Ⴕ搹賠\ueb9e臖\uf59fᴔ髚ㅜգ깉ॼꊝ阺", -TextUtils.lastIndexOf("", '0', 0, 0)).intern(), activity);
                    int i6 = f28220 + 59;
                    f28221 = i6 % 128;
                    int i7 = i6 % 2;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28220 + 7;
                f28221 = i4 % 128;
                int i5 = i4 % 2;
                if (C11877co.m29634(activity, list)) {
                    m29687(m29684("䏀\u18ab䎯ョ蓮܋ࣰ폩㌘ᐕ馓䉏ꋬ救⤚늦ᆫ\uf6f4뫍⇫脔", ExpandableListView.getPackedPositionType(0L) + 1).intern(), activity);
                    int i6 = f28221 + 51;
                    f28220 = i6 % 128;
                    int i7 = i6 % 2;
                }
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0031  */
            /* JADX WARN: Code duplicated, block: B:12:0x0046  */
            /* JADX WARN: Code duplicated, block: B:9:0x0022  */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                int i3;
                int i4 = 2 % 2;
                int i5 = f28221 + 79;
                f28220 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 6 / 0;
                    if (C11877co.m29634(activity, list)) {
                        i3 = f28220 + 5;
                        f28221 = i3 % 128;
                        if (i3 % 2 == 0) {
                            m29685(m29684("虃\u2d97蘬\uee1d뇒\ue7ee혊㌌\uf69b℩䝩ꊪ杯偭\uf7e0剖퐱쏝搎섅䒀猸ᕺ炱땼\ue275藼\ue047∪淐㈦", -Process.getGidForName("")).intern(), activity, bundle);
                            int i7 = 81 / 0;
                        } else {
                            m29685(m29684("虃\u2d97蘬\uee1d뇒\ue7ee혊㌌\uf69b℩䝩ꊪ杯偭\uf7e0剖퐱쏝搎섅䒀猸ᕺ炱땼\ue275藼\ue047∪淐㈦", -Process.getGidForName("")).intern(), activity, bundle);
                        }
                    }
                } else if (C11877co.m29634(activity, list)) {
                    i3 = f28220 + 5;
                    f28221 = i3 % 128;
                    if (i3 % 2 == 0) {
                        m29685(m29684("虃\u2d97蘬\uee1d뇒\ue7ee혊㌌\uf69b℩䝩ꊪ杯偭\uf7e0剖퐱쏝搎섅䒀猸ᕺ炱땼\ue275藼\ue047∪淐㈦", -Process.getGidForName("")).intern(), activity, bundle);
                        int i8 = 81 / 0;
                    } else {
                        m29685(m29684("虃\u2d97蘬\uee1d뇒\ue7ee혊㌌\uf69b℩䝩ꊪ杯偭\uf7e0剖퐱쏝搎섅䒀猸ᕺ炱땼\ue275藼\ue047∪淐㈦", -Process.getGidForName("")).intern(), activity, bundle);
                    }
                }
                int i9 = f28220 + 25;
                f28221 = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 28 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28221 + 9;
                f28220 = i4 % 128;
                int i5 = i4 % 2;
                if (C11877co.m29634(activity, list)) {
                    int i6 = f28221 + 9;
                    f28220 = i6 % 128;
                    int i7 = i6 % 2;
                    m29687(m29684("\u009a퉯õ࣓个쾞ツ᭼灂\uded1ꆧ諚\ue1b6꾕ᄹ稢勭㰴苻\ue974쉓賑\uf3b1", 1 - TextUtils.getTrimmedLength("")).intern(), activity);
                    int i8 = f28220 + 57;
                    f28221 = i8 % 128;
                    int i9 = i8 % 2;
                }
            }

            /* JADX INFO: renamed from: ﾒ */
            private void m29687(String str, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28221 + 95;
                f28220 = i4 % 128;
                int i5 = i4 % 2;
                m29683(str, Collections.singletonList(activity));
                if (i5 != 0) {
                    throw null;
                }
                int i6 = f28221 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                f28220 = i6 % 128;
                int i7 = i6 % 2;
            }

            /* JADX INFO: renamed from: ﻛ */
            private void m29685(String str, Activity activity, Bundle bundle) {
                int i3 = 2 % 2;
                int i4 = f28221 + 19;
                f28220 = i4 % 128;
                int i5 = i4 % 2;
                m29683(str, Arrays.asList(activity, bundle));
                int i6 = f28221 + 57;
                f28220 = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﻐ */
            private void m29683(final String str, final List<Object> list2) {
                int i3 = 2 % 2;
                m29688(str, true, list2);
                C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.co.10.2
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        AnonymousClass10.m29682(AnonymousClass10.this, str, list2);
                    }
                });
                int i4 = f28220 + 45;
                f28221 = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﾒ */
            private void m29688(String str, boolean z, List<Object> list2) {
                int i3 = 2 % 2;
                C11877co c11877co = C11877co.this;
                StringBuilder sb = new StringBuilder();
                sb.append(m29686("홋ெ⟼错ⴇ뼮\uf14aἋỺ晧顰芤켸텬洁䡕䄷࠶", (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 52672), "䑞⩛嶏㤰", 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "釆㤨샙뫍").intern());
                sb.append(str);
                C11877co.m29631(c11877co, sb.toString(), z, false, list2);
                int i4 = f28221 + 49;
                f28220 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX INFO: renamed from: ﻛ */
            private static String m29684(String str, int i3) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (C11943f.f28848) {
                    char[] cArrM30189 = C11943f.m30189(f28224, cArr, i3);
                    C11943f.f28846 = 4;
                    while (C11943f.f28846 < cArrM30189.length) {
                        C11943f.f28847 = C11943f.f28846 - 4;
                        cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f28224));
                        C11943f.f28846++;
                    }
                    str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
                }
                return str2;
            }

            /* JADX INFO: renamed from: ｋ */
            private static String m29686(String str, char c2, String str2, int i3, String str3) {
                String str4;
                Object charArray = str3;
                if (str3 != null) {
                    charArray = str3.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                Object charArray2 = str2;
                if (str2 != null) {
                    charArray2 = str2.toCharArray();
                }
                char[] cArr2 = (char[]) charArray2;
                Object charArray3 = str;
                if (str != null) {
                    charArray3 = str.toCharArray();
                }
                char[] cArr3 = (char[]) charArray3;
                synchronized (C12051j.f29510) {
                    char[] cArr4 = (char[]) cArr.clone();
                    char[] cArr5 = (char[]) cArr2.clone();
                    cArr4[0] = (char) (c2 ^ cArr4[0]);
                    cArr5[2] = (char) (cArr5[2] + ((char) i3));
                    int length = cArr3.length;
                    char[] cArr6 = new char[length];
                    C12051j.f29511 = 0;
                    while (C12051j.f29511 < length) {
                        int i4 = (C12051j.f29511 + 2) % 4;
                        int i5 = (C12051j.f29511 + 3) % 4;
                        C12051j.f29509 = (char) (((cArr4[C12051j.f29511 % 4] * 32718) + cArr5[i4]) % 65535);
                        cArr5[i5] = (char) (((cArr4[i5] * 32718) + cArr5[i4]) / 65535);
                        cArr4[i5] = C12051j.f29509;
                        cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i5] ^ cArr3[C12051j.f29511])) ^ f28225) ^ ((long) f28223)) ^ ((long) f28222));
                        C12051j.f29511++;
                    }
                    str4 = new String(cArr6);
                }
                return str4;
            }
        };
        int i3 = f28195 + 87;
        f28194 = i3 % 128;
        if (i3 % 2 != 0) {
            return abstractC12059jh;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static boolean m29663(Activity activity, List<String> list) {
        int i2 = 2 % 2;
        int i3 = f28194 + 53;
        f28195 = i3 % 128;
        if (i3 % 2 != 0) {
            list.isEmpty();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (list.isEmpty()) {
            return true;
        }
        int i4 = f28194 + 89;
        f28195 = i4 % 128;
        int i5 = i4 % 2;
        return list.contains(activity.getClass().getName());
    }

    /* JADX INFO: renamed from: ﾒ */
    private JSONObject m29659(JSONObject jSONObject) {
        C11903dn c11903dnM29626;
        int i2 = 2 % 2;
        int i3 = f28195 + 71;
        f28194 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        String strOptString = jSONObject.optString(m29628((String) null, 127 - TextUtils.getTrimmedLength(""), (int[]) null, "\u009e\u0089\u0095\u0082\u008c\u009d\u008a\u009c").intern());
        jSONObject.remove(m29628((String) null, View.resolveSizeAndState(0, 0, 0) + 127, (int[]) null, "\u009e\u0089\u0095\u0082\u008c\u009d\u008a\u009c").intern());
        if (jSONObject.optBoolean(m29628((String) null, 127 - Color.green(0), (int[]) null, "\u008a\u009f\u0085\u0092\u0082\u009c\u008b\u0089").intern()) && (c11903dnM29626 = m29626()) != null) {
            if (!TextUtils.isEmpty(c11903dnM29626.m30032())) {
                jSONObject.remove(m29628((String) null, View.getDefaultSize(0, 0) + 127, (int[]) null, "\u008a\u009f\u0085\u0092\u0082\u009c\u008b\u0089").intern());
                try {
                    String strIntern = m29645("�\u000e\u0004\r￮\t￣\b\u0004\uffff", 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), false, 2 - View.resolveSize(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 183).intern();
                    StringBuilder sb = new StringBuilder();
                    sb.append(strOptString);
                    sb.append(c11903dnM29626.m30032());
                    jSONObject.put(strIntern, sb.toString());
                } catch (JSONException unused) {
                }
            }
            if (c11903dnM29626.m30035()) {
                try {
                    jSONObject.put(m29645("\f￣\ufffa\u000b\r\u0011\uffde\ufffe\f\u000e", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9, true, Color.green(0) + 10, 185 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), true);
                } catch (JSONException unused2) {
                }
            }
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            int i5 = f28195 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f28194 = i5 % 128;
            if (i5 % 2 == 0) {
                m29642(jSONObject, itKeys.next());
                super.hashCode();
                throw null;
            }
            if (!m29642(jSONObject, itKeys.next())) {
                return null;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻛ */
    private boolean m29642(JSONObject jSONObject, String str) {
        int i2;
        int i3 = 2 % 2;
        int i4 = f28195 + 7;
        f28194 = i4 % 128;
        if (i4 % 2 != 0) {
            Object objOpt = jSONObject.opt(str);
            try {
                if (objOpt instanceof String) {
                    String str2 = (String) objOpt;
                    if (m29650(str2)) {
                        int i5 = f28195 + 101;
                        f28194 = i5 % 128;
                        int i6 = i5 % 2;
                        String strM29653 = m29653(str2);
                        if (strM29653 != null) {
                            jSONObject.put(str, strM29653);
                            i2 = f28194 + 7;
                            f28195 = i2 % 128;
                            int i7 = i2 % 2;
                        } else {
                            String strM29666 = m29666();
                            StringBuilder sb = new StringBuilder();
                            sb.append(m29645("\b\u0013￪ￇ\u001a\u001a", Color.argb(0, 0, 0, 0) + 6, true, TextUtils.getOffsetAfter("", 0) + 3, 171 - View.MeasureSpec.getSize(0)).intern());
                            sb.append(str2);
                            sb.append(m29628((String) null, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, (int[]) null, "\u0096\u0098\u0085\u0082\u008a\u009b\u008c\u0082\u008b\u0082\u0085\u008a\u0089\u008f\u009b¢\u008b\u0089\u0085\u008c\u0084¡\u008e\u009b \u009b\u0087\u008b\u0098\u0084\u0095\u009b\u0085\u0084\u008b\u009b").intern());
                            C11875cm.m29606(strM29666, sb.toString());
                            return false;
                        }
                    }
                } else if (objOpt instanceof JSONArray) {
                    jSONObject.put(str, new JSONArray((Collection) m29646(C12077jz.m30815((JSONArray) objOpt))));
                    i2 = f28195 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                    f28194 = i2 % 128;
                    int i8 = i2 % 2;
                }
            } catch (JSONException unused) {
            }
            return true;
        }
        boolean z = jSONObject.opt(str) instanceof String;
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private List<String> m29646(List<String> list) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i3 = f28194 + 25;
        f28195 = i3 % 128;
        int i4 = i3 % 2;
        for (String str : list) {
            if (m29650(str)) {
                int i5 = f28194 + 9;
                f28195 = i5 % 128;
                int i6 = i5 % 2;
                String strM29653 = m29653(str);
                if (strM29653 != null) {
                    int i7 = f28195 + 51;
                    f28194 = i7 % 128;
                    int i8 = i7 % 2;
                    arrayList.add(strM29653);
                }
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ */
    private String m29653(String str) {
        int i2 = 2 % 2;
        int i3 = f28195 + 37;
        f28194 = i3 % 128;
        int i4 = i3 % 2;
        Class clsM28833 = m29670().m28833(C12081kc.m30851(str, m29645("ￎ\u0013\u0013\u0001\f\u0003", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5, true, 1 - (ViewConfiguration.getTapTimeout() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 178).intern()));
        if (clsM28833 != null) {
            return clsM28833.getName();
        }
        int i5 = f28195 + 5;
        f28194 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 46 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static boolean m29650(String str) {
        int i2 = 2 % 2;
        int i3 = f28194 + 9;
        f28195 = i3 % 128;
        int i4 = i3 % 2;
        boolean zEndsWith = str.endsWith(m29645("ￎ\u0013\u0013\u0001\f\u0003", 6 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), true, 1 - View.getDefaultSize(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 178).intern());
        int i5 = f28195 + 43;
        f28194 = i5 % 128;
        if (i5 % 2 != 0) {
            return zEndsWith;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private C12087n m29658(final boolean z) {
        int i2 = 2 % 2;
        C12087n c12087n = new C12087n() { // from class: com.ironsource.adqualitysdk.sdk.i.co.14

            /* JADX INFO: renamed from: ﱟ */
            private static int f28244 = 0;

            /* JADX INFO: renamed from: ﺙ */
            private static int f28245 = 1;

            /* JADX INFO: renamed from: ﻛ */
            private static long f28246 = 0;

            /* JADX INFO: renamed from: ｋ */
            private static char f28247 = 32485;

            /* JADX INFO: renamed from: ﾒ */
            private static int f28248;

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo28225(JSONObject jSONObject, WebView webView, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28245 + 17;
                f28244 = i4 % 128;
                int i5 = i4 % 2;
                mo28225(jSONObject, webView, activity);
                if (i5 != 0) {
                    int i6 = 9 / 0;
                }
                int i7 = f28244 + 45;
                f28245 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 22 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo28226(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28245 + 53;
                f28244 = i4 % 128;
                int i5 = i4 % 2;
                mo28226(jSONObject, webView, obj, activity);
                int i6 = f28245 + 97;
                f28244 = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                Object obj2 = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo28227(JSONObject jSONObject, WebView webView, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28244 + 47;
                f28245 = i4 % 128;
                int i5 = i4 % 2;
                Object obj = null;
                mo28227(jSONObject, webView, activity);
                if (i5 == 0) {
                    super.hashCode();
                    throw null;
                }
                int i6 = f28244 + 99;
                f28245 = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo28228(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28245 + 1;
                f28244 = i4 % 128;
                int i5 = i4 % 2;
                mo28228(jSONObject, webView, obj, activity);
                int i6 = f28245 + 55;
                f28244 = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                Object obj2 = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo28229(JSONObject jSONObject, WebView webView, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28245 + 3;
                f28244 = i4 % 128;
                int i5 = i4 % 2;
                mo28229(jSONObject, webView, activity);
                if (i5 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo28230(JSONObject jSONObject, WebView webView, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28244 + 93;
                f28245 = i4 % 128;
                int i5 = i4 % 2;
                mo28230(jSONObject, webView, activity);
                int i6 = f28244 + 19;
                f28245 = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo28231(JSONObject jSONObject, WebView webView, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28244 + 73;
                f28245 = i4 % 128;
                int i5 = i4 % 2;
                mo28231(jSONObject, webView, activity);
                int i6 = f28244 + 53;
                f28245 = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo28232(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28244 + 83;
                f28245 = i4 % 128;
                int i5 = i4 % 2;
                mo28232(jSONObject, webView, obj, activity);
                int i6 = f28244 + 39;
                f28245 = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                Object obj2 = null;
                super.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n
            /* JADX INFO: renamed from: ﾒ */
            public final void mo28227(JSONObject jSONObject, WebView webView, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28244 + 5;
                f28245 = i4 % 128;
                if (i4 % 2 == 0) {
                    m29718(m29717("ፑÒ纤\ud9e2䜟쭈ꆢⅽ\ud7abଽ㊒", (char) KeyEvent.normalizeMetaState(0), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getEdgeSlop() * 30) + 2076751095, "\uf717좴䵻髌").intern(), jSONObject, webView, null, activity);
                } else {
                    m29718(m29717("ፑÒ纤\ud9e2䜟쭈ꆢⅽ\ud7abଽ㊒", (char) KeyEvent.normalizeMetaState(0), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getEdgeSlop() >> 16) + 2076751095, "\uf717좴䵻髌").intern(), jSONObject, webView, null, activity);
                }
                int i5 = f28244 + 31;
                f28245 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n
            /* JADX INFO: renamed from: ﻐ */
            public final void mo28229(JSONObject jSONObject, WebView webView, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28245 + 27;
                f28244 = i4 % 128;
                int i5 = i4 % 2;
                m29718(m29717("퀎겘ﻒ\ue7d1㵠繛㿂抇娠罡歍碗乧ꗎ㏛\uec04", (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 26312), "\u0000\u0000\u0000\u0000", ViewConfiguration.getMaximumDrawingCacheSize() >> 24, "࢈늢젶륦").intern(), jSONObject, webView, null, activity);
                int i6 = f28244 + 85;
                f28245 = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n
            /* JADX INFO: renamed from: ｋ */
            public final void mo28226(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28244 + 17;
                f28245 = i4 % 128;
                int i5 = i4 % 2;
                m29718(m29717("ꛕﲅ똆삄蠏\ude61翏䜥벙", (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u0000\u0000\u0000\u0000", (-601632766) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "ɫ⏐㓜\udddc").intern(), jSONObject, webView, obj, activity);
                int i6 = f28245 + 77;
                f28244 = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n
            /* JADX INFO: renamed from: ﾇ */
            public final void mo28232(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28245 + 79;
                f28244 = i4 % 128;
                if (i4 % 2 != 0) {
                    m29718(m29717("ኧᚣΏ潎⒈ﳱ㵱ꠤぅ醴뻕顶㈸蓅\ue71f", (char) (10026 >>> (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", (-1208639517) >> View.resolveSize(1, 1), "\ue357\uf59f醴쵯").intern(), jSONObject, webView, obj, activity);
                } else {
                    m29718(m29717("ኧᚣΏ潎⒈ﳱ㵱ꠤぅ醴뻕顶㈸蓅\ue71f", (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28665), "\u0000\u0000\u0000\u0000", (-1208639517) - View.resolveSize(0, 0), "\ue357\uf59f醴쵯").intern(), jSONObject, webView, obj, activity);
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n
            /* JADX INFO: renamed from: ｋ */
            public final void mo28225(JSONObject jSONObject, WebView webView, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28245 + 49;
                f28244 = i4 % 128;
                int i5 = i4 % 2;
                m29718(m29717("ﶘ\udce6\ue14e똸⢨⭯簴횰", (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", (-1) - TextUtils.lastIndexOf("", '0'), "ꋘ䖆窈⟍").intern(), jSONObject, webView, null, activity);
                int i6 = f28244 + 89;
                f28245 = i6 % 128;
                int i7 = i6 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n
            /* JADX INFO: renamed from: ﾇ */
            public final void mo28231(JSONObject jSONObject, WebView webView, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28244 + 57;
                f28245 = i4 % 128;
                int i5 = i4 % 2;
                m29718(m29717("潃椢犖韬൲찱魖\ude94铸㔣᭶斬", (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0000\u0000\u0000\u0000", KeyEvent.getDeadChar(0, 0), "䪡뚼ဆ\udaab").intern(), jSONObject, webView, null, activity);
                int i6 = f28245 + 5;
                f28244 = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28228(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28244 + 95;
                f28245 = i4 % 128;
                int i5 = i4 % 2;
                m29718(m29717("\u0df0鸝嶍婲ⅴඳ⾔籎끕︫캸풫\ud885ꬭ꜓썾箣㪕쪓ᕟ", (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "\u0000\u0000\u0000\u0000", ViewConfiguration.getScrollDefaultDelay() >> 16, "ᓱ\ue915鴽\ue50d").intern(), jSONObject, webView, obj, activity);
                int i6 = f28244 + 75;
                f28245 = i6 % 128;
                int i7 = i6 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28230(JSONObject jSONObject, WebView webView, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28244 + 45;
                f28245 = i4 % 128;
                if (i4 % 2 == 0) {
                    m29718(m29717("劜䞒켗層珁㷸\u0bdd㠈䚆끫萲", (char) Gravity.getAbsoluteGravity(1, 1), "\u0000\u0000\u0000\u0000", (-2112389816) >>> TextUtils.lastIndexOf("", (char) 14, 0), "䝵\u177d⚂螙").intern(), jSONObject, webView, null, activity);
                } else {
                    m29718(m29717("劜䞒켗層珁㷸\u0bdd㠈䚆끫萲", (char) Gravity.getAbsoluteGravity(0, 0), "\u0000\u0000\u0000\u0000", TextUtils.lastIndexOf("", '0', 0) - 2112389816, "䝵\u177d⚂螙").intern(), jSONObject, webView, null, activity);
                }
            }

            /* JADX INFO: renamed from: ﾒ */
            private void m29718(String str, JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i3 = 2 % 2;
                C11877co c11877co = C11877co.this;
                StringBuilder sb = new StringBuilder();
                sb.append(m29717("엷：䲂\uf1a5笈偃沽ﴚ쓌Ǉ홲荝\udb11䠆헯같\u0efa툜ᴖ", (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 62762), "\u0000\u0000\u0000\u0000", MotionEvent.axisFromString("") - 862983163, "ѝ迬⫌꯵").intern());
                sb.append(str);
                C11877co.m29631(c11877co, sb.toString(), z, false, Arrays.asList(jSONObject, webView, obj, activity));
                int i4 = f28245 + 19;
                f28244 = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﻛ */
            private static String m29717(String str, char c2, String str2, int i3, String str3) {
                String str4;
                Object charArray = str3;
                if (str3 != null) {
                    charArray = str3.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                Object charArray2 = str2;
                if (str2 != null) {
                    charArray2 = str2.toCharArray();
                }
                char[] cArr2 = (char[]) charArray2;
                Object charArray3 = str;
                if (str != null) {
                    charArray3 = str.toCharArray();
                }
                char[] cArr3 = (char[]) charArray3;
                synchronized (C12051j.f29510) {
                    char[] cArr4 = (char[]) cArr.clone();
                    char[] cArr5 = (char[]) cArr2.clone();
                    cArr4[0] = (char) (c2 ^ cArr4[0]);
                    cArr5[2] = (char) (cArr5[2] + ((char) i3));
                    int length = cArr3.length;
                    char[] cArr6 = new char[length];
                    C12051j.f29511 = 0;
                    while (C12051j.f29511 < length) {
                        int i4 = (C12051j.f29511 + 2) % 4;
                        int i5 = (C12051j.f29511 + 3) % 4;
                        C12051j.f29509 = (char) (((cArr4[C12051j.f29511 % 4] * 32718) + cArr5[i4]) % 65535);
                        cArr5[i5] = (char) (((cArr4[i5] * 32718) + cArr5[i4]) / 65535);
                        cArr4[i5] = C12051j.f29509;
                        cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i5] ^ cArr3[C12051j.f29511])) ^ f28246) ^ ((long) f28248)) ^ ((long) f28247));
                        C12051j.f29511++;
                    }
                    str4 = new String(cArr6);
                }
                return str4;
            }
        };
        int i3 = f28194 + 113;
        f28195 = i3 % 128;
        int i4 = i3 % 2;
        return c12087n;
    }

    /* JADX INFO: renamed from: ｋ */
    private C12093t m29643(final boolean z) {
        int i2 = 2 % 2;
        C12093t c12093t = new C12093t() { // from class: com.ironsource.adqualitysdk.sdk.i.co.11

            /* JADX INFO: renamed from: ﻛ */
            private static int f28231 = 1;

            /* JADX INFO: renamed from: ｋ */
            private static long f28232 = -6462879446616405498L;

            /* JADX INFO: renamed from: ﾒ */
            private static int f28233;

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo28225(JSONObject jSONObject, View view, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28233 + 53;
                f28231 = i4 % 128;
                int i5 = i4 % 2;
                mo28225(jSONObject, view, activity);
                if (i5 == 0) {
                    Object obj = null;
                    super.hashCode();
                    throw null;
                }
                int i6 = f28233 + 75;
                f28231 = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo28226(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28233 + 109;
                f28231 = i4 % 128;
                int i5 = i4 % 2;
                mo28226(jSONObject, view, obj, activity);
                if (i5 == 0) {
                    Object obj2 = null;
                    super.hashCode();
                    throw null;
                }
                int i6 = f28231 + 113;
                f28233 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 60 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo28227(JSONObject jSONObject, View view, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28233 + 11;
                f28231 = i4 % 128;
                int i5 = i4 % 2;
                mo28227(jSONObject, view, activity);
                int i6 = f28231 + 13;
                f28233 = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo28228(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28231 + 37;
                f28233 = i4 % 128;
                int i5 = i4 % 2;
                mo28228(jSONObject, view, obj, activity);
                if (i5 != 0) {
                    int i6 = 96 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo28229(JSONObject jSONObject, View view, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28233 + 43;
                f28231 = i4 % 128;
                int i5 = i4 % 2;
                mo28229(jSONObject, view, activity);
                if (i5 == 0) {
                    Object obj = null;
                    super.hashCode();
                    throw null;
                }
                int i6 = f28233 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f28231 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 84 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo28230(JSONObject jSONObject, View view, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28233 + 49;
                f28231 = i4 % 128;
                int i5 = i4 % 2;
                Object obj = null;
                mo28230(jSONObject, view, activity);
                if (i5 == 0) {
                    throw null;
                }
                int i6 = f28233 + 11;
                f28231 = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo28231(JSONObject jSONObject, View view, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28231 + 1;
                f28233 = i4 % 128;
                int i5 = i4 % 2;
                mo28231(jSONObject, view, activity);
                if (i5 != 0) {
                    int i6 = 64 / 0;
                }
                int i7 = f28233 + 55;
                f28231 = i7 % 128;
                int i8 = i7 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo28232(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28231 + 11;
                f28233 = i4 % 128;
                int i5 = i4 % 2;
                mo28232(jSONObject, view, obj, activity);
                int i6 = f28231 + 19;
                f28233 = i6 % 128;
                int i7 = i6 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t
            /* JADX INFO: renamed from: ﾒ */
            public final void mo28227(JSONObject jSONObject, View view, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28233 + 91;
                f28231 = i4 % 128;
                int i5 = i4 % 2;
                m29690(m29689("\u0f6d༌ቪ須埗ᛃ䎟袸✆⩦殟킈弤䉛㎏", KeyEvent.getMaxKeyCode() >> 16).intern(), jSONObject, view, null, activity);
                int i6 = f28231 + 95;
                f28233 = i6 % 128;
                int i7 = i6 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t
            /* JADX INFO: renamed from: ｋ */
            public final void mo28229(JSONObject jSONObject, View view, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28233 + 101;
                f28231 = i4 % 128;
                int i5 = i4 % 2;
                m29690(m29689("麞黿姁펣ꀘ뿓두↨뛵懍鱐禘컗ৰ쑀凔\ue6ae톙ⰾꧨ", TextUtils.indexOf((CharSequence) "", '0', 0) + 1).intern(), jSONObject, view, null, activity);
                int i6 = f28231 + 23;
                f28233 = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28226(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28231 + 53;
                f28233 = i4 % 128;
                if (i4 % 2 != 0) {
                    m29690(m29689("⿳⾒㒆뻤\udd45夋줊익ނಙ\ue10a齄羧", (TypedValue.complexToFloat(0) > 2.0f ? 1 : (TypedValue.complexToFloat(0) == 2.0f ? 0 : -1))).intern(), jSONObject, view, obj, activity);
                } else {
                    m29690(m29689("⿳⾒㒆뻤\udd45夋줊익ނಙ\ue10a齄羧", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), jSONObject, view, obj, activity);
                }
                int i5 = f28231 + 71;
                f28233 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t
            /* JADX INFO: renamed from: ｋ */
            public final void mo28232(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28231 + 41;
                f28233 = i4 % 128;
                if (i4 % 2 != 0) {
                    m29690(m29689("俾侟훛岹\ue5a8멥\uf1e7␛枏\ueec4\ud9e7簪ᾪ蛉臦呈㟛庽榏", (-1) / (ViewConfiguration.getScrollFriction() > 2.0f ? 1 : (ViewConfiguration.getScrollFriction() == 2.0f ? 0 : -1))).intern(), jSONObject, view, obj, activity);
                } else {
                    m29690(m29689("俾侟훛岹\ue5a8멥\uf1e7␛枏\ueec4\ud9e7簪ᾪ蛉臦呈㟛庽榏", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1).intern(), jSONObject, view, obj, activity);
                }
                int i5 = f28233 + 105;
                f28231 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28225(JSONObject jSONObject, View view, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28233 + 55;
                f28231 = i4 % 128;
                int i5 = i4 % 2;
                m29690(m29689("\ue10d\ue16c\ue8a9拋쮽됓\udff2⩭쥺킦\uf7fc牝", ViewConfiguration.getFadingEdgeLength() >> 16).intern(), jSONObject, view, null, activity);
                int i6 = f28233 + 85;
                f28231 = i6 % 128;
                int i7 = i6 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t
            /* JADX INFO: renamed from: ﻐ */
            public final void mo28231(JSONObject jSONObject, View view, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28231 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f28233 = i4 % 128;
                if (i4 % 2 != 0) {
                    m29690(m29689("嘣噕㯓놼᪲䍦\u0edb\udd03繺ϖ⛢蔭ٰ毢绫굀", ViewConfiguration.getFadingEdgeLength() / 72).intern(), jSONObject, view, null, activity);
                } else {
                    m29690(m29689("嘣噕㯓놼᪲䍦\u0edb\udd03繺ϖ⛢蔭ٰ毢绫굀", ViewConfiguration.getFadingEdgeLength() >> 16).intern(), jSONObject, view, null, activity);
                }
                int i5 = f28233 + 5;
                f28231 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t
            /* JADX INFO: renamed from: ﾒ */
            public final void mo28228(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28233 + 107;
                f28231 = i4 % 128;
                int i5 = i4 % 2;
                m29690(m29689("㝷㜀䲦웅㑋艏‥ᰞἇ璩ࠀ䐈朢Ჰ倛汤佚쓥롫鑐靡\uecc6聉뱉", ViewConfiguration.getEdgeSlop() >> 16).intern(), jSONObject, view, obj, activity);
                int i6 = f28233 + 27;
                f28231 = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t
            /* JADX INFO: renamed from: ﾇ */
            public final void mo28230(JSONObject jSONObject, View view, Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28231 + 5;
                f28233 = i4 % 128;
                int i5 = i4 % 2;
                m29690(m29689("莿菜䔐콣漒㰵筭ꉓꯈ紐即響폪ᔻ\u0b5a", TextUtils.lastIndexOf("", '0', 0, 0) + 1).intern(), jSONObject, view, null, activity);
                int i6 = f28231 + 51;
                f28233 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 40 / 0;
                }
            }

            /* JADX INFO: renamed from: ﻐ */
            private void m29690(String str, JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i3 = 2 % 2;
                C11877co c11877co = C11877co.this;
                StringBuilder sb = new StringBuilder();
                sb.append(m29689("쿭쾻\u2efc꒓樷璧繞\ueac2\ue7b4ᛩ噟다龮绑\u0e6e骋럀ꚯ\ue64d", KeyEvent.keyCodeFromString("")).intern());
                sb.append(str);
                C11877co.m29631(c11877co, sb.toString(), z, false, Arrays.asList(jSONObject, view, obj, activity));
                int i4 = f28231 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                f28233 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 30 / 0;
                }
            }

            /* JADX INFO: renamed from: ﻐ */
            private static String m29689(String str, int i3) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (C11943f.f28848) {
                    char[] cArrM30189 = C11943f.m30189(f28232, cArr, i3);
                    C11943f.f28846 = 4;
                    while (C11943f.f28846 < cArrM30189.length) {
                        C11943f.f28847 = C11943f.f28846 - 4;
                        cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f28232));
                        C11943f.f28846++;
                    }
                    str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
                }
                return str2;
            }
        };
        int i3 = f28195 + 87;
        f28194 = i3 % 128;
        if (i3 % 2 != 0) {
            return c12093t;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private C12095v m29652(final boolean z) {
        int i2 = 2 % 2;
        C12095v c12095v = new C12095v() { // from class: com.ironsource.adqualitysdk.sdk.i.co.13

            /* JADX INFO: renamed from: ﻐ */
            private static int f28239 = 0;

            /* JADX INFO: renamed from: ﻛ */
            private static int[] f28240 = {2128686196, 1323476466, 672286070, 267956599, 1003728514, -303646812, -177029460, 1202676447, 1917068700, -1617155405, -784652492, -1839265567, 1616008483, -1044321986, 840136394, -1231807494, -1612973302, -538696794};

            /* JADX INFO: renamed from: ｋ */
            private static int f28241 = 1;

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo28225(JSONObject jSONObject, WebView webView, View view) {
                int i3 = 2 % 2;
                int i4 = f28241 + 63;
                f28239 = i4 % 128;
                int i5 = i4 % 2;
                mo28225(jSONObject, webView, view);
                if (i5 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo28226(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i3 = 2 % 2;
                int i4 = f28241 + 45;
                f28239 = i4 % 128;
                int i5 = i4 % 2;
                Object obj2 = null;
                mo28226(jSONObject, webView, obj, view);
                if (i5 != 0) {
                    super.hashCode();
                    throw null;
                }
                int i6 = f28241 + 87;
                f28239 = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo28227(JSONObject jSONObject, WebView webView, View view) {
                int i3 = 2 % 2;
                int i4 = f28241 + 37;
                f28239 = i4 % 128;
                int i5 = i4 % 2;
                mo28227(jSONObject, webView, view);
                int i6 = f28241 + 31;
                f28239 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 94 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo28228(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i3 = 2 % 2;
                int i4 = f28239 + 63;
                f28241 = i4 % 128;
                int i5 = i4 % 2;
                mo28228(jSONObject, webView, obj, view);
                if (i5 != 0) {
                    return;
                }
                Object obj2 = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo28229(JSONObject jSONObject, WebView webView, View view) {
                int i3 = 2 % 2;
                int i4 = f28241 + 105;
                f28239 = i4 % 128;
                int i5 = i4 % 2;
                mo28229(jSONObject, webView, view);
                if (i5 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo28230(JSONObject jSONObject, WebView webView, View view) {
                int i3 = 2 % 2;
                int i4 = f28241 + 73;
                f28239 = i4 % 128;
                int i5 = i4 % 2;
                Object obj = null;
                mo28230(jSONObject, webView, view);
                if (i5 != 0) {
                    throw null;
                }
                int i6 = f28239 + 5;
                f28241 = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo28231(JSONObject jSONObject, WebView webView, View view) {
                int i3 = 2 % 2;
                int i4 = f28239 + 17;
                f28241 = i4 % 128;
                int i5 = i4 % 2;
                mo28231(jSONObject, webView, view);
                int i6 = f28239 + 97;
                f28241 = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo28232(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i3 = 2 % 2;
                int i4 = f28239 + 3;
                f28241 = i4 % 128;
                int i5 = i4 % 2;
                mo28232(jSONObject, webView, obj, view);
                if (i5 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v
            /* JADX INFO: renamed from: ﾒ */
            public final void mo28227(JSONObject jSONObject, WebView webView, View view) {
                int i3 = 2 % 2;
                int i4 = f28241 + 21;
                f28239 = i4 % 128;
                int i5 = i4 % 2;
                m29708(m29707(new int[]{791343310, 358274754, -1221639819, 1851441390, -141164020, 1892605411}, 11 - Color.blue(0)).intern(), jSONObject, webView, null, view);
                int i6 = f28241 + 105;
                f28239 = i6 % 128;
                int i7 = i6 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28229(JSONObject jSONObject, WebView webView, View view) {
                int i3 = 2 % 2;
                int i4 = f28241 + 15;
                f28239 = i4 % 128;
                int i5 = i4 % 2;
                m29708(m29707(new int[]{791343310, 358274754, -1221639819, 1851441390, 452921995, 1989199903, 1966304676, -42913132}, 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), jSONObject, webView, null, view);
                int i6 = f28239 + 21;
                f28241 = i6 % 128;
                int i7 = i6 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28226(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i3 = 2 % 2;
                int i4 = f28239 + 83;
                f28241 = i4 % 128;
                if (i4 % 2 == 0) {
                    m29708(m29707(new int[]{655582118, 705894325, -1509831089, 2143838339, -1656697845, 1755219419}, 47 << (ViewConfiguration.getScrollDefaultDelay() / 111)).intern(), jSONObject, webView, obj, view);
                } else {
                    m29708(m29707(new int[]{655582118, 705894325, -1509831089, 2143838339, -1656697845, 1755219419}, 9 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), jSONObject, webView, obj, view);
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v
            /* JADX INFO: renamed from: ﻐ */
            public final void mo28232(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i3 = 2 % 2;
                int i4 = f28239 + 7;
                f28241 = i4 % 128;
                int i5 = i4 % 2;
                m29708(m29707(new int[]{655582118, 705894325, -1509831089, 2143838339, -776581567, -1624521277, 436090857, 1207961905}, 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), jSONObject, webView, obj, view);
                int i6 = f28241 + 11;
                f28239 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 94 / 0;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v
            /* JADX INFO: renamed from: ｋ */
            public final void mo28225(JSONObject jSONObject, WebView webView, View view) {
                int i3 = 2 % 2;
                int i4 = f28239 + 39;
                f28241 = i4 % 128;
                if (i4 % 2 == 0) {
                    m29708(m29707(new int[]{655582118, 705894325, 1287067507, 1083252243}, 36 >> ExpandableListView.getPackedPositionGroup(1L)).intern(), jSONObject, webView, null, view);
                } else {
                    m29708(m29707(new int[]{655582118, 705894325, 1287067507, 1083252243}, 8 - ExpandableListView.getPackedPositionGroup(0L)).intern(), jSONObject, webView, null, view);
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v
            /* JADX INFO: renamed from: ﾇ */
            public final void mo28231(JSONObject jSONObject, WebView webView, View view) {
                int i3 = 2 % 2;
                int i4 = f28239 + 39;
                f28241 = i4 % 128;
                if (i4 % 2 == 0) {
                    m29708(m29707(new int[]{2016808342, -1013513375, 1643659324, -1372601660, 1890891165, 1484619485}, 49 >> View.MeasureSpec.getMode(1)).intern(), jSONObject, webView, null, view);
                } else {
                    m29708(m29707(new int[]{2016808342, -1013513375, 1643659324, -1372601660, 1890891165, 1484619485}, 12 - View.MeasureSpec.getMode(0)).intern(), jSONObject, webView, null, view);
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v
            /* JADX INFO: renamed from: ｋ */
            public final void mo28228(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i3 = 2 % 2;
                int i4 = f28239 + 63;
                f28241 = i4 % 128;
                int i5 = i4 % 2;
                m29708(m29707(new int[]{1656660676, 1060602729, -823722648, 169386870, 1086518300, 1687365623, 162719690, -822336368, -1566790667, 1964051518}, KeyEvent.getDeadChar(0, 0) + 20).intern(), jSONObject, webView, obj, view);
                int i6 = f28239 + 25;
                f28241 = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v
            /* JADX INFO: renamed from: ﻐ */
            public final void mo28230(JSONObject jSONObject, WebView webView, View view) {
                int i3 = 2 % 2;
                int i4 = f28239 + 33;
                f28241 = i4 % 128;
                int i5 = i4 % 2;
                m29708(m29707(new int[]{2062576052, 1829993037, -488648427, -1773543132, -1626316332, -939094295}, TextUtils.indexOf((CharSequence) "", '0', 0) + 12).intern(), jSONObject, webView, null, view);
                int i6 = f28239 + 15;
                f28241 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 56 / 0;
                }
            }

            /* JADX INFO: renamed from: ﾒ */
            private void m29708(String str, JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i3 = 2 % 2;
                C11877co c11877co = C11877co.this;
                StringBuilder sb = new StringBuilder();
                sb.append(m29707(new int[]{-2082877211, 2065338789, -1606615036, -977953951, 930643019, 844505529, -1209662969, -1823356253, -646545241, -1610082598}, 17 - TextUtils.indexOf("", "", 0)).intern());
                sb.append(str);
                C11877co.m29631(c11877co, sb.toString(), z, false, Arrays.asList(jSONObject, webView, obj, view));
                int i4 = f28239 + 105;
                f28241 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX INFO: renamed from: ｋ */
            private static String m29707(int[] iArr, int i3) {
                String str;
                synchronized (C11835b.f27464) {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f28240.clone();
                    C11835b.f27462 = 0;
                    while (C11835b.f27462 < iArr.length) {
                        cArr[0] = (char) (iArr[C11835b.f27462] >> 16);
                        cArr[1] = (char) iArr[C11835b.f27462];
                        cArr[2] = (char) (iArr[C11835b.f27462 + 1] >> 16);
                        cArr[3] = (char) iArr[C11835b.f27462 + 1];
                        C11835b.f27463 = (cArr[0] << 16) + cArr[1];
                        C11835b.f27461 = (cArr[2] << 16) + cArr[3];
                        C11835b.m28718(iArr2);
                        for (int i4 = 0; i4 < 16; i4++) {
                            int i5 = C11835b.f27463 ^ iArr2[i4];
                            C11835b.f27463 = i5;
                            C11835b.f27461 = C11835b.m28717(i5) ^ C11835b.f27461;
                            int i6 = C11835b.f27463;
                            C11835b.f27463 = C11835b.f27461;
                            C11835b.f27461 = i6;
                        }
                        int i7 = C11835b.f27463;
                        C11835b.f27463 = C11835b.f27461;
                        C11835b.f27461 = i7;
                        C11835b.f27461 = i7 ^ iArr2[16];
                        C11835b.f27463 ^= iArr2[17];
                        int i8 = C11835b.f27463;
                        int i9 = C11835b.f27461;
                        cArr[0] = (char) (C11835b.f27463 >>> 16);
                        cArr[1] = (char) C11835b.f27463;
                        cArr[2] = (char) (C11835b.f27461 >>> 16);
                        cArr[3] = (char) C11835b.f27461;
                        C11835b.m28718(iArr2);
                        cArr2[C11835b.f27462 << 1] = cArr[0];
                        cArr2[(C11835b.f27462 << 1) + 1] = cArr[1];
                        cArr2[(C11835b.f27462 << 1) + 2] = cArr[2];
                        cArr2[(C11835b.f27462 << 1) + 3] = cArr[3];
                        C11835b.f27462 += 2;
                    }
                    str = new String(cArr2, 0, i3);
                }
                return str;
            }
        };
        int i3 = f28195 + 29;
        f28194 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 96 / 0;
        }
        return c12095v;
    }

    /* JADX INFO: renamed from: ﻐ */
    private C12087n m29627(final C12087n c12087n, final C12087n c12087n2) {
        int i2 = 2 % 2;
        int i3 = f28194 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f28195 = i3 % 128;
        int i4 = i3 % 2;
        if (c12087n == null) {
            c12087n = new C12087n();
        }
        if (c12087n2 == null) {
            c12087n2 = new C12087n();
        }
        C12087n c12087n3 = new C12087n() { // from class: com.ironsource.adqualitysdk.sdk.i.co.12
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo28225(JSONObject jSONObject, WebView webView, Activity activity) {
                mo28225(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo28226(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                mo28226(jSONObject, webView, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo28227(JSONObject jSONObject, WebView webView, Activity activity) {
                mo28227(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻛ */
            public final /* bridge */ /* synthetic */ void mo28228(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                mo28228(jSONObject, webView, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo28229(JSONObject jSONObject, WebView webView, Activity activity) {
                mo28229(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo28230(JSONObject jSONObject, WebView webView, Activity activity) {
                mo28230(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo28231(JSONObject jSONObject, WebView webView, Activity activity) {
                mo28231(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo28232(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                mo28232(jSONObject, webView, obj, activity);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n
            /* JADX INFO: renamed from: ﾒ */
            public final void mo28227(JSONObject jSONObject, WebView webView, Activity activity) {
                c12087n2.mo28227(jSONObject, webView, activity);
                C12089p.m30935(new e.AnonymousClass5(c12087n, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n
            /* JADX INFO: renamed from: ﻐ */
            public final void mo28229(JSONObject jSONObject, WebView webView, Activity activity) {
                c12087n2.mo28229(jSONObject, webView, activity);
                C12089p.m30935(new a.AnonymousClass1(c12087n, jSONObject, webView, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n
            /* JADX INFO: renamed from: ｋ */
            public final void mo28226(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                c12087n2.mo28226(jSONObject, webView, obj, activity);
                C12089p.m30935(new b.AnonymousClass1(c12087n, jSONObject, webView, obj, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n
            /* JADX INFO: renamed from: ﾇ */
            public final void mo28232(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                c12087n2.mo28232(jSONObject, webView, obj, activity);
                C12089p.m30935(new c.AnonymousClass2(c12087n, jSONObject, webView, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n
            /* JADX INFO: renamed from: ｋ */
            public final void mo28225(JSONObject jSONObject, WebView webView, Activity activity) {
                c12087n2.mo28225(jSONObject, webView, activity);
                C12089p.m30935(new d.AnonymousClass4(c12087n, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n
            /* JADX INFO: renamed from: ﾇ */
            public final void mo28231(JSONObject jSONObject, WebView webView, Activity activity) {
                c12087n2.mo28231(jSONObject, webView, activity);
                C12089p.m30935(new f.AnonymousClass4(c12087n, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28228(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                c12087n2.mo28228(jSONObject, webView, obj, activity);
                C12089p.m30935(new i.AnonymousClass5(c12087n, jSONObject, webView, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12087n
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28230(JSONObject jSONObject, WebView webView, Activity activity) {
                c12087n2.mo28230(jSONObject, webView, activity);
                C12089p.m30935(new j.AnonymousClass1(c12087n, jSONObject, webView, activity));
            }
        };
        int i5 = f28195 + 43;
        f28194 = i5 % 128;
        if (i5 % 2 != 0) {
            return c12087n3;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private C12095v m29644(final C12095v c12095v, final C12095v c12095v2) {
        int i2 = 2 % 2;
        int i3 = f28194 + 73;
        f28195 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (c12095v == null) {
            c12095v = new C12095v();
            int i4 = f28194 + 79;
            f28195 = i4 % 128;
            int i5 = i4 % 2;
        }
        if (c12095v2 == null) {
            c12095v2 = new C12095v();
        }
        return new C12095v() { // from class: com.ironsource.adqualitysdk.sdk.i.co.15
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo28225(JSONObject jSONObject, WebView webView, View view) {
                mo28225(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo28226(JSONObject jSONObject, WebView webView, Object obj2, View view) {
                mo28226(jSONObject, webView, obj2, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo28227(JSONObject jSONObject, WebView webView, View view) {
                mo28227(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo28228(JSONObject jSONObject, WebView webView, Object obj2, View view) {
                mo28228(jSONObject, webView, obj2, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo28229(JSONObject jSONObject, WebView webView, View view) {
                mo28229(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo28230(JSONObject jSONObject, WebView webView, View view) {
                mo28230(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo28231(JSONObject jSONObject, WebView webView, View view) {
                mo28231(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo28232(JSONObject jSONObject, WebView webView, Object obj2, View view) {
                mo28232(jSONObject, webView, obj2, view);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v
            /* JADX INFO: renamed from: ﾒ */
            public final void mo28227(JSONObject jSONObject, WebView webView, View view) {
                c12095v2.mo28227(jSONObject, webView, view);
                C12089p.m30935(new e.AnonymousClass5(c12095v, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28229(JSONObject jSONObject, WebView webView, View view) {
                c12095v2.mo28229(jSONObject, webView, view);
                C12089p.m30935(new a.AnonymousClass1(c12095v, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28226(JSONObject jSONObject, WebView webView, Object obj2, View view) {
                c12095v2.mo28226(jSONObject, webView, obj2, view);
                C12089p.m30935(new b.AnonymousClass1(c12095v, jSONObject, webView, obj2, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v
            /* JADX INFO: renamed from: ﻐ */
            public final void mo28232(JSONObject jSONObject, WebView webView, Object obj2, View view) {
                c12095v2.mo28232(jSONObject, webView, obj2, view);
                C12089p.m30935(new c.AnonymousClass2(c12095v, jSONObject, webView, obj2, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v
            /* JADX INFO: renamed from: ｋ */
            public final void mo28225(JSONObject jSONObject, WebView webView, View view) {
                c12095v2.mo28225(jSONObject, webView, view);
                C12089p.m30935(new d.AnonymousClass4(c12095v, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v
            /* JADX INFO: renamed from: ﾇ */
            public final void mo28231(JSONObject jSONObject, WebView webView, View view) {
                c12095v2.mo28231(jSONObject, webView, view);
                C12089p.m30935(new f.AnonymousClass4(c12095v, jSONObject, webView, view));
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v
            /* JADX INFO: renamed from: ｋ */
            public final void mo28228(JSONObject jSONObject, WebView webView, Object obj2, View view) {
                c12095v2.mo28228(jSONObject, webView, obj2, view);
                C12089p.m30935(new i.AnonymousClass5(c12095v, jSONObject, webView, obj2, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12095v
            /* JADX INFO: renamed from: ﻐ */
            public final void mo28230(JSONObject jSONObject, WebView webView, View view) {
                c12095v2.mo28230(jSONObject, webView, view);
                C12089p.m30935(new j.AnonymousClass1(c12095v, jSONObject, webView, view));
            }
        };
    }

    /* JADX INFO: renamed from: ﾇ */
    private C12093t m29651(final C12093t c12093t, final C12093t c12093t2) {
        int i2 = 2 % 2;
        if (c12093t == null) {
            c12093t = new C12093t();
            int i3 = f28195 + 59;
            f28194 = i3 % 128;
            int i4 = i3 % 2;
        }
        if (c12093t2 == null) {
            c12093t2 = new C12093t();
            int i5 = f28195 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f28194 = i5 % 128;
            int i6 = i5 % 2;
        }
        return new C12093t() { // from class: com.ironsource.adqualitysdk.sdk.i.co.17
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo28225(JSONObject jSONObject, View view, Activity activity) {
                mo28225(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo28226(JSONObject jSONObject, View view, Object obj, Activity activity) {
                mo28226(jSONObject, view, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo28227(JSONObject jSONObject, View view, Activity activity) {
                mo28227(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo28228(JSONObject jSONObject, View view, Object obj, Activity activity) {
                mo28228(jSONObject, view, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo28229(JSONObject jSONObject, View view, Activity activity) {
                mo28229(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﾇ */
            public final /* bridge */ /* synthetic */ void mo28230(JSONObject jSONObject, View view, Activity activity) {
                mo28230(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo28231(JSONObject jSONObject, View view, Activity activity) {
                mo28231(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo28232(JSONObject jSONObject, View view, Object obj, Activity activity) {
                mo28232(jSONObject, view, obj, activity);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t
            /* JADX INFO: renamed from: ﾒ */
            public final void mo28227(JSONObject jSONObject, View view, Activity activity) {
                c12093t2.mo28227(jSONObject, view, activity);
                C12089p.m30935(new e.AnonymousClass5(c12093t, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t
            /* JADX INFO: renamed from: ｋ */
            public final void mo28229(JSONObject jSONObject, View view, Activity activity) {
                c12093t2.mo28229(jSONObject, view, activity);
                C12089p.m30935(new a.AnonymousClass1(c12093t, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28226(JSONObject jSONObject, View view, Object obj, Activity activity) {
                c12093t2.mo28226(jSONObject, view, obj, activity);
                C12089p.m30935(new b.AnonymousClass1(c12093t, jSONObject, view, obj, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t
            /* JADX INFO: renamed from: ｋ */
            public final void mo28232(JSONObject jSONObject, View view, Object obj, Activity activity) {
                c12093t2.mo28232(jSONObject, view, obj, activity);
                C12089p.m30935(new c.AnonymousClass2(c12093t, jSONObject, view, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28225(JSONObject jSONObject, View view, Activity activity) {
                c12093t2.mo28225(jSONObject, view, activity);
                C12089p.m30935(new d.AnonymousClass4(c12093t, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t
            /* JADX INFO: renamed from: ﻐ */
            public final void mo28231(JSONObject jSONObject, View view, Activity activity) {
                c12093t2.mo28231(jSONObject, view, activity);
                C12089p.m30935(new f.AnonymousClass4(c12093t, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t
            /* JADX INFO: renamed from: ﾒ */
            public final void mo28228(JSONObject jSONObject, View view, Object obj, Activity activity) {
                c12093t2.mo28228(jSONObject, view, obj, activity);
                C12089p.m30935(new i.AnonymousClass5(c12093t, jSONObject, view, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12093t
            /* JADX INFO: renamed from: ﾇ */
            public final void mo28230(JSONObject jSONObject, View view, Activity activity) {
                c12093t2.mo28230(jSONObject, view, activity);
                C12089p.m30935(new j.AnonymousClass1(c12093t, jSONObject, view, activity));
            }
        };
    }

    /* JADX INFO: renamed from: ﬤ */
    private AbstractC12059jh m29620() {
        int i2 = 2 % 2;
        AbstractC12059jh abstractC12059jh = new AbstractC12059jh() { // from class: com.ironsource.adqualitysdk.sdk.i.co.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                C11877co.this.m29674(C12035ik.f29377, C11877co.m29629(C11877co.this, activity, (Bundle) null));
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                C11877co.this.m29674(C12035ik.f29378, C11877co.m29629(C11877co.this, activity, (Bundle) null));
            }
        };
        int i3 = f28194 + 41;
        f28195 = i3 % 128;
        if (i3 % 2 == 0) {
            return abstractC12059jh;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$e */
    class e<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$e$5, reason: invalid class name */
        final class AnonymousClass5 extends AbstractRunnableC12044it {

            /* JADX INFO: renamed from: ﻛ */
            private /* synthetic */ Object f28299;

            /* JADX INFO: renamed from: ｋ */
            private /* synthetic */ JSONObject f28300;

            /* JADX INFO: renamed from: ﾇ */
            private /* synthetic */ Object f28301;

            /* JADX INFO: renamed from: ﾒ */
            private /* synthetic */ InterfaceC12090q f28302;

            AnonymousClass5(InterfaceC12090q interfaceC12090q, JSONObject jSONObject, Object obj, Object obj2) {
                this.f28302 = interfaceC12090q;
                this.f28300 = jSONObject;
                this.f28299 = obj;
                this.f28301 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                this.f28302.mo28227(this.f28300, this.f28299, this.f28301);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$a */
    class a<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$a$1, reason: invalid class name */
        final class AnonymousClass1 extends AbstractRunnableC12044it {

            /* JADX INFO: renamed from: ﻐ */
            private /* synthetic */ InterfaceC12090q f28281;

            /* JADX INFO: renamed from: ﻛ */
            private /* synthetic */ JSONObject f28282;

            /* JADX INFO: renamed from: ﾇ */
            private /* synthetic */ Object f28283;

            /* JADX INFO: renamed from: ﾒ */
            private /* synthetic */ Object f28284;

            AnonymousClass1(InterfaceC12090q interfaceC12090q, JSONObject jSONObject, Object obj, Object obj2) {
                this.f28281 = interfaceC12090q;
                this.f28282 = jSONObject;
                this.f28284 = obj;
                this.f28283 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                this.f28281.mo28229(this.f28282, this.f28284, this.f28283);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$b */
    class b<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$b$1, reason: invalid class name */
        final class AnonymousClass1 extends AbstractRunnableC12044it {

            /* JADX INFO: renamed from: ﻐ */
            private /* synthetic */ InterfaceC12090q f28285;

            /* JADX INFO: renamed from: ﻛ */
            private /* synthetic */ Object f28286;

            /* JADX INFO: renamed from: ｋ */
            private /* synthetic */ Object f28287;

            /* JADX INFO: renamed from: ﾇ */
            private /* synthetic */ Object f28288;

            /* JADX INFO: renamed from: ﾒ */
            private /* synthetic */ JSONObject f28289;

            AnonymousClass1(InterfaceC12090q interfaceC12090q, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f28285 = interfaceC12090q;
                this.f28289 = jSONObject;
                this.f28288 = obj;
                this.f28286 = obj2;
                this.f28287 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                this.f28285.mo28226(this.f28289, this.f28288, this.f28286, this.f28287);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$c */
    class c<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$c$2, reason: invalid class name */
        final class AnonymousClass2 extends AbstractRunnableC12044it {

            /* JADX INFO: renamed from: ﻐ */
            private /* synthetic */ Object f28290;

            /* JADX INFO: renamed from: ﻛ */
            private /* synthetic */ Object f28291;

            /* JADX INFO: renamed from: ｋ */
            private /* synthetic */ InterfaceC12090q f28292;

            /* JADX INFO: renamed from: ﾇ */
            private /* synthetic */ JSONObject f28293;

            /* JADX INFO: renamed from: ﾒ */
            private /* synthetic */ Object f28294;

            AnonymousClass2(InterfaceC12090q interfaceC12090q, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f28292 = interfaceC12090q;
                this.f28293 = jSONObject;
                this.f28291 = obj;
                this.f28290 = obj2;
                this.f28294 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                this.f28292.mo28232(this.f28293, this.f28291, this.f28290, this.f28294);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$d */
    class d<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$d$4, reason: invalid class name */
        final class AnonymousClass4 extends AbstractRunnableC12044it {

            /* JADX INFO: renamed from: ﻛ */
            private /* synthetic */ Object f28295;

            /* JADX INFO: renamed from: ｋ */
            private /* synthetic */ InterfaceC12090q f28296;

            /* JADX INFO: renamed from: ﾇ */
            private /* synthetic */ Object f28297;

            /* JADX INFO: renamed from: ﾒ */
            private /* synthetic */ JSONObject f28298;

            AnonymousClass4(InterfaceC12090q interfaceC12090q, JSONObject jSONObject, Object obj, Object obj2) {
                this.f28296 = interfaceC12090q;
                this.f28298 = jSONObject;
                this.f28295 = obj;
                this.f28297 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                this.f28296.mo28225(this.f28298, this.f28295, this.f28297);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$f */
    class f<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$f$4, reason: invalid class name */
        final class AnonymousClass4 extends AbstractRunnableC12044it {

            /* JADX INFO: renamed from: ﻐ */
            private /* synthetic */ JSONObject f28303;

            /* JADX INFO: renamed from: ﻛ */
            private /* synthetic */ InterfaceC12090q f28304;

            /* JADX INFO: renamed from: ｋ */
            private /* synthetic */ Object f28305;

            /* JADX INFO: renamed from: ﾒ */
            private /* synthetic */ Object f28306;

            AnonymousClass4(InterfaceC12090q interfaceC12090q, JSONObject jSONObject, Object obj, Object obj2) {
                this.f28304 = interfaceC12090q;
                this.f28303 = jSONObject;
                this.f28305 = obj;
                this.f28306 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                this.f28304.mo28231(this.f28303, this.f28305, this.f28306);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$i */
    class i<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$i$5, reason: invalid class name */
        final class AnonymousClass5 extends AbstractRunnableC12044it {

            /* JADX INFO: renamed from: ﻐ */
            private /* synthetic */ Object f28307;

            /* JADX INFO: renamed from: ﻛ */
            private /* synthetic */ Object f28308;

            /* JADX INFO: renamed from: ｋ */
            private /* synthetic */ InterfaceC12090q f28309;

            /* JADX INFO: renamed from: ﾇ */
            private /* synthetic */ JSONObject f28310;

            /* JADX INFO: renamed from: ﾒ */
            private /* synthetic */ Object f28311;

            AnonymousClass5(InterfaceC12090q interfaceC12090q, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f28309 = interfaceC12090q;
                this.f28310 = jSONObject;
                this.f28307 = obj;
                this.f28308 = obj2;
                this.f28311 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                this.f28309.mo28228(this.f28310, this.f28307, this.f28308, this.f28311);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$j */
    class j<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$j$1, reason: invalid class name */
        final class AnonymousClass1 extends AbstractRunnableC12044it {

            /* JADX INFO: renamed from: ﻛ */
            private /* synthetic */ JSONObject f28312;

            /* JADX INFO: renamed from: ｋ */
            private /* synthetic */ Object f28313;

            /* JADX INFO: renamed from: ﾇ */
            private /* synthetic */ InterfaceC12090q f28314;

            /* JADX INFO: renamed from: ﾒ */
            private /* synthetic */ Object f28315;

            AnonymousClass1(InterfaceC12090q interfaceC12090q, JSONObject jSONObject, Object obj, Object obj2) {
                this.f28314 = interfaceC12090q;
                this.f28312 = jSONObject;
                this.f28315 = obj;
                this.f28313 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                this.f28314.mo28230(this.f28312, this.f28315, this.f28313);
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private JSONObject m29655(Activity activity, Bundle bundle) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C12035ik.f29413, m29676().m29740());
            jSONObject.put(C12035ik.f29369, m29676().m29742());
            jSONObject.put(C12035ik.f29365, m29676().m29736());
            jSONObject.put(m29628((String) null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, (int[]) null, "\u0082\u0083\u008e£\u0085\u0092\u008e").intern(), activity.getClass().getName());
            if (bundle != null) {
                int i3 = f28195 + 33;
                f28194 = i3 % 128;
                int i4 = i3 % 2;
                jSONObject.put(m29628((String) null, TextUtils.indexOf("", "", 0, 0) + 127, (int[]) null, "\u0082\u0085\u008e\u0085¤\u0085\u0092\u008e").intern(), true);
            }
            int i5 = f28194 + 89;
            f28195 = i5 % 128;
            int i6 = i5 % 2;
            return jSONObject;
        } catch (JSONException unused) {
            C12085l.m30929(m29628((String) null, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, (int[]) null, "\u008c\u0082\u008b\u0082\u0085\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m29628((String) null, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, (int[]) null, "\u0085\u0092\u0082\u009c¡\u0084\u009b\u008b\u0084\u008a\u009c\u009b\u0085\u0092\u008e\u009b¢\u008b\u0089\u0085\u008e\u0082\u008c\u0092\u009b\u008c\u0084\u008c\u008c¥").intern());
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private InterfaceC12066jo m29657(final List<String> list) {
        int i2 = 2 % 2;
        InterfaceC12066jo interfaceC12066jo = new InterfaceC12066jo() { // from class: com.ironsource.adqualitysdk.sdk.i.co.1

            /* JADX INFO: renamed from: ﻏ */
            private static int f28211 = 1;

            /* JADX INFO: renamed from: ﻐ */
            private static char[] f28212 = {'o', 'n', 'F', 'c', AbstractJsonLexerKt.UNICODE_ESC, 's', 'L', 't', 'R', 'e', 'r', 'd', 'A', 'p', 'i', '.'};

            /* JADX INFO: renamed from: ｋ */
            private static char f28213 = 4;

            /* JADX INFO: renamed from: ﾇ */
            private static int f28214;

            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12066jo
            /* JADX INFO: renamed from: ﻐ */
            public final void mo28389(Activity activity) {
                int i3 = 2 % 2;
                int i4 = f28214 + 21;
                f28211 = i4 % 128;
                int i5 = i4 % 2;
                m29681(m29680("\u0001\u0002\u0003\u0001\u0000\u0007\u0006\u0007\u0001\u0004Å", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, (byte) (81 - (ViewConfiguration.getScrollBarSize() >> 8))).intern(), activity, list);
                int i6 = f28214 + 27;
                f28211 = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12066jo
            /* JADX INFO: renamed from: ﾇ */
            public final void mo28390(Activity activity) {
                int packedPositionChild;
                byte bIndexOf;
                int i3 = 2 % 2;
                int i4 = f28214 + 35;
                f28211 = i4 % 128;
                if (i4 % 2 == 0) {
                    packedPositionChild = ExpandableListView.getPackedPositionChild(0L) * 63;
                    bIndexOf = (byte) (5 % TextUtils.indexOf("", "", 0, 1));
                } else {
                    packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 16;
                    bIndexOf = (byte) (29 - TextUtils.indexOf("", "", 0, 0));
                }
                m29681(m29680("\u0001\u0002\u0003\u0001\u0000\u0007\u0004\t\r\t\u0004\u0003\u000b\n\u0081", packedPositionChild, bIndexOf).intern(), activity, list);
            }

            /* JADX INFO: renamed from: ﾒ */
            private void m29681(String str, final Activity activity, List<String> list2) {
                int i3 = 2 % 2;
                int i4 = f28214 + 45;
                f28211 = i4 % 128;
                if (i4 % 2 == 0) {
                    C11877co.m29634(activity, list2);
                    throw null;
                }
                if (C11877co.m29634(activity, list2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(m29680("\r\u000e\u000e\u0001\u0001\u0000\u0005\u0006\n\u0002\u0006\u0004\r\u0005\n\u000bD", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 17, (byte) (22 - TextUtils.getCapsMode("", 0, 0))).intern());
                    sb.append(str);
                    final String string = sb.toString();
                    C11877co.m29631(C11877co.this, string, true, false, Collections.singletonList(activity));
                    C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.co.1.1
                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            C11877co.m29631(C11877co.this, string, false, false, Collections.singletonList(activity));
                        }
                    });
                    int i5 = f28214 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                    f28211 = i5 % 128;
                    int i6 = i5 % 2;
                }
            }

            /* JADX INFO: renamed from: ﾒ */
            private static String m29680(String str, int i3, byte b2) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (C11970g.f28961) {
                    char[] cArr2 = f28212;
                    char c2 = f28213;
                    char[] cArr3 = new char[i3];
                    if (i3 % 2 != 0) {
                        i3--;
                        cArr3[i3] = (char) (cArr[i3] - b2);
                    }
                    if (i3 > 1) {
                        C11970g.f28962 = 0;
                        while (C11970g.f28962 < i3) {
                            C11970g.f28964 = cArr[C11970g.f28962];
                            C11970g.f28965 = cArr[C11970g.f28962 + 1];
                            if (C11970g.f28964 == C11970g.f28965) {
                                cArr3[C11970g.f28962] = (char) (C11970g.f28964 - b2);
                                cArr3[C11970g.f28962 + 1] = (char) (C11970g.f28965 - b2);
                            } else {
                                C11970g.f28963 = C11970g.f28964 / c2;
                                C11970g.f28959 = C11970g.f28964 % c2;
                                C11970g.f28966 = C11970g.f28965 / c2;
                                C11970g.f28960 = C11970g.f28965 % c2;
                                if (C11970g.f28959 == C11970g.f28960) {
                                    C11970g.f28963 = ((C11970g.f28963 + c2) - 1) % c2;
                                    C11970g.f28966 = ((C11970g.f28966 + c2) - 1) % c2;
                                    int i4 = (C11970g.f28963 * c2) + C11970g.f28959;
                                    int i5 = (C11970g.f28966 * c2) + C11970g.f28960;
                                    cArr3[C11970g.f28962] = cArr2[i4];
                                    cArr3[C11970g.f28962 + 1] = cArr2[i5];
                                } else if (C11970g.f28963 == C11970g.f28966) {
                                    C11970g.f28959 = ((C11970g.f28959 + c2) - 1) % c2;
                                    C11970g.f28960 = ((C11970g.f28960 + c2) - 1) % c2;
                                    int i6 = (C11970g.f28963 * c2) + C11970g.f28959;
                                    int i7 = (C11970g.f28966 * c2) + C11970g.f28960;
                                    cArr3[C11970g.f28962] = cArr2[i6];
                                    cArr3[C11970g.f28962 + 1] = cArr2[i7];
                                } else {
                                    int i8 = (C11970g.f28963 * c2) + C11970g.f28960;
                                    int i9 = (C11970g.f28966 * c2) + C11970g.f28959;
                                    cArr3[C11970g.f28962] = cArr2[i8];
                                    cArr3[C11970g.f28962 + 1] = cArr2[i9];
                                }
                            }
                            C11970g.f28962 += 2;
                        }
                    }
                    str2 = new String(cArr3);
                }
                return str2;
            }
        };
        int i3 = f28194 + 27;
        f28195 = i3 % 128;
        int i4 = i3 % 2;
        return interfaceC12066jo;
    }

    /* JADX INFO: renamed from: ףּ */
    private InterfaceC11874cl m29622() {
        int i2 = 2 % 2;
        InterfaceC11874cl interfaceC11874cl = new InterfaceC11874cl() { // from class: com.ironsource.adqualitysdk.sdk.i.co.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC11874cl
            /* JADX INFO: renamed from: ﾒ */
            public final void mo29605(final String str, final List<Object> list) {
                final boolean z = true;
                final boolean z2 = false;
                C11877co.m29631(C11877co.this, str, true, false, list);
                C11877co.m29630(C11877co.this, new AbstractC12039io() { // from class: com.ironsource.adqualitysdk.sdk.i.co.4.2
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        C11877co.m29631(C11877co.this, str, false, z2, list);
                    }
                }, false);
                C11877co.m29630(C11877co.this, new AbstractC12039io() { // from class: com.ironsource.adqualitysdk.sdk.i.co.4.2
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        C11877co.m29631(C11877co.this, str, false, z, list);
                    }
                }, true);
            }
        };
        int i3 = f28194 + 73;
        f28195 = i3 % 128;
        if (i3 % 2 == 0) {
            return interfaceC11874cl;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    protected final void m29677(String str, List<Object> list) {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m29628((String) null, 127 - View.resolveSizeAndState(0, 0, 0), (int[]) null, "\u008d\u0085\u008a\u008e\u0092\u0087\u008e\u0084\u008c¦\u008e\u008f\u0083\u0084\u0084¤").intern());
        sb.append(str);
        m29648(sb.toString(), list);
        int i3 = f28195 + 69;
        f28194 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    private void m29648(final String str, final List<Object> list) {
        int i2 = 2 % 2;
        C12089p.m30935(new AbstractC12039io() { // from class: com.ironsource.adqualitysdk.sdk.i.co.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                C11877co.m29631(C11877co.this, str, false, false, list);
            }
        });
        C12089p.m30938(new AbstractC12039io() { // from class: com.ironsource.adqualitysdk.sdk.i.co.6
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                C11877co.m29631(C11877co.this, str, true, false, list);
            }
        });
        m29632(new AbstractC12039io() { // from class: com.ironsource.adqualitysdk.sdk.i.co.8
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                C11877co.m29631(C11877co.this, str, false, true, list);
            }
        }, true);
        int i3 = f28194 + 45;
        f28195 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private void m29633(String str, boolean z, boolean z2, List<Object> list) {
        int i2 = 2 % 2;
        int i3 = f28194 + 63;
        f28195 = i3 % 128;
        int i4 = i3 % 2;
        try {
            C11902dm c11902dmM30352 = this.f28210.m30352(str);
            if (c11902dmM30352 != null) {
                int i5 = f28195 + 89;
                f28194 = i5 % 128;
                Object obj = null;
                if (i5 % 2 != 0) {
                    C11906dq c11906dqM30354 = this.f28210.m30354(c11902dmM30352.m30027());
                    if (c11906dqM30354 != null) {
                        if (z == c11902dmM30352.m30029() && z2 == c11902dmM30352.m30028()) {
                            if (C12092s.m30994().m31001()) {
                                C11875cm.m29606(m29666(), str);
                            }
                            c11906dqM30354.m30048(this.f28206, this, list);
                            return;
                        }
                        return;
                    }
                    String strM29666 = m29666();
                    StringBuilder sb = new StringBuilder();
                    sb.append(m29628((String) null, ExpandableListView.getPackedPositionGroup(0L) + 127, (int[]) null, "\u009b\u008c\u0084\u0095\u009b\u008b\u0084\u0089\u0085\u0089\u008b\u0089\u0095\u0082\u0087\u009b\u0087\u0084\u009a\u0085\u0082\u0099").intern());
                    sb.append(c11902dmM30352.m30027());
                    sb.append(m29645("\b\u0011\u0017\u0010\u0006ￂ\u0010\u0011\u0016ￂ", 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16), false, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 4, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 176).intern());
                    C11875cm.m29607(strM29666, sb.toString(), null);
                    return;
                }
                this.f28210.m30354(c11902dmM30352.m30027());
                super.hashCode();
                throw null;
            }
        } catch (Throwable th) {
            String strM29667 = m29666();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m29645("\u0010\u0013\u0013￦\uffc1\u0015\u000f\u0006\u0017\u0006\uffc1\b\u000f\n\r\u0005\u000f\u0002\t\uffc1\u0013", TextUtils.getOffsetBefore("", 0) + 21, true, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3, TextUtils.getOffsetBefore("", 0) + 177).intern());
            sb2.append(str);
            C11875cm.m29607(strM29667, sb2.toString(), th);
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m29674(String str, JSONObject jSONObject) {
        int i2 = 2 % 2;
        if (str.equals(m29645("\u0004\b\u000b\u0001￼\ufff7￼\ufff9￼�\u0011\ufff9", TextUtils.lastIndexOf("", '0', 0, 0) + 13, true, 8 - Drawable.resolveOpacity(0, 0), 186 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
            this.f28205.m29731().m28702(jSONObject);
        } else if (str.equals(m29645("\ufff9\ufffe\ufffb\ufffe\uffff\r\t\u0006�", 9 - (ViewConfiguration.getScrollBarSize() >> 8), true, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2, (ViewConfiguration.getEdgeSlop() >> 16) + 184).intern())) {
            this.f28205.m29731().m28704(jSONObject);
        }
        JSONObject jSONObjectM30816 = C12077jz.m30816(m29638(jSONObject));
        if (!(!str.equals(C12035ik.f29374))) {
            this.f28205.m29731().m28706(jSONObjectM30816);
            return;
        }
        Object obj = null;
        if (str.equals(C12035ik.f29370)) {
            int i3 = f28195 + 39;
            f28194 = i3 % 128;
            if (i3 % 2 != 0) {
                this.f28205.m29731().m28710(jSONObjectM30816);
                return;
            } else {
                this.f28205.m29731().m28710(jSONObjectM30816);
                super.hashCode();
                throw null;
            }
        }
        if (str.equals(C12035ik.f29377)) {
            int i4 = f28195 + 27;
            f28194 = i4 % 128;
            int i5 = i4 % 2;
            this.f28205.m29731().m28709(jSONObjectM30816);
            return;
        }
        if (str.equals(C12035ik.f29378)) {
            int i6 = f28195 + 81;
            f28194 = i6 % 128;
            if (i6 % 2 == 0) {
                this.f28205.m29731().m28699(jSONObjectM30816);
                throw null;
            }
            this.f28205.m29731().m28699(jSONObjectM30816);
            int i7 = f28195 + 25;
            f28194 = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        if (str.equals(C12035ik.f29372)) {
            this.f28205.m29731().m28698(jSONObjectM30816);
            return;
        }
        if (str.equals(C12035ik.f29371)) {
            this.f28205.m29731().m28697(jSONObjectM30816);
        } else if (str.equals(C12035ik.f29373)) {
            this.f28205.m29731().m28700(jSONObjectM30816);
        } else {
            this.f28205.m29731().m28705(str, jSONObject);
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private void m29632(final AbstractC12039io abstractC12039io, boolean z) {
        int i2 = 2 % 2;
        int i3 = f28195 + 15;
        f28194 = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (z) {
                C12089p.m30943(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.co.7
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        C12089p.m30933(abstractC12039io);
                    }
                });
                return;
            }
            C12089p.m30933(abstractC12039io);
            int i5 = f28195 + 29;
            f28194 = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: טּ */
    private void m29621() {
        int i2 = 2 % 2;
        int i3 = f28195 + 89;
        f28194 = i3 % 128;
        int i4 = i3 % 2;
        this.f28203.m31018();
        int i5 = f28195 + 95;
        f28194 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29628(String str, int i2, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(C9415C.ISO88591_NAME);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C12088o.f29838) {
            char[] cArr2 = f28198;
            int i3 = f28196;
            if (f28197) {
                int length = bArr.length;
                C12088o.f29839 = length;
                char[] cArr3 = new char[length];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr3[C12088o.f29840] = (char) (cArr2[bArr[(C12088o.f29839 - 1) - C12088o.f29840] + i2] - i3);
                    C12088o.f29840++;
                }
                return new String(cArr3);
            }
            if (f28200) {
                int length2 = cArr.length;
                C12088o.f29839 = length2;
                char[] cArr4 = new char[length2];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr4[C12088o.f29840] = (char) (cArr2[cArr[(C12088o.f29839 - 1) - C12088o.f29840] - i2] - i3);
                    C12088o.f29840++;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            C12088o.f29839 = length3;
            char[] cArr5 = new char[length3];
            C12088o.f29840 = 0;
            while (C12088o.f29840 < C12088o.f29839) {
                cArr5[C12088o.f29840] = (char) (cArr2[iArr[(C12088o.f29839 - 1) - C12088o.f29840] - i2] - i3);
                C12088o.f29840++;
            }
            return new String(cArr5);
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m29645(String str, int i2, boolean z, int i3, int i4) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11889d.f28479) {
            char[] cArr2 = new char[i2];
            C11889d.f28481 = 0;
            while (C11889d.f28481 < i2) {
                C11889d.f28480 = cArr[C11889d.f28481];
                cArr2[C11889d.f28481] = (char) (C11889d.f28480 + i4);
                int i5 = C11889d.f28481;
                cArr2[i5] = (char) (cArr2[i5] - f28199);
                C11889d.f28481++;
            }
            if (i3 > 0) {
                C11889d.f28478 = i3;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - C11889d.f28478, C11889d.f28478);
                System.arraycopy(cArr3, C11889d.f28478, cArr2, 0, i2 - C11889d.f28478);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                C11889d.f28481 = 0;
                while (C11889d.f28481 < i2) {
                    cArr4[C11889d.f28481] = cArr2[(i2 - C11889d.f28481) - 1];
                    C11889d.f28481++;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}

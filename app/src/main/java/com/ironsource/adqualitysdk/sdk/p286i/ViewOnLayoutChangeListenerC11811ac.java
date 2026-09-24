package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C9415C;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ac */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnLayoutChangeListenerC11811ac extends AbstractC12097x<View> implements View.OnLayoutChangeListener, InterfaceC12064jm {

    /* JADX INFO: renamed from: ﺙ */
    private static int f26932 = 1;

    /* JADX INFO: renamed from: ﾇ */
    private static int f26933;

    /* JADX INFO: renamed from: ﾒ */
    private static char[] f26934 = {' ', AbstractJsonLexerKt.STRING_ESC, 'n', 'g', '_', 'f', 's', 'i', 'i', 'k', '`', 'd', 'k', 'h', 'h', 'i', 'g', 'T', 'V', '9', 'r', AbstractJsonLexerKt.BEGIN_LIST, '2', 'F', 'n', 'p', 'l', 'C', 'I', 's', 'q', 'i', 'm', 'm', 'B', 'G', 'q', 'J', 'C', 'j', 'k', 'k', 'i', 'l', 's', 'n', 'j', 'F', 'I', 'p', 'p', 212, '\"', AbstractJsonLexerKt.BEGIN_LIST, 'r', 'p', 'p', 'I', 'D', 'k', 'G', 'G', 'n', AbstractJsonLexerKt.END_LIST, 'V', 'm', 't', 'r', 't', AbstractJsonLexerKt.BEGIN_LIST, 'U', 'd', 'g', 'j', 'f'};

    /* JADX INFO: renamed from: ﻐ */
    private a f26935;

    /* JADX INFO: renamed from: ﻛ */
    private WeakHashMap<View, Boolean> f26936;

    /* JADX INFO: renamed from: ｋ */
    private Class f26937;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12097x
    /* JADX INFO: renamed from: ﻛ */
    final /* synthetic */ void mo28275(View view, List list) {
        int i = 2 % 2;
        int i2 = f26933 + 5;
        f26932 = i2 % 128;
        int i3 = i2 % 2;
        m28272(view, (List<WebView>) list);
        int i4 = f26932 + 93;
        f26933 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12097x
    /* JADX INFO: renamed from: ﾇ */
    final /* synthetic */ View mo28277(View view) {
        int i = 2 % 2;
        int i2 = f26933 + 91;
        f26932 = i2 % 128;
        View view2 = view;
        if (i2 % 2 != 0) {
            return m28266(view2);
        }
        m28266(view2);
        throw null;
    }

    ViewOnLayoutChangeListenerC11811ac(JSONObject jSONObject) {
        super(null);
        this.f26936 = new WeakHashMap<>();
        this.f26935 = new a(this);
        m28274(jSONObject);
    }

    /* JADX INFO: renamed from: ﻐ */
    public final void m28274(JSONObject jSONObject) {
        int i = 2 % 2;
        a aVar = new a(this, jSONObject);
        m31073((AbstractC12097x.b) aVar);
        this.f26935 = aVar;
        try {
            this.f26937 = Class.forName(a.m28283(aVar));
            int i2 = f26932 + 113;
            f26933 = i2 % 128;
            int i3 = i2 % 2;
            m28271();
            if (i3 != 0) {
                int i4 = 74 / 0;
            }
            int i5 = f26933 + 3;
            f26932 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 77 / 0;
            }
        } catch (ClassNotFoundException e) {
            String strIntern = m28269(true, new int[]{0, 19, 0, 11}, "\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m28269(true, new int[]{19, 31, 0, 3}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001").intern());
            sb.append(a.m28283(aVar));
            sb.append(m28269(true, new int[]{50, 2, 167, 1}, "\u0001\u0000").intern());
            sb.append(e.getLocalizedMessage());
            C12085l.m30909(strIntern, sb.toString());
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private void m28271() {
        int i = 2 % 2;
        int i2 = f26933 + 83;
        f26932 = i2 % 128;
        if (i2 % 2 == 0) {
            C12057jf.m30656().m30661(this);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        C12057jf.m30656().m30661(this);
        int i3 = f26933 + 73;
        f26932 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final void m28278() {
        int i = 2 % 2;
        int i2 = f26933 + 81;
        f26932 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            m31102((InterfaceC12090q) null);
            C12057jf.m30656().m30662(this);
            int i3 = f26933 + 63;
            f26932 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 44 / 0;
                return;
            }
            return;
        }
        m31102((InterfaceC12090q) null);
        C12057jf.m30656().m30662(this);
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static View m28266(View view) {
        int i = 2 % 2;
        int i2 = f26933 + 65;
        f26932 = i2 % 128;
        if (i2 % 2 != 0) {
            return view;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12097x
    /* JADX INFO: renamed from: ｋ */
    final InterfaceC12090q<WebView, View> mo28276() {
        int i = 2 % 2;
        int i2 = f26933;
        int i3 = i2 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f26932 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 97 / 0;
        }
        int i5 = i2 + 1;
        f26932 = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12097x
    /* JADX INFO: renamed from: ﻐ */
    final AbstractViewOnLayoutChangeListenerC11812ad mo28273() {
        int i = 2 % 2;
        C11809aa c11809aa = new C11809aa();
        int i2 = f26932 + 63;
        f26933 = i2 % 128;
        int i3 = i2 % 2;
        return c11809aa;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12064jm
    /* JADX INFO: renamed from: ﾒ */
    public final void mo28223(View view) {
        View viewM28268;
        int i = 2 % 2;
        View viewM28267 = m28267(view, this.f26937);
        if (viewM28267 != null) {
            m28270(viewM28267);
            return;
        }
        if (!TextUtils.isEmpty(a.m28285(this.f26935)) && (viewM28268 = m28268(view, a.m28285(this.f26935))) != null) {
            int i2 = f26932 + 111;
            f26933 = i2 % 128;
            int i3 = i2 % 2;
            viewM28268.addOnLayoutChangeListener(this);
            if (i3 != 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
        }
        int i4 = f26933 + 65;
        f26932 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12064jm
    /* JADX INFO: renamed from: ﾇ, reason: avoid collision after fix types in other method */
    public final void mo28222(View view) {
        int i = 2 % 2;
        View viewM28267 = m28267(view, this.f26937);
        if (viewM28267 != null && this.f26936.remove(viewM28267) != null) {
            int i2 = f26933 + 31;
            f26932 = i2 % 128;
            int i3 = i2 % 2;
            mo31051(view);
        }
        int i4 = f26933 + 103;
        f26932 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = f26932 + 49;
        f26933 = i10 % 128;
        Object obj = null;
        try {
            if (i10 % 2 == 0) {
                View viewM28267 = m28267(view, this.f26937);
                if (viewM28267 != null) {
                    m28270(viewM28267);
                    view.removeOnLayoutChangeListener(this);
                }
                int i11 = f26933 + 37;
                f26932 = i11 % 128;
                if (i11 % 2 != 0) {
                    return;
                }
                super.hashCode();
                throw null;
            }
            m28267(view, this.f26937);
            super.hashCode();
            throw null;
        } catch (Throwable th) {
            C12080kb.m30845(m28269(true, new int[]{0, 19, 0, 11}, "\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000").intern(), m28269(false, new int[]{52, 23, 0, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000").intern(), th, false);
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private void m28270(View view) {
        int i = 2 % 2;
        if (!this.f26936.containsKey(view)) {
            int i2 = f26932 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            f26933 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f26936.put(view, Boolean.TRUE);
                mo31048(view, Integer.toHexString(view.hashCode()));
                int i3 = 1 / 0;
            } else {
                this.f26936.put(view, Boolean.TRUE);
                mo31048(view, Integer.toHexString(view.hashCode()));
            }
        }
        int i4 = f26933 + 47;
        f26932 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ */
    private View m28267(View view, Class cls) {
        int i = 2 % 2;
        if (view instanceof ViewGroup) {
            int i2 = f26932 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f26933 = i2 % 128;
            int i3 = i2 % 2;
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (!cls.isAssignableFrom(childAt.getClass())) {
                    View viewM28267 = m28267(childAt, cls);
                    if (viewM28267 != null) {
                        int i5 = f26933 + 9;
                        f26932 = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 32 / 0;
                        }
                        return viewM28267;
                    }
                } else {
                    int i7 = f26933 + 33;
                    f26932 = i7 % 128;
                    if (i7 % 2 != 0) {
                        return childAt;
                    }
                    throw null;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048 A[LOOP:0: B:10:0x001f->B:19:0x0048, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    /* JADX INFO: renamed from: ﻛ */
    private View m28268(View view, String str) {
        ViewGroup viewGroup;
        View childAt;
        View viewM28268;
        int i = 2 % 2;
        int i2 = f26933 + 83;
        f26932 = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            int i4 = 86 / 0;
            if (!(!(view instanceof ViewGroup))) {
                viewGroup = (ViewGroup) view;
                while (i3 < viewGroup.getChildCount()) {
                    childAt = viewGroup.getChildAt(i3);
                    if (childAt.getClass().getName().startsWith(str)) {
                        viewM28268 = m28268(childAt, str);
                        if (viewM28268 != null) {
                            return viewM28268;
                        }
                        i3++;
                        int i5 = f26933 + 53;
                        f26932 = i5 % 128;
                        int i6 = i5 % 2;
                    } else {
                        int i7 = f26933 + 71;
                        f26932 = i7 % 128;
                        int i8 = i7 % 2;
                        return childAt;
                    }
                }
            }
        } else if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
            while (i3 < viewGroup.getChildCount()) {
                childAt = viewGroup.getChildAt(i3);
                if (childAt.getClass().getName().startsWith(str)) {
                    viewM28268 = m28268(childAt, str);
                    if (viewM28268 != null) {
                        return viewM28268;
                    }
                    i3++;
                    int i9 = f26933 + 53;
                    f26932 = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    int i11 = f26933 + 71;
                    f26932 = i11 % 128;
                    int i12 = i11 % 2;
                    return childAt;
                }
            }
        }
        int i13 = f26932 + 85;
        f26933 = i13 % 128;
        int i14 = i13 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private void m28272(View view, List<WebView> list) {
        int i = 2 % 2;
        int i2 = f26932 + 53;
        f26933 = i2 % 128;
        if (i2 % 2 != 0) {
            C12083kh.m30879(view, WebView.class, a.m28286(this.f26935), false, false, null, this.f26935.f30028, list);
        } else {
            C12083kh.m30879(view, WebView.class, a.m28286(this.f26935), true, false, null, this.f26935.f30028, list);
        }
        int i3 = f26933 + 59;
        f26932 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ac$a */
    public class a extends AbstractC12097x.b {

        /* JADX INFO: renamed from: ﮉ */
        private static int f26938 = 1;

        /* JADX INFO: renamed from: ﻏ */
        private static int f26943;

        /* JADX INFO: renamed from: ﻐ */
        private String f26945;

        /* JADX INFO: renamed from: ｋ */
        private String f26946;

        /* JADX INFO: renamed from: ﾇ */
        private String f26947;

        /* JADX INFO: renamed from: ﾒ */
        private static int[] f26944 = {-877452438, 1887784364, 848050981, 836093227, 911284899, -634162509, 1653580606, -1135966117, -765507557, 913146255, 402262574, -1650794265, -1586624560, -1379117782, 816821573, 43156758, 845677726, -1118288146};

        /* JADX INFO: renamed from: ﱟ */
        private static boolean f26940 = true;

        /* JADX INFO: renamed from: ﺙ */
        private static boolean f26942 = true;

        /* JADX INFO: renamed from: ﱡ */
        private static int f26941 = 40;

        /* JADX INFO: renamed from: ﮐ */
        private static char[] f26939 = {157, 155, 141, 'm', Typography.nbsp, 156, 154, 137, 'r', 148, 'x', 142, 145, 'T', 149, 152, 'q', 150, 139, 'w', 151};

        /* JADX INFO: renamed from: ｋ */
        static /* synthetic */ String m28283(a aVar) {
            int i = 2 % 2;
            int i2 = f26943;
            int i3 = i2 + 47;
            f26938 = i3 % 128;
            int i4 = i3 % 2;
            String str = aVar.f26945;
            int i5 = i2 + 91;
            f26938 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ */
        static /* synthetic */ String m28285(a aVar) {
            int i = 2 % 2;
            int i2 = f26938 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            int i3 = i2 % 128;
            f26943 = i3;
            int i4 = i2 % 2;
            String str = aVar.f26947;
            if (i4 != 0) {
                int i5 = 51 / 0;
            }
            int i6 = i3 + 113;
            f26938 = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        /* JADX INFO: renamed from: ﾒ */
        static /* synthetic */ String m28286(a aVar) {
            int i = 2 % 2;
            int i2 = f26943 + 11;
            int i3 = i2 % 128;
            f26938 = i3;
            int i4 = i2 % 2;
            String str = aVar.f26946;
            int i5 = i3 + 35;
            f26943 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public a(ViewOnLayoutChangeListenerC11811ac viewOnLayoutChangeListenerC11811ac) {
        }

        public a(ViewOnLayoutChangeListenerC11811ac viewOnLayoutChangeListenerC11811ac, JSONObject jSONObject) {
            m28280(jSONObject.optString(m28279(new int[]{879036837, 286801415, -76904979, -1528655659, -103060967, 1931837056, 797404830, -774830749, 1149697848, 431996507, 567526276, -198896341}, Gravity.getAbsoluteGravity(0, 0) + 22).intern()));
            m28284(jSONObject.optString(m28279(new int[]{1248625094, 1180126858, 1246739336, -623524300, -270756593, 1428877449, 7292383, -2112450161}, 12 - MotionEvent.axisFromString("")).intern()));
            m28282(jSONObject.optString(m28279(new int[]{572001166, -251355528, 1838940309, -1156219879, 1011065142, -1459243572, 1493474598, 1424644173}, 15 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern()));
            m31089(jSONObject.optString(m28279(new int[]{-1162513798, -1296571198, -1918550429, -1430921203, 1630546491, -435346594}, 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern()));
            m31093(false);
            m31096(!TextUtils.isEmpty(jSONObject.optString(m28279(new int[]{-1162513798, -1296571198, -1918550429, -1430921203, 1630546491, -435346594}, (ViewConfiguration.getLongPressTimeout() >> 16) + 10).intern())) || jSONObject.optBoolean(m28279(new int[]{-86314678, 874458888, 1332084668, -934405285, 1791891700, 932418782, -2012565965, -881553976}, 16 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern()) || jSONObject.optBoolean(m28279(new int[]{-86314678, 874458888, -60177805, -35872071, 964874018, -1619839732, 2008216562, -1644415586, 754064166, 80023001}, 19 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern()));
            m31094(jSONObject.optBoolean(m28279(new int[]{-86314678, 874458888, 1332084668, -934405285, 1791891700, 932418782, -2012565965, -881553976}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16).intern()));
            m31087(jSONObject.optBoolean(m28281((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, null, null, "\u0082\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern()));
            m31095(TextUtils.isEmpty(jSONObject.optString(m28281(Color.red(0) + 127, null, null, "\u0085\u008d\u008c\u0083\u0087\u008b\u008a\u0087\u0081").intern())) ? null : Arrays.asList(jSONObject.optString(m28281(127 - TextUtils.getTrimmedLength(""), null, null, "\u0085\u008d\u008c\u0083\u0087\u008b\u008a\u0087\u0081").intern()).split(m28281(View.resolveSizeAndState(0, 0, 0) + 127, null, null, "\u008e").intern())));
            m31092(jSONObject.optBoolean(m28279(new int[]{698331361, 165833758, 810777523, 662573104, -598819791, -426927888, -1482610, -21196775}, 13 - View.getDefaultSize(0, 0)).intern(), true));
            m31091(false);
            m31086(jSONObject.optBoolean(m28281(128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), null, null, "\u0082\u0083\u0093\u0092\u0088\u0086\u0082\u0092\u0091\u0083\u008a\u0090\u008d\u0086\u008a\u0081\u008f").intern()));
            m31088(jSONObject.optBoolean(m28281(127 - (ViewConfiguration.getTouchSlop() >> 8), null, null, "\u0086\u0082\u0095\u008b\u0092\u0094\u0090\u008f\u008d").intern()));
            m31090(C12077jz.m30804(jSONObject.optJSONArray(m28279(new int[]{1248625094, 1180126858, -944058441, 2100366860, 2053085589, 1660731840, 7292383, -2112450161}, View.MeasureSpec.makeMeasureSpec(0, 0) + 13).intern())));
        }

        /* JADX INFO: renamed from: ﻛ */
        private a m28280(String str) {
            int i = 2 % 2;
            int i2 = f26938 + 81;
            int i3 = i2 % 128;
            f26943 = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                this.f26946 = str;
                int i4 = i3 + 71;
                f26938 = i4 % 128;
                if (i4 % 2 != 0) {
                    return this;
                }
                super.hashCode();
                throw null;
            }
            this.f26946 = str;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ */
        private a m28284(String str) {
            int i = 2 % 2;
            int i2 = f26938 + 53;
            int i3 = i2 % 128;
            f26943 = i3;
            if (i2 % 2 == 0) {
                this.f26945 = str;
                int i4 = i3 + 89;
                f26938 = i4 % 128;
                int i5 = i4 % 2;
                return this;
            }
            this.f26945 = str;
            throw null;
        }

        /* JADX INFO: renamed from: ｋ */
        private a m28282(String str) {
            int i = 2 % 2;
            int i2 = f26938 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            f26943 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f26947 = str;
                return this;
            }
            this.f26947 = str;
            throw null;
        }

        /* JADX INFO: renamed from: ﻐ */
        private static String m28279(int[] iArr, int i) {
            String str;
            synchronized (C11835b.f27464) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f26944.clone();
                C11835b.f27462 = 0;
                while (C11835b.f27462 < iArr.length) {
                    cArr[0] = (char) (iArr[C11835b.f27462] >> 16);
                    cArr[1] = (char) iArr[C11835b.f27462];
                    cArr[2] = (char) (iArr[C11835b.f27462 + 1] >> 16);
                    cArr[3] = (char) iArr[C11835b.f27462 + 1];
                    C11835b.f27463 = (cArr[0] << 16) + cArr[1];
                    C11835b.f27461 = (cArr[2] << 16) + cArr[3];
                    C11835b.m28718(iArr2);
                    for (int i2 = 0; i2 < 16; i2++) {
                        int i3 = C11835b.f27463 ^ iArr2[i2];
                        C11835b.f27463 = i3;
                        C11835b.f27461 = C11835b.m28717(i3) ^ C11835b.f27461;
                        int i4 = C11835b.f27463;
                        C11835b.f27463 = C11835b.f27461;
                        C11835b.f27461 = i4;
                    }
                    int i5 = C11835b.f27463;
                    C11835b.f27463 = C11835b.f27461;
                    C11835b.f27461 = i5;
                    C11835b.f27461 = i5 ^ iArr2[16];
                    C11835b.f27463 ^= iArr2[17];
                    int i6 = C11835b.f27463;
                    int i7 = C11835b.f27461;
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
                str = new String(cArr2, 0, i);
            }
            return str;
        }

        /* JADX INFO: renamed from: ﻛ */
        private static String m28281(int i, String str, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f26939;
                int i2 = f26941;
                if (f26942) {
                    int length = bArr.length;
                    C12088o.f29839 = length;
                    char[] cArr3 = new char[length];
                    C12088o.f29840 = 0;
                    while (C12088o.f29840 < C12088o.f29839) {
                        cArr3[C12088o.f29840] = (char) (cArr2[bArr[(C12088o.f29839 - 1) - C12088o.f29840] + i] - i2);
                        C12088o.f29840++;
                    }
                    return new String(cArr3);
                }
                if (f26940) {
                    int length2 = cArr.length;
                    C12088o.f29839 = length2;
                    char[] cArr4 = new char[length2];
                    C12088o.f29840 = 0;
                    while (C12088o.f29840 < C12088o.f29839) {
                        cArr4[C12088o.f29840] = (char) (cArr2[cArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                        C12088o.f29840++;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                C12088o.f29839 = length3;
                char[] cArr5 = new char[length3];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr5[C12088o.f29840] = (char) (cArr2[iArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                    C12088o.f29840++;
                }
                return new String(cArr5);
            }
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m28269(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(C9415C.ISO88591_NAME);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (C12024i.f29270) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f26934, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                C12024i.f29269 = 0;
                char c = 0;
                while (C12024i.f29269 < i2) {
                    if (bArr[C12024i.f29269] == 1) {
                        cArr2[C12024i.f29269] = (char) (((cArr[C12024i.f29269] << 1) + 1) - c);
                    } else {
                        cArr2[C12024i.f29269] = (char) ((cArr[C12024i.f29269] << 1) - c);
                    }
                    c = cArr2[C12024i.f29269];
                    C12024i.f29269++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                C12024i.f29269 = 0;
                while (C12024i.f29269 < i2) {
                    cArr4[C12024i.f29269] = cArr[(i2 - C12024i.f29269) - 1];
                    C12024i.f29269++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                C12024i.f29269 = 0;
                while (C12024i.f29269 < i2) {
                    cArr[C12024i.f29269] = (char) (cArr[C12024i.f29269] - iArr[2]);
                    C12024i.f29269++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }
}

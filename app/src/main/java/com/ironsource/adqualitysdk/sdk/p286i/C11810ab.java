package com.ironsource.adqualitysdk.sdk.p286i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import androidx.media3.common.PlaybackException;
import com.google.android.exoplayer2.C9415C;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ab */
/* JADX INFO: loaded from: classes6.dex */
public final class C11810ab extends AbstractC12098y<View, Activity> {

    /* JADX INFO: renamed from: סּ */
    private static int f26880 = 1;

    /* JADX INFO: renamed from: ﭖ */
    private static int f26881 = 106;

    /* JADX INFO: renamed from: ﭴ */
    private static int f26882 = 1463095260;

    /* JADX INFO: renamed from: ﭸ */
    private static int f26883 = 0;

    /* JADX INFO: renamed from: ﮉ */
    private static byte[] f26884 = {-9, -29, -14, -32, -9, 3, -65, -7, Ascii.f22490CR, -76, -4, -26, -3, 126, -47, -29, -58, -38, Ascii.DC4, -118, -54, -42, -58, -47, -32, -49, Ascii.CAN, 127, -44, -50, -47, -2, -120, -94, 9, -83, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﮌ */
    private static short[] f26885 = null;

    /* JADX INFO: renamed from: ﺙ */
    private static int f26886 = 1660153957;

    /* JADX INFO: renamed from: ﮐ */
    private Class f26887;

    /* JADX INFO: renamed from: ﻐ */
    private InterfaceC12042ir f26891;

    /* JADX INFO: renamed from: ﻛ */
    private View.OnLayoutChangeListener f26892;

    /* JADX INFO: renamed from: ｋ */
    private InterfaceC12064jm f26893;

    /* JADX INFO: renamed from: ﾇ */
    private final Map<WebView, AbstractViewOnLayoutChangeListenerC11812ad> f26894 = new WeakHashMap();

    /* JADX INFO: renamed from: ﾒ */
    private final Map<View, C11810ab> f26895 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻏ */
    private final Map<View, View.OnLayoutChangeListener> f26890 = new WeakHashMap();

    /* JADX INFO: renamed from: ﱟ */
    private e f26888 = new e();

    /* JADX INFO: renamed from: ﱡ */
    private final List<View> f26889 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ Map m28201(C11810ab c11810ab) {
        int i = 2 % 2;
        int i2 = f26883 + 95;
        f26880 = i2 % 128;
        int i3 = i2 % 2;
        Map<View, View.OnLayoutChangeListener> map = c11810ab.f26890;
        if (i3 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ List m28206(C11810ab c11810ab) {
        int i = 2 % 2;
        int i2 = f26883 + 95;
        int i3 = i2 % 128;
        f26880 = i3;
        int i4 = i2 % 2;
        List<View> list = c11810ab.f26889;
        int i5 = i3 + 73;
        f26883 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ void m28207(Activity activity, View view, Class cls, boolean z, List list, List list2, List list3) {
        int i = 2 % 2;
        int i2 = f26883 + 9;
        f26880 = i2 % 128;
        int i3 = i2 % 2;
        m28211(activity, view, cls, z, list, list2, list3);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ View.OnLayoutChangeListener m28210(C11810ab c11810ab) {
        int i = 2 % 2;
        int i2 = f26880;
        int i3 = i2 + 93;
        f26883 = i3 % 128;
        int i4 = i3 % 2;
        View.OnLayoutChangeListener onLayoutChangeListener = c11810ab.f26892;
        int i5 = i2 + 95;
        f26883 = i5 % 128;
        if (i5 % 2 == 0) {
            return onLayoutChangeListener;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ void m28212(C11810ab c11810ab, List list) {
        int i = 2 % 2;
        int i2 = f26880 + 107;
        f26883 = i2 % 128;
        int i3 = i2 % 2;
        c11810ab.m28209((List<View>) list);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ e m28213(C11810ab c11810ab) {
        int i = 2 % 2;
        int i2 = f26880 + 103;
        int i3 = i2 % 128;
        f26883 = i3;
        int i4 = i2 % 2;
        e eVar = c11810ab.f26888;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 15;
        f26880 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 45 / 0;
        }
        return eVar;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ Class m28216(C11810ab c11810ab) {
        int i = 2 % 2;
        int i2 = f26880;
        int i3 = i2 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f26883 = i3 % 128;
        int i4 = i3 % 2;
        Class cls = c11810ab.f26887;
        int i5 = i2 + 65;
        f26883 = i5 % 128;
        int i6 = i5 % 2;
        return cls;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12098y
    /* JADX INFO: renamed from: ﻐ */
    protected final /* synthetic */ String mo28218(Activity activity) {
        int i = 2 % 2;
        int i2 = f26880 + 35;
        f26883 = i2 % 128;
        int i3 = i2 % 2;
        String strM28204 = m28204();
        int i4 = f26880 + 17;
        f26883 = i4 % 128;
        int i5 = i4 % 2;
        return strM28204;
    }

    C11810ab(JSONObject jSONObject, InterfaceC12042ir interfaceC12042ir) {
        m28220(jSONObject, interfaceC12042ir);
        m28202();
    }

    /* JADX INFO: renamed from: ﻛ */
    final void m28220(JSONObject jSONObject, InterfaceC12042ir interfaceC12042ir) {
        int i = 2 % 2;
        this.f26888 = new e(jSONObject);
        this.f26891 = interfaceC12042ir;
        int i2 = f26880 + 87;
        f26883 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    private void m28202() {
        int i = 2 % 2;
        this.f26892 = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.ab.5

            /* JADX INFO: renamed from: ﻐ */
            private static long f26903 = -9138622156967563746L;

            /* JADX INFO: renamed from: ﻛ */
            private static int f26904 = 1;

            /* JADX INFO: renamed from: ﾒ */
            private static int f26905;

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10 = 2 % 2;
                int i11 = f26904 + 87;
                f26905 = i11 % 128;
                try {
                    if (i11 % 2 == 0) {
                        C11810ab.this.m28219(view);
                        int i12 = f26904 + 5;
                        f26905 = i12 % 128;
                        if (i12 % 2 != 0) {
                            int i13 = 40 / 0;
                            return;
                        }
                        return;
                    }
                    C11810ab.this.m28219(view);
                    Object obj = null;
                    super.hashCode();
                    throw null;
                } catch (Throwable th) {
                    C12080kb.m30845(m28233("⹈幸칥繄\uee63ḱ踷㸿긇\udef7们ﻗ滏麯", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 28686).intern(), m28233("⹛뎋ᖢ\uf7c4姰㮽鴝缡섆ꍮն\ue6bf䢫⫝̸賓滢\uf01a刊㑈陚硼\udd8a뾡", 40423 - TextUtils.indexOf("", "", 0)).intern(), th, false);
                }
            }

            /* JADX INFO: renamed from: ﻛ */
            private static String m28233(String str, int i2) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (C11997h.f29102) {
                    C11997h.f29101 = i2;
                    char[] cArr2 = new char[cArr.length];
                    C11997h.f29103 = 0;
                    while (C11997h.f29103 < cArr.length) {
                        cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f26903);
                        C11997h.f29103++;
                    }
                    str2 = new String(cArr2);
                }
                return str2;
            }
        };
        this.f26893 = new InterfaceC12064jm() { // from class: com.ironsource.adqualitysdk.sdk.i.ab.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12064jm
            /* JADX INFO: renamed from: ﾒ */
            public final void mo28223(View view) {
                view.addOnLayoutChangeListener(C11810ab.m28210(C11810ab.this));
                C11810ab.m28201(C11810ab.this).put(view, C11810ab.m28210(C11810ab.this));
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12064jm
            /* JADX INFO: renamed from: ﾇ */
            public final void mo28222(View view) {
                view.removeOnLayoutChangeListener(C11810ab.m28210(C11810ab.this));
                C11810ab.m28201(C11810ab.this).remove(view);
            }
        };
        C12057jf.m30656().m30661(this.f26893);
        int i2 = f26880 + 11;
        f26883 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    final void m28221() {
        int i = 2 % 2;
        m31102((InterfaceC12090q) null);
        C12057jf.m30656().m30662(this.f26893);
        HashSet hashSet = new HashSet(this.f26890.keySet());
        this.f26890.clear();
        Iterator it = hashSet.iterator();
        while (!(!it.hasNext())) {
            int i2 = f26880 + 23;
            f26883 = i2 % 128;
            if (i2 % 2 != 0) {
                ((View) it.next()).removeOnLayoutChangeListener(this.f26892);
                int i3 = 73 / 0;
            } else {
                ((View) it.next()).removeOnLayoutChangeListener(this.f26892);
            }
        }
        int i4 = f26880 + 9;
        f26883 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m28204() {
        int i = 2 % 2;
        int i2 = f26883;
        int i3 = i2 + 103;
        f26880 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 7;
        f26880 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final void m28219(final View view) {
        int i = 2 % 2;
        try {
            Object obj = null;
            if (this.f26887 == null) {
                int i2 = f26880 + 55;
                f26883 = i2 % 128;
                if (i2 % 2 != 0) {
                    this.f26887 = Class.forName(e.m28254(this.f26888));
                    throw null;
                }
                this.f26887 = Class.forName(e.m28254(this.f26888));
                int i3 = f26883 + 103;
                f26880 = i3 % 128;
                int i4 = i3 % 2;
            }
            final Activity activityMo30664 = AbstractC12058jg.m30663().mo30664();
            if (activityMo30664 == null) {
                return;
            }
            if (!e.m28258(this.f26888).isEmpty()) {
                int i5 = f26880 + 47;
                f26883 = i5 % 128;
                if (i5 % 2 != 0) {
                    C12083kh.m30871(view);
                    super.hashCode();
                    throw null;
                }
                Activity activityM30871 = C12083kh.m30871(view);
                if (activityM30871 != null && e.m28258(this.f26888).contains(activityM30871.getClass().getName())) {
                    return;
                }
            }
            C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ab.3
                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                /* JADX INFO: renamed from: ﻛ */
                public final void mo28224() {
                    C11810ab.m28206(C11810ab.this).clear();
                    C11810ab.m28207(activityMo30664, view, C11810ab.m28216(C11810ab.this), e.m28265(C11810ab.m28213(C11810ab.this)), e.m28261(C11810ab.m28213(C11810ab.this)), e.m28250(C11810ab.m28213(C11810ab.this)), C11810ab.m28206(C11810ab.this));
                    if (C12083kh.m30882(view, C11810ab.m28216(C11810ab.this), null, e.m28261(C11810ab.m28213(C11810ab.this)), e.m28250(C11810ab.m28213(C11810ab.this)))) {
                        C11810ab.m28206(C11810ab.this).add(view);
                    }
                    final ArrayList arrayList = new ArrayList(C11810ab.m28206(C11810ab.this));
                    if (e.m28241(C11810ab.m28213(C11810ab.this))) {
                        C12089p.m30943(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ab.3.3
                            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                            /* JADX INFO: renamed from: ﻛ */
                            public final void mo28224() {
                                C11810ab.m28212(C11810ab.this, arrayList);
                            }
                        });
                    } else {
                        C11810ab.m28212(C11810ab.this, arrayList);
                    }
                }
            });
        } catch (Throwable th) {
            String strIntern = m28205((short) (21 - TextUtils.lastIndexOf("", '0', 0, 0)), (byte) View.MeasureSpec.getSize(0), (-1660153957) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-92) - View.MeasureSpec.makeMeasureSpec(0, 0), (-1463095174) - Color.red(0)).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m28205((short) (47 - (ViewConfiguration.getScrollBarSize() >> 8)), (byte) (ViewConfiguration.getLongPressTimeout() >> 16), (-1660153944) - (Process.myPid() >> 22), (-86) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-1463095191) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern());
            sb.append(e.m28254(this.f26888));
            sb.append(m28205((short) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 107), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), Process.getGidForName("") - 1660153924, (-103) - Drawable.resolveOpacity(0, 0), (-1463095228) - View.MeasureSpec.getSize(0)).intern());
            sb.append(th.getLocalizedMessage());
            C12085l.m30929(strIntern, sb.toString());
            m28221();
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private void m28209(List<View> list) {
        int i = 2 % 2;
        int i2 = f26880 + 115;
        f26883 = i2 % 128;
        for (int i3 = i2 % 2 != 0 ? 1 : 0; i3 < list.size(); i3++) {
            int i4 = f26880 + 107;
            f26883 = i4 % 128;
            int i5 = i4 % 2;
            m28208(list.get(i3), this.f26888);
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private static <E extends View> void m28211(Activity activity, View view, Class<E> cls, boolean z, List<Integer> list, List<String> list2, List<E> list3) {
        int i = 2 % 2;
        int i2 = f26880 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        int i3 = i2 % 128;
        f26883 = i3;
        int i4 = i2 % 2;
        if (view != null) {
            int i5 = i3 + 107;
            f26880 = i5 % 128;
            if (i5 % 2 == 0) {
                C12083kh.m30876(view, cls, true, z, list, list2, list3);
                return;
            } else {
                C12083kh.m30876(view, cls, false, z, list, list2, list3);
                return;
            }
        }
        C12083kh.m30875(activity, cls, z, list, list2, list3);
    }

    /* JADX INFO: renamed from: ﻛ */
    private void m28208(View view, e eVar) {
        int i = 2 % 2;
        if (m28203(view)) {
            int i2 = f26883 + 73;
            f26880 = i2 % 128;
            int i3 = i2 % 2;
            if (e.m28245(eVar)) {
                if (this.f26895.get(view) == null) {
                    this.f26895.put(view, this);
                    mo28227(new JSONObject(), view, null);
                    return;
                }
                if (e.m28240(eVar)) {
                    mo28227(new JSONObject(), view, null);
                }
                int i4 = f26880 + 111;
                f26883 = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            ArrayList<WebView> arrayList = new ArrayList();
            C12083kh.m30876(view, WebView.class, false, e.m28265(eVar), e.m28261(eVar), e.m28250(eVar), arrayList);
            if (view instanceof WebView) {
                arrayList.add((WebView) view);
                int i6 = f26880 + 93;
                f26883 = i6 % 128;
                int i7 = i6 % 2;
            }
            for (WebView webView : arrayList) {
                if (this.f26895.get(webView) == null) {
                    int i8 = f26880 + 11;
                    f26883 = i8 % 128;
                    int i9 = i8 % 2;
                    if (webView.getClass().getName().startsWith(e.m28243(eVar))) {
                        C12099z c12099z = new C12099z();
                        this.f26894.put(webView, c12099z);
                        c12099z.m28302(e.m28242(eVar), TextUtils.isEmpty(e.m28237(eVar)) ? null : Arrays.asList(e.m28237(eVar).split(m28205((short) ((ViewConfiguration.getPressedStateDuration() >> 16) - 100), (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ImageFormat.getBitsPerPixel(0) - 1660153922, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT, View.MeasureSpec.getMode(0) - 1463095216).intern())), e.m28234(eVar), e.m28238(eVar), e.m28235(eVar));
                        c12099z.m31102((InterfaceC12090q) m28214());
                        c12099z.m28305(webView);
                        c12099z.m28304(Integer.toHexString(webView.hashCode()));
                        this.f26895.put(webView, this);
                    }
                }
            }
        }
        int i10 = f26880 + 37;
        f26883 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    private InterfaceC12090q<WebView, Activity> m28214() {
        int i = 2 % 2;
        C11834az.b bVar = new C11834az.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ab.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻐ */
            public final /* bridge */ /* synthetic */ void mo28225(JSONObject jSONObject, Object obj, Object obj2) {
                C11810ab.this.mo28225(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻐ */
            public final /* bridge */ /* synthetic */ void mo28226(JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                C11810ab.this.mo28226(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻛ */
            public final /* bridge */ /* synthetic */ void mo28227(JSONObject jSONObject, Object obj, Object obj2) {
                C11810ab.this.mo28227(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﻛ */
            public final /* bridge */ /* synthetic */ void mo28228(JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                C11810ab.this.mo28228(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo28229(JSONObject jSONObject, Object obj, Object obj2) {
                C11810ab.this.mo28229(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﾇ */
            public final /* bridge */ /* synthetic */ void mo28230(JSONObject jSONObject, Object obj, Object obj2) {
                C11810ab.this.mo28230(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﾒ */
            public final /* bridge */ /* synthetic */ void mo28231(JSONObject jSONObject, Object obj, Object obj2) {
                C11810ab.this.mo28231(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
            /* JADX INFO: renamed from: ﾒ */
            public final /* bridge */ /* synthetic */ void mo28232(JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                C11810ab.this.mo28232(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }
        };
        int i2 = f26883 + 83;
        f26880 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 12 / 0;
        }
        return bVar;
    }

    /* JADX INFO: renamed from: ﻐ */
    private boolean m28203(View view) {
        int i = 2 % 2;
        Object obj = null;
        if (this.f26891 == null) {
            int i2 = f26880 + 27;
            f26883 = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!m28215(view, e.m28236(this.f26888)) || !this.f26891.mo29721(view)) {
            return false;
        }
        int i3 = f26880 + 25;
        int i4 = i3 % 128;
        f26883 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 23;
        f26880 = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static boolean m28215(View view, List<String> list) {
        int i = 2 % 2;
        if (list != null) {
            int i2 = f26883 + 51;
            f26880 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                list.isEmpty();
                super.hashCode();
                throw null;
            }
            if (!list.isEmpty()) {
                String name = view.getClass().getPackage().getName();
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    int i3 = f26883 + 81;
                    f26880 = i3 % 128;
                    if (i3 % 2 == 0) {
                        TextUtils.isEmpty(m28217(it.next()));
                        super.hashCode();
                        throw null;
                    }
                    String strM28217 = m28217(it.next());
                    if (!TextUtils.isEmpty(strM28217) && name.startsWith(strM28217)) {
                        int i4 = f26880 + 1;
                        f26883 = i4 % 128;
                        int i5 = i4 % 2;
                        return true;
                    }
                }
                int i6 = f26883 + 115;
                f26880 = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m28217(String str) {
        int i = 2 % 2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int i2 = f26880 + 39;
        f26883 = i2 % 128;
        int i3 = i2 % 2;
        List listAsList = Arrays.asList(str.split(m28205((short) (38 - View.combineMeasuredStates(0, 0)), (byte) View.resolveSizeAndState(0, 0, 0), (-1660153924) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Color.rgb(0, 0, 0) + 16777113, View.MeasureSpec.getSize(0) - 1463095169).intern()));
        if (listAsList.size() > 3) {
            return TextUtils.join(m28205((short) (116 - KeyEvent.keyCodeFromString("")), (byte) Color.blue(0), Color.blue(0) - 1660153921, (ViewConfiguration.getScrollDefaultDelay() >> 16) + PlaybackException.ERROR_CODE_PARENTAL_CONTROL_RESTRICTED, (-1463095214) - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), listAsList.subList(0, 3));
        }
        int i4 = f26880 + 13;
        f26883 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ab$e */
    public class e {

        /* JADX INFO: renamed from: ヶ */
        private static int f26909 = 0;

        /* JADX INFO: renamed from: 丫 */
        private static int f26910 = 1;

        /* JADX INFO: renamed from: 爫 */
        private static boolean f26912 = true;

        /* JADX INFO: renamed from: ﬤ */
        private static int f26913 = 244;

        /* JADX INFO: renamed from: טּ */
        private static boolean f26914 = true;

        /* JADX INFO: renamed from: ﭖ */
        private boolean f26917;

        /* JADX INFO: renamed from: ﮐ */
        private boolean f26922;

        /* JADX INFO: renamed from: ﱟ */
        private boolean f26923;

        /* JADX INFO: renamed from: ﱡ */
        private boolean f26924;

        /* JADX INFO: renamed from: ﺙ */
        private boolean f26925;

        /* JADX INFO: renamed from: ﻏ */
        private boolean f26926;

        /* JADX INFO: renamed from: ﻐ */
        private String f26927;

        /* JADX INFO: renamed from: ﻛ */
        private String f26928;

        /* JADX INFO: renamed from: ｋ */
        private String f26929;

        /* JADX INFO: renamed from: ﾇ */
        private String f26930;

        /* JADX INFO: renamed from: ﾒ */
        private boolean f26931;

        /* JADX INFO: renamed from: ףּ */
        private static char[] f26916 = {341, 344, 330, 349, 345, 363, 311, 352, 359, 322, 353, 361, 331, 342, 354, 360, 348, 358, 355, 362, 309, 343, 318, 356, 313, 364, 323, 321, 328, 317, 347};

        /* JADX INFO: renamed from: 乁 */
        private static char f26911 = 38690;

        /* JADX INFO: renamed from: ヮ */
        private static char f26908 = 49419;

        /* JADX INFO: renamed from: リ */
        private static char f26907 = 18292;

        /* JADX INFO: renamed from: סּ */
        private static char f26915 = 19782;

        /* JADX INFO: renamed from: ﭸ */
        private List<Integer> f26919 = new ArrayList();

        /* JADX INFO: renamed from: ﭴ */
        private List<String> f26918 = new ArrayList();

        /* JADX INFO: renamed from: ﮌ */
        private List<String> f26921 = new ArrayList();

        /* JADX INFO: renamed from: ﮉ */
        private List<String> f26920 = new ArrayList();

        /* JADX INFO: renamed from: ﭖ */
        static /* synthetic */ boolean m28234(e eVar) {
            int i = 2 % 2;
            int i2 = f26909 + 113;
            int i3 = i2 % 128;
            f26910 = i3;
            int i4 = i2 % 2;
            boolean z = eVar.f26925;
            if (i4 == 0) {
                int i5 = 93 / 0;
            }
            int i6 = i3 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f26909 = i6 % 128;
            int i7 = i6 % 2;
            return z;
        }

        /* JADX INFO: renamed from: ﭴ */
        static /* synthetic */ boolean m28235(e eVar) {
            int i = 2 % 2;
            int i2 = f26909 + 15;
            int i3 = i2 % 128;
            f26910 = i3;
            int i4 = i2 % 2;
            Object obj = null;
            boolean z = eVar.f26923;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i3 + 59;
            f26909 = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﭸ */
        static /* synthetic */ List m28236(e eVar) {
            int i = 2 % 2;
            int i2 = f26909;
            int i3 = i2 + 5;
            f26910 = i3 % 128;
            int i4 = i3 % 2;
            List<String> list = eVar.f26920;
            int i5 = i2 + 63;
            f26910 = i5 % 128;
            if (i5 % 2 != 0) {
                return list;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﮉ */
        static /* synthetic */ String m28237(e eVar) {
            int i = 2 % 2;
            int i2 = f26910;
            int i3 = i2 + 95;
            f26909 = i3 % 128;
            int i4 = i3 % 2;
            String str = eVar.f26930;
            int i5 = i2 + 1;
            f26909 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        /* JADX INFO: renamed from: ﮌ */
        static /* synthetic */ boolean m28238(e eVar) {
            int i = 2 % 2;
            int i2 = f26910 + 113;
            int i3 = i2 % 128;
            f26909 = i3;
            int i4 = i2 % 2;
            boolean z = eVar.f26931;
            int i5 = i3 + 85;
            f26910 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 42 / 0;
            }
            return z;
        }

        /* JADX INFO: renamed from: ﮐ */
        static /* synthetic */ boolean m28240(e eVar) {
            int i = 2 % 2;
            int i2 = f26910 + 55;
            f26909 = i2 % 128;
            int i3 = i2 % 2;
            boolean z = eVar.f26922;
            if (i3 == 0) {
                return z;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﱟ */
        static /* synthetic */ boolean m28241(e eVar) {
            int i = 2 % 2;
            int i2 = f26910;
            int i3 = i2 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f26909 = i3 % 128;
            int i4 = i3 % 2;
            boolean z = eVar.f26917;
            int i5 = i2 + 7;
            f26909 = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        /* JADX INFO: renamed from: ﱡ */
        static /* synthetic */ String m28242(e eVar) {
            int i = 2 % 2;
            int i2 = f26909 + 27;
            int i3 = i2 % 128;
            f26910 = i3;
            int i4 = i2 % 2;
            String str = eVar.f26929;
            if (i4 == 0) {
                int i5 = 3 / 0;
            }
            int i6 = i3 + 99;
            f26909 = i6 % 128;
            if (i6 % 2 == 0) {
                return str;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﺙ */
        static /* synthetic */ String m28243(e eVar) {
            int i = 2 % 2;
            int i2 = f26910 + 67;
            f26909 = i2 % 128;
            int i3 = i2 % 2;
            String str = eVar.f26928;
            if (i3 != 0) {
                int i4 = 2 / 0;
            }
            return str;
        }

        /* JADX INFO: renamed from: ﻏ */
        static /* synthetic */ boolean m28245(e eVar) {
            int i = 2 % 2;
            int i2 = f26910 + 83;
            int i3 = i2 % 128;
            f26909 = i3;
            int i4 = i2 % 2;
            boolean z = eVar.f26924;
            int i5 = i3 + 105;
            f26910 = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        /* JADX INFO: renamed from: ﻐ */
        static /* synthetic */ List m28250(e eVar) {
            int i = 2 % 2;
            int i2 = f26909 + 107;
            int i3 = i2 % 128;
            f26910 = i3;
            int i4 = i2 % 2;
            List<String> list = eVar.f26921;
            int i5 = i3 + 79;
            f26909 = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        /* JADX INFO: renamed from: ﻛ */
        static /* synthetic */ String m28254(e eVar) {
            int i = 2 % 2;
            int i2 = f26909;
            int i3 = i2 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            f26910 = i3 % 128;
            int i4 = i3 % 2;
            String str = eVar.f26927;
            int i5 = i2 + 3;
            f26910 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        /* JADX INFO: renamed from: ｋ */
        static /* synthetic */ List m28258(e eVar) {
            int i = 2 % 2;
            int i2 = f26910 + 49;
            int i3 = i2 % 128;
            f26909 = i3;
            int i4 = i2 % 2;
            List<String> list = eVar.f26918;
            if (i4 != 0) {
                int i5 = 66 / 0;
            }
            int i6 = i3 + 39;
            f26910 = i6 % 128;
            if (i6 % 2 != 0) {
                return list;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ */
        static /* synthetic */ List m28261(e eVar) {
            int i = 2 % 2;
            int i2 = f26909;
            int i3 = i2 + 93;
            f26910 = i3 % 128;
            int i4 = i3 % 2;
            List<Integer> list = eVar.f26919;
            int i5 = i2 + 29;
            f26910 = i5 % 128;
            if (i5 % 2 != 0) {
                return list;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ */
        static /* synthetic */ boolean m28265(e eVar) {
            int i = 2 % 2;
            int i2 = f26909;
            int i3 = i2 + 9;
            f26910 = i3 % 128;
            int i4 = i3 % 2;
            boolean z = eVar.f26926;
            int i5 = i2 + 69;
            f26910 = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public e() {
        }

        public e(JSONObject jSONObject) {
            m28255(jSONObject.optString(m28249(127 - (KeyEvent.getMaxKeyCode() >> 16), null, null, "\u0085\u008b\u0081\u008a\u0089\u0089\u0081\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern()));
            m28251(jSONObject.optString(m28260("嚥ꗫ욮쁙揂嵐㉥枺പ뒣歋쩬ᾌ朒", Color.alpha(0) + 13).intern()));
            m28262(jSONObject.optString(m28260("圻抦ĩ\ue723棓쑫ퟐ겇悑랛", 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()));
            m28259(jSONObject.optBoolean(m28249(ExpandableListView.getPackedPositionType(0L) + 127, null, null, "\u0090\u008f\u0085\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u008e\u0085\u008d\u0085\u0089\u008c").intern()));
            jSONObject.optBoolean(m28249(126 - ImageFormat.getBitsPerPixel(0), null, null, "\u0090\u008f\u0085\u0084\u0088\u0087\u0085\u008b\u0093\u0092\u0091\u0087\u008e\u0085\u008d\u0085\u0089\u008c").intern());
            m28246(jSONObject.optString(m28260("砕꼻\u20ce팗⦿埍〤ꯔ퇧軙", TextUtils.indexOf((CharSequence) "", '0') + 10).intern()));
            m28248(jSONObject.optBoolean(m28249(127 - (ViewConfiguration.getFadingEdgeLength() >> 16), null, null, "\u0082\u0095\u0085\u0094\u0084\u0090\u0081\u008a\u0089\u0084").intern()));
            m28257(jSONObject.optBoolean(m28260("˾ﱙꁟ뭱\u09da\ue261禱\ud919ส閈탏柪诹\ue0ae禱\ud919\ud90b\u16fb", (ViewConfiguration.getLongPressTimeout() >> 16) + 18).intern()));
            m28253(jSONObject.optBoolean(m28249((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, null, null, "\u0085\u0094\u0084\u0089\u0092\u008c\u0096\u0085\u0092").intern()));
            m28264(jSONObject.optBoolean(m28249(TextUtils.getOffsetAfter("", 0) + 127, null, null, "\u0090\u0098\u0084\u0092\u0096\u0089\u0081\u0094\u0081\u0097\u0085\u0089\u008c").intern(), true));
            m28244(jSONObject.optBoolean(m28249((ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, null, null, "\u0089\u0097\u0081\u0092\u0090\u009a\u0099\u0085\u0089\u008c").intern()));
            m28239(jSONObject.optBoolean(m28249((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, null, null, "\u0082\u0081\u0085\u0092\u0091\u009d\u008f\u0084\u0081\u009c\u008f\u009b\u0089\u0086\u0085\u0084\u0083\u0089\u0089\u0085\u0096\u0093\u0092\u0098").intern(), true));
            m28263(C12077jz.m30804(jSONObject.optJSONArray(m28260("塙쩩揂嵐捒絙椷曗", 6 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())));
            m28256(C12077jz.m30804(jSONObject.optJSONArray(m28249(TextUtils.indexOf("", "", 0, 0) + 127, null, null, "\u0085\u0092\u0093\u008f\u009f\u009e\u0093\u009d\u0089\u0085\u0084\u0090\u0084\u0094\u0084\u0090\u0096\u0081").intern())));
            m28252(C12077jz.m30804(jSONObject.optJSONArray(m28249(126 - TextUtils.indexOf((CharSequence) "", '0'), null, null, "\u0085\u0092\u0093\u008f\u009f\u009e\u0093\u009d\u0089\u0086\u0085\u0084\u0094").intern())));
            m28247(C12077jz.m30804(jSONObject.optJSONArray(m28260("怼̮迻쯿\uf5c8䓷Ⅎ禹祱⚑帅誆\ud977쌟", TextUtils.getTrimmedLength("") + 13).intern())));
        }

        /* JADX INFO: renamed from: ｋ */
        private e m28255(String str) {
            int i = 2 % 2;
            int i2 = f26909;
            int i3 = i2 + 17;
            f26910 = i3 % 128;
            int i4 = i3 % 2;
            this.f26927 = str;
            int i5 = i2 + 69;
            f26910 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ */
        private e m28251(String str) {
            int i = 2 % 2;
            int i2 = f26910;
            int i3 = i2 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f26909 = i3 % 128;
            if (i3 % 2 == 0) {
                this.f26928 = str;
                int i4 = i2 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                f26909 = i4 % 128;
                int i5 = i4 % 2;
                return this;
            }
            this.f26928 = str;
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ */
        private e m28262(String str) {
            int i = 2 % 2;
            int i2 = f26909 + 33;
            f26910 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f26929 = str;
                int i3 = 11 / 0;
                return this;
            }
            this.f26929 = str;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ */
        private e m28259(boolean z) {
            int i = 2 % 2;
            int i2 = f26909;
            int i3 = i2 + 9;
            f26910 = i3 % 128;
            int i4 = i3 % 2;
            this.f26931 = z;
            int i5 = i2 + 87;
            f26910 = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﻐ */
        private e m28246(String str) {
            int i = 2 % 2;
            int i2 = f26909 + 3;
            int i3 = i2 % 128;
            f26910 = i3;
            if (i2 % 2 == 0) {
                this.f26930 = str;
                int i4 = 48 / 0;
            } else {
                this.f26930 = str;
            }
            int i5 = i3 + 47;
            f26909 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ */
        private e m28248(boolean z) {
            int i = 2 % 2;
            int i2 = f26910 + 73;
            f26909 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f26924 = z;
                return this;
            }
            this.f26924 = z;
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ｋ */
        private e m28257(boolean z) {
            int i = 2 % 2;
            int i2 = f26910;
            int i3 = i2 + 113;
            f26909 = i3 % 128;
            int i4 = i3 % 2;
            this.f26922 = z;
            int i5 = i2 + 75;
            f26909 = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ */
        private e m28253(boolean z) {
            int i = 2 % 2;
            int i2 = f26910 + 87;
            int i3 = i2 % 128;
            f26909 = i3;
            int i4 = i2 % 2;
            this.f26926 = z;
            int i5 = i3 + 89;
            f26910 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ */
        private e m28264(boolean z) {
            int i = 2 % 2;
            int i2 = f26909;
            int i3 = i2 + 99;
            f26910 = i3 % 128;
            int i4 = i3 % 2;
            this.f26925 = z;
            int i5 = i2 + 25;
            f26910 = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻏ */
        private e m28244(boolean z) {
            int i = 2 % 2;
            int i2 = f26910 + 21;
            int i3 = i2 % 128;
            f26909 = i3;
            if (i2 % 2 == 0) {
                this.f26923 = z;
                int i4 = i3 + 107;
                f26910 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 85 / 0;
                }
                return this;
            }
            this.f26923 = z;
            throw null;
        }

        /* JADX INFO: renamed from: ﮐ */
        private e m28239(boolean z) {
            int i = 2 % 2;
            int i2 = f26910 + 63;
            int i3 = i2 % 128;
            f26909 = i3;
            if (i2 % 2 == 0) {
                this.f26917 = z;
                int i4 = i3 + 77;
                f26910 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 29 / 0;
                }
                return this;
            }
            this.f26917 = z;
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ */
        private e m28263(List<Integer> list) {
            int i = 2 % 2;
            int i2 = f26909;
            int i3 = i2 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f26910 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (list != null) {
                this.f26919 = list;
                int i4 = i2 + 49;
                f26910 = i4 % 128;
                int i5 = i4 % 2;
            }
            return this;
        }

        /* JADX INFO: renamed from: ｋ */
        private e m28256(List<String> list) {
            int i = 2 % 2;
            int i2 = f26910;
            int i3 = i2 + 87;
            f26909 = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
            if (list != null) {
                this.f26918 = list;
            }
            int i4 = i2 + 77;
            f26909 = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ */
        private e m28252(List<String> list) {
            int i = 2 % 2;
            if (list != null) {
                this.f26921 = list;
                int i2 = f26910 + 97;
                f26909 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 5 / 3;
                }
            }
            int i4 = f26909 + 47;
            f26910 = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ */
        private e m28247(List<String> list) {
            int i = 2 % 2;
            int i2 = f26909;
            int i3 = i2 + 95;
            f26910 = i3 % 128;
            int i4 = i3 % 2;
            if (list != null) {
                this.f26920 = list;
                int i5 = i2 + 93;
                f26910 = i5 % 128;
                int i6 = i5 % 2;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﻐ */
        private static String m28249(int i, String str, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f26916;
                int i2 = f26913;
                if (f26914) {
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
                if (f26912) {
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

        /* JADX INFO: renamed from: ﾇ */
        private static String m28260(String str, int i) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (C12078k.f29776) {
                char[] cArr2 = new char[cArr.length];
                C12078k.f29775 = 0;
                char[] cArr3 = new char[2];
                while (C12078k.f29775 < cArr.length) {
                    cArr3[0] = cArr[C12078k.f29775];
                    cArr3[1] = cArr[C12078k.f29775 + 1];
                    int i2 = 58224;
                    for (int i3 = 0; i3 < 16; i3++) {
                        char c = cArr3[1];
                        char c2 = cArr3[0];
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f26911)) ^ ((c2 >>> 5) + f26907)));
                        cArr3[1] = c3;
                        cArr3[0] = (char) (c2 - (((c3 >>> 5) + f26908) ^ ((c3 + i2) ^ ((c3 << 4) + f26915))));
                        i2 -= 40503;
                    }
                    cArr2[C12078k.f29775] = cArr3[0];
                    cArr2[C12078k.f29775 + 1] = cArr3[1];
                    C12078k.f29775 += 2;
                }
                str2 = new String(cArr2, 0, i);
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m28205(short s, byte b, int i, int i2, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f26881;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f26884;
                if (bArr != null) {
                    i5 = (byte) (bArr[f26886 + i] + i4);
                } else {
                    i5 = (short) (f26885[f26886 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f26886 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i3 + f26882);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f26884;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f26885;
                        int i8 = C12086m.f29836;
                        C12086m.f29836 = i8 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((short) (sArr[i8] + s)) ^ C12086m.f29833));
                    }
                    sb.append(C12086m.f29837);
                    C12086m.f29834 = C12086m.f29837;
                    C12086m.f29835++;
                }
            }
            string = sb.toString();
        }
        return string;
    }
}

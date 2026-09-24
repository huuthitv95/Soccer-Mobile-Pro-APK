package com.ironsource.adqualitysdk.sdk.p286i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import android.widget.ExpandableListView;
import androidx.core.view.InputDeviceCompat;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.p286i.C11834az.AnonymousClass4;
import com.ironsource.adqualitysdk.sdk.p286i.C11834az.AnonymousClass5;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.p300io.encoding.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.aw */
/* JADX INFO: loaded from: classes6.dex */
public final class C11831aw {

    /* JADX INFO: renamed from: 爫 */
    private static char f27276 = 51463;

    /* JADX INFO: renamed from: ﬤ */
    private static int f27277 = 0;

    /* JADX INFO: renamed from: טּ */
    private static int[] f27278 = {-1041715186, 615166760, 430575148, -1775561099, 860930354, -1782024898, 551740820, 477444224, 1374561631, -2111086042, 1455790861, 1674372224, 848107533, 1266225069, 373117145, -2088556688, 1352346919, 1647313524};

    /* JADX INFO: renamed from: סּ */
    private static int f27279 = 1;

    /* JADX INFO: renamed from: ףּ */
    private static char f27280 = 28991;

    /* JADX INFO: renamed from: ﭖ */
    private static char f27281 = 10992;

    /* JADX INFO: renamed from: ﮉ */
    private static char f27282 = 27270;

    /* JADX INFO: renamed from: ﭴ */
    private ISAdQualityInitListener f27283;

    /* JADX INFO: renamed from: ﭸ */
    private C11833ay f27284;

    /* JADX INFO: renamed from: ﮌ */
    private C12050iz f27285;

    /* JADX INFO: renamed from: ﱟ */
    private C11834az f27287;

    /* JADX INFO: renamed from: ﱡ */
    private String f27288;

    /* JADX INFO: renamed from: ﻐ */
    private boolean f27291 = false;

    /* JADX INFO: renamed from: ﾇ */
    private List<C11878cp> f27294 = new ArrayList();

    /* JADX INFO: renamed from: ｋ */
    private List<AbstractC11980gj> f27293 = new ArrayList();

    /* JADX INFO: renamed from: ﻛ */
    private Map<String, JSONObject> f27292 = new HashMap();

    /* JADX INFO: renamed from: ﾒ */
    private Map<String, String> f27295 = new HashMap();

    /* JADX INFO: renamed from: ﮐ */
    private C11891db f27286 = new C11891db();

    /* JADX INFO: renamed from: ﻏ */
    private C11907dr f27290 = C11907dr.m30050();

    /* JADX INFO: renamed from: ﺙ */
    private Map<String, C11832ax> f27289 = new HashMap();

    /* JADX INFO: renamed from: ﮐ */
    static /* synthetic */ Map m28606(C11831aw c11831aw) {
        int i = 2 % 2;
        int i2 = f27279 + 41;
        f27277 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, JSONObject> mapM28609 = c11831aw.m28609();
        int i4 = f27279 + 47;
        f27277 = i4 % 128;
        if (i4 % 2 == 0) {
            return mapM28609;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ */
    static /* synthetic */ List m28608(C11831aw c11831aw) {
        int i = 2 % 2;
        int i2 = f27279 + 81;
        f27277 = i2 % 128;
        int i3 = i2 % 2;
        List<AbstractC11980gj> listM28614 = c11831aw.m28614();
        int i4 = f27277 + 65;
        f27279 = i4 % 128;
        if (i4 % 2 != 0) {
            return listM28614;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ */
    static /* synthetic */ boolean m28610(C11831aw c11831aw) {
        int i = 2 % 2;
        int i2 = f27279 + 55;
        f27277 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM28603 = c11831aw.m28603();
        int i4 = f27277 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f27279 = i4 % 128;
        int i5 = i4 % 2;
        return zM28603;
    }

    /* JADX INFO: renamed from: ﺙ */
    static /* synthetic */ void m28612(C11831aw c11831aw) {
        int i = 2 % 2;
        int i2 = f27279 + 17;
        f27277 = i2 % 128;
        int i3 = i2 % 2;
        c11831aw.m28656();
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        int i5 = f27277 + 27;
        f27279 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻏ */
    static /* synthetic */ String m28613(C11831aw c11831aw) {
        int i = 2 % 2;
        int i2 = f27277;
        int i3 = i2 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f27279 = i3 % 128;
        int i4 = i3 % 2;
        String str = c11831aw.f27288;
        int i5 = i2 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f27279 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ C11907dr m28615(C11831aw c11831aw, C11907dr c11907dr) {
        int i = 2 % 2;
        int i2 = f27277 + 107;
        int i3 = i2 % 128;
        f27279 = i3;
        int i4 = i2 % 2;
        c11831aw.f27290 = c11907dr;
        int i5 = i3 + 11;
        f27277 = i5 % 128;
        int i6 = i5 % 2;
        return c11907dr;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ Map m28617(C11831aw c11831aw) {
        int i = 2 % 2;
        int i2 = f27277 + 85;
        f27279 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> mapM28611 = c11831aw.m28611();
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
        int i5 = f27279 + 33;
        f27277 = i5 % 128;
        int i6 = i5 % 2;
        return mapM28611;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ JSONObject m28618(C11831aw c11831aw, C11878cp c11878cp) {
        int i = 2 % 2;
        int i2 = f27277 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f27279 = i2 % 128;
        if (i2 % 2 != 0) {
            return m28650(c11878cp);
        }
        m28650(c11878cp);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ void m28623(C11831aw c11831aw, Context context) {
        int i = 2 % 2;
        int i2 = f27277 + 3;
        f27279 = i2 % 128;
        int i3 = i2 % 2;
        c11831aw.m28633(context);
        int i4 = f27277 + 49;
        f27279 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ void m28624(C11831aw c11831aw, Context context, String str, String str2, AbstractC11980gj abstractC11980gj, C11878cp c11878cp, boolean z, AbstractC11840be abstractC11840be, AbstractRunnableC12044it abstractRunnableC12044it) {
        int i = 2 % 2;
        int i2 = f27279 + 103;
        f27277 = i2 % 128;
        int i3 = i2 % 2;
        c11831aw.m28621(context, str, str2, abstractC11980gj, c11878cp, z, abstractC11840be, abstractRunnableC12044it);
        int i4 = f27277 + 113;
        f27279 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ void m28625(C11831aw c11831aw, Context context, String str, String str2, AbstractC11980gj abstractC11980gj, AbstractRunnableC12044it abstractRunnableC12044it) {
        int i = 2 % 2;
        int i2 = f27277 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f27279 = i2 % 128;
        int i3 = i2 % 2;
        c11831aw.m28642(context, str, str2, abstractC11980gj, abstractRunnableC12044it);
        if (i3 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f27279 + 113;
        f27277 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ void m28626(C11831aw c11831aw, Context context, String str, String str2, List list, AbstractRunnableC12044it abstractRunnableC12044it) {
        int i = 2 % 2;
        int i2 = f27279 + 33;
        f27277 = i2 % 128;
        int i3 = i2 % 2;
        c11831aw.m28622(context, str, str2, (List<AbstractC11980gj>) list, abstractRunnableC12044it);
        int i4 = f27279 + 99;
        f27277 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ void m28627(C11831aw c11831aw, Context context, List list, List list2, AbstractRunnableC12044it abstractRunnableC12044it) {
        int i = 2 % 2;
        int i2 = f27277 + 91;
        f27279 = i2 % 128;
        int i3 = i2 % 2;
        c11831aw.m28644(context, (List<AbstractC11980gj>) list, (List<String>) list2, abstractRunnableC12044it);
        int i4 = f27279 + 41;
        f27277 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ void m28628(C11831aw c11831aw, Context context, Map map, Runnable runnable) {
        int i = 2 % 2;
        int i2 = f27277 + 101;
        f27279 = i2 % 128;
        int i3 = i2 % 2;
        c11831aw.m28635(context, map, runnable);
        int i4 = f27277 + 67;
        f27279 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ void m28629(C11831aw c11831aw, String str, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f27277 + 15;
        f27279 = i2 % 128;
        int i3 = i2 % 2;
        c11831aw.m28652(str, jSONObject);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ void m28636(C11831aw c11831aw) {
        int i = 2 % 2;
        int i2 = f27277 + 69;
        f27279 = i2 % 128;
        int i3 = i2 % 2;
        c11831aw.m28604();
        int i4 = f27279 + 69;
        f27277 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ C11878cp m28639(C11831aw c11831aw, Context context, String str, AbstractC11840be abstractC11840be) {
        int i = 2 % 2;
        int i2 = f27279 + 45;
        f27277 = i2 % 128;
        int i3 = i2 % 2;
        C11878cp c11878cpM28654 = c11831aw.m28654(context, str, abstractC11840be);
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        return c11878cpM28654;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ List m28641(C11831aw c11831aw) {
        int i = 2 % 2;
        int i2 = f27277 + 39;
        f27279 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            c11831aw.m28607();
            super.hashCode();
            throw null;
        }
        List<C11878cp> listM28607 = c11831aw.m28607();
        int i3 = f27279 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f27277 = i3 % 128;
        if (i3 % 2 == 0) {
            return listM28607;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ boolean m28645(C11878cp c11878cp) {
        int i = 2 % 2;
        int i2 = f27277 + 67;
        f27279 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM28637 = m28637(c11878cp);
        int i4 = f27279 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f27277 = i4 % 128;
        int i5 = i4 % 2;
        return zM28637;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ boolean m28646(C11878cp c11878cp, String str) {
        int i = 2 % 2;
        int i2 = f27279 + 23;
        f27277 = i2 % 128;
        if (i2 % 2 != 0) {
            m28661(c11878cp, str);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        boolean zM28661 = m28661(c11878cp, str);
        int i3 = f27279 + 107;
        f27277 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 33 / 0;
        }
        return zM28661;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ C11834az m28647(C11831aw c11831aw) {
        int i = 2 % 2;
        int i2 = f27277;
        int i3 = i2 + 75;
        f27279 = i3 % 128;
        int i4 = i3 % 2;
        C11834az c11834az = c11831aw.f27287;
        if (i4 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = i2 + 61;
        f27279 = i5 % 128;
        int i6 = i5 % 2;
        return c11834az;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ List m28648(C11831aw c11831aw, List list) {
        int i = 2 % 2;
        int i2 = f27279 + 111;
        int i3 = i2 % 128;
        f27277 = i3;
        int i4 = i2 % 2;
        c11831aw.f27294 = list;
        int i5 = i3 + 41;
        f27279 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ Map m28649(C11831aw c11831aw, Map map) {
        int i = 2 % 2;
        int i2 = f27277 + 19;
        int i3 = i2 % 128;
        f27279 = i3;
        int i4 = i2 % 2;
        c11831aw.f27289 = map;
        int i5 = i3 + 35;
        f27277 = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ List m28655(C11831aw c11831aw) {
        int i = 2 % 2;
        int i2 = f27277 + 33;
        f27279 = i2 % 128;
        if (i2 % 2 == 0) {
            c11831aw.m28605();
            throw null;
        }
        List<C11878cp> listM28605 = c11831aw.m28605();
        int i3 = f27279 + 41;
        f27277 = i3 % 128;
        if (i3 % 2 == 0) {
            return listM28605;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ void m28658(C11831aw c11831aw, Context context, String str, String str2, List list, AbstractRunnableC12044it abstractRunnableC12044it) {
        int i = 2 % 2;
        int i2 = f27279 + 47;
        f27277 = i2 % 128;
        int i3 = i2 % 2;
        c11831aw.m28643(context, str, str2, (List<AbstractC11980gj>) list, abstractRunnableC12044it);
        int i4 = f27279 + 71;
        f27277 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ void m28659(C11831aw c11831aw, C11878cp c11878cp, String str) {
        int i = 2 % 2;
        int i2 = f27279 + 57;
        f27277 = i2 % 128;
        int i3 = i2 % 2;
        c11831aw.m28630(c11878cp, str);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ boolean m28660(C11831aw c11831aw, String str) {
        int i = 2 % 2;
        int i2 = f27279 + 45;
        f27277 = i2 % 128;
        if (i2 % 2 == 0) {
            return c11831aw.m28653(str);
        }
        c11831aw.m28653(str);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public C11831aw(C12050iz c12050iz, C11814af c11814af, String str, C11834az c11834az, ISAdQualityInitListener iSAdQualityInitListener) {
        this.f27285 = c12050iz;
        C11833ay c11833ay = new C11833ay(C12089p.m30942(), c11814af);
        this.f27284 = c11833ay;
        C12080kb.m30838(c11833ay);
        this.f27284.m28707(new InterfaceC12040ip() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.3

            /* JADX INFO: renamed from: ｋ */
            private static int f27350 = 0;

            /* JADX INFO: renamed from: ﾇ */
            private static int f27351 = 67;

            /* JADX INFO: renamed from: ﾒ */
            private static int f27352 = 1;

            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12040ip
            /* JADX INFO: renamed from: ﻛ */
            public final JSONObject mo28677(String str2, JSONObject jSONObject) {
                int i = 2 % 2;
                int i2 = f27350 + 57;
                f27352 = i2 % 128;
                int i3 = i2 % 2;
                if (!str2.equals(m28676("\u0005\u0002\u0005\u0007\u0003\ufff2\ufff8\u0005", 8 - KeyEvent.normalizeMetaState(0), false, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 176).intern())) {
                    return null;
                }
                int i4 = f27352 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f27350 = i4 % 128;
                if (i4 % 2 == 0) {
                    return C11831aw.this.m28665();
                }
                C11831aw.this.m28665();
                throw null;
            }

            /* JADX INFO: renamed from: ﻛ */
            private static String m28676(String str2, int i, boolean z, int i2, int i3) {
                String str3;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (C11889d.f28479) {
                    char[] cArr2 = new char[i];
                    C11889d.f28481 = 0;
                    while (C11889d.f28481 < i) {
                        C11889d.f28480 = cArr[C11889d.f28481];
                        cArr2[C11889d.f28481] = (char) (C11889d.f28480 + i3);
                        int i4 = C11889d.f28481;
                        cArr2[i4] = (char) (cArr2[i4] - f27351);
                        C11889d.f28481++;
                    }
                    if (i2 > 0) {
                        C11889d.f28478 = i2;
                        char[] cArr3 = new char[i];
                        System.arraycopy(cArr2, 0, cArr3, 0, i);
                        System.arraycopy(cArr3, 0, cArr2, i - C11889d.f28478, C11889d.f28478);
                        System.arraycopy(cArr3, C11889d.f28478, cArr2, 0, i - C11889d.f28478);
                    }
                    if (z) {
                        char[] cArr4 = new char[i];
                        C11889d.f28481 = 0;
                        while (C11889d.f28481 < i) {
                            cArr4[C11889d.f28481] = cArr2[(i - C11889d.f28481) - 1];
                            C11889d.f28481++;
                        }
                        cArr2 = cArr4;
                    }
                    str3 = new String(cArr2);
                }
                return str3;
            }
        });
        this.f27288 = str;
        this.f27287 = c11834az;
        this.f27283 = iSAdQualityInitListener;
    }

    /* JADX INFO: renamed from: ｋ */
    public final synchronized void m28666(final Context context, final Runnable runnable) {
        int i = 2 % 2;
        int i2 = f27277 + 7;
        f27279 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        if (this.f27291) {
            C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.15
                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                /* JADX INFO: renamed from: ﻛ */
                public final void mo28224() {
                    runnable.run();
                }
            });
            int i3 = f27279 + 89;
            f27277 = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            super.hashCode();
            throw null;
        }
        String strIntern = m28640("\udcc4繹㗶✛蠶⓴㐹\uef50㷊ﾩ晿ⷁ", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12).intern();
        StringBuilder sb = new StringBuilder();
        sb.append(m28616(new int[]{163327898, 1085453907, 163327898, 1085453907, 163327898, 1085453907, 53644563, -368611487, 1940491795, -1202358817, 610914716, -1574878677, 1837054931, -459946138, 1115413672, -1909042567, -66985844, 670232632}, TextUtils.getCapsMode("", 0, 0) + 36).intern());
        sb.append(IronSourceAdQuality.getSDKVersion());
        sb.append(m28616(new int[]{-253833168, 904097920, 163327898, 1085453907, 163327898, 1085453907, -859832962, -2116009876}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 15).intern());
        C12085l.m30923(strIntern, sb.toString());
        AbstractRunnableC12044it abstractRunnableC12044it = new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.8
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.8.2
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        runnable.run();
                    }
                });
                C11831aw.m28623(C11831aw.this, context);
            }
        };
        if (m28602()) {
            int i4 = f27279 + 115;
            f27277 = i4 % 128;
            int i5 = i4 % 2;
            m28657(context, abstractRunnableC12044it);
        } else {
            m28620(context, abstractRunnableC12044it);
            int i6 = 2 % 2;
        }
        this.f27291 = true;
        return;
        throw th;
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m28667(ISAdQualityAdListener iSAdQualityAdListener) {
        int i = 2 % 2;
        int i2 = f27277 + 109;
        f27279 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f27284.m28701(iSAdQualityAdListener);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        this.f27284.m28701(iSAdQualityAdListener);
        int i3 = f27277 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f27279 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final synchronized void m28668() {
        int i = 2 % 2;
        C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.12
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                Iterator it = C11831aw.m28655(C11831aw.this).iterator();
                while (it.hasNext()) {
                    ((C11878cp) it.next()).m29743();
                }
                C11831aw.m28641(C11831aw.this).clear();
                C11831aw.m28648(C11831aw.this, (List) null);
            }
        });
        C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.az.1
            AnonymousClass1() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                C11834az.this.f27449.clear();
                C11834az.this.f27449 = null;
            }
        });
        this.f27287 = null;
        C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.14
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() throws Exception {
                C11831aw.m28615(C11831aw.this, (C11907dr) null);
            }
        });
        int i2 = f27279 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f27277 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    public final JSONObject m28665() {
        int i = 2 % 2;
        int i2 = f27277 + 93;
        f27279 = i2 % 128;
        int i3 = i2 % 2;
        try {
            JSONObject jSONObjectM28632 = m28632(m28609());
            int i4 = f27277 + 61;
            f27279 = i4 % 128;
            int i5 = i4 % 2;
            return jSONObjectM28632;
        } catch (JSONException e) {
            C12085l.m30922(m28616(new int[]{-743362187, -855579378, 296289115, 1422676582, 1258510841, -1493404968, 783211270, -1415686626}, ExpandableListView.getPackedPositionChild(0L) + 17).intern(), m28616(new int[]{1715185050, -1376270443, 1439667487, 983239257, -404462843, -1128584222, 1975217367, 1250378622, 1325827898, 777371843, -2104828318, 1578991032, -1561734227, 2098921362, -1773554542, 1466112700}, 31 - TextUtils.getTrimmedLength("")).intern(), e);
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public final JSONObject m28662() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            Iterator it = new HashSet(m28611().keySet()).iterator();
            while (it.hasNext()) {
                int i2 = f27279 + 97;
                f27277 = i2 % 128;
                if (i2 % 2 != 0) {
                    String str = (String) it.next();
                    jSONObject2.put(str, m28611().get(str));
                    throw null;
                }
                String str2 = (String) it.next();
                jSONObject2.put(str2, m28611().get(str2));
            }
            jSONObject.put(m28640("Ꮑ뭥灭崡", 3 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), jSONObject2);
        } catch (JSONException e) {
            C12085l.m30922(m28616(new int[]{-743362187, -855579378, 296289115, 1422676582, 1258510841, -1493404968, 783211270, -1415686626}, Color.rgb(0, 0, 0) + InputDeviceCompat.SOURCE_JOYSTICK).intern(), m28616(new int[]{1715185050, -1376270443, 1439667487, 983239257, -404462843, -1128584222, 1975217367, 1250378622, 1325827898, 777371843, -425770312, 1234423969, 912668153, -1758705311, -71288793, 1694944643}, View.MeasureSpec.getMode(0) + 29).intern(), e);
        }
        int i3 = f27279 + 81;
        f27277 = i3 % 128;
        int i4 = i3 % 2;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾒ */
    private void m28657(Context context, AbstractRunnableC12044it abstractRunnableC12044it) {
        int i = 2 % 2;
        m28644(context, new ArrayList(C11836ba.m28728()), new ArrayList(C11836ba.m28720()), abstractRunnableC12044it);
        int i2 = f27279 + 93;
        f27277 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    private void m28644(Context context, final List<AbstractC11980gj> list, final List<String> list2, final AbstractRunnableC12044it abstractRunnableC12044it) {
        final Context context2;
        AbstractRunnableC12044it abstractRunnableC12044it2;
        int i = 2 % 2;
        int i2 = f27277 + 25;
        f27279 = i2 % 128;
        int i3 = i2 % 2;
        if (list.isEmpty()) {
            return;
        }
        AbstractC11980gj abstractC11980gjRemove = list.remove(0);
        String strRemove = list2.remove(0);
        if (!list.isEmpty()) {
            context2 = context;
            AbstractRunnableC12044it abstractRunnableC12044it3 = new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.11
                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                /* JADX INFO: renamed from: ﻛ */
                public final void mo28224() {
                    C12089p.m30934(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.11.3
                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            C11831aw.m28627(C11831aw.this, context2, list, list2, abstractRunnableC12044it);
                        }
                    }, AbstractC11823ao.m28472().mo28473());
                }
            };
            int i4 = f27279 + 77;
            f27277 = i4 % 128;
            int i5 = i4 % 2;
            abstractRunnableC12044it2 = abstractRunnableC12044it3;
        } else {
            context2 = context;
            int i6 = f27277 + 31;
            f27279 = i6 % 128;
            int i7 = i6 % 2;
            abstractRunnableC12044it2 = abstractRunnableC12044it;
        }
        m28634(context2, abstractC11980gjRemove, strRemove, abstractRunnableC12044it2);
    }

    /* JADX INFO: renamed from: ﻐ */
    private void m28620(Context context, AbstractRunnableC12044it abstractRunnableC12044it) {
        int i = 2 % 2;
        int i2 = f27279 + 33;
        f27277 = i2 % 128;
        if (i2 % 2 == 0) {
            m28634(context, C11836ba.m28725(), C11836ba.m28722(), abstractRunnableC12044it);
            int i3 = f27277 + 103;
            f27279 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        m28634(context, C11836ba.m28725(), C11836ba.m28722(), abstractRunnableC12044it);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private void m28634(final Context context, final AbstractC11980gj abstractC11980gj, final String str, final AbstractRunnableC12044it abstractRunnableC12044it) {
        int i = 2 % 2;
        C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.13
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                final String lowerCase = str.toLowerCase();
                C11831aw.m28647(C11831aw.this).m28714(lowerCase);
                C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.13.3

                    /* JADX INFO: renamed from: ﻐ */
                    private static int f27330 = 1;

                    /* JADX INFO: renamed from: ｋ */
                    private static int[] f27331 = {1957377240, -312085074, 1268773463, -1394608301, 135578464, 380751618, -1868565529, 1873451987, 635156415, 1040419097, 1479170159, 846264563, 1559424625, 598014584, -242482116, -2125657333, -1342734761, -1516409352};

                    /* JADX INFO: renamed from: ﾒ */
                    private static int f27332;

                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        int i2 = 2 % 2;
                        String strIntern = m28674(new int[]{1657330043, -1563925851, 845244485, -1058427544, 646382864, 416747192, -937213928, -1473776485}, View.getDefaultSize(0, 0) + 16).intern();
                        StringBuilder sb = new StringBuilder();
                        sb.append(m28674(new int[]{1388555717, -167175366, 133418030, -86787174, -319021673, 1919902191, -1136235619, -180119707, -1260126970, -201034464, 23788055, 45404262}, (ViewConfiguration.getTouchSlop() >> 8) + 23).intern());
                        sb.append(lowerCase);
                        C12085l.m30917(strIntern, sb.toString());
                        try {
                            C11831aw.m28625(C11831aw.this, context, str, lowerCase, abstractC11980gj, abstractRunnableC12044it);
                            int i3 = f27330 + 69;
                            f27332 = i3 % 128;
                            int i4 = i3 % 2;
                        } catch (Throwable th) {
                            C12089p.m30938(C11831aw.m28647(C11831aw.this).new AnonymousClass5(lowerCase, C11837bb.b.f27505));
                            C11831aw.m28617(C11831aw.this).put(str, C12080kb.m30847(th).toString());
                            String strIntern2 = m28674(new int[]{1657330043, -1563925851, 845244485, -1058427544, 646382864, 416747192, -937213928, -1473776485}, 16 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m28674(new int[]{193754109, 1010339258, 304218427, 1999359086, 577383856, -1517407056, 1483770189, -1005490225, 283735551, 357683902, -931892382, -2012754291, -758341253, 169227118}, Color.alpha(0) + 25).intern());
                            sb2.append(lowerCase);
                            C12080kb.m30846(strIntern2, sb2.toString(), th, true, true, true);
                        }
                    }

                    /* JADX INFO: renamed from: ﻐ */
                    private static String m28674(int[] iArr, int i2) {
                        String str2;
                        synchronized (C11835b.f27464) {
                            char[] cArr = new char[4];
                            char[] cArr2 = new char[iArr.length << 1];
                            int[] iArr2 = (int[]) f27331.clone();
                            C11835b.f27462 = 0;
                            while (C11835b.f27462 < iArr.length) {
                                cArr[0] = (char) (iArr[C11835b.f27462] >> 16);
                                cArr[1] = (char) iArr[C11835b.f27462];
                                cArr[2] = (char) (iArr[C11835b.f27462 + 1] >> 16);
                                cArr[3] = (char) iArr[C11835b.f27462 + 1];
                                C11835b.f27463 = (cArr[0] << 16) + cArr[1];
                                C11835b.f27461 = (cArr[2] << 16) + cArr[3];
                                C11835b.m28718(iArr2);
                                for (int i3 = 0; i3 < 16; i3++) {
                                    int i4 = C11835b.f27463 ^ iArr2[i3];
                                    C11835b.f27463 = i4;
                                    C11835b.f27461 = C11835b.m28717(i4) ^ C11835b.f27461;
                                    int i5 = C11835b.f27463;
                                    C11835b.f27463 = C11835b.f27461;
                                    C11835b.f27461 = i5;
                                }
                                int i6 = C11835b.f27463;
                                C11835b.f27463 = C11835b.f27461;
                                C11835b.f27461 = i6;
                                C11835b.f27461 = i6 ^ iArr2[16];
                                C11835b.f27463 ^= iArr2[17];
                                int i7 = C11835b.f27463;
                                int i8 = C11835b.f27461;
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
                            str2 = new String(cArr2, 0, i2);
                        }
                        return str2;
                    }
                });
            }
        });
        int i2 = f27279 + 79;
        f27277 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    /* JADX INFO: renamed from: ﻛ */
    private void m28633(final Context context) {
        int i = 2 % 2;
        int i2 = f27277 + 77;
        f27279 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 52 / 0;
            if (!m28603()) {
                C12089p.m30934(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.18
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.18.4
                            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                            /* JADX INFO: renamed from: ﻛ */
                            public final void mo28224() {
                                C11831aw.m28636(C11831aw.this);
                            }
                        });
                    }
                }, AbstractC11823ao.m28472().mo28479());
                int i4 = f27277 + 67;
                f27279 = i4 % 128;
                int i5 = i4 % 2;
            }
        } else if (!m28603()) {
            C12089p.m30934(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.18
                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                /* JADX INFO: renamed from: ﻛ */
                public final void mo28224() {
                    C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.18.4
                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            C11831aw.m28636(C11831aw.this);
                        }
                    });
                }
            }, AbstractC11823ao.m28472().mo28479());
            int i6 = f27277 + 67;
            f27279 = i6 % 128;
            int i7 = i6 % 2;
        }
        final Map<String, List<AbstractC11980gj>> mapM28727 = C11836ba.m28727();
        C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.16
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                C11831aw.m28649(C11831aw.this, AbstractC11823ao.m28472().mo28493());
                C11831aw.m28628(C11831aw.this, context, mapM28727, new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.16.1
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        if (C11831aw.m28610(C11831aw.this)) {
                            C11831aw.m28636(C11831aw.this);
                        }
                    }
                });
                AbstractC11823ao.m28472().mo28502(new InterfaceC11828at() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.16.2

                    /* JADX INFO: renamed from: ﻐ */
                    private static char f27341 = 5;

                    /* JADX INFO: renamed from: ｋ */
                    private static int f27342 = 0;

                    /* JADX INFO: renamed from: ﾇ */
                    private static int f27343 = 1;

                    /* JADX INFO: renamed from: ﾒ */
                    private static char[] f27344 = {'C', 'o', 'n', 'e', 'c', 't', 'r', 'M', 'a', 'g', 'D', 'i', 's', 'b', 'l', ' ', 'z', 'd', 'E', 'F', 'G', 'H', 'I', 'J', 'K'};

                    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC11828at
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo28394() {
                        int i8 = 2 % 2;
                        int i9 = f27342 + 85;
                        f27343 = i9 % 128;
                        int i10 = i9 % 2;
                        C11831aw.m28649(C11831aw.this, AbstractC11823ao.m28472().mo28493());
                        C12085l.m30917(m28675("\u0001\u0002ËË\u0004\u0000\u0006\u0000\u0007\b\u0007\u0003\t\u0005\u0001\b", (ViewConfiguration.getTouchSlop() >> 8) + 16, (byte) (View.MeasureSpec.getSize(0) + 93)).intern(), m28675("\u000b\f\r\u0007\u000e\n\f\u0001\u0005\u0013\f\u0001\n\u0006\r\u0006\n\f\u0012\u0001\u0012\u0010\u0000\u0002ëë\u0004\u0000\u0006\u0000\u0007\u000b", 31 - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE)).intern());
                        C11831aw.m28612(C11831aw.this);
                        int i11 = f27342 + 11;
                        f27343 = i11 % 128;
                        int i12 = i11 % 2;
                    }

                    /* JADX INFO: renamed from: ﾇ */
                    private static String m28675(String str, int i8, byte b) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (C11970g.f28961) {
                            char[] cArr2 = f27344;
                            char c = f27341;
                            char[] cArr3 = new char[i8];
                            if (i8 % 2 != 0) {
                                i8--;
                                cArr3[i8] = (char) (cArr[i8] - b);
                            }
                            if (i8 > 1) {
                                C11970g.f28962 = 0;
                                while (C11970g.f28962 < i8) {
                                    C11970g.f28964 = cArr[C11970g.f28962];
                                    C11970g.f28965 = cArr[C11970g.f28962 + 1];
                                    if (C11970g.f28964 == C11970g.f28965) {
                                        cArr3[C11970g.f28962] = (char) (C11970g.f28964 - b);
                                        cArr3[C11970g.f28962 + 1] = (char) (C11970g.f28965 - b);
                                    } else {
                                        C11970g.f28963 = C11970g.f28964 / c;
                                        C11970g.f28959 = C11970g.f28964 % c;
                                        C11970g.f28966 = C11970g.f28965 / c;
                                        C11970g.f28960 = C11970g.f28965 % c;
                                        if (C11970g.f28959 == C11970g.f28960) {
                                            C11970g.f28963 = ((C11970g.f28963 + c) - 1) % c;
                                            C11970g.f28966 = ((C11970g.f28966 + c) - 1) % c;
                                            int i9 = (C11970g.f28963 * c) + C11970g.f28959;
                                            int i10 = (C11970g.f28966 * c) + C11970g.f28960;
                                            cArr3[C11970g.f28962] = cArr2[i9];
                                            cArr3[C11970g.f28962 + 1] = cArr2[i10];
                                        } else if (C11970g.f28963 == C11970g.f28966) {
                                            C11970g.f28959 = ((C11970g.f28959 + c) - 1) % c;
                                            C11970g.f28960 = ((C11970g.f28960 + c) - 1) % c;
                                            int i11 = (C11970g.f28963 * c) + C11970g.f28959;
                                            int i12 = (C11970g.f28966 * c) + C11970g.f28960;
                                            cArr3[C11970g.f28962] = cArr2[i11];
                                            cArr3[C11970g.f28962 + 1] = cArr2[i12];
                                        } else {
                                            int i13 = (C11970g.f28963 * c) + C11970g.f28960;
                                            int i14 = (C11970g.f28966 * c) + C11970g.f28959;
                                            cArr3[C11970g.f28962] = cArr2[i13];
                                            cArr3[C11970g.f28962 + 1] = cArr2[i14];
                                        }
                                    }
                                    C11970g.f28962 += 2;
                                }
                            }
                            str2 = new String(cArr3);
                        }
                        return str2;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.aw$4, reason: invalid class name */
    final class AnonymousClass4 extends AbstractRunnableC12044it {

        /* JADX INFO: renamed from: ﮐ */
        private /* synthetic */ String f27354;

        /* JADX INFO: renamed from: ﱡ */
        private /* synthetic */ List f27355;

        /* JADX INFO: renamed from: ﻐ */
        final /* synthetic */ Runnable f27356;

        /* JADX INFO: renamed from: ﻛ */
        final /* synthetic */ Map f27357;

        /* JADX INFO: renamed from: ﾇ */
        private /* synthetic */ String f27359;

        /* JADX INFO: renamed from: ﾒ */
        final /* synthetic */ Context f27360;

        AnonymousClass4(String str, Context context, String str2, List list, Map map, Runnable runnable) {
            this.f27359 = str;
            this.f27360 = context;
            this.f27354 = str2;
            this.f27355 = list;
            this.f27357 = map;
            this.f27356 = runnable;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
        /* JADX INFO: renamed from: ﻛ */
        public final void mo28224() {
            if (AbstractC11823ao.m28472().mo28501(this.f27359, C11831aw.m28613(C11831aw.this))) {
                C11831aw.m28626(C11831aw.this, this.f27360, this.f27354, this.f27359, this.f27355, new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.4.5
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        if (C11831aw.m28610(C11831aw.this)) {
                            C12089p.m30939(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.4.5.4
                                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                                /* JADX INFO: renamed from: ﻛ */
                                public final void mo28224() {
                                    C11831aw.m28628(C11831aw.this, AnonymousClass4.this.f27360, AnonymousClass4.this.f27357, AnonymousClass4.this.f27356);
                                }
                            }, AbstractC11823ao.m28472().mo28473());
                        }
                    }
                });
                return;
            }
            JSONObject jSONObject = new JSONObject();
            C11831aw.m28629(C11831aw.this, this.f27359, jSONObject);
            C11831aw.m28606(C11831aw.this).put(this.f27359, jSONObject);
            C12089p.m30939(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.4.4
                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                /* JADX INFO: renamed from: ﻛ */
                public final void mo28224() {
                    C11831aw.m28628(C11831aw.this, AnonymousClass4.this.f27360, AnonymousClass4.this.f27357, AnonymousClass4.this.f27356);
                }
            }, AbstractC11823ao.m28472().mo28473());
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private void m28635(Context context, Map<String, List<AbstractC11980gj>> map, Runnable runnable) {
        Context context2;
        Map<String, List<AbstractC11980gj>> map2;
        Runnable runnable2;
        int i = 2 % 2;
        while (map != null) {
            int i2 = f27277 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            f27279 = i2 % 128;
            int i3 = i2 % 2;
            if (map.size() <= 0) {
                break;
            }
            String next = map.keySet().iterator().next();
            List<AbstractC11980gj> listRemove = map.remove(next);
            String strM28631 = m28631(listRemove);
            if (strM28631 != null) {
                this.f27287.m28714(strM28631);
                context2 = context;
                map2 = map;
                runnable2 = runnable;
                C12089p.m30943(new AnonymousClass4(strM28631, context2, next, listRemove, map2, runnable2));
                if (m28603()) {
                    int i4 = f27277 + 13;
                    f27279 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 55 / 0;
                        return;
                    }
                    return;
                }
            } else {
                context2 = context;
                map2 = map;
                runnable2 = runnable;
            }
            context = context2;
            map = map2;
            runnable = runnable2;
        }
        final Runnable runnable3 = runnable;
        C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                C12089p.m30943(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.2.3
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        runnable3.run();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: ﾇ */
    private void m28652(String str, JSONObject jSONObject) {
        int i = 2 % 2;
        C12089p.m30938(this.f27287.new AnonymousClass4(str, C11837bb.a.f27496));
        if (jSONObject != null) {
            int i2 = f27279 + 59;
            f27277 = i2 % 128;
            int i3 = i2 % 2;
            try {
                jSONObject.put(m28616(new int[]{-904381802, 716348216}, 3 - View.combineMeasuredStates(0, 0)).intern(), true);
                int i4 = f27279 + 19;
                f27277 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 35 / 0;
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m28631(List<AbstractC11980gj> list) {
        int i = 2 % 2;
        int i2 = f27277 + 91;
        f27279 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        if (list == null || list.isEmpty() || list.get(0) == null) {
            return null;
        }
        String strMo30209 = list.get(0).mo30209();
        int i3 = f27279 + 21;
        f27277 = i3 % 128;
        if (i3 % 2 == 0) {
            return strMo30209;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private void m28622(final Context context, final String str, final String str2, final List<AbstractC11980gj> list, final AbstractRunnableC12044it abstractRunnableC12044it) {
        int i = 2 % 2;
        C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.5

            /* JADX INFO: renamed from: ﮐ */
            private static int[] f27364 = {625987963, 1809885399, -280881198, -1221874152, -881821558, -664256400, -288173509, 320784663, 331377702, -1134607506, 1782476172, -409182575, 1671461472, 1613377699, 582193768, -800295458, 490555564, 1004662085};

            /* JADX INFO: renamed from: ﱡ */
            private static int f27365 = 1;

            /* JADX INFO: renamed from: ﺙ */
            private static int f27366;

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                int i2 = 2 % 2;
                String strIntern = m28678(new int[]{-437505527, -1921335418, -1652530757, 974679696, 335208165, -506666101, -852042752, -2041144284}, ((Process.getThreadPriority(0) + 20) >> 6) + 16).intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m28678(new int[]{-2011446496, -735054114, -692123305, -1875654070, 1794109135, -2041549048, -561533682, -204168167, -1782987635, -1314431995, -244719848, -900558378}, (Process.myPid() >> 22) + 23).intern());
                sb.append(str2);
                C12085l.m30917(strIntern, sb.toString());
                try {
                    C11831aw.m28658(C11831aw.this, context, str, str2, list, abstractRunnableC12044it);
                    int i3 = f27365 + 63;
                    f27366 = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 25 / 0;
                    }
                } catch (Throwable th) {
                    if (C11831aw.m28647(C11831aw.this) != null) {
                        C12089p.m30938(C11831aw.m28647(C11831aw.this).new AnonymousClass5(str2, C11837bb.b.f27505));
                    }
                    C11831aw.m28617(C11831aw.this).put(str, C12080kb.m30847(th).toString());
                    String strIntern2 = m28678(new int[]{-437505527, -1921335418, -1652530757, 974679696, 335208165, -506666101, -852042752, -2041144284}, 16 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m28678(new int[]{-751821664, 1100376951, -2126680837, -526408021, 233868475, -109016626, 936435204, 1749251739, 279840471, -608912192, -839218950, -364225495, -1535813557, -200633359}, 25 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
                    sb2.append(str2);
                    C12080kb.m30846(strIntern2, sb2.toString(), th, true, true, true);
                    int i5 = f27365 + 101;
                    f27366 = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                }
            }

            /* JADX INFO: renamed from: ｋ */
            private static String m28678(int[] iArr, int i2) {
                String str3;
                synchronized (C11835b.f27464) {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f27364.clone();
                    C11835b.f27462 = 0;
                    while (C11835b.f27462 < iArr.length) {
                        cArr[0] = (char) (iArr[C11835b.f27462] >> 16);
                        cArr[1] = (char) iArr[C11835b.f27462];
                        cArr[2] = (char) (iArr[C11835b.f27462 + 1] >> 16);
                        cArr[3] = (char) iArr[C11835b.f27462 + 1];
                        C11835b.f27463 = (cArr[0] << 16) + cArr[1];
                        C11835b.f27461 = (cArr[2] << 16) + cArr[3];
                        C11835b.m28718(iArr2);
                        for (int i3 = 0; i3 < 16; i3++) {
                            int i4 = C11835b.f27463 ^ iArr2[i3];
                            C11835b.f27463 = i4;
                            C11835b.f27461 = C11835b.m28717(i4) ^ C11835b.f27461;
                            int i5 = C11835b.f27463;
                            C11835b.f27463 = C11835b.f27461;
                            C11835b.f27461 = i5;
                        }
                        int i6 = C11835b.f27463;
                        C11835b.f27463 = C11835b.f27461;
                        C11835b.f27461 = i6;
                        C11835b.f27461 = i6 ^ iArr2[16];
                        C11835b.f27463 ^= iArr2[17];
                        int i7 = C11835b.f27463;
                        int i8 = C11835b.f27461;
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
                    str3 = new String(cArr2, 0, i2);
                }
                return str3;
            }
        });
        int i2 = f27279 + 45;
        f27277 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    private void m28630(final C11878cp c11878cp, final String str) {
        int i = 2 % 2;
        final String strM29740 = c11878cp.m29740();
        C12089p.m30938(this.f27287.new AnonymousClass4(strM29740, C11837bb.a.f27494));
        C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.1

            /* JADX INFO: renamed from: ﮐ */
            private static int f27296 = 1;

            /* JADX INFO: renamed from: ﱟ */
            private static int f27297 = 0;

            /* JADX INFO: renamed from: ﱡ */
            private static long f27298 = 0;

            /* JADX INFO: renamed from: ﺙ */
            private static char f27299 = 0;

            /* JADX INFO: renamed from: ﻏ */
            private static int f27300 = -1743774490;

            /* JADX INFO: renamed from: ｋ */
            private static long f27301 = 3700894777568446042L;

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() throws Exception {
                int i2 = 2 % 2;
                JSONObject jSONObjectM28618 = C11831aw.m28618(C11831aw.this, c11878cp);
                jSONObjectM28618.put(m28670("옿\uf167", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 14149).intern(), true);
                C11831aw.m28606(C11831aw.this).put(c11878cp.m29740(), jSONObjectM28618);
                String strM29737 = c11878cp.m29737();
                if (m28671("ବ醉\ud992꼁褐瀻锘\udff8", (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), "\u0000\u0000\u0000\u0000", Process.myPid() >> 22, "༊荳掚\uf055").intern().equals(strM29737)) {
                    String strIntern = m28671("萸ﮛ\ueb20ઙ䤩疀뎜\uf7bd⃬䷆ꔵ몭⩎⪠铝塙", (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 519), "\u0000\u0000\u0000\u0000", TextUtils.indexOf("", ""), "\ue7a3ㄨި턂").intern();
                    StringBuilder sb = new StringBuilder();
                    sb.append(c11878cp.m29739());
                    sb.append(m28670("왺\udecc\uf7df賫ꗠ뫶厇條Ɲ⚵㿨풴\ued55舋魘끨䥹湾܂ᰙ㔛쨧", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6389).intern());
                    C12085l.m30917(strIntern, sb.toString());
                    C12089p.m30938(C11831aw.m28647(C11831aw.this).new AnonymousClass4(strM29740, C11837bb.a.f27496));
                    int i3 = f27296 + 35;
                    f27297 = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 4 / 5;
                    }
                } else if (C11831aw.m28660(C11831aw.this, strM29740)) {
                    String strIntern2 = m28671("萸ﮛ\ueb20ઙ䤩疀뎜\uf7bd⃬䷆ꔵ몭⩎⪠铝塙", (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 518), "\u0000\u0000\u0000\u0000", TextUtils.getOffsetBefore("", 0), "\ue7a3ㄨި턂").intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c11878cp.m29739());
                    sb2.append(m28671("㪵頕⃕忮聺篟╭\ud9aa㧁ݧ෦ﯤ晴\ude7c큡\udef5忕㙥宠粼༬쌄昊䨮毃䓿봢넫蹧摈蔜櫻\ue4a9诎䢉\udf90橿₋誰", (char) (22653 - View.getDefaultSize(0, 0)), "\u0000\u0000\u0000\u0000", (-110789529) - TextUtils.lastIndexOf("", '0'), "栵敼緹䡘").intern());
                    C12085l.m30917(strIntern2, sb2.toString());
                    C12089p.m30938(C11831aw.m28647(C11831aw.this).new AnonymousClass4(strM29740, C11837bb.a.f27496));
                    jSONObjectM28618.put(m28670("옾᭄糓", 56701 - TextUtils.getOffsetAfter("", 0)).intern(), true);
                } else if (C11831aw.m28646(c11878cp, strM29737)) {
                    C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.1.5

                        /* JADX INFO: renamed from: ﻛ */
                        private static int f27306 = 0;

                        /* JADX INFO: renamed from: ｋ */
                        private static int f27307 = 85;

                        /* JADX INFO: renamed from: ﾒ */
                        private static int f27308 = 1;

                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            int i5 = 2 % 2;
                            c11878cp.m29741();
                            C12089p.m30938(C11831aw.m28647(C11831aw.this).new AnonymousClass4(strM29740, C11837bb.a.f27493));
                            String strIntern3 = m28673("\uffff�\u000e\t\f\uffe7\ufffb\b\ufffb\u0001\uffff\f\uffdd\t\b\b", View.MeasureSpec.getMode(0) + 16, false, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13, 187 - (KeyEvent.getMaxKeyCode() >> 16)).intern();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(c11878cp.m29739());
                            sb3.append(m28673("\ufffe\u0000\t\t\n\ufffeﾻ\uffff\u0000\u0015\u0004\u0007￼\u0004\u000f\u0004\t\u0004ﾻ\u0014\u0007\u0007\u0010\u0001\u000e\u000e\u0000\ufffe\ufffe\u0010\u000eﾻ\r\n\u000f", 36 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), true, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7, Color.green(0) + 186).intern());
                            C12085l.m30917(strIntern3, sb3.toString());
                            int i6 = f27306 + 63;
                            f27308 = i6 % 128;
                            int i7 = i6 % 2;
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo28672(Throwable th) {
                            int i5 = 2 % 2;
                            int i6 = f27308 + 57;
                            f27306 = i6 % 128;
                            int i7 = i6 % 2;
                            try {
                                ((JSONObject) C11831aw.m28606(C11831aw.this).get(c11878cp.m29740())).put(m28673("￼\u0001￼\u0007", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5, false, (ViewConfiguration.getScrollBarSize() >> 8) + 4, 194 - View.resolveSizeAndState(0, 0, 0)).intern(), false);
                            } catch (JSONException e) {
                                C12085l.m30922(m28673("\uffff�\u000e\t\f\uffe7\ufffb\b\ufffb\u0001\uffff\f\uffdd\t\b\b", 16 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), false, Drawable.resolveOpacity(0, 0) + 12, 187 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), m28673("\u0001ﾾ\r\u0012ﾾ\u0012\u0007\f\u0007ﾾ\u0005\f\u0007\u0012\u0012\u0003\u0011ﾾ\u0010\r\u0010\u0010￣\f\r\u0011\bﾾ\f\r\u0007\u0011\u0010\u0003\u0014ﾾ\u0010\r\u0012\u0001\u0003\f\f\r", 44 - (ViewConfiguration.getLongPressTimeout() >> 16), true, TextUtils.getOffsetBefore("", 0) + 23, 183 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), e);
                            }
                            C12089p.m30938(C11831aw.m28647(C11831aw.this).new AnonymousClass5(strM29740, C11837bb.b.f27502));
                            String strIntern3 = m28673("\uffff�\u000e\t\f\uffe7\ufffb\b\ufffb\u0001\uffff\f\uffdd\t\b\b", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15, false, (ViewConfiguration.getEdgeSlop() >> 16) + 12, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 186).intern();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m28673("\f\u0007ﾾ\u0010\r\u0010\u0010￣ﾾ\u0005\f\u0007\u0018\u0007\n\uffff\u0007\u0012\u0007", 19 - TextUtils.getOffsetAfter("", 0), true, Color.rgb(0, 0, 0) + 16777224, 182 - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
                            sb3.append(c11878cp.m29739());
                            sb3.append(m28673("\uffff\u0001\n\n\u000b\uffffﾼ\u000e\u000b\u0010", 10 - (ViewConfiguration.getWindowTouchSlop() >> 8), true, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7, TextUtils.getTrimmedLength("") + 185).intern());
                            C12080kb.m30846(strIntern3, sb3.toString(), th, true, true, true);
                            String strIntern4 = m28673("\u0016\u000b\u000e\u0003\u0017\ufff3\u0006￣￭￦\ufff5\u001b", AndroidCharacter.getMirror('0') - '$', true, 7 - MotionEvent.axisFromString(""), View.resolveSizeAndState(0, 0, 0) + 179).intern();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(m28673("\f\r\u0010\tￄ\r\u0012\r\u0018\r\u0005\u0010\r\u001e\r\u0012\u000bￄ￭\ufff7￥\b\ufff5\u0019\u0005\u0010\r\u0018\u001dￄ\ufff7￨\uffefￄ￥\u0012ￄ\t\u0016\u0016\u0013\u0016ￄ\u0013\u0007\u0007\u0019\u0016\u0016\t\bￄ\u001b", 53 - (ViewConfiguration.getPressedStateDuration() >> 16), false, 33 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getTouchSlop() >> 8) + 177).intern());
                            sb4.append(c11878cp.m29739());
                            sb4.append(m28673("\u0010\u000f\u000f\u0006\u0004\u0015\u0010\u0013ￏ\uffc1\u0004", (ViewConfiguration.getLongPressTimeout() >> 16) + 11, false, TextUtils.indexOf("", "", 0, 0) + 9, 180 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
                            C12085l.m30912(strIntern4, sb4.toString());
                            int i8 = f27308 + 3;
                            f27306 = i8 % 128;
                            if (i8 % 2 != 0) {
                                int i9 = 42 / 0;
                            }
                        }

                        /* JADX INFO: renamed from: ｋ */
                        private static String m28673(String str2, int i5, boolean z, int i6, int i7) {
                            String str3;
                            Object charArray = str2;
                            if (str2 != null) {
                                charArray = str2.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (C11889d.f28479) {
                                char[] cArr2 = new char[i5];
                                C11889d.f28481 = 0;
                                while (C11889d.f28481 < i5) {
                                    C11889d.f28480 = cArr[C11889d.f28481];
                                    cArr2[C11889d.f28481] = (char) (C11889d.f28480 + i7);
                                    int i8 = C11889d.f28481;
                                    cArr2[i8] = (char) (cArr2[i8] - f27307);
                                    C11889d.f28481++;
                                }
                                if (i6 > 0) {
                                    C11889d.f28478 = i6;
                                    char[] cArr3 = new char[i5];
                                    System.arraycopy(cArr2, 0, cArr3, 0, i5);
                                    System.arraycopy(cArr3, 0, cArr2, i5 - C11889d.f28478, C11889d.f28478);
                                    System.arraycopy(cArr3, C11889d.f28478, cArr2, 0, i5 - C11889d.f28478);
                                }
                                if (z) {
                                    char[] cArr4 = new char[i5];
                                    C11889d.f28481 = 0;
                                    while (C11889d.f28481 < i5) {
                                        cArr4[C11889d.f28481] = cArr2[(i5 - C11889d.f28481) - 1];
                                        C11889d.f28481++;
                                    }
                                    cArr2 = cArr4;
                                }
                                str3 = new String(cArr2);
                            }
                            return str3;
                        }
                    });
                    C11831aw.m28641(C11831aw.this).add(c11878cp);
                } else {
                    jSONObjectM28618.put(m28671("⢫롑晧", (char) (59645 - (ViewConfiguration.getPressedStateDuration() >> 16)), "\u0000\u0000\u0000\u0000", (-2021458455) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\ue980苽ﶇ\uf1e8").intern(), false);
                    C12089p.m30938(C11831aw.m28647(C11831aw.this).new AnonymousClass5(strM29740, C11837bb.b.f27504));
                    String strIntern3 = m28671("萸ﮛ\ueb20ઙ䤩疀뎜\uf7bd⃬䷆ꔵ몭⩎⪠铝塙", (char) (ExpandableListView.getPackedPositionType(0L) + 519), "\u0000\u0000\u0000\u0000", ViewConfiguration.getEdgeSlop() >> 16, "\ue7a3ㄨި턂").intern();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(m28670("왺\ude4a\uf698軘ꝶ뽣垭濽бᱨ㒫쳕\ue55e", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6210).intern());
                    sb3.append(strM29737);
                    sb3.append(m28670("왺䶢턋擉\ue870翠荈ᚍ骫⸦떄㥁䳥큲柄\ueb55缥芉ᘜ鷼Ⅺ뒟㡎䰤폢朇\uea88繴薦॔鳋₻됔㮎佻틽晑\ueddd", Drawable.resolveOpacity(0, 0) + 35729).intern());
                    C12080kb.m30846(strIntern3, sb3.toString(), null, true, true, true);
                    ISAdQualityInitListener iSAdQualityInitListenerM28663 = C11831aw.this.m28663();
                    ISAdQualityInitError iSAdQualityInitError = ISAdQualityInitError.AD_NETWORK_VERSION_NOT_SUPPORTED_YET;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(c11878cp.m29739());
                    sb4.append(m28670("왺\ude4a\uf698軘ꝶ뽣垭濽бᱨ㒫쳕\ue55e", 6259 - AndroidCharacter.getMirror('0')).intern());
                    sb4.append(c11878cp.m29737());
                    sb4.append(m28670("왺䶢턋擉\ue870翠荈ᚍ骫⸦떄㥁䳥큲柄\ueb55缥芉ᘜ鷼Ⅺ뒟㡎䰤폢朇\uea88繴薦॔鳋₻됔㮎佻틽晑\ueddd", 35728 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
                    iSAdQualityInitListenerM28663.adQualitySdkInitFailed(iSAdQualityInitError, sb4.toString());
                    int i5 = f27296 + 79;
                    f27297 = i5 % 128;
                    int i6 = i5 % 2;
                }
                jSONObjectM28618.remove(m28670("옿\uf167", 14149 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻐ */
            public final void mo28672(Throwable th) {
                int i2 = 2 % 2;
                C12089p.m30938(C11831aw.m28647(C11831aw.this).new AnonymousClass5(strM29740, C11837bb.b.f27498));
                String strIntern = m28671("萸ﮛ\ueb20ઙ䤩疀뎜\uf7bd⃬䷆ꔵ몭⩎⪠铝塙", (char) (519 - (Process.myTid() >> 22)), "\u0000\u0000\u0000\u0000", Drawable.resolveOpacity(0, 0), "\ue7a3ㄨި턂").intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m28670("옟諉忪ₖ\uf5ac䘟୵\udc13ꄻ症웹讐岺⅞\uf26e䜜ࠤ\udcccꆨ犊잡衁嵢⸈\uf321䟗࣯\udd93껦", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19681).intern());
                sb.append(strM29740);
                C12080kb.m30846(strIntern, sb.toString(), th, true, true, true);
                int i3 = f27297 + 69;
                f27296 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 36 / 0;
                }
            }

            /* JADX INFO: renamed from: ﾇ */
            private static String m28670(String str2, int i2) {
                String str3;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (C11997h.f29102) {
                    C11997h.f29101 = i2;
                    char[] cArr2 = new char[cArr.length];
                    C11997h.f29103 = 0;
                    while (C11997h.f29103 < cArr.length) {
                        cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f27301);
                        C11997h.f29103++;
                    }
                    str3 = new String(cArr2);
                }
                return str3;
            }

            /* JADX INFO: renamed from: ﾒ */
            private static String m28671(String str2, char c, String str3, int i2, String str4) {
                String str5;
                Object charArray = str4;
                if (str4 != null) {
                    charArray = str4.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                Object charArray2 = str3;
                if (str3 != null) {
                    charArray2 = str3.toCharArray();
                }
                char[] cArr2 = (char[]) charArray2;
                Object charArray3 = str2;
                if (str2 != null) {
                    charArray3 = str2.toCharArray();
                }
                char[] cArr3 = (char[]) charArray3;
                synchronized (C12051j.f29510) {
                    char[] cArr4 = (char[]) cArr.clone();
                    char[] cArr5 = (char[]) cArr2.clone();
                    cArr4[0] = (char) (c ^ cArr4[0]);
                    cArr5[2] = (char) (cArr5[2] + ((char) i2));
                    int length = cArr3.length;
                    char[] cArr6 = new char[length];
                    C12051j.f29511 = 0;
                    while (C12051j.f29511 < length) {
                        int i3 = (C12051j.f29511 + 2) % 4;
                        int i4 = (C12051j.f29511 + 3) % 4;
                        C12051j.f29509 = (char) (((cArr4[C12051j.f29511 % 4] * 32718) + cArr5[i3]) % 65535);
                        cArr5[i4] = (char) (((cArr4[i4] * 32718) + cArr5[i3]) / 65535);
                        cArr4[i4] = C12051j.f29509;
                        cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i4] ^ cArr3[C12051j.f29511])) ^ f27298) ^ ((long) f27300)) ^ ((long) f27299));
                        C12051j.f29511++;
                    }
                    str5 = new String(cArr6);
                }
                return str5;
            }
        });
        int i2 = f27279 + 93;
        f27277 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private void m28643(Context context, String str, String str2, List<AbstractC11980gj> list, AbstractRunnableC12044it abstractRunnableC12044it) {
        Iterator<AbstractC11980gj> it;
        int i = 2 % 2;
        int i2 = f27279 + 9;
        f27277 = i2 % 128;
        if (i2 % 2 != 0) {
            it = list.iterator();
            int i3 = 22 / 0;
        } else {
            it = list.iterator();
        }
        while (it.hasNext()) {
            Context context2 = context;
            String str3 = str;
            String str4 = str2;
            AbstractRunnableC12044it abstractRunnableC12044it2 = abstractRunnableC12044it;
            m28642(context2, str3, str4, it.next(), abstractRunnableC12044it2);
            int i4 = f27277 + 27;
            f27279 = i4 % 128;
            int i5 = i4 % 2;
            context = context2;
            str = str3;
            str2 = str4;
            abstractRunnableC12044it = abstractRunnableC12044it2;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private void m28642(final Context context, final String str, final String str2, final AbstractC11980gj abstractC11980gj, final AbstractRunnableC12044it abstractRunnableC12044it) {
        int i = 2 % 2;
        C12053jb.a aVarM30231 = abstractC11980gj.m30231();
        if (aVarM30231 == null) {
            C12089p.m30933(abstractRunnableC12044it);
            int i2 = f27279 + 47;
            f27277 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        final AbstractC11840be abstractC11840beMo30210 = abstractC11980gj.mo30210();
        m28651(str2, abstractC11840beMo30210);
        C12089p.m30938(this.f27287.new AnonymousClass4(str2, C11837bb.a.f27495));
        final String strM30582 = this.f27285.m30582(aVarM30231, new InterfaceC12038in() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.6
            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12038in
            /* JADX INFO: renamed from: ｋ */
            public final void mo28594(String str3) {
                C11831aw.m28624(C11831aw.this, context, str, str2, abstractC11980gj, C11831aw.m28639(C11831aw.this, context, str3, abstractC11840beMo30210), false, abstractC11840beMo30210, abstractRunnableC12044it);
            }
        });
        C12089p.m30934(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.10
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                C11878cp c11878cpM28639 = C11831aw.m28639(C11831aw.this, context, strM30582, abstractC11840beMo30210);
                if (c11878cpM28639 != null) {
                    C11831aw.m28624(C11831aw.this, context, str, str2, abstractC11980gj, c11878cpM28639, true, abstractC11840beMo30210, abstractRunnableC12044it);
                } else {
                    C12089p.m30933(abstractRunnableC12044it);
                }
            }
        }, m28638(aVarM30231));
        int i4 = f27279 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f27277 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private C11878cp m28654(Context context, String str, AbstractC11840be abstractC11840be) {
        int i = 2 % 2;
        int i2 = f27277 + 95;
        f27279 = i2 % 128;
        int i3 = i2 % 2;
        if (str == null) {
            return null;
        }
        C11878cp c11878cp = new C11878cp(context, new C11897dh(str, this.f27290), this.f27284, this.f27286, abstractC11840be);
        int i4 = f27279 + 9;
        f27277 = i4 % 128;
        int i5 = i4 % 2;
        return c11878cp;
    }

    /* JADX INFO: renamed from: ﻐ */
    private void m28621(final Context context, final String str, final String str2, final AbstractC11980gj abstractC11980gj, final C11878cp c11878cp, final boolean z, final AbstractC11840be abstractC11840be, final AbstractRunnableC12044it abstractRunnableC12044it) {
        int i = 2 % 2;
        C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.7

            /* JADX INFO: renamed from: טּ */
            private static int f27380 = 1;

            /* JADX INFO: renamed from: ﭖ */
            private static byte[] f27381 = {-36, -64, -79, -71, -90, -64, -57, -114, -74, -82, -60, -79, -86, -77, -78, -33, -39, -115, -51, -39, -61, -27, -47, -33, -52, -55, -33, -49, -7, -34, Ascii.f22499SI, 100, 92, 114, 95, 88, 97, 96, 109, -92, Ascii.f22493FS, 82, 102, 99, 105, 84, -77, -44, -29, Ascii.f22494GS, Ascii.ESC, 35, 32, Ascii.f22493FS, 89, -43, 70, -128, 126, -122, 112, -112, -128, -65};

            /* JADX INFO: renamed from: ﭴ */
            private static int f27382 = -374711463;

            /* JADX INFO: renamed from: ﭸ */
            private static short[] f27383 = null;

            /* JADX INFO: renamed from: ﮉ */
            private static int f27384 = 52;

            /* JADX INFO: renamed from: ﮌ */
            private static int f27385 = 0;

            /* JADX INFO: renamed from: ﻏ */
            private static int f27386 = 1158638241;

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                AbstractRunnableC12044it abstractRunnableC12044it2;
                int i2 = 2 % 2;
                if (c11878cp == null || C11831aw.m28608(C11831aw.this).contains(abstractC11980gj)) {
                    return;
                }
                C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.az.3

                    /* JADX INFO: renamed from: ﻐ */
                    private /* synthetic */ boolean f27451;

                    /* JADX INFO: renamed from: ﾇ */
                    private /* synthetic */ String f27453;

                    /* JADX INFO: renamed from: ﾒ */
                    private /* synthetic */ C11878cp f27454;

                    AnonymousClass3() {
                        str = str;
                        c11878cp = c11878cp;
                        z = z;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        C11837bb c11837bbM28712 = C11834az.m28712(C11834az.this, str);
                        if (c11837bbM28712 != null) {
                            c11837bbM28712.m28740(c11878cp);
                        }
                    }
                });
                if (!c11878cp.m29730()) {
                    int i3 = f27385 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                    f27380 = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                    AbstractRunnableC12044it abstractRunnableC12044it3 = abstractRunnableC12044it;
                    if (abstractRunnableC12044it3 != null) {
                        C12089p.m30933(abstractRunnableC12044it3);
                    }
                }
                if (!C11831aw.m28645(c11878cp)) {
                    C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.7.3

                        /* JADX INFO: renamed from: ﮐ */
                        private static int f27396 = 1;

                        /* JADX INFO: renamed from: ﱡ */
                        private static short[] f27397 = null;

                        /* JADX INFO: renamed from: ﻏ */
                        private static int f27398 = 0;

                        /* JADX INFO: renamed from: ﻐ */
                        private static int f27399 = 40;

                        /* JADX INFO: renamed from: ﻛ */
                        private static byte[] f27400 = {-37, -106, -82, -27, -64, Ascii.f22490CR, Ascii.DC4, 4, Ascii.f22499SI, Ascii.ESC, -3, 100, -61, Ascii.NAK, -1, 97, -11, -99, -22, -15, -31, -20, -8, -38, 65, -96, -14, -36, 62, -86, -32, -22, -23, -21, 7, Ascii.f22498RS, -104, -7, -34, -12, -33, -17, -9, -34, Base64.padSymbol, -31, 0, -31, 5, -22, 65, -95, -10, 66, -24, 92, 77, 85, 66, 92, 99, 42, 82, 74, 96, 77, 70, 79, 78, 123};

                        /* JADX INFO: renamed from: ｋ */
                        private static int f27401 = 1158949753;

                        /* JADX INFO: renamed from: ﾒ */
                        private static int f27402 = -2095834535;

                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            int i4 = 2 % 2;
                            if (C11831aw.m28617(C11831aw.this).containsKey(c11878cp.m29740())) {
                                return;
                            }
                            C12089p.m30938(C11831aw.m28647(C11831aw.this).new AnonymousClass5(c11878cp.m29740(), C11837bb.b.f27506));
                            JSONObject jSONObjectM28618 = C11831aw.m28618(C11831aw.this, c11878cp);
                            try {
                                jSONObjectM28618.put(m28680((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 1158949753, (short) (103 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2095834632, (byte) ((-1) - MotionEvent.axisFromString("")), (-42) - MotionEvent.axisFromString("")).intern(), false);
                                int i5 = f27398 + 21;
                                f27396 = i5 % 128;
                                if (i5 % 2 == 0) {
                                    int i6 = 4 / 5;
                                }
                            } catch (JSONException unused) {
                            }
                            C11831aw.m28606(C11831aw.this).put(c11878cp.m29740(), jSONObjectM28618);
                            String strM28715 = C11831aw.m28647(C11831aw.this).m28715(c11878cp.m29740());
                            C11831aw.m28617(C11831aw.this).put(c11878cp.m29740(), strM28715);
                            ISAdQualityInitListener iSAdQualityInitListenerM28663 = C11831aw.this.m28663();
                            ISAdQualityInitError iSAdQualityInitError = ISAdQualityInitError.AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK;
                            StringBuilder sb = new StringBuilder();
                            sb.append(c11878cp.m29739());
                            sb.append(m28680((-1158949750) - View.MeasureSpec.makeMeasureSpec(0, 0), (short) (Gravity.getAbsoluteGravity(0, 0) - 14), ((byte) KeyEvent.getModifierMetaStateMask()) + 2095834568, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (-16777257) - Color.rgb(0, 0, 0)).intern());
                            sb.append(c11878cp.m29737());
                            sb.append(m28680(TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 1158949736, (short) (20 - TextUtils.lastIndexOf("", '0')), (Process.myPid() >> 22) + 2095834567, (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-41) - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
                            sb.append(c11878cp.m29738());
                            sb.append(m28680((ViewConfiguration.getTapTimeout() >> 16) - 1158949708, (short) (12 - MotionEvent.axisFromString("")), 2095834567 - ExpandableListView.getPackedPositionType(0L), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-42) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
                            iSAdQualityInitListenerM28663.adQualitySdkInitFailed(iSAdQualityInitError, sb.toString());
                            C12080kb.m30846(m28680(AndroidCharacter.getMirror('0') - 11123, (short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 80), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2095834601, (byte) (ViewConfiguration.getTouchSlop() >> 8), ((byte) KeyEvent.getModifierMetaStateMask()) - 40).intern(), strM28715, null, true, true, true);
                            int i7 = f27396 + 57;
                            f27398 = i7 % 128;
                            int i8 = i7 % 2;
                        }

                        /* JADX INFO: renamed from: ﾇ */
                        private static String m28680(int i4, short s, int i5, byte b, int i6) {
                            String string;
                            synchronized (C12086m.f29832) {
                                StringBuilder sb = new StringBuilder();
                                int i7 = f27399;
                                int i8 = i6 + i7;
                                int i9 = i8 == -1 ? 1 : 0;
                                if (i9 != 0) {
                                    byte[] bArr = f27400;
                                    if (bArr != null) {
                                        i8 = (byte) (bArr[f27401 + i4] + i7);
                                    } else {
                                        i8 = (short) (f27397[f27401 + i4] + i7);
                                    }
                                }
                                if (i8 > 0) {
                                    C12086m.f29836 = ((i4 + i8) - 2) + f27401 + i9;
                                    C12086m.f29833 = b;
                                    C12086m.f29837 = (char) (i5 + f27402);
                                    sb.append(C12086m.f29837);
                                    C12086m.f29834 = C12086m.f29837;
                                    C12086m.f29835 = 1;
                                    while (C12086m.f29835 < i8) {
                                        byte[] bArr2 = f27400;
                                        if (bArr2 != null) {
                                            int i10 = C12086m.f29836;
                                            C12086m.f29836 = i10 - 1;
                                            C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i10] + s)) ^ C12086m.f29833));
                                        } else {
                                            short[] sArr = f27397;
                                            int i11 = C12086m.f29836;
                                            C12086m.f29836 = i11 - 1;
                                            C12086m.f29837 = (char) (C12086m.f29834 + (((short) (sArr[i11] + s)) ^ C12086m.f29833));
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
                    });
                    return;
                }
                String strIntern = m28679(View.MeasureSpec.makeMeasureSpec(0, 0) - 1158638241, (short) (78 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 374711530, (byte) KeyEvent.keyCodeFromString(""), (-53) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m28679((-1158638226) - TextUtils.lastIndexOf("", '0', 0), (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 45), ((Process.getThreadPriority(0) + 20) >> 6) + 374711536, (byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (-54) - ImageFormat.getBitsPerPixel(0)).intern());
                sb.append(str);
                sb.append(m28679((-1158638212) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (short) ((-97) - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 374711495, (byte) View.resolveSize(0, 0), (-54) - TextUtils.lastIndexOf("", '0')).intern());
                sb.append((z ? m28679((ViewConfiguration.getTapTimeout() >> 16) - 1158638194, (short) ((ViewConfiguration.getScrollBarSize() >> 8) - 30), 374711502 - TextUtils.indexOf((CharSequence) "", '0'), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 53) : m28679((-1158638186) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126), KeyEvent.normalizeMetaState(0) + 374711503, (byte) ExpandableListView.getPackedPositionGroup(0L), ImageFormat.getBitsPerPixel(0) - 52)).intern());
                C11875cm.m29606(strIntern, sb.toString());
                abstractC11840be.m28836();
                if (c11878cp.m29730() && (abstractRunnableC12044it2 = abstractRunnableC12044it) != null) {
                    int i4 = f27380 + 89;
                    f27385 = i4 % 128;
                    int i5 = i4 % 2;
                    C12089p.m30933(abstractRunnableC12044it2);
                }
                if (!(!C12092s.m30994().m31000())) {
                    return;
                }
                int i6 = f27380 + 17;
                f27385 = i6 % 128;
                int i7 = i6 % 2;
                C11831aw.m28659(C11831aw.this, c11878cp, str);
                if (C11831aw.m28660(C11831aw.this, c11878cp.m29740())) {
                    return;
                }
                C11831aw.m28608(C11831aw.this).add(abstractC11980gj);
            }

            /* JADX INFO: renamed from: ﾒ */
            private static String m28679(int i2, short s, int i3, byte b, int i4) {
                String string;
                synchronized (C12086m.f29832) {
                    StringBuilder sb = new StringBuilder();
                    int i5 = f27384;
                    int i6 = i4 + i5;
                    int i7 = i6 == -1 ? 1 : 0;
                    if (i7 != 0) {
                        byte[] bArr = f27381;
                        if (bArr != null) {
                            i6 = (byte) (bArr[f27386 + i2] + i5);
                        } else {
                            i6 = (short) (f27383[f27386 + i2] + i5);
                        }
                    }
                    if (i6 > 0) {
                        C12086m.f29836 = ((i2 + i6) - 2) + f27386 + i7;
                        C12086m.f29833 = b;
                        C12086m.f29837 = (char) (i3 + f27382);
                        sb.append(C12086m.f29837);
                        C12086m.f29834 = C12086m.f29837;
                        C12086m.f29835 = 1;
                        while (C12086m.f29835 < i6) {
                            byte[] bArr2 = f27381;
                            if (bArr2 != null) {
                                int i8 = C12086m.f29836;
                                C12086m.f29836 = i8 - 1;
                                C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i8] + s)) ^ C12086m.f29833));
                            } else {
                                short[] sArr = f27383;
                                int i9 = C12086m.f29836;
                                C12086m.f29836 = i9 - 1;
                                C12086m.f29837 = (char) (C12086m.f29834 + (((short) (sArr[i9] + s)) ^ C12086m.f29833));
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
        });
        int i2 = f27277 + 31;
        f27279 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX INFO: renamed from: ﾇ */
    private static JSONObject m28650(C11878cp c11878cp) {
        int i = 2 % 2;
        int i2 = f27279 + 7;
        f27277 = i2 % 128;
        ?? r1 = i2 % 2;
        try {
            if (r1 != 0) {
                JSONObject jSONObjectM28619 = m28619(c11878cp.m29737());
                jSONObjectM28619.put(C12035ik.f29369, c11878cp.m29742());
                int i3 = 21 / 0;
                r1 = jSONObjectM28619;
            } else {
                JSONObject jSONObjectM286110 = m28619(c11878cp.m29737());
                jSONObjectM286110.put(C12035ik.f29369, c11878cp.m29742());
                r1 = jSONObjectM286110;
            }
        } catch (JSONException e) {
            C12085l.m30922(m28616(new int[]{-743362187, -855579378, 296289115, 1422676582, 1258510841, -1493404968, 783211270, -1415686626}, MotionEvent.axisFromString("") + 17).intern(), m28616(new int[]{1715185050, -1376270443, 163608994, -1385366754, 890577456, 1463768030, 2129168782, -845544352, -1036764761, -519755590, -438690400, 2067116869, 1462330912, 1311357789, 1109185785, 896795414, 1072498516, -1362437208, 902045757, 180712424}, 36 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), e);
        }
        int i4 = f27279 + 11;
        f27277 = i4 % 128;
        if (i4 % 2 == 0) {
            return r1;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static boolean m28661(C11878cp c11878cp, String str) {
        int i = 2 % 2;
        int i2 = f27279 + 59;
        f27277 = i2 % 128;
        int i3 = i2 % 2;
        if (m28616(new int[]{387888166, -1483490518, -1573086586, 1422860009}, (Process.myTid() >> 22) + 7).intern().equals(str)) {
            return true;
        }
        int i4 = f27277 + 47;
        f27279 = i4 % 128;
        int i5 = i4 % 2;
        if (TextUtils.isEmpty(str) || C12081kc.m30858(str, c11878cp.m29734()) < 0) {
            return false;
        }
        int i6 = f27279 + 51;
        f27277 = i6 % 128;
        int i7 = i6 % 2;
        return C12081kc.m30858(str, c11878cp.m29735()) <= 0;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static boolean m28637(C11878cp c11878cp) {
        int i = 2 % 2;
        String strM29738 = c11878cp.m29738();
        if (strM29738 == null || C12081kc.m30858(IronSourceAdQuality.getSDKVersion(), strM29738) >= 0) {
            int i2 = f27279 + 81;
            f27277 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = f27279 + 67;
        f27277 = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private boolean m28653(String str) {
        int i = 2 % 2;
        if (this.f27289.containsKey(str)) {
            int i2 = f27279 + 101;
            f27277 = i2 % 128;
            int i3 = i2 % 2;
            if (this.f27289.get(str).m28686(this.f27288)) {
                int i4 = f27279 + 23;
                f27277 = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        int i6 = f27277 + 109;
        f27279 = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private void m28656() {
        int i = 2 % 2;
        ArrayList<C11878cp> arrayList = new ArrayList();
        Iterator<C11878cp> it = m28605().iterator();
        while (!(!it.hasNext())) {
            int i2 = f27277 + 17;
            f27279 = i2 % 128;
            int i3 = i2 % 2;
            C11878cp next = it.next();
            if (m28653(next.m29740())) {
                arrayList.add(next);
                int i4 = f27277 + 55;
                f27279 = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        for (final C11878cp c11878cp : arrayList) {
            String strIntern = m28616(new int[]{-743362187, -855579378, 296289115, 1422676582, 1258510841, -1493404968, 783211270, -1415686626}, (KeyEvent.getMaxKeyCode() >> 16) + 16).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m28616(new int[]{-1642699356, -714721318, -1740787657, 2109979465, 1686278008, 159525577}, 10 - Color.red(0)).intern());
            sb.append(c11878cp.m29739());
            sb.append(m28640("ꮧ\udf2b룲Õ稡䏚\ue510⎮\ue46f\u2ef4", Color.argb(0, 0, 0, 0) + 10).intern());
            C12085l.m30923(strIntern, sb.toString());
            String strM29740 = c11878cp.m29740();
            m28652(strM29740, m28609().get(strM29740));
            C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.9
                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                /* JADX INFO: renamed from: ﻛ */
                public final void mo28224() {
                    c11878cp.m29743();
                }
            });
            m28607().remove(c11878cp);
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private long m28638(C12053jb.a aVar) {
        int i = 2 % 2;
        int i2 = f27277 + 113;
        f27279 = i2 % 128;
        int i3 = i2 % 2;
        if (!AbstractC11823ao.m28472().mo28500()) {
            if (aVar == null || this.f27285.m30581(aVar)) {
                return 0L;
            }
            int i4 = f27277 + 111;
            f27279 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 91 / 0;
            }
            return 2000L;
        }
        int i6 = f27277 + 21;
        f27279 = i6 % 128;
        if (i6 % 2 != 0) {
            return 2000L;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ */
    private synchronized List<C11878cp> m28607() {
        List<C11878cp> list;
        int i = 2 % 2;
        int i2 = f27277 + 83;
        int i3 = i2 % 128;
        f27279 = i3;
        if (i2 % 2 == 0) {
            list = this.f27294;
            int i4 = 29 / 0;
        } else {
            list = this.f27294;
        }
        int i5 = i3 + 59;
        f27277 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﻏ */
    private synchronized List<AbstractC11980gj> m28614() {
        List<AbstractC11980gj> list;
        int i = 2 % 2;
        int i2 = f27277 + 35;
        int i3 = i2 % 128;
        f27279 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        list = this.f27293;
        int i4 = i3 + 93;
        f27277 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﱡ */
    private synchronized Map<String, JSONObject> m28609() {
        Map<String, JSONObject> map;
        int i = 2 % 2;
        int i2 = f27279 + 47;
        f27277 = i2 % 128;
        if (i2 % 2 != 0) {
            map = this.f27292;
            int i3 = 17 / 0;
        } else {
            map = this.f27292;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﺙ */
    private synchronized Map<String, String> m28611() {
        Map<String, String> map;
        int i = 2 % 2;
        int i2 = f27279;
        int i3 = i2 + 59;
        f27277 = i3 % 128;
        int i4 = i3 % 2;
        map = this.f27295;
        int i5 = i2 + 81;
        f27277 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﮐ */
    private List<C11878cp> m28605() {
        int i = 2 % 2;
        int i2 = f27277 + 9;
        f27279 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (this.f27294 == null) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList(this.f27294);
            int i3 = f27277 + 87;
            f27279 = i3 % 128;
            if (i3 % 2 != 0) {
                return arrayList;
            }
            super.hashCode();
            throw null;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private void m28651(String str, AbstractC11840be abstractC11840be) {
        int i = 2 % 2;
        int i2 = f27277 + 3;
        f27279 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (abstractC11840be != null) {
            m28609().put(str, m28619(abstractC11840be.m28834()));
        }
        int i3 = f27277 + 35;
        f27279 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static JSONObject m28619(String str) {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C12035ik.f29365, str);
            int i2 = f27279 + 15;
            f27277 = i2 % 128;
            int i3 = i2 % 2;
        } catch (JSONException e) {
            C12085l.m30922(m28616(new int[]{-743362187, -855579378, 296289115, 1422676582, 1258510841, -1493404968, 783211270, -1415686626}, TextUtils.lastIndexOf("", '0', 0, 0) + 17).intern(), m28616(new int[]{1715185050, -1376270443, 163608994, -1385366754, 890577456, 1463768030, 2129168782, -845544352, -1036764761, -519755590, -438690400, 2067116869, 1462330912, 1311357789, 1109185785, 896795414, 1072498516, -1362437208, 902045757, 180712424}, 38 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), e);
        }
        int i4 = f27277 + 7;
        f27279 = i4 % 128;
        if (i4 % 2 != 0) {
            return jSONObject;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static JSONObject m28632(Map<String, JSONObject> map) throws JSONException {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str : new HashSet(map.keySet())) {
            int i2 = f27277 + 45;
            f27279 = i2 % 128;
            int i3 = i2 % 2;
            jSONObject2.put(str.toLowerCase(), map.get(str));
        }
        jSONObject.put(m28616(new int[]{-1235226365, 2020325568}, (ViewConfiguration.getTapTimeout() >> 16) + 4).intern(), jSONObject2);
        int i4 = f27279 + 7;
        f27277 = i4 % 128;
        int i5 = i4 % 2;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final void m28669(String str) {
        int i = 2 % 2;
        m28664(str, new ArrayList());
        int i2 = f27277 + 87;
        f27279 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 55 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public final void m28664(String str, List<Object> list) {
        int i = 2 % 2;
        int i2 = f27279 + 9;
        f27277 = i2 % 128;
        if (i2 % 2 == 0) {
            Iterator<C11878cp> it = m28605().iterator();
            while (it.hasNext()) {
                int i3 = f27279 + 79;
                f27277 = i3 % 128;
                if (i3 % 2 != 0) {
                    it.next().m29744(str, list);
                    int i4 = 3 / 0;
                } else {
                    it.next().m29744(str, list);
                }
            }
            int i5 = f27279 + 41;
            f27277 = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        m28605().iterator();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final synchronized ISAdQualityInitListener m28663() {
        ISAdQualityInitListener iSAdQualityInitListener;
        int i = 2 % 2;
        int i2 = f27277 + 99;
        f27279 = i2 % 128;
        if (i2 % 2 == 0) {
            iSAdQualityInitListener = this.f27283;
            int i3 = 5 / 0;
        } else {
            iSAdQualityInitListener = this.f27283;
        }
        return iSAdQualityInitListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        if (r5.f27287.m28716() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.p286i.C11831aw.f27277 + 89;
        com.ironsource.adqualitysdk.sdk.p286i.C11831aw.f27279 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if ((r1 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        r0 = m28663();
        r1 = com.ironsource.adqualitysdk.sdk.ISAdQualityInitError.CONNECTOR_LOAD_TIMEOUT;
        r2 = m28640("\ue976勍ᲀꙴ촦奵\ue9dc夶\uf8c0䛜稡䏚\uf8c0䛜塞\u0eff瓳뗗ᷖ⭹ꃌ듮訿ﰨ\u05f8覩ﳑ躞灭崡윚牁ⓩ쵙糁묓씏⤚ᲀꙴ騼帪\udd68俣㈠漣᭱톉ւ㑂\uec89웈㑫ﮈ", android.view.View.getDefaultSize(1, 0) * 114).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        r0.adQualitySdkInitFailed(r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        r0 = m28663();
        r1 = com.ironsource.adqualitysdk.sdk.ISAdQualityInitError.CONNECTOR_LOAD_TIMEOUT;
        r2 = m28640("\ue976勍ᲀꙴ촦奵\ue9dc夶\uf8c0䛜稡䏚\uf8c0䛜塞\u0eff瓳뗗ᷖ⭹ꃌ듮訿ﰨ\u05f8覩ﳑ躞灭崡윚牁ⓩ쵙糁묓씏⤚ᲀꙴ騼帪\udd68俣㈠漣᭱톉ւ㑂\uec89웈㑫ﮈ", android.view.View.getDefaultSize(0, 0) + 53).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        m28663().adQualitySdkInitSuccess();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r5.f27287.m28716() == false) goto L15;
     */
    /* JADX INFO: renamed from: ﮉ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void m28604() {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C11831aw.f27277     // Catch: java.lang.Throwable -> L6e
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11831aw.f27279 = r2     // Catch: java.lang.Throwable -> L6e
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1e
            com.ironsource.adqualitysdk.sdk.i.az r1 = r5.f27287     // Catch: java.lang.Throwable -> L6e
            boolean r1 = r1.m28716()     // Catch: java.lang.Throwable -> L6e
            r3 = 47
            int r3 = r3 / r2
            if (r1 != 0) goto L65
            goto L26
        L1c:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L6e
        L1e:
            com.ironsource.adqualitysdk.sdk.i.az r1 = r5.f27287     // Catch: java.lang.Throwable -> L6e
            boolean r1 = r1.m28716()     // Catch: java.lang.Throwable -> L6e
            if (r1 != 0) goto L65
        L26:
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C11831aw.f27277     // Catch: java.lang.Throwable -> L6e
            int r1 = r1 + 89
            int r3 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11831aw.f27279 = r3     // Catch: java.lang.Throwable -> L6e
            int r1 = r1 % r0
            if (r1 != 0) goto L4c
            com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener r0 = r5.m28663()     // Catch: java.lang.Throwable -> L6e
            com.ironsource.adqualitysdk.sdk.ISAdQualityInitError r1 = com.ironsource.adqualitysdk.sdk.ISAdQualityInitError.CONNECTOR_LOAD_TIMEOUT     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = "\ue976勍ᲀꙴ촦奵\ue9dc夶\uf8c0䛜稡䏚\uf8c0䛜塞\u0eff瓳뗗ᷖ⭹ꃌ듮訿ﰨ\u05f8覩ﳑ躞灭崡윚牁ⓩ쵙糁묓씏⤚ᲀꙴ騼帪\udd68俣㈠漣᭱톉ւ㑂\uec89웈㑫ﮈ"
            r4 = 1
            int r2 = android.view.View.getDefaultSize(r4, r2)     // Catch: java.lang.Throwable -> L6e
            int r2 = r2 * 114
            java.lang.String r2 = m28640(r3, r2)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = r2.intern()     // Catch: java.lang.Throwable -> L6e
        L48:
            r0.adQualitySdkInitFailed(r1, r2)     // Catch: java.lang.Throwable -> L6e
            goto L63
        L4c:
            com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener r0 = r5.m28663()     // Catch: java.lang.Throwable -> L6e
            com.ironsource.adqualitysdk.sdk.ISAdQualityInitError r1 = com.ironsource.adqualitysdk.sdk.ISAdQualityInitError.CONNECTOR_LOAD_TIMEOUT     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = "\ue976勍ᲀꙴ촦奵\ue9dc夶\uf8c0䛜稡䏚\uf8c0䛜塞\u0eff瓳뗗ᷖ⭹ꃌ듮訿ﰨ\u05f8覩ﳑ躞灭崡윚牁ⓩ쵙糁묓씏⤚ᲀꙴ騼帪\udd68俣㈠漣᭱톉ւ㑂\uec89웈㑫ﮈ"
            int r2 = android.view.View.getDefaultSize(r2, r2)     // Catch: java.lang.Throwable -> L6e
            int r2 = r2 + 53
            java.lang.String r2 = m28640(r3, r2)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = r2.intern()     // Catch: java.lang.Throwable -> L6e
            goto L48
        L63:
            monitor-exit(r5)
            return
        L65:
            com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener r0 = r5.m28663()     // Catch: java.lang.Throwable -> L6e
            r0.adQualitySdkInitSuccess()     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r5)
            return
        L6e:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C11831aw.m28604():void");
    }

    /* JADX INFO: renamed from: ﭴ */
    private synchronized boolean m28603() {
        boolean zMo28474;
        int i = 2 % 2;
        int i2 = f27279 + 87;
        f27277 = i2 % 128;
        int i3 = i2 % 2;
        zMo28474 = AbstractC11823ao.m28472().mo28474();
        int i4 = f27277 + 33;
        f27279 = i4 % 128;
        int i5 = i4 % 2;
        return zMo28474;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a A[Catch: all -> 0x0047, TryCatch #1 {, blocks: (B:4:0x0002, B:6:0x0010, B:15:0x002a, B:17:0x0030, B:25:0x0042, B:12:0x001f, B:13:0x0020, B:21:0x003e, B:8:0x001a), top: B:35:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0030 A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0002, B:6:0x0010, B:15:0x002a, B:17:0x0030, B:25:0x0042, B:12:0x001f, B:13:0x0020, B:21:0x003e, B:8:0x001a), top: B:35:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0043 A[DONT_GENERATE] */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x0043, please report this as an issue */
    /* JADX INFO: renamed from: ﭖ */
    private synchronized boolean m28602() {
        int i;
        int i2 = 2 % 2;
        int i3 = f27279 + 63;
        f27277 = i3 % 128;
        if (i3 % 2 == 0) {
            if (AbstractC11823ao.m28472().mo28475()) {
                if (m28603()) {
                    i = f27277 + 19;
                    f27279 = i % 128;
                    if (i % 2 == 0) {
                        return true;
                    }
                    int i4 = 13 / 0;
                    return true;
                }
            }
            return false;
        }
        int i5 = 58 / 0;
        if (AbstractC11823ao.m28472().mo28475()) {
            if (m28603()) {
                i = f27277 + 19;
                f27279 = i % 128;
                if (i % 2 == 0) {
                    return true;
                }
                int i6 = 13 / 0;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m28640(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f27276)) ^ ((c2 >>> 5) + f27280)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f27281) ^ ((c3 + i2) ^ ((c3 << 4) + f27282))));
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

    /* JADX INFO: renamed from: ﻐ */
    private static String m28616(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f27278.clone();
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
}

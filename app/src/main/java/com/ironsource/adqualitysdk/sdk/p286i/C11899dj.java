package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.dj */
/* JADX INFO: loaded from: classes6.dex */
public class C11899dj extends C11886cx implements InterfaceC11870ch {

    /* JADX INFO: renamed from: ﭖ */
    private static int f28568 = 0;

    /* JADX INFO: renamed from: ﮌ */
    private static int f28569 = 1;

    /* JADX INFO: renamed from: ﮐ */
    private static int f28570 = 0;

    /* JADX INFO: renamed from: ﱟ */
    private static long f28571 = 0;

    /* JADX INFO: renamed from: ﺙ */
    private static char f28572 = 11969;

    /* JADX INFO: renamed from: ﻏ */
    private static long f28573 = 1633399238806482778L;

    /* JADX INFO: renamed from: ﻐ */
    private String f28575;

    /* JADX INFO: renamed from: ﻛ */
    private String f28576;

    /* JADX INFO: renamed from: ｋ */
    private EnumC12009hl f28577;

    /* JADX INFO: renamed from: ﾇ */
    private String f28578;

    /* JADX INFO: renamed from: ﾒ */
    private final JSONObject f28579 = new JSONObject();

    /* JADX INFO: renamed from: ﱡ */
    private final List<String> f28574 = new ArrayList();

    /* JADX INFO: renamed from: ﾒ */
    private String m29987() {
        int i = 2 % 2;
        int i2 = f28568 + 3;
        int i3 = i2 % 128;
        f28569 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String str = this.f28575;
        int i4 = i3 + 53;
        f28568 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ */
    private void m29983(String str) {
        int i = 2 % 2;
        int i2 = f28569 + 3;
        int i3 = i2 % 128;
        f28568 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.f28575 = str;
        if (i4 != 0) {
            super.hashCode();
            throw null;
        }
        int i5 = i3 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f28569 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private EnumC12009hl m29975() {
        int i = 2 % 2;
        int i2 = f28568 + 1;
        int i3 = i2 % 128;
        f28569 = i3;
        int i4 = i2 % 2;
        EnumC12009hl enumC12009hl = this.f28577;
        int i5 = i3 + 115;
        f28568 = i5 % 128;
        if (i5 % 2 == 0) {
            return enumC12009hl;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private void m29982(EnumC12009hl enumC12009hl) {
        int i = 2 % 2;
        int i2 = f28569 + 35;
        int i3 = i2 % 128;
        f28568 = i3;
        int i4 = i2 % 2;
        this.f28577 = enumC12009hl;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 73;
        f28569 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 77 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private String m29980() {
        int i = 2 % 2;
        int i2 = f28568;
        int i3 = i2 + 69;
        f28569 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f28576;
        int i5 = i2 + 49;
        f28569 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ */
    private void m29985(String str) {
        int i = 2 % 2;
        int i2 = f28569;
        int i3 = i2 + 1;
        f28568 = i3 % 128;
        int i4 = i3 % 2;
        this.f28576 = str;
        int i5 = i2 + 105;
        f28568 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﻛ */
    private String m29977() {
        int i = 2 % 2;
        int i2 = f28569 + 23;
        f28568 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f28578;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private void m29988(String str) {
        int i = 2 % 2;
        int i2 = f28569;
        int i3 = i2 + 51;
        f28568 = i3 % 128;
        int i4 = i3 % 2;
        this.f28578 = str;
        int i5 = i2 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f28568 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    private List<String> m29984() {
        int i = 2 % 2;
        int i2 = f28569;
        int i3 = i2 + 103;
        f28568 = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.f28574;
        int i5 = i2 + 31;
        f28568 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private void m29976(String str) {
        int i = 2 % 2;
        if (!TextUtils.isEmpty(str) && !this.f28574.contains(str)) {
            int i2 = f28568 + 69;
            f28569 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f28574.add(str);
                int i3 = 31 / 0;
            } else {
                this.f28574.add(str);
            }
        }
        int i4 = f28569 + 15;
        f28568 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    private void m29986(List<String> list) {
        Iterator<String> it;
        int i = 2 % 2;
        int i2 = f28569 + 55;
        f28568 = i2 % 128;
        if (i2 % 2 != 0) {
            it = list.iterator();
            int i3 = 52 / 0;
        } else {
            it = list.iterator();
        }
        while (it.hasNext()) {
            m29976(it.next());
            int i4 = f28569 + 9;
            f28568 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX INFO: renamed from: ﮐ */
    private String m29967() {
        int i = 2 % 2;
        int i2 = f28569 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f28568 = i2 % 128;
        int i3 = i2 % 2;
        String strOptString = this.f28579.optString(C12035ik.f29403);
        int i4 = f28569 + 5;
        f28568 = i4 % 128;
        int i5 = i4 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﻛ */
    private void m29979(String str) {
        int i = 2 % 2;
        int i2 = f28569 + 81;
        f28568 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                this.f28579.put(C12035ik.f29403, str);
                int i3 = f28568 + 25;
                f28569 = i3 % 128;
                if (i3 % 2 != 0) {
                    return;
                }
                super.hashCode();
                throw null;
            }
            this.f28579.put(C12035ik.f29403, str);
            super.hashCode();
            throw null;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻏ */
    private String m29974() {
        String strOptString;
        int i = 2 % 2;
        int i2 = f28569 + 37;
        f28568 = i2 % 128;
        if (i2 % 2 != 0) {
            strOptString = this.f28579.optString(C12035ik.f29395);
            int i3 = 28 / 0;
        } else {
            strOptString = this.f28579.optString(C12035ik.f29395);
        }
        int i4 = f28568 + 23;
        f28569 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return strOptString;
    }

    /* JADX INFO: renamed from: ﱟ */
    private void m29970(String str) {
        int i = 2 % 2;
        int i2 = f28569 + 47;
        f28568 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f28579.put(C12035ik.f29395, str);
            int i4 = f28569 + 59;
            f28568 = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﺙ */
    private Object m29972() {
        String strOptString;
        int i = 2 % 2;
        int i2 = f28569 + 47;
        f28568 = i2 % 128;
        if (i2 % 2 != 0) {
            strOptString = this.f28579.optString(C12035ik.f29397);
            int i3 = 5 / 0;
        } else {
            strOptString = this.f28579.optString(C12035ik.f29397);
        }
        int i4 = f28569 + 97;
        f28568 = i4 % 128;
        if (i4 % 2 == 0) {
            return strOptString;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ */
    private void m29973(String str) {
        int i = 2 % 2;
        int i2 = f28569 + 91;
        f28568 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f28579.put(C12035ik.f29397, str);
                int i3 = f28569 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                f28568 = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            this.f28579.put(C12035ik.f29397, str);
            throw null;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱟ */
    private String m29969() {
        int i = 2 % 2;
        int i2 = f28568 + 69;
        f28569 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObject = this.f28579;
        if (i3 != 0) {
            return jSONObject.optString(C12035ik.f29392);
        }
        int i4 = 30 / 0;
        return jSONObject.optString(C12035ik.f29392);
    }

    /* JADX INFO: renamed from: ﮐ */
    private void m29968(String str) {
        int i = 2 % 2;
        int i2 = f28568 + 99;
        f28569 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f28579.put(C12035ik.f29392, str);
            int i4 = f28568 + 75;
            f28569 = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱡ */
    private JSONObject m29971() {
        int i = 2 % 2;
        int i2 = f28569 + 111;
        int i3 = i2 % 128;
        f28568 = i3;
        int i4 = i2 % 2;
        JSONObject jSONObject = this.f28579;
        int i5 = i3 + 85;
        f28569 = i5 % 128;
        int i6 = i5 % 2;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﭴ */
    private Object m29966() {
        int i = 2 % 2;
        int i2 = f28568 + 83;
        f28569 = i2 % 128;
        if (i2 % 2 == 0) {
            TextUtils.isEmpty(this.f28575);
            throw null;
        }
        boolean z = true;
        if (TextUtils.isEmpty(this.f28575) && !(!TextUtils.isEmpty(this.f28576)) && TextUtils.isEmpty(this.f28578)) {
            int i3 = f28568 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            f28569 = i3 % 128;
            int i4 = i3 % 2;
            if (this.f28574.size() <= 0) {
                int i5 = f28568 + 111;
                f28569 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 3 / 3;
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ﭖ */
    private JSONObject m29965() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f28575 != null) {
                int i2 = f28569 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f28568 = i2 % 128;
                int i3 = i2 % 2;
                if (this.f28577 != null) {
                    jSONObject.putOpt(C12035ik.f29403, this.f28575);
                    jSONObject.putOpt(C12035ik.f29402, Integer.valueOf(this.f28577.m30273()));
                    int i4 = f28569 + 5;
                    f28568 = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            jSONObject.putOpt(C12035ik.f29395, this.f28576);
            jSONObject.putOpt(C12035ik.f29397, this.f28578);
            if (this.f28574.size() > 0) {
                jSONObject.putOpt(C12035ik.f29392, new JSONArray((Collection) this.f28574));
            }
            if (this.f28579.length() > 0) {
                jSONObject.putOpt(C12035ik.f29404, this.f28579.toString());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0063  */
    /* JADX WARN: Code duplicated, block: B:57:0x0256  */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC11870ch
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo28830(String str, List<Object> list, InterfaceC11874cl interfaceC11874cl) {
        byte b;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -2118395364:
                if (!str.equals(m29978("쭕髴儵ᩏꊙ\ue5c3赐ཁ\uedf2벜ﯲ⇞\ue574\u0bfc摁", (char) (KeyEvent.keyCodeFromString("") + 24532), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getTapTimeout() >> 16) + 5706148, "ꑡ圑퐀ᑟ").intern())) {
                    b = -1;
                } else {
                    int i2 = f28569 + 97;
                    f28568 = i2 % 128;
                    if (i2 % 2 == 0) {
                        b = 0;
                    } else {
                        b = 1;
                    }
                }
                break;
            case -1836320845:
                if (!str.equals(m29981("녘넹ᘩ㤗\ud8a6虶겣⋾\u0c5f爵騘槫쯭뱖往⩌", (-1) - TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                    b = -1;
                } else {
                    int i3 = f28569 + 45;
                    f28568 = i3 % 128;
                    int i4 = i3 % 2;
                    b = 9;
                }
                break;
            case -1700761801:
                b = !str.equals(m29978("튐쪄複ꪗㄟ㹭웺龞偾諎", (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), "\u0000\u0000\u0000\u0000", ViewConfiguration.getScrollBarFadeDuration() >> 16, "\udbdf醠硝ᥥ").intern()) ? (byte) -1 : (byte) 4;
                break;
            case -1409157227:
                b = !str.equals(m29981("Ꝓꜵꘋ褴뗳\ueb33聬ัᩕ䪼\uf75d䔤\udde7\u0c74㋅ڃ鼙", TextUtils.getTrimmedLength("")).intern()) ? (byte) -1 : (byte) 8;
                break;
            case -1296571754:
                b = !str.equals(m29981("㠱㡂\ud98b\uf6b4倣\u0ee3螡৩蔰㔧ኞ䋳䊴珓휋Ťf빬顽쿌췴", ViewConfiguration.getTapTimeout() >> 16).intern()) ? (byte) -1 : (byte) 16;
                break;
            case -1247838300:
                b = !str.equals(m29978("♷й⡶\u1fb5곃ᬆ㿙\ue23e\u1879燂⏑庚\uddbf⨦唡⤚憉㮻ꢖ앣䇉ᩦ䉑", (char) (ViewConfiguration.getWindowTouchSlop() >> 8), "\u0000\u0000\u0000\u0000", (-976515209) - View.MeasureSpec.getMode(0), "眕쮏翅ො").intern()) ? (byte) -1 : (byte) 19;
                break;
            case -1207642840:
                if (!str.equals(m29978("蛗뉨ˮ№ﱼ滆摠ﾵ㽗\udae6鯨麸֥\ud96a䋎", (char) (31560 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", Gravity.getAbsoluteGravity(0, 0) - 264333834, "\uf691㺕䣰浻").intern())) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -1091371232:
                b = !str.equals(m29978("\u0a64ഊౖ慂靝ﻣ趻뉳灹\uf83d믈圻拁", (char) (1856 - KeyEvent.getDeadChar(0, 0)), "\u0000\u0000\u0000\u0000", TextUtils.lastIndexOf("", '0', 0) - 1143484598, "䤯ퟏ䂻봇").intern()) ? (byte) -1 : (byte) 10;
                break;
            case -869156349:
                b = str.equals(m29978("\ue20f㖍ᛋ蘾栅ꭥ", (char) (23307 - TextUtils.indexOf("", "", 0, 0)), "\u0000\u0000\u0000\u0000", MotionEvent.axisFromString("") + 1, "囼綈௯쉛").intern()) ? Ascii.NAK : (byte) -1;
                break;
            case -772930430:
                b = !str.equals(m29978("覘釅齷醀\udd3d\udaf8幂ဟ轐讦甘䓒ᩆ맪鈤廌섭৫㳬", (char) (14315 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", 1512279859 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "㍚⎏\uea5a㼷").intern()) ? (byte) -1 : (byte) 3;
                break;
            case -407028174:
                b = !str.equals(m29981("강걲挹䰆⽤熤踵\u007fᄘ辈淌䭜횷쥿ꡳ࣎鑘ә\ue72b왜", ViewConfiguration.getEdgeSlop() >> 16).intern()) ? (byte) -1 : (byte) 13;
                break;
            case -356418934:
                if (!str.equals(m29978("／Ⴆ䬱ヹ簠\ue93dᜲ\u13ff囃⧝Ꚗ祆聸䨥⚕嬢\u1718", (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 34464), "\u0000\u0000\u0000\u0000", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 743557178, "㨳凈ꀬᲆ").intern())) {
                    b = -1;
                } else {
                    int i5 = f28569 + 23;
                    f28568 = i5 % 128;
                    if (i5 % 2 == 0) {
                        b = Ascii.f22499SI;
                    } else {
                        b = Ascii.f22503VT;
                    }
                }
                break;
            case -140869031:
                b = !str.equals(m29978("*鑭ᐢᴲ컛汋併ᣗ诎ꚧ㝻\u1a1c殫磊봏ӿ䭅㽮", (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 28414), "\u0000\u0000\u0000\u0000", KeyEvent.normalizeMetaState(0), "\u0557枟ﵐ衮").intern()) ? (byte) -1 : (byte) 17;
                break;
            case 205499235:
                b = !str.equals(m29978("듶泐\uf5e4ꦨ眨䨇큲눚\ue5eb좊䧊ˁ\ue0c5䴷珱椽戆痷ﯔ犯탦", (char) View.getDefaultSize(0, 0), "\u0000\u0000\u0000\u0000", View.MeasureSpec.getMode(0) + 934747966, "㸩뜟昷噎").intern()) ? (byte) -1 : Ascii.f22492FF;
                break;
            case 236043435:
                b = !str.equals(m29978("ਤ皒㷊햁滅\ue383谦㡹纃ḵ", (char) View.MeasureSpec.getMode(0), "\u0000\u0000\u0000\u0000", TextUtils.getTrimmedLength(""), "䉾ᰥ鸃錀").intern()) ? (byte) -1 : (byte) 5;
                break;
            case 770797430:
                b = !str.equals(m29981("닼늛畉婶銱챱\ue10e潁\u0ff0駽퀈⑅졘\udf0aᖆ柺誶ኒ嫹꥓䜥凃顀", Color.green(0)).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 779164621:
                if (!str.equals(m29978("줳쿮\udd75遈왅罱Ꞟ\udeb1℅䍮ቋ遺ᵽ፣ﺛ봜슴瘊", (char) (39922 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", Drawable.resolveOpacity(0, 0), "ᕅӵ\uf22b궛").intern())) {
                    b = -1;
                } else {
                    int i6 = f28568 + 13;
                    f28569 = i6 % 128;
                    int i7 = i6 % 2;
                    b = Ascii.DC2;
                }
                break;
            case 1308044955:
                b = !str.equals(m29981("灦瀕嘴礋ꮥ\uf565\ued8f揇쵧몘\ue918⣝ૣﱬⲍ", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 7;
                break;
            case 1396624783:
                b = !str.equals(m29981("\ue337\ue350\uf078\udf47ꋩﰩڕ裝帶᳔\ue054쏇馲娠◁", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 6;
                break;
            case 1924460979:
                if (!str.equals(m29978("ڽ㔠뇂醉ⵋᄌ돳ꎠꈟ㬭瘻㔷뎁褣᭣\ue84eಽ", (char) (Gravity.getAbsoluteGravity(0, 0) + 8106), "\u0000\u0000\u0000\u0000", Color.alpha(0) - 1442954719, "ℼ﹂ꪩ謟").intern())) {
                    b = -1;
                } else {
                    int i8 = f28568 + 61;
                    f28569 = i8 % 128;
                    int i9 = i8 % 2;
                    b = Ascii.DC4;
                }
                break;
            case 1964255575:
                if (!str.equals(m29978("㑌\ud8e3\uefd7潠3虠邲瀱햚筴₧掻뮧櫝\uefeaᴞ庭䜵в\u197aᶒ", (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), "\u0000\u0000\u0000\u0000", 1038918539 - TextUtils.getTrimmedLength(""), "诏\ueca3鬽瀟").intern())) {
                    b = -1;
                } else {
                    b = Ascii.f22503VT;
                }
                break;
            case 2056496294:
                b = !str.equals(m29981("ݘܫ翂僽뇋\uef0b縷\uf07d멕鍳\uf363뭞緺햄㛜\uf8cc㼕ᠢ禄㙞", ViewConfiguration.getDoubleTapTimeout() >> 16).intern()) ? (byte) -1 : Ascii.f22500SO;
                break;
            default:
                b = -1;
                break;
        }
        Object obj = null;
        switch (b) {
            case 0:
                return m29987();
            case 1:
                m29983((String) m29851(list, 0, String.class));
                return null;
            case 2:
                if (m29975() == null) {
                    return null;
                }
                int i10 = f28568 + 17;
                f28569 = i10 % 128;
                if (i10 % 2 != 0) {
                    return Integer.valueOf(m29975().m30273());
                }
                Integer.valueOf(m29975().m30273());
                super.hashCode();
                throw null;
            case 3:
                m29982(EnumC12009hl.m30272(((Integer) m29851(list, 0, Integer.class)).intValue()));
                return null;
            case 4:
                return m29980();
            case 5:
                m29985((String) m29851(list, 0, String.class));
                return null;
            case 6:
                return m29977();
            case 7:
                m29988((String) m29851(list, 0, String.class));
                return null;
            case 8:
                return m29984();
            case 9:
                m29976((String) m29851(list, 0, String.class));
                return null;
            case 10:
                m29986((List<String>) m29851(list, 0, List.class));
                return null;
            case 11:
                return m29967();
            case 12:
                m29979((String) m29851(list, 0, String.class));
                return null;
            case 13:
                return m29974();
            case 14:
                m29970((String) m29851(list, 0, String.class));
                return null;
            case 15:
                return m29972();
            case 16:
                m29973((String) m29851(list, 0, String.class));
                return null;
            case 17:
                return m29969();
            case 18:
                m29968((String) m29851(list, 0, String.class));
                return null;
            case 19:
                return m29971();
            case 20:
                return m29966();
            case 21:
                return m29965();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m29978(String str, char c, String str2, int i, String str3) {
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
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            C12051j.f29511 = 0;
            while (C12051j.f29511 < length) {
                int i2 = (C12051j.f29511 + 2) % 4;
                int i3 = (C12051j.f29511 + 3) % 4;
                C12051j.f29509 = (char) (((cArr4[C12051j.f29511 % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = C12051j.f29509;
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f28571) ^ ((long) f28570)) ^ ((long) f28572));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m29981(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f28573, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f28573));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}

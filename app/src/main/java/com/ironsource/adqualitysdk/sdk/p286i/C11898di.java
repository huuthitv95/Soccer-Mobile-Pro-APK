package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.di */
/* JADX INFO: loaded from: classes6.dex */
public class C11898di extends C11886cx implements InterfaceC11870ch {

    /* JADX INFO: renamed from: ﭸ */
    private static int f28555 = 0;

    /* JADX INFO: renamed from: ﮉ */
    private static char f28556 = 25955;

    /* JADX INFO: renamed from: ﮌ */
    private static int f28557 = 1;

    /* JADX INFO: renamed from: ﮐ */
    private static char f28558 = 35906;

    /* JADX INFO: renamed from: ﱟ */
    private static char f28559 = 57167;

    /* JADX INFO: renamed from: ﱡ */
    private static long f28560 = -3518346327825943527L;

    /* JADX INFO: renamed from: ﻏ */
    private static char f28561 = 18531;

    /* JADX INFO: renamed from: ﻐ */
    private boolean f28563;

    /* JADX INFO: renamed from: ｋ */
    private String f28565;

    /* JADX INFO: renamed from: ﾇ */
    private String f28566;

    /* JADX INFO: renamed from: ﻛ */
    private String f28564 = "";

    /* JADX INFO: renamed from: ﾒ */
    private double f28567 = -1.0d;

    /* JADX INFO: renamed from: ﺙ */
    private boolean f28562 = false;

    /* JADX INFO: renamed from: ｋ */
    public final void m29962(String str) {
        int i = 2 % 2;
        int i2 = f28555;
        int i3 = i2 + 23;
        f28557 = i3 % 128;
        int i4 = i3 % 2;
        this.f28565 = str;
        int i5 = i2 + 89;
        f28557 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﾒ */
    private String m29958() {
        int i = 2 % 2;
        int i2 = f28555 + 93;
        f28557 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f28565;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private void m29955(String str) {
        int i = 2 % 2;
        int i2 = f28557 + 29;
        int i3 = i2 % 128;
        f28555 = i3;
        int i4 = i2 % 2;
        this.f28564 = str;
        int i5 = i3 + 91;
        f28557 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private String m29954() {
        int i = 2 % 2;
        int i2 = f28555 + 77;
        f28557 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f28564;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m29961(Double d) {
        int i = 2 % 2;
        int i2 = f28555 + 81;
        f28557 = i2 % 128;
        int i3 = i2 % 2;
        this.f28567 = d.doubleValue();
        int i4 = f28555 + 99;
        f28557 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private Double m29956() {
        int i = 2 % 2;
        int i2 = f28557 + 87;
        f28555 = i2 % 128;
        int i3 = i2 % 2;
        Double dValueOf = Double.valueOf(this.f28567);
        int i4 = f28555 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f28557 = i4 % 128;
        if (i4 % 2 != 0) {
            return dValueOf;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private void m29959(boolean z) {
        int i = 2 % 2;
        int i2 = f28555;
        int i3 = i2 + 11;
        f28557 = i3 % 128;
        int i4 = i3 % 2;
        this.f28563 = z;
        int i5 = i2 + 3;
        f28557 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final void m29960(boolean z) {
        int i = 2 % 2;
        int i2 = f28555 + 13;
        f28557 = i2 % 128;
        int i3 = i2 % 2;
        this.f28562 = z;
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private boolean m29953() {
        int i = 2 % 2;
        int i2 = f28555 + 59;
        int i3 = i2 % 128;
        f28557 = i3;
        int i4 = i2 % 2;
        boolean z = this.f28562;
        int i5 = i3 + 85;
        f28555 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ﻏ */
    private boolean m29951() {
        int i = 2 % 2;
        int i2 = f28555;
        int i3 = i2 + 93;
        f28557 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.f28563;
        int i5 = i2 + 1;
        f28557 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final void m29964(String str) {
        int i = 2 % 2;
        int i2 = f28557 + 29;
        int i3 = i2 % 128;
        f28555 = i3;
        int i4 = i2 % 2;
        this.f28566 = str;
        int i5 = i3 + 69;
        f28557 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﱡ */
    private String m29950() {
        int i = 2 % 2;
        int i2 = f28555 + 57;
        f28557 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f28566;
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﱟ */
    private String m29949() {
        String strIntern;
        int i = 2 % 2;
        int i2 = f28557 + 59;
        f28555 = i2 % 128;
        int i3 = i2 % 2;
        if (!m29951()) {
            strIntern = m29957("嗽喟飧\uec9f뜄彘哿藼ꢐࣚ", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern();
        } else {
            int i4 = f28555 + 15;
            f28557 = i4 % 128;
            int i5 = i4 % 2;
            strIntern = m29957("蹒踴䑉〥铁粟⌺幅琻Ⱕ缝受\u2eff⒪", 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m29952("ꗜ㇜镣䧒뜎ꆨ뼭ȕ\ud808耫", TextUtils.getOffsetAfter("", 0) + 10).intern());
        sb.append(this.f28564);
        sb.append(m29957("\ue57a\ue554伥ꘖ\uf35a", 1 - KeyEvent.normalizeMetaState(0)).intern());
        sb.append(strIntern);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ﾇ */
    public final JSONObject m29963() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(C12035ik.f29410, this.f28565);
            if (this.f28567 > -1.0d) {
                int i2 = f28557 + 39;
                f28555 = i2 % 128;
                int i3 = i2 % 2;
                jSONObject2.put(C12035ik.f29364, this.f28567);
            }
            jSONObject2.put(C12035ik.f29360, this.f28566);
        } catch (JSONException unused) {
        }
        try {
            if (jSONObject2.length() > 0) {
                int i4 = f28555 + 61;
                f28557 = i4 % 128;
                int i5 = i4 % 2;
                if (this.f28562) {
                    jSONObject2.put(C12035ik.f29363, true);
                }
                jSONObject.put(C12035ik.f29361, jSONObject2);
            }
            int i6 = f28555 + 45;
            f28557 = i6 % 128;
            int i7 = i6 % 2;
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0141  */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC11870ch
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo28830(String str, List<Object> list, InterfaceC11874cl interfaceC11874cl) {
        byte b = 2;
        int i = 2 % 2;
        int i2 = f28557 + 3;
        f28555 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            str.hashCode();
            super.hashCode();
            throw null;
        }
        switch (str.hashCode()) {
            case -2010356102:
                b = !str.equals(m29957("\uef61\uef06᭔漨恡蠧涃㽷⬺\ud896ㆊᵁ俊箨\ue8e8쳭鸈訛㥚ﲓ꺅\udacf䧂갼ﻰ", -TextUtils.indexOf((CharSequence) "", '0', 0)).intern()) ? (byte) -1 : Ascii.f22492FF;
                break;
            case -1679773410:
                if (!str.equals(m29957("蓁蒲⠽屁⡿쀹苨哉ᡝ邊\udef3\uf239⑤䣅ꃫ⎔\uf5a4률", 1 - Drawable.resolveOpacity(0, 0)).intern())) {
                    b = -1;
                } else {
                    int i3 = f28557 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                    f28555 = i3 % 128;
                    b = i3 % 2 == 0 ? (byte) 8 : (byte) 42;
                }
                break;
            case -1457409854:
                b = !str.equals(m29952("\ueac5놳䴎瘊ꅚℹ⌶Ẁ自\ude1f晇ꊴ瀣㳺ꗜ㇜", (ViewConfiguration.getWindowTouchSlop() >> 8) + 16).intern()) ? (byte) -1 : (byte) 1;
                break;
            case -1033133001:
                b = !str.equals(m29957("귧궔祉വ復럯\uf70f緧䤚\ue75aꬅ蟜ൊᦺ휦噳", 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -869156349:
                b = !str.equals(m29957("䎈䏼\uf011葧\uf3a5ᯝ垳鎃쁴\u0b8b", TextUtils.indexOf("", "") + 1).intern()) ? (byte) -1 : Ascii.f22490CR;
                break;
            case -303276684:
                if (!str.equals(m29952("\ueac5놳\ue954ᎃ矺빰酹彦藇䥘浗폞䮌⛋쮍➪蛁ꬦ瀣㳺ꗜ㇜", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22).intern())) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 91962794:
                if (!str.equals(m29957("Ꙥꘃ䄼㕀ꂚ䣜貴癬煜ᡯ킯ﱥہ⇄⠎ⷈ휁큡", View.MeasureSpec.getMode(0) + 1).intern())) {
                    b = -1;
                } else {
                    int i4 = f28557 + 89;
                    f28555 = i4 % 128;
                    int i5 = i4 % 2;
                    b = 9;
                }
                break;
            case 701278346:
                if (!str.equals(m29952("ᄮ桷텻\udb4e鹪⫝觚⽶ᔻ며ㅠ\udaae\uf7ec㈃ꣻ낒极톏", 17 - TextUtils.getOffsetBefore("", 0)).intern())) {
                    b = -1;
                } else {
                    int i6 = f28555 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                    f28557 = i6 % 128;
                    int i7 = i6 % 2;
                    b = 6;
                }
                break;
            case 1006114614:
                b = !str.equals(m29952("ᄮ桷䴎瘊ꅚℹ⌶Ẁ自\ude1f晇ꊴ瀣㳺ꗜ㇜", 17 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 0;
                break;
            case 1009851624:
                if (!str.equals(m29957("횞훭ⅰ唌\udb68㌮쐕ڟᄕ掗頓득瘢䆈叶敎ꟗ뀽艁唋靼\ue0ce\uf2e4֩윇퍤", 1 - (Process.myPid() >> 22)).intern())) {
                    b = -1;
                } else {
                    int i8 = f28557 + 39;
                    f28555 = i8 % 128;
                    if (i8 % 2 != 0) {
                        b = 3;
                    }
                }
                break;
            case 1314266045:
                if (!str.equals(m29957("噒嘡ꄴ핈\uf787῁\ueda9虅酶佤놫鵷\uf6ee쇆缐", 1 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    b = -1;
                } else {
                    int i9 = f28555 + 55;
                    f28557 = i9 % 128;
                    int i10 = i9 % 2;
                    b = 10;
                }
                break;
            case 1402845873:
                if (!str.equals(m29957("⎘⏿㍼䜀\uebefΩ髺\uf38f̾匌웸\uea24茤厎捸", -TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern())) {
                    b = -1;
                } else {
                    int i11 = f28555 + 115;
                    f28557 = i11 % 128;
                    int i12 = i11 % 2;
                    b = Ascii.f22503VT;
                }
                break;
            case 1641431166:
                b = !str.equals(m29957("ƴǓ뺦쫚ᄞ菱킇톣軡ꧽ貅ꁆꄐ\ude48馇燤烽⿺䠮䆳䁀", 1 - View.getDefaultSize(0, 0)).intern()) ? (byte) -1 : (byte) 7;
                break;
            case 1712841667:
                if (!str.equals(m29957("㇅ㆢ䚛㋧㋁\uda87\uf15c\ue1c5盈訲굖膏酨♨멎倠", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i13 = f28555 + 79;
                    f28557 = i13 % 128;
                    int i14 = i13 % 2;
                    b = 5;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                m29962((String) m29851(list, 0, String.class));
                return null;
            case 1:
                return m29958();
            case 2:
                m29955((String) m29851(list, 0, String.class));
                return null;
            case 3:
                return m29954();
            case 4:
                m29961((Double) m29851(list, 0, Double.class));
                return null;
            case 5:
                return m29956();
            case 6:
                m29959(((Boolean) m29851(list, 0, Boolean.class)).booleanValue());
                return null;
            case 7:
                return Boolean.valueOf(m29951());
            case 8:
                m29964((String) m29851(list, 0, String.class));
                return null;
            case 9:
                return m29950();
            case 10:
                m29960(((Boolean) m29851(list, 0, Boolean.class)).booleanValue());
                return Boolean.valueOf(m29953());
            case 11:
                return Boolean.valueOf(m29953());
            case 12:
                return m29949();
            case 13:
                return m29963();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m29957(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f28560, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f28560));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29952(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f28561)) ^ ((c2 >>> 5) + f28556)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f28558) ^ ((c3 + i2) ^ ((c3 << 4) + f28559))));
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

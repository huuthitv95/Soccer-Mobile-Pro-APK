package com.ironsource.adqualitysdk.sdk.p286i;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.an */
/* JADX INFO: loaded from: classes6.dex */
public final class C11822an {

    /* JADX INFO: renamed from: ﻏ */
    private static int f27176 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static long f27177;

    /* JADX INFO: renamed from: ﾇ */
    private static int f27178;

    /* JADX INFO: renamed from: ﾒ */
    private String f27181 = m28465("豢谊\uee5f駡錑b糱杌匹뢗嶂䛋㉛\ud868㺔▨ᅫדּṰӑ\uf0a6ᩜｄ\ue3e8ퟃ㶢\ud823썪뛧岋맼ꉘ阃美髙脺畁鼺箨", ViewConfiguration.getTouchSlop() >> 8).intern();

    /* JADX INFO: renamed from: ｋ */
    private String f27180 = m28465("桦栎냸읆\ud931띹㛑큗뜽\ue630អ\uf1d0홙蛏璴銳\uf56fꖔ呐돊ᒢ䓻땤哳㏇挅鈃瑱勣Ȭ\uf3dcᕃ爇℩탹㘡酅솝ㆈ", ViewConfiguration.getKeyRepeatDelay() >> 16).intern();

    /* JADX INFO: renamed from: ﻛ */
    private String f27179 = m28465("ͷ̟ᨂ涼⫇麽씧煉\udc2c䳊\ue454\ud814뵆ⰵ蝂뭷鹾\u0f6eꞦ騎羳\uee01䚒紷壖짿懵嶵㧲꣖*㲇ᤖ诓⌏ῥ穀歧쉾", MotionEvent.axisFromString("") + 1).intern();

    /* JADX INFO: renamed from: ｋ */
    static void m28466() {
        f27177 = 6061967079652423626L;
    }

    public C11822an() {
        m28465("蹾踊᪃活\uf25a폲ᶯ듏儳䰓㲇锗ぅⲷ忕\uf62aጨྥ缴", ViewConfiguration.getScrollDefaultDelay() >> 16).intern();
    }

    static {
        m28466();
        m28465("㍣㍒ꗵ퉛ࡨ≢\ue7b9䕝\uec2f\uf344욻撓贎鎠ꗞ\u07fb깟낖蕈", 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern();
        int i = f27178 + 1;
        f27176 = i % 128;
        if (i % 2 == 0) {
            int i2 = 95 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public final String m28470(String str) {
        int i = 2 % 2;
        int i2 = f27176 + 37;
        f27178 = i2 % 128;
        if (i2 % 2 != 0) {
            m28464(this.f27181, str);
            throw null;
        }
        String strM28464 = m28464(this.f27181, str);
        int i3 = f27176 + 9;
        f27178 = i3 % 128;
        int i4 = i3 % 2;
        return strM28464;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final String m28471(String str) {
        int i = 2 % 2;
        int i2 = f27178 + 5;
        f27176 = i2 % 128;
        int i3 = i2 % 2;
        String strM28464 = m28464(this.f27180, str);
        int i4 = f27176 + 77;
        f27178 = i4 % 128;
        int i5 = i4 % 2;
        return strM28464;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m28464(String str, String str2) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            int i2 = f27176 + 85;
            f27178 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(m28465("\ud894\ud8bb冻찣ꂱ", KeyEvent.getMaxKeyCode() >> 16).intern());
        if (str2 == null) {
            int i4 = f27176 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f27178 = i4 % 128;
            int i5 = i4 % 2;
            str2 = "";
        }
        sb.append(str2);
        String string = sb.toString();
        int i6 = f27178 + 95;
        f27176 = i6 % 128;
        int i7 = i6 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final String m28468() {
        int i = 2 % 2;
        int i2 = f27178 + 103;
        f27176 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f27179;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final String m28469() {
        int i = 2 % 2;
        int i2 = f27176 + 63;
        f27178 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f27181;
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static String m28467() {
        int i = 2 % 2;
        int i2 = f27178 + 111;
        f27176 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m28465("蹾踊᪃活\uf25a폲ᶯ듏儳䰓㲇锗ぅⲷ忕\uf62aጨྥ缴", KeyEvent.normalizeMetaState(0)).intern();
        int i4 = f27176 + 97;
        f27178 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m28465(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f27177, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f27177));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}

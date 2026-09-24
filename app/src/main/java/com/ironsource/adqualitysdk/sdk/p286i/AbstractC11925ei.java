package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ei */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11925ei extends AbstractC11919ec {

    /* JADX INFO: renamed from: ﮐ */
    private static int f28795 = 0;

    /* JADX INFO: renamed from: ﱟ */
    private static int f28796 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static long f28797 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static char f28798 = 0;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28799 = -1702527468;

    /* JADX INFO: renamed from: ｋ */
    private AbstractC11919ec f28800;

    /* JADX INFO: renamed from: ﾇ */
    private AbstractC11919ec f28801;

    AbstractC11925ei(AbstractC11919ec abstractC11919ec, AbstractC11919ec abstractC11919ec2, C11904do c11904do) {
        super(c11904do);
        this.f28800 = abstractC11919ec;
        this.f28801 = abstractC11919ec2;
    }

    /* JADX INFO: renamed from: ﾇ */
    final AbstractC11919ec m30169() {
        int i = 2 % 2;
        int i2 = f28795;
        int i3 = i2 + 113;
        f28796 = i3 % 128;
        int i4 = i3 % 2;
        AbstractC11919ec abstractC11919ec = this.f28800;
        int i5 = i2 + 17;
        f28796 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
        return abstractC11919ec;
    }

    /* JADX INFO: renamed from: ｋ */
    final AbstractC11919ec m30168() {
        int i = 2 % 2;
        int i2 = f28796;
        int i3 = i2 + 81;
        f28795 = i3 % 128;
        int i4 = i3 % 2;
        AbstractC11919ec abstractC11919ec = this.f28801;
        int i5 = i2 + 105;
        f28795 = i5 % 128;
        int i6 = i5 % 2;
        return abstractC11919ec;
    }

    public String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m30169().toString());
        sb.append(m30167("ᆛ", (char) (View.MeasureSpec.getSize(0) + 64319), "\u0000\u0000\u0000\u0000", 985759036 - View.combineMeasuredStates(0, 0), "㱞셽㼺û").intern());
        sb.append(m30168().toString());
        sb.append(m30167("ꛇ", (char) (37598 - TextUtils.indexOf("", "", 0)), "\u0000\u0000\u0000\u0000", 262268550 - Color.green(0), "蘦ꇦ\ude0f힒").intern());
        String string = sb.toString();
        int i2 = f28795 + 47;
        f28796 = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f28795 + 83;
        f28796 = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC11925ei abstractC11925ei = (AbstractC11925ei) obj;
            AbstractC11919ec abstractC11919ec = this.f28800;
            if (abstractC11919ec == null ? abstractC11925ei.f28800 != null : !abstractC11919ec.equals(abstractC11925ei.f28800)) {
                return false;
            }
            AbstractC11919ec abstractC11919ec2 = this.f28801;
            if (abstractC11919ec2 != null) {
                int i4 = f28795 + 115;
                f28796 = i4 % 128;
                int i5 = i4 % 2;
                AbstractC11919ec abstractC11919ec3 = abstractC11925ei.f28801;
                if (i5 != 0) {
                    return abstractC11919ec2.equals(abstractC11919ec3);
                }
                abstractC11919ec2.equals(abstractC11919ec3);
                throw null;
            }
            if (abstractC11925ei.f28801 == null) {
                int i6 = f28796 + 7;
                f28795 = i6 % 128;
                return i6 % 2 == 0;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        AbstractC11919ec abstractC11919ec = this.f28800;
        int iHashCode = 0;
        int iHashCode2 = (abstractC11919ec != null ? abstractC11919ec.hashCode() : 0) * 31;
        AbstractC11919ec abstractC11919ec2 = this.f28801;
        if (abstractC11919ec2 != null) {
            int i2 = f28796 + 79;
            f28795 = i2 % 128;
            if (i2 % 2 != 0) {
                abstractC11919ec2.hashCode();
                Object obj = null;
                super.hashCode();
                throw null;
            }
            iHashCode = abstractC11919ec2.hashCode();
            int i3 = f28796 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f28795 = i3 % 128;
            int i4 = i3 % 2;
        }
        return iHashCode2 + iHashCode;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30167(String str, char c, String str2, int i, String str3) {
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
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f28797) ^ ((long) f28799)) ^ ((long) f28798));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}

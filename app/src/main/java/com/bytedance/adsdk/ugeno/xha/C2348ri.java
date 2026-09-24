package com.bytedance.adsdk.ugeno.xha;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.view.ViewCompat;
import com.ironsource.C11744X3;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.xha.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2348ri {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.xha.ri$ri */
    public static class ri {

        /* JADX INFO: renamed from: ik */
        public float[] f6102ik;

        /* JADX INFO: renamed from: lr */
        public int[] f6103lr;

        /* JADX INFO: renamed from: ri */
        public GradientDrawable.Orientation f6104ri;
    }

    /* JADX INFO: renamed from: ik */
    public static boolean m8049ik(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("linear-gradient");
    }

    /* JADX INFO: renamed from: ka */
    public static GradientDrawable.Orientation m8050ka(String str) {
        try {
            int i = str.contains("deg") ? Integer.parseInt(str.substring(0, str.length() - 3).trim()) : Integer.parseInt(str);
            if (i == 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i == 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i == 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            if (i == 135) {
                return GradientDrawable.Orientation.TL_BR;
            }
            return i == 45 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    /* JADX INFO: renamed from: lr */
    public static ri m8051lr(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String strSubstring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
            if (TextUtils.isEmpty(strSubstring)) {
                return null;
            }
            int iM8054ri = m8054ri(strSubstring, '%');
            int iIndexOf = strSubstring.indexOf(",");
            String strSubstring2 = strSubstring.substring(0, iIndexOf);
            ri riVar = new ri();
            riVar.f6104ri = m8050ka(strSubstring2);
            String strSubstring3 = strSubstring.substring(iIndexOf + 1);
            int[] iArr = new int[iM8054ri];
            float[] fArr = new float[iM8054ri];
            for (int i = 0; i < iM8054ri; i++) {
                int iIndexOf2 = strSubstring3.indexOf("%");
                String strTrim = strSubstring3.substring(0, iIndexOf2 + 1).trim();
                int iIndexOf3 = (strTrim.contains("rgba") ? strTrim.indexOf(")") : strTrim.indexOf(" ")) + 1;
                iArr[i] = m8053ri(strTrim.substring(0, iIndexOf3).trim());
                fArr[i] = C2343ik.m8029ri(strTrim.substring(iIndexOf3, strTrim.indexOf("%")).trim(), 0.0f) / 100.0f;
                int i2 = iIndexOf2 + 2;
                if (strSubstring3.length() <= i2) {
                    break;
                }
                strSubstring3 = strSubstring3.substring(i2);
            }
            if (iM8054ri < 2) {
                return null;
            }
            riVar.f6103lr = iArr;
            riVar.f6102ik = fArr;
            return riVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static int m8052ri(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            Log.e("ColorUtils", "alpha must be between 0 and 255. ");
            i2 = 255;
        }
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (i2 << 24);
    }

    /* JADX INFO: renamed from: ri */
    public static int m8053ri(String str) {
        return m8055ri(str, ViewCompat.MEASURED_STATE_MASK);
    }

    /* JADX INFO: renamed from: ri */
    public static int m8054ri(String str, char c) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == c) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ri */
    public static int m8055ri(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(C11744X3.i.f26348T)) {
                return 0;
            }
            if (str.charAt(0) == '#' && str.length() == 4) {
                StringBuilder sb = new StringBuilder("#");
                char[] charArray = str.toCharArray();
                for (int i2 = 1; i2 < charArray.length; i2++) {
                    sb.append(charArray[i2]);
                    sb.append(charArray[i2]);
                }
                return Color.parseColor(sb.toString());
            }
            if (str.charAt(0) == '#' && str.length() == 7) {
                return Color.parseColor(str);
            }
            if (str.charAt(0) == '#' && str.length() == 9) {
                return Color.parseColor(str);
            }
            if (!str.startsWith("rgba")) {
                return ViewCompat.MEASURED_STATE_MASK;
            }
            String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
            if (strArrSplit != null && strArrSplit.length == 4) {
                return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
            }
        }
        return i;
    }
}

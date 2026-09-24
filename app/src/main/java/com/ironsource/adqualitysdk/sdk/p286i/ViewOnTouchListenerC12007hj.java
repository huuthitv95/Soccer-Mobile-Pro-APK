package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hj */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnTouchListenerC12007hj extends C11996gz<View.OnTouchListener> implements View.OnTouchListener {

    /* JADX INFO: renamed from: ﻐ */
    private static int f29153 = 0;

    /* JADX INFO: renamed from: ｋ */
    private static int[] f29154 = {-1484236807, 1230230615, -305794368, 1791758804, -769143821, -2085340031, 641800463, 1554792012, -1914485927, 1296092190, -572444031, -7589614, -2099867665, 1416680051, 1286459264, -1719697477, 1508290889, -490764933};

    /* JADX INFO: renamed from: ﾇ */
    private static int f29155 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private a f29156;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hj$a */
    public interface a {
        /* JADX INFO: renamed from: ﻐ */
        boolean mo29841(ViewOnTouchListenerC12007hj viewOnTouchListenerC12007hj, View view, MotionEvent motionEvent);
    }

    public ViewOnTouchListenerC12007hj(View.OnTouchListener onTouchListener, a aVar) {
        super(onTouchListener);
        this.f29156 = aVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = f29153 + 101;
        f29155 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f29156.mo29841(this, view, motionEvent);
                throw null;
            }
            this.f29156.mo29841(this, view, motionEvent);
            if (mo28813() == null) {
                return false;
            }
            boolean zOnTouch = mo28813().onTouch(view, motionEvent);
            int i3 = f29155 + 29;
            f29153 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 84 / 0;
            }
            return zOnTouch;
        } catch (Throwable th) {
            C12080kb.m30845(m30263(new int[]{-1413534338, 1448909433, -331475539, 259375848, -97056014, -36385928, 1551817759, -616926813, 555937618, 542717898, 1316256678, -812483031}, 24 - Drawable.resolveOpacity(0, 0)).intern(), m30263(new int[]{-1475282663, -1604371918, 489634053, -2119385159, 61434530, 980607779, -1590212306, -1655959277, -2135273109, 629099889, 1314182130, -233446144, 2035075116, 57160292}, 27 - Process.getGidForName("")).intern(), th, false);
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30263(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f29154.clone();
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

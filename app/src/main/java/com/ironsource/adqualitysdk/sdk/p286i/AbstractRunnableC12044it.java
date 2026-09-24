package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media3.common.PlaybackException;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.it */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractRunnableC12044it implements Runnable {

    /* JADX INFO: renamed from: ﮐ */
    private static int f29421 = 0;

    /* JADX INFO: renamed from: ﺙ */
    private static int f29422 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static byte[] f29423 = {-92, -7, 10, 1, -13, 0, -7, 35, -19, -1, 5, Ascii.f22500SO, 17, -18, -91, -83, 0, Ascii.DC2, -11, 9, 67, -78, 5, 73, -82, 3, -3, 0, 45, -100, -75, 0, Ascii.DC2, -11, 41, -105, -98, -57, 7, 3, 8, -19, Ascii.f22499SI, 33};

    /* JADX INFO: renamed from: ﻛ */
    private static int f29424 = 106;

    /* JADX INFO: renamed from: ｋ */
    private static int f29425 = 542976338;

    /* JADX INFO: renamed from: ﾇ */
    private static int f29426 = 597852707;

    /* JADX INFO: renamed from: ﾒ */
    private static short[] f29427;

    /* JADX INFO: renamed from: ﻛ */
    public abstract void mo28224() throws Exception;

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = f29422 + 113;
        f29421 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                mo28224();
                int i3 = 57 / 0;
            } else {
                mo28224();
            }
            int i4 = f29421 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f29422 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 63 / 0;
            }
        } catch (Throwable th) {
            try {
                mo28672(th);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public void mo28672(Throwable th) {
        int i = 2 % 2;
        String strIntern = m30523((ViewConfiguration.getTouchSlop() >> 8) - 542976338, (short) (MotionEvent.axisFromString("") + 1), (-597852623) - ExpandableListView.getPackedPositionType(0L), (byte) TextUtils.getOffsetAfter("", 0), (-107) - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern();
        StringBuilder sb = new StringBuilder();
        sb.append(m30523((-542976325) - Process.getGidForName(""), (short) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 597852637, (byte) View.MeasureSpec.makeMeasureSpec(0, 0), (-107) - Color.red(0)).intern());
        sb.append(getClass().getName());
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m30523((ViewConfiguration.getKeyRepeatDelay() >> 16) - 542976309, (short) TextUtils.getOffsetAfter("", 0), (-597852640) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.indexOf("", "", 0) + PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED).intern());
        sb2.append(getClass().getName());
        sb2.append(m30523((ViewConfiguration.getTouchSlop() >> 8) - 542976303, (short) KeyEvent.normalizeMetaState(0), (-597852666) - TextUtils.indexOf("", ""), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-107) - View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
        C12080kb.m30843(strIntern, string, sb2.toString(), th);
        String strIntern2 = m30523((-542976338) - ExpandableListView.getPackedPositionType(0L), (short) (ViewConfiguration.getPressedStateDuration() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 597852624, (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (-107) - (Process.myPid() >> 22)).intern();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m30523((-542976323) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) ExpandableListView.getPackedPositionType(0L), View.MeasureSpec.getMode(0) - 597852638, (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-107) - TextUtils.getOffsetBefore("", 0)).intern());
        sb3.append(getClass().getName());
        C12085l.m30929(strIntern2, sb3.toString());
        C12085l.m30922(m30523(View.MeasureSpec.makeMeasureSpec(0, 0) - 542976338, (short) ((-1) - TextUtils.lastIndexOf("", '0', 0)), Process.getGidForName("") - 597852622, (byte) TextUtils.indexOf("", ""), (-107) - View.resolveSize(0, 0)).intern(), m30523((-542976301) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) (ViewConfiguration.getFadingEdgeLength() >> 16), (-597852640) - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), (-107) - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), th);
        int i2 = f29421 + 97;
        f29422 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30523(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f29424;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f29423;
                if (bArr != null) {
                    i5 = (byte) (bArr[f29425 + i] + i4);
                } else {
                    i5 = (short) (f29427[f29425 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f29425 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f29426);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f29423;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f29427;
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

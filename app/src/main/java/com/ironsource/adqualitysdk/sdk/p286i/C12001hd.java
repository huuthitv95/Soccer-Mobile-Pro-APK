package com.ironsource.adqualitysdk.sdk.p286i;

import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.exoplayer2.C9415C;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hd */
/* JADX INFO: loaded from: classes6.dex */
public final class C12001hd extends C11996gz<MediaPlayer.OnCompletionListener> implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: ﮐ */
    private static int f29124 = 1;

    /* JADX INFO: renamed from: ﱟ */
    private static int f29125 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static boolean f29126 = true;

    /* JADX INFO: renamed from: ｋ */
    private static char[] f29127 = {265, 296, 253, 297, 295, 298, 294, 287, 302, 291, 262, 301, 300, 254, 285, 283, 255, 218, 270, 284};

    /* JADX INFO: renamed from: ﾇ */
    private static boolean f29128 = true;

    /* JADX INFO: renamed from: ﾒ */
    private static int f29129 = 186;

    /* JADX INFO: renamed from: ﻐ */
    private e f29130;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hd$e */
    public interface e {
        /* JADX INFO: renamed from: ﻛ */
        void mo29845(C12001hd c12001hd, MediaPlayer mediaPlayer);
    }

    public C12001hd(MediaPlayer.OnCompletionListener onCompletionListener, e eVar) {
        super(onCompletionListener);
        this.f29130 = eVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        int i = 2 % 2;
        int i2 = f29125 + 53;
        f29124 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        try {
            this.f29130.mo29845(this, mediaPlayer);
            int i4 = f29124 + 81;
            f29125 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            C12080kb.m30845(m30256(null, TextUtils.lastIndexOf("", '0', 0, 0) + 128, null, "\u008d\u0084\u0089\u0090\u008d\u0084\u008f\u0088\u008e\u008d\u0088\u0082\u0088\u0089\u008c\u008a\u008b\u0082\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m30256(null, 126 - MotionEvent.axisFromString(""), null, "\u0082\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0084\u0092\u008d\u0088\u0082\u0088\u0089\u008c\u008a\u008b\u0094\u0093\u0085\u0092\u0082\u008a\u0092\u008d\u0084\u008d\u008d\u0091").intern(), th, false);
        }
        if (mo28813() != null) {
            int i6 = f29124 + 57;
            f29125 = i6 % 128;
            int i7 = i6 % 2;
            mo28813().onCompletion(mediaPlayer);
            if (i7 == 0) {
                return;
            }
            super.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30256(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f29127;
            int i2 = f29129;
            if (f29128) {
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
            if (f29126) {
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

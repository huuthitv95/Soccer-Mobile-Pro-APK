package com.ironsource.adqualitysdk.sdk.p286i;

import android.media.MediaPlayer;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.exoplayer2.C9415C;
import java.io.UnsupportedEncodingException;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hc */
/* JADX INFO: loaded from: classes6.dex */
public final class C12000hc extends C11996gz<MediaPlayer.OnPreparedListener> implements MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: ﮐ */
    private static int f29117 = 1;

    /* JADX INFO: renamed from: ﱟ */
    private static int f29118 = 0;

    /* JADX INFO: renamed from: ﻐ */
    private static char[] f29119 = {128, 159, 129, Typography.pound, 150, 161, 146, 149, AbstractJsonLexerKt.END_OBJ, 154, 164, 165, AbstractJsonLexerKt.UNICODE_ESC, 148, Typography.nbsp, 'v', 'Q', 158, 133, 147};

    /* JADX INFO: renamed from: ﻛ */
    private static boolean f29120 = true;

    /* JADX INFO: renamed from: ｋ */
    private static int f29121 = 49;

    /* JADX INFO: renamed from: ﾇ */
    private static boolean f29122 = true;

    /* JADX INFO: renamed from: ﾒ */
    private c f29123;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hc$c */
    public interface c {
        /* JADX INFO: renamed from: ﻛ */
        void mo29843(C12000hc c12000hc, MediaPlayer mediaPlayer);
    }

    public C12000hc(MediaPlayer.OnPreparedListener onPreparedListener, c cVar) {
        super(onPreparedListener);
        this.f29123 = cVar;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        int i = 2 % 2;
        int i2 = f29118 + 35;
        f29117 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                this.f29123.mo29843(this, mediaPlayer);
                throw null;
            }
            this.f29123.mo29843(this, mediaPlayer);
            if (mo28813() != null) {
                int i3 = f29117 + 71;
                f29118 = i3 % 128;
                int i4 = i3 % 2;
                mo28813().onPrepared(mediaPlayer);
            }
            int i5 = f29117 + 25;
            f29118 = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            super.hashCode();
            throw null;
        } catch (Throwable th) {
            C12080kb.m30845(m30255(null, (Process.myTid() >> 22) + 127, null, "\u0084\u008f\u008c\u0087\u0084\u008f\u008e\u0085\u008d\u0084\u0085\u0082\u0085\u008c\u008b\u008a\u0089\u0088\u0085\u0084\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m30255(null, TextUtils.indexOf("", "", 0) + 127, null, "\u0088\u0085\u0084\u0087\u0086\u0085\u0084\u0083\u0082\u008f\u0091\u0084\u0085\u0082\u0085\u008c\u008b\u008a\u0089\u0094\u0093\u0092\u0091\u0082\u008a\u0091\u0084\u008f\u0084\u0084\u0090").intern(), th, false);
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30255(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f29119;
            int i2 = f29121;
            if (f29120) {
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
            if (f29122) {
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

package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hg */
/* JADX INFO: loaded from: classes6.dex */
public final class C12004hg extends C11996gz<MediaPlayer.OnInfoListener> implements MediaPlayer.OnInfoListener {

    /* JADX INFO: renamed from: ﻐ */
    private static int f29136 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static int f29137 = 1;

    /* JADX INFO: renamed from: ﾇ */
    private static long f29138 = 6686965817223732588L;

    /* JADX INFO: renamed from: ﾒ */
    private d f29139;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hg$d */
    public interface d {
        /* JADX INFO: renamed from: ﻛ */
        boolean mo29842(C12004hg c12004hg, MediaPlayer mediaPlayer, int i, int i2);
    }

    public C12004hg(MediaPlayer.OnInfoListener onInfoListener, d dVar) {
        super(onInfoListener);
        this.f29139 = dVar;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = f29137 + 17;
        f29136 = i4 % 128;
        try {
            if (i4 % 2 != 0) {
                this.f29139.mo29842(this, mediaPlayer, i, i2);
                Object obj = null;
                super.hashCode();
                throw null;
            }
            this.f29139.mo29842(this, mediaPlayer, i, i2);
            if (mo28813() == null) {
                return false;
            }
            int i5 = f29137 + 77;
            f29136 = i5 % 128;
            int i6 = i5 % 2;
            return mo28813().onInfo(mediaPlayer, i, i2);
        } catch (Throwable th) {
            C12080kb.m30845(m30258("ꔵ핍ꕺࡏ㩪胻㞁꾫탣蘾મꈶ並᷵鰷ⱡ쑀\ueb43⇆嚚玖愎ꮀ샎\ue931ﳾ㵐", ViewConfiguration.getWindowTouchSlop() >> 8).intern(), m30258("眦즳督ᒭ읭緇쬚匱ˤ骏\uf78c庫鱦Ē愁탷ᙺ\uf7a6\udcf6ꨑꆃ緱嚐㱇㭶\ue000쁋럌땨噙믺", Color.blue(0)).intern(), th, false);
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30258(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f29138, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f29138));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}

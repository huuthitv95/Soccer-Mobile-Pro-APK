package com.ironsource.adqualitysdk.sdk.p286i;

import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hi */
/* JADX INFO: loaded from: classes6.dex */
public final class C12006hi extends C11996gz<MediaPlayer.OnSeekCompleteListener> implements MediaPlayer.OnSeekCompleteListener {

    /* JADX INFO: renamed from: ﮐ */
    private static int f29146 = 1;

    /* JADX INFO: renamed from: ﱟ */
    private static int f29147 = 0;

    /* JADX INFO: renamed from: ﻐ */
    private static char f29148 = 16641;

    /* JADX INFO: renamed from: ｋ */
    private static char f29149 = 57102;

    /* JADX INFO: renamed from: ﾇ */
    private static char f29150 = 34210;

    /* JADX INFO: renamed from: ﾒ */
    private static char f29151 = 11560;

    /* JADX INFO: renamed from: ﻛ */
    private d f29152;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hi$d */
    public interface d {
        /* JADX INFO: renamed from: ﻐ */
        void mo29848(C12006hi c12006hi, MediaPlayer mediaPlayer);
    }

    public C12006hi(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener, d dVar) {
        super(onSeekCompleteListener);
        this.f29152 = dVar;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        int i = 2 % 2;
        try {
            this.f29152.mo29848(this, mediaPlayer);
            int i2 = f29146 + 91;
            f29147 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            C12080kb.m30845(m30262("᧗查⦑뷉䕚䭛뗃㉎ᓑ傼滆ﶹ\ue655ග츋ὴ冁꺻\ue27d\ue4fc҆鵋ؽ๕찝㣛鶊\uee60ᩓڑ㝥\udcbf", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31).intern(), m30262("렾朽尣矏邸鶞㼹Ⅵ彻ᣡ贆\uf227츋ὴ冁꺻\ue27d\ue4fc҆鵋뗁稓じ선䅤Ẁ穻䠖㠑\ue2e7﮸翅鯢\uf8cd멚豥", 35 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), th, false);
        }
        if (mo28813() != null) {
            int i4 = f29146 + 79;
            f29147 = i4 % 128;
            int i5 = i4 % 2;
            mo28813().onSeekComplete(mediaPlayer);
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30262(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f29151)) ^ ((c2 >>> 5) + f29148)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f29149) ^ ((c3 + i2) ^ ((c3 << 4) + f29150))));
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

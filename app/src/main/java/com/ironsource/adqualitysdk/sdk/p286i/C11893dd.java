package com.ironsource.adqualitysdk.sdk.p286i;

import android.media.AudioTrack;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.dd */
/* JADX INFO: loaded from: classes6.dex */
public final class C11893dd extends C11886cx {

    /* JADX INFO: renamed from: ﻛ */
    private static int f28499 = 0;

    /* JADX INFO: renamed from: ﾇ */
    private static long f28500 = -3124762931405486044L;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28501 = 1;

    /* JADX INFO: renamed from: ﾇ */
    public final AbstractRunnableC12044it m29879(final C11877co c11877co, List<Object> list, final C11907dr c11907dr) {
        final List<Object> list2;
        int i = 2 % 2;
        try {
            if (m29852(list, 0, AbstractRunnableC12044it.class)) {
                AbstractRunnableC12044it abstractRunnableC12044it = (AbstractRunnableC12044it) m29851(list, 0, AbstractRunnableC12044it.class);
                int i2 = f28501 + 49;
                f28499 = i2 % 128;
                int i3 = i2 % 2;
                return abstractRunnableC12044it;
            }
            final C11906dq c11906dq = (C11906dq) m29851(list, 0, C11906dq.class);
            if (list.size() > 2) {
                int i4 = f28499 + 23;
                f28501 = i4 % 128;
                int i5 = i4 % 2;
                list2 = m29854(list, 2);
            } else {
                list2 = m29854(list, 1);
            }
            AbstractRunnableC12044it abstractRunnableC12044it2 = new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.dd.1
                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                /* JADX INFO: renamed from: ﻛ */
                public final void mo28224() {
                    list2.add(0, this);
                    c11906dq.m30048(c11907dr, c11877co, list2);
                    list2.remove(0);
                }
            };
            int i6 = f28499 + 87;
            f28501 = i6 % 128;
            int i7 = i6 % 2;
            return abstractRunnableC12044it2;
        } catch (Exception e) {
            C11875cm.m29607(c11877co.m29666(), m29872("衡侷ޔ\udfe8韒潡✁ｱ띉躬䚚Ủ훆긮晊㹦\uf651춡薞巸ᗔ\ued71ꔀ給㕒ಳ쒟鳽哔ⰼ", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 51168).intern(), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public final Object m29876(C11877co c11877co, List<Object> list, C11907dr c11907dr) {
        int i = 2 % 2;
        int i2 = f28499 + 107;
        f28501 = i2 % 128;
        int i3 = i2 % 2;
        C12089p.m30938(m29879(c11877co, list, c11907dr));
        int i4 = f28501 + 1;
        f28499 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final Object m29877(C11877co c11877co, List<Object> list, C11907dr c11907dr) {
        int i = 2 % 2;
        int i2 = f28499 + 7;
        f28501 = i2 % 128;
        int i3 = i2 % 2;
        C12089p.m30943(m29879(c11877co, list, c11907dr));
        int i4 = f28501 + 83;
        f28499 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ｋ */
    public final Object m29878(C11877co c11877co, List<Object> list, C11907dr c11907dr) {
        int i = 2 % 2;
        int i2 = f28501 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f28499 = i2 % 128;
        int i3 = i2 % 2;
        C12089p.m30939(m29879(c11877co, list, c11907dr), m29873(list));
        int i4 = f28499 + 23;
        f28501 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final Object m29880(C11877co c11877co, List<Object> list, C11907dr c11907dr) {
        int i = 2 % 2;
        int i2 = f28501 + 99;
        f28499 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            C12089p.m30935(m29879(c11877co, list, c11907dr));
            return null;
        }
        C12089p.m30935(m29879(c11877co, list, c11907dr));
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ */
    public final Object m29875(C11877co c11877co, List<Object> list, C11907dr c11907dr) {
        int i = 2 % 2;
        int i2 = f28501 + 45;
        f28499 = i2 % 128;
        int i3 = i2 % 2;
        C12089p.m30933(m29879(c11877co, list, c11907dr));
        int i4 = f28499 + 47;
        f28501 = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ */
    public final Object m29874(C11877co c11877co, List<Object> list, C11907dr c11907dr) {
        int i = 2 % 2;
        int i2 = f28501 + 39;
        f28499 = i2 % 128;
        if (i2 % 2 != 0) {
            C12089p.m30934(m29879(c11877co, list, c11907dr), m29873(list));
            int i3 = 11 / 0;
        } else {
            C12089p.m30934(m29879(c11877co, list, c11907dr), m29873(list));
        }
        int i4 = f28499 + 101;
        f28501 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0045  */
    /* JADX WARN: Code duplicated, block: B:7:0x0031  */
    /* JADX WARN: Code duplicated, block: B:9:0x0037  */
    /* JADX INFO: renamed from: ﾒ */
    private static long m29873(List<Object> list) {
        long j;
        int iIntValue;
        int i = 2 % 2;
        if (list.size() > 1) {
            int i2 = f28499 + 59;
            f28501 = i2 % 128;
            int i3 = i2 % 2;
            if (m29852(list, 1, Integer.class)) {
                int i4 = f28499 + 109;
                f28501 = i4 % 128;
                int i5 = i4 % 2;
                iIntValue = ((Integer) m29851(list, 1, Integer.class)).intValue();
            } else if (list.size() > 2) {
                iIntValue = ((Integer) m29851(list, 2, Integer.class)).intValue();
            } else {
                j = 0;
            }
            j = iIntValue;
        } else if (list.size() > 2) {
            iIntValue = ((Integer) m29851(list, 2, Integer.class)).intValue();
            j = iIntValue;
        } else {
            j = 0;
        }
        int i6 = f28501 + 99;
        f28499 = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29872(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11997h.f29102) {
            C11997h.f29101 = i;
            char[] cArr2 = new char[cArr.length];
            C11997h.f29103 = 0;
            while (C11997h.f29103 < cArr.length) {
                cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f28500);
                C11997h.f29103++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}

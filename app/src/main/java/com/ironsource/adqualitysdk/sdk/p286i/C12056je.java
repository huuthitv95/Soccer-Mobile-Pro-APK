package com.ironsource.adqualitysdk.sdk.p286i;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.C9415C;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.je */
/* JADX INFO: loaded from: classes6.dex */
public class C12056je {

    /* JADX INFO: renamed from: ﻐ */
    private static Handler f29595 = null;

    /* JADX INFO: renamed from: ﻛ */
    private static int f29596 = 0;

    /* JADX INFO: renamed from: ﾇ */
    private static char[] f29597 = {'0', 'f', 'p', 'm', AbstractJsonLexerKt.STRING_ESC, 'c', 'q', 'p', 'i', 'd', 'f', 'X', 'X', 'o', 'g', AbstractJsonLexerKt.UNICODE_ESC, 207, 211, 236, 240, 249, 250, 248, 240, 232, 240};

    /* JADX INFO: renamed from: ﾒ */
    private static int f29598 = 1;

    /* JADX INFO: renamed from: ｋ */
    private C12027ic f29599;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.je$a */
    public interface a {
        /* JADX INFO: renamed from: ﾒ */
        void mo30652();
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.je$d */
    public interface d {
        /* JADX INFO: renamed from: ﻛ */
        void mo30653(String str);
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ void m30637(C12056je c12056je, a aVar) {
        int i = 2 % 2;
        int i2 = f29596 + 51;
        f29598 = i2 % 128;
        int i3 = i2 % 2;
        c12056je.m30641(aVar);
        int i4 = f29598 + 7;
        f29596 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static Handler m30639() {
        Handler handler;
        synchronized (C12056je.class) {
            if (f29595 == null) {
                HandlerThread handlerThread = new HandlerThread(m30640(new int[]{0, 15, 0, 11}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001", false).intern());
                handlerThread.start();
                f29595 = new Handler(handlerThread.getLooper());
            }
            handler = f29595;
        }
        return handler;
    }

    public C12056je(Context context, String str, String str2) {
        this.f29599 = new C12027ic(context, str, str2);
    }

    /* JADX INFO: renamed from: ﻛ */
    public final int m30643(String str) {
        int i = 2 % 2;
        int i2 = f29596 + 75;
        f29598 = i2 % 128;
        int i3 = i2 % 2;
        int iM30470 = this.f29599.m30470(str);
        int i4 = f29596 + 99;
        f29598 = i4 % 128;
        if (i4 % 2 != 0) {
            return iM30470;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final HashMap<String, String> m30650(String str, int i) {
        int i2 = 2 % 2;
        int i3 = f29598 + 73;
        f29596 = i3 % 128;
        int i4 = i3 % 2;
        HashMap<String, String> mapM30468 = this.f29599.m30468(str, i);
        int i5 = f29598 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f29596 = i5 % 128;
        if (i5 % 2 == 0) {
            return mapM30468;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final String m30642(String str) {
        int i = 2 % 2;
        int i2 = f29598 + 25;
        f29596 = i2 % 128;
        int i3 = i2 % 2;
        String strM30467 = this.f29599.m30467(str);
        int i4 = f29596 + 19;
        f29598 = i4 % 128;
        if (i4 % 2 != 0) {
            return strM30467;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final void m30647(final String str, final d dVar) {
        int i = 2 % 2;
        m30639().post(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.je.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                final String strM30642 = C12056je.this.m30642(str);
                C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.je.4.1
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        dVar.mo30653(strM30642);
                    }
                });
            }
        });
        int i2 = f29598 + 55;
        f29596 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final void m30646(String str) {
        int i = 2 % 2;
        int i2 = f29596 + 49;
        f29598 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f29599.m30469(str);
            throw null;
        }
        this.f29599.m30469(str);
        int i3 = f29596 + 75;
        f29598 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final void m30648(String str, String str2) {
        int i = 2 % 2;
        int i2 = f29598 + 61;
        f29596 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f29599.m30471(str, str2);
            throw null;
        }
        this.f29599.m30471(str, str2);
        int i3 = f29598 + 67;
        f29596 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final void m30644(String str, String str2) {
        int i = 2 % 2;
        int i2 = f29598 + 107;
        f29596 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m30649(str, str2, null);
        if (i3 == 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final void m30649(final String str, final String str2, final a aVar) {
        int i = 2 % 2;
        m30639().post(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.je.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                C12056je.this.m30648(str, str2);
                C12056je.m30637(C12056je.this, aVar);
            }
        });
        int i2 = f29598 + 101;
        f29596 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final void m30651(String str, String str2) {
        int i = 2 % 2;
        int i2 = f29596 + 67;
        f29598 = i2 % 128;
        if (i2 % 2 == 0) {
            m30648(str, str2);
            m30648(m30638(str), Long.toString(C12072ju.m30752()));
            int i3 = 94 / 0;
        } else {
            m30648(str, str2);
            m30648(m30638(str), Long.toString(C12072ju.m30752()));
        }
        int i4 = f29596 + 109;
        f29598 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final void m30645(final String str, final String str2, final a aVar) {
        int i = 2 % 2;
        m30639().post(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.je.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                C12056je.this.m30651(str, str2);
                C12056je.m30637(C12056je.this, aVar);
            }
        });
        int i2 = f29598 + 29;
        f29596 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30638(String str) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(m30640(new int[]{15, 11, 134, 1}, "\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", false).intern());
        String string = sb.toString();
        int i2 = f29598 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29596 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
        return string;
    }

    /* JADX INFO: renamed from: ﾒ */
    private void m30641(a aVar) {
        int i = 2 % 2;
        int i2 = f29598 + 81;
        f29596 = i2 % 128;
        int i3 = i2 % 2;
        if (aVar != null) {
            C12089p.m30938(new AbstractRunnableC12044it(aVar) { // from class: com.ironsource.adqualitysdk.sdk.i.je.1
                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                /* JADX INFO: renamed from: ﻛ */
                public final void mo28224() {
                }
            });
            int i4 = f29598 + 9;
            f29596 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30640(int[] iArr, String str, boolean z) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(C9415C.ISO88591_NAME);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (C12024i.f29270) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f29597, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                C12024i.f29269 = 0;
                char c = 0;
                while (C12024i.f29269 < i2) {
                    if (bArr[C12024i.f29269] == 1) {
                        cArr2[C12024i.f29269] = (char) (((cArr[C12024i.f29269] << 1) + 1) - c);
                    } else {
                        cArr2[C12024i.f29269] = (char) ((cArr[C12024i.f29269] << 1) - c);
                    }
                    c = cArr2[C12024i.f29269];
                    C12024i.f29269++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                C12024i.f29269 = 0;
                while (C12024i.f29269 < i2) {
                    cArr4[C12024i.f29269] = cArr[(i2 - C12024i.f29269) - 1];
                    C12024i.f29269++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                C12024i.f29269 = 0;
                while (C12024i.f29269 < i2) {
                    cArr[C12024i.f29269] = (char) (cArr[C12024i.f29269] - iArr[2]);
                    C12024i.f29269++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }
}

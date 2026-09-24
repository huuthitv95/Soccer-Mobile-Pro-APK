package com.ironsource.adqualitysdk.sdk.p286i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ig */
/* JADX INFO: loaded from: classes6.dex */
public final class C12031ig {

    /* JADX INFO: renamed from: ﭴ */
    private static int f29311 = 1;

    /* JADX INFO: renamed from: ﮉ */
    private static int f29312;

    /* JADX INFO: renamed from: ﮌ */
    private static long f29313;

    /* JADX INFO: renamed from: ﱟ */
    private static char f29314;

    /* JADX INFO: renamed from: ﱡ */
    private static char[] f29315;

    /* JADX INFO: renamed from: ﺙ */
    private static C12031ig f29316;

    /* JADX INFO: renamed from: ﻏ */
    private static final Object f29317;

    /* JADX INFO: renamed from: ﮐ */
    private final Handler f29318;

    /* JADX INFO: renamed from: ﾇ */
    private final Context f29322;

    /* JADX INFO: renamed from: ﾒ */
    private boolean f29323 = true;

    /* JADX INFO: renamed from: ﻛ */
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> f29320 = new HashMap<>();

    /* JADX INFO: renamed from: ﻐ */
    private final HashMap<String, ArrayList<d>> f29319 = new HashMap<>();

    /* JADX INFO: renamed from: ｋ */
    private final ArrayList<c> f29321 = new ArrayList<>();

    /* JADX INFO: renamed from: ﾇ */
    static void m30494() {
        f29314 = (char) 6;
        f29315 = new char[]{'L', 'o', 'c', 'a', 'l', 'B', 'r', 'd', 's', 't', 'M', 'n', 'g', 'e', 'R', 'v', 'i', ' ', 'y', 'p', 'f', 'A', AbstractJsonLexerKt.COLON, 'h', 'F', '\'', AbstractJsonLexerKt.UNICODE_ESC, 'k', 'w', 'N', 'O', 'P', 'Q', 'S', 'T', 'U'};
        f29313 = 2945072502408402423L;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ void m30492(C12031ig c12031ig) {
        int i = 2 % 2;
        int i2 = f29311 + 71;
        f29312 = i2 % 128;
        int i3 = i2 % 2;
        c12031ig.m30495();
        int i4 = f29311 + 23;
        f29312 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ig$d */
    static class d {

        /* JADX INFO: renamed from: ﱟ */
        private static int f29327 = 1;

        /* JADX INFO: renamed from: ﾇ */
        private static long f29328 = -4191700330757749502L;

        /* JADX INFO: renamed from: ﾒ */
        private static int f29329;

        /* JADX INFO: renamed from: ﻐ */
        final BroadcastReceiver f29330;

        /* JADX INFO: renamed from: ﻛ */
        final IntentFilter f29331;

        /* JADX INFO: renamed from: ｋ */
        boolean f29332;

        public final String toString() {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder(128);
            sb.append(m30499("Ր靤Ⅷ덮䵧\udf7b極ﭥ镡", 37379 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern());
            sb.append(this.f29330);
            sb.append(m30499("Ԣ浝픙㷅ꖒ౺琦\udcb0", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 26680).intern());
            sb.append(this.f29331);
            sb.append(m30499("տ", 53113 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
            String string = sb.toString();
            int i2 = f29327 + 25;
            f29329 = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        /* JADX INFO: renamed from: ﻐ */
        private static String m30499(String str, int i) {
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
                    cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f29328);
                    C11997h.f29103++;
                }
                str2 = new String(cArr2);
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ig$c */
    static class c {

        /* JADX INFO: renamed from: ﻐ */
        final Intent f29325;

        /* JADX INFO: renamed from: ｋ */
        final ArrayList<d> f29326;

        c(Intent intent, ArrayList<d> arrayList) {
            this.f29325 = intent;
            this.f29326 = arrayList;
        }
    }

    static {
        m30494();
        f29317 = new Object();
        int i = f29312 + 39;
        f29311 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public static C12031ig m30493(Context context) {
        C12031ig c12031ig;
        synchronized (f29317) {
            if (f29316 == null) {
                f29316 = new C12031ig(context.getApplicationContext());
            }
            c12031ig = f29316;
        }
        return c12031ig;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final synchronized void m30496() {
        int i = 2 % 2;
        int i2 = f29312;
        int i3 = i2 + 79;
        f29311 = i3 % 128;
        int i4 = i3 % 2;
        this.f29323 = true;
        int i5 = i2 + 37;
        f29311 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public final synchronized void m30498() {
        int i = 2 % 2;
        int i2 = f29311 + 11;
        f29312 = i2 % 128;
        int i3 = i2 % 2;
        this.f29323 = false;
        m30490();
        int i4 = f29312 + 77;
        f29311 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
    }

    private C12031ig(Context context) {
        this.f29322 = context;
        this.f29318 = new Handler(context.getMainLooper()) { // from class: com.ironsource.adqualitysdk.sdk.i.ig.5
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what == 1) {
                    C12031ig.m30492(C12031ig.this);
                } else {
                    super.handleMessage(message);
                }
            }
        };
    }

    /* JADX INFO: renamed from: ﻐ */
    private void m30491(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f29320) {
            ArrayList<IntentFilter> arrayListRemove = this.f29320.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int i = 0; i < arrayListRemove.size(); i++) {
                IntentFilter intentFilter = arrayListRemove.get(i);
                for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                    String action = intentFilter.getAction(i2);
                    ArrayList<d> arrayList = this.f29319.get(action);
                    if (arrayList != null) {
                        int i3 = 0;
                        while (i3 < arrayList.size()) {
                            if (arrayList.get(i3).f29330 == broadcastReceiver) {
                                arrayList.remove(i3);
                                i3--;
                            }
                            i3++;
                        }
                        if (arrayList.size() <= 0) {
                            this.f29319.remove(action);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private void m30490() {
        synchronized (this.f29320) {
            Iterator it = new HashMap(this.f29320).keySet().iterator();
            while (it.hasNext()) {
                m30491((BroadcastReceiver) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public final boolean m30497(Intent intent) {
        float f;
        String strIntern;
        String strIntern2 = m30489("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0000\u0001\t\u0003\u0004\t\n\t\u0004\t\u0005\r\u000eÒ", Color.argb(0, 0, 0, 0) + 21, (byte) (View.resolveSizeAndState(0, 0, 0) + 96)).intern();
        if (!this.f29323) {
            return false;
        }
        synchronized (this.f29320) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f29322.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = true;
            boolean z2 = (intent.getFlags() & 8) != 0;
            if (z2) {
                StringBuilder sb = new StringBuilder();
                sb.append(m30489("\u000f\u000e\u0007\u0002\u0003\u0010\u0011\n\r\f\u0006\u0015\u0019\u0013.", Process.getGidForName("") + 16, (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 14)).intern());
                sb.append(strResolveTypeIfNeeded);
                sb.append(m30488("罙㦉ꡇ罹\u0890\uec0dϊ褝⣠ᐷꯨ텱", 1 - (ViewConfiguration.getScrollBarSize() >> 8)).intern());
                sb.append(scheme);
                sb.append(m30489("\r\u0005\u0017\u000e\u0011\n\u0007\u000f\u0006\nC", 11 - TextUtils.indexOf("", ""), (byte) (View.resolveSize(0, 0) + 35)).intern());
                sb.append(intent);
                Log.v(strIntern2, sb.toString());
            }
            ArrayList<d> arrayList = this.f29319.get(intent.getAction());
            if (arrayList != null) {
                if (z2) {
                    StringBuilder sb2 = new StringBuilder();
                    f = 0.0f;
                    sb2.append(m30489("\u0014\u0003\n\u000f\u0005\u0007\u0010\u0005\u000e\n\n\u0015'", (Process.myPid() >> 22) + 13, (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7)).intern());
                    sb2.append(arrayList);
                    Log.v(strIntern2, sb2.toString());
                } else {
                    f = 0.0f;
                }
                int i = 0;
                ArrayList arrayList2 = null;
                while (i < arrayList.size()) {
                    d dVar = arrayList.get(i);
                    if (z2) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(m30489("\t\u0004\b\u0003\u0016\u0011\u0006\u0011\u000f\u0005\u000f\u0000\u0011\n\t\n\u000e\u0017\u0016\n\u0007\u000f\u000b\f", (ViewConfiguration.getWindowTouchSlop() >> 8) + 24, (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 42)).intern());
                        sb3.append(dVar.f29331);
                        Log.v(strIntern2, sb3.toString());
                    }
                    if (dVar.f29332) {
                        if (z2) {
                            Log.v(strIntern2, m30489("%%\u001c\f\u0003\n\f\u0007\u001a\u0007\u000f\u000b\u0000\t\r\u000e\u000b\u000f\u0004\u0005\u0007\f\u0001\t\u0017\f\u0001\t\r\u0013i", (ViewConfiguration.getWindowTouchSlop() >> 8) + 31, (byte) (6 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)))).intern());
                        }
                        scheme = scheme;
                        data = data;
                    } else {
                        int iMatch = dVar.f29331.match(action, strResolveTypeIfNeeded, scheme, data, categories, strIntern2);
                        if (iMatch >= 0) {
                            if (z2) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(m30488("迲\uefef\u0015迒膺㨸ꮽ6\ud842쉈κ堉\u206a樭寒끓蠅㈌돲ࢧ킣\udaa8୫悂㣟拘捌룣胧ી뭻", TextUtils.indexOf("", "", 0) + 1).intern());
                                sb4.append(Integer.toHexString(iMatch));
                                Log.v(strIntern2, sb4.toString());
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(dVar);
                            dVar.f29332 = z;
                        } else {
                            action = action;
                            strResolveTypeIfNeeded = strResolveTypeIfNeeded;
                            scheme = scheme;
                            data = data;
                            if (z2) {
                                if (iMatch == -4) {
                                    action = action;
                                    strResolveTypeIfNeeded = strResolveTypeIfNeeded;
                                    strIntern = m30489("\u0003\u0004\u0007\u000f\r\u0000\f\u0018", 8 - TextUtils.getOffsetBefore("", 0), (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 40)).intern();
                                } else if (iMatch == -3) {
                                    action = action;
                                    strResolveTypeIfNeeded = strResolveTypeIfNeeded;
                                    strIntern = m30488("㳢埔椐㲃ꖗ艀슊␛歑穩", '1' - AndroidCharacter.getMirror('0')).intern();
                                } else if (iMatch == -2) {
                                    action = action;
                                    strResolveTypeIfNeeded = strResolveTypeIfNeeded;
                                    strIntern = m30488("\u12c1슡䇷እ䛩\u1737\uea6d읭", -ExpandableListView.getPackedPositionChild(0L)).intern();
                                } else if (iMatch == -1) {
                                    action = action;
                                    strResolveTypeIfNeeded = strResolveTypeIfNeeded;
                                    strIntern = m30489("\u0006\u0015\u0019\u0013", KeyEvent.normalizeMetaState(0) + 4, (byte) (97 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).intern();
                                } else {
                                    action = action;
                                    strResolveTypeIfNeeded = strResolveTypeIfNeeded;
                                    strIntern = m30489("\u001d\b\u001d\t\u0004\u0019\u0011\u0017\u0007\f\u0002\t\u0005\u0007", 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) (88 - TextUtils.lastIndexOf("", '0', 0, 0))).intern();
                                }
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(m30488("鋢ᤥ\udda5鋂笠쳲瘍硴앒㒂\ude0a⁋㵺鳮虪적镖쓀湈烵춲Ⱟ횚ᣙ◍鐎뺥샩", 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
                                sb5.append(strIntern);
                                Log.v(strIntern2, sb5.toString());
                            } else {
                                action = action;
                                strResolveTypeIfNeeded = strResolveTypeIfNeeded;
                            }
                        }
                    }
                    i++;
                    scheme = scheme;
                    action = action;
                    strResolveTypeIfNeeded = strResolveTypeIfNeeded;
                    data = data;
                    z = true;
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((d) arrayList2.get(i2)).f29332 = false;
                    }
                    this.f29321.add(new c(intent, arrayList2));
                    if (!this.f29318.hasMessages(1)) {
                        this.f29318.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private void m30495() {
        int size;
        c[] cVarArr;
        while (true) {
            synchronized (this.f29320) {
                size = this.f29321.size();
                if (size <= 0) {
                    return;
                }
                cVarArr = new c[size];
                this.f29321.toArray(cVarArr);
                this.f29321.clear();
            }
            for (int i = 0; i < size; i++) {
                c cVar = cVarArr[i];
                for (int i2 = 0; i2 < cVar.f29326.size(); i2++) {
                    cVar.f29326.get(i2).f29330.onReceive(this.f29322, cVar.f29325);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30489(String str, int i, byte b) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11970g.f28961) {
            char[] cArr2 = f29315;
            char c2 = f29314;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr3[i] = (char) (cArr[i] - b);
            }
            if (i > 1) {
                C11970g.f28962 = 0;
                while (C11970g.f28962 < i) {
                    C11970g.f28964 = cArr[C11970g.f28962];
                    C11970g.f28965 = cArr[C11970g.f28962 + 1];
                    if (C11970g.f28964 == C11970g.f28965) {
                        cArr3[C11970g.f28962] = (char) (C11970g.f28964 - b);
                        cArr3[C11970g.f28962 + 1] = (char) (C11970g.f28965 - b);
                    } else {
                        C11970g.f28963 = C11970g.f28964 / c2;
                        C11970g.f28959 = C11970g.f28964 % c2;
                        C11970g.f28966 = C11970g.f28965 / c2;
                        C11970g.f28960 = C11970g.f28965 % c2;
                        if (C11970g.f28959 == C11970g.f28960) {
                            C11970g.f28963 = ((C11970g.f28963 + c2) - 1) % c2;
                            C11970g.f28966 = ((C11970g.f28966 + c2) - 1) % c2;
                            int i2 = (C11970g.f28963 * c2) + C11970g.f28959;
                            int i3 = (C11970g.f28966 * c2) + C11970g.f28960;
                            cArr3[C11970g.f28962] = cArr2[i2];
                            cArr3[C11970g.f28962 + 1] = cArr2[i3];
                        } else if (C11970g.f28963 == C11970g.f28966) {
                            C11970g.f28959 = ((C11970g.f28959 + c2) - 1) % c2;
                            C11970g.f28960 = ((C11970g.f28960 + c2) - 1) % c2;
                            int i4 = (C11970g.f28963 * c2) + C11970g.f28959;
                            int i5 = (C11970g.f28966 * c2) + C11970g.f28960;
                            cArr3[C11970g.f28962] = cArr2[i4];
                            cArr3[C11970g.f28962 + 1] = cArr2[i5];
                        } else {
                            int i6 = (C11970g.f28963 * c2) + C11970g.f28960;
                            int i7 = (C11970g.f28966 * c2) + C11970g.f28959;
                            cArr3[C11970g.f28962] = cArr2[i6];
                            cArr3[C11970g.f28962 + 1] = cArr2[i7];
                        }
                    }
                    C11970g.f28962 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30488(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f29313, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f29313));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}

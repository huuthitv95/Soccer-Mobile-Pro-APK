package com.ironsource.adqualitysdk.sdk.p286i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.iw */
/* JADX INFO: loaded from: classes6.dex */
public final class C12047iw extends BroadcastReceiver {

    /* JADX INFO: renamed from: ﮐ */
    private static char f29433 = 0;

    /* JADX INFO: renamed from: ﱟ */
    private static int f29434 = 1;

    /* JADX INFO: renamed from: ﱡ */
    private static char f29435;

    /* JADX INFO: renamed from: ﺙ */
    private static int f29436;

    /* JADX INFO: renamed from: ﻏ */
    private static char f29437;

    /* JADX INFO: renamed from: ﻛ */
    private static String f29438;

    /* JADX INFO: renamed from: ﾇ */
    private static char f29439;

    /* JADX INFO: renamed from: ﻐ */
    private Context f29440;

    /* JADX INFO: renamed from: ｋ */
    private boolean f29441 = false;

    /* JADX INFO: renamed from: ﾒ */
    private Set<InterfaceC12041iq> f29442 = new HashSet();

    /* JADX INFO: renamed from: ﱡ */
    static void m30530() {
        f29437 = (char) 35367;
        f29433 = (char) 12222;
        f29435 = (char) 51737;
        f29439 = (char) 33617;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ void m30535(C12047iw c12047iw, boolean z) {
        int i = 2 % 2;
        int i2 = f29434 + 99;
        f29436 = i2 % 128;
        int i3 = i2 % 2;
        c12047iw.m30534(z);
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ boolean m30536(C12047iw c12047iw, Context context) {
        int i = 2 % 2;
        int i2 = f29434 + 99;
        f29436 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM30538 = m30538(context);
        int i4 = f29434 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f29436 = i4 % 128;
        int i5 = i4 % 2;
        return zM30538;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ String m30537() {
        int i = 2 % 2;
        int i2 = f29436;
        int i3 = i2 + 27;
        f29434 = i3 % 128;
        int i4 = i3 % 2;
        String str = f29438;
        int i5 = i2 + 59;
        f29434 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    static {
        m30530();
        f29438 = m30533("ꢻ䜗쯒ﷇ\ue085殃觿롅캆䄍\ue919ᮍ좷၄憝\ue433诲‿멇尐", AndroidCharacter.getMirror('0') - 28).intern();
        int i = f29436 + 17;
        f29434 = i % 128;
        int i2 = i % 2;
    }

    public C12047iw(Context context) {
        this.f29440 = context.getApplicationContext();
        C12085l.m30909(f29438, m30533("펣톞㤊덠ἐ蟈䙓ᦐ➵⫨\ue02b吟鶛鋩먕\ue649꣄㽥꤀Ð胳駁葺㚽멻Ԝ葜岍꿬\uf703", 29 - TextUtils.indexOf((CharSequence) "", '0')).intern());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(m30533("ﶝ醦榨뮨藑䠼诋칛ッ➥꽄ﴵㅹ畺ꬢ\ud8f9餅벀뿰넶\ue07d\u0cdc\uf1b0裀⧢⏢苂䐴ꘆ懋ꪙᔱ텐Aꚓ굿", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 36).intern());
        this.f29440.registerReceiver(this, intentFilter);
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m30542() {
        int i = 2 % 2;
        int i2 = f29436 + 103;
        f29434 = i2 % 128;
        int i3 = i2 % 2;
        this.f29440.unregisterReceiver(this);
        int i4 = f29434 + 109;
        f29436 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final synchronized void m30540(InterfaceC12041iq interfaceC12041iq) {
        int i = 2 % 2;
        int i2 = f29436 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29434 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f29442.add(interfaceC12041iq);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        this.f29442.add(interfaceC12041iq);
        int i3 = f29436 + 41;
        f29434 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 98 / 0;
            return;
        }
        return;
        throw th;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final synchronized void m30544(InterfaceC12041iq interfaceC12041iq) {
        int i = 2 % 2;
        int i2 = f29436 + 15;
        f29434 = i2 % 128;
        int i3 = i2 % 2;
        this.f29442.remove(interfaceC12041iq);
        int i4 = f29434 + 53;
        f29436 = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﺙ */
    private synchronized Set<InterfaceC12041iq> m30531() {
        int i = 2 % 2;
        HashSet hashSet = new HashSet(this.f29442);
        int i2 = f29434 + 85;
        f29436 = i2 % 128;
        if (i2 % 2 == 0) {
            return hashSet;
        }
        int i3 = 19 / 0;
        return hashSet;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final void m30539() {
        int i = 2 % 2;
        Iterator<InterfaceC12041iq> it = m30531().iterator();
        int i2 = f29436 + 105;
        f29434 = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = f29434 + 101;
            f29436 = i4 % 128;
            int i5 = i4 % 2;
            it.next().mo28406();
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    public final void m30543() {
        int i = 2 % 2;
        int i2 = f29436 + 95;
        f29434 = i2 % 128;
        int i3 = i2 % 2;
        Iterator<InterfaceC12041iq> it = m30531().iterator();
        while (it.hasNext()) {
            int i4 = f29436 + 23;
            f29434 = i4 % 128;
            int i5 = i4 % 2;
            it.next();
            if (i5 == 0) {
                int i6 = 38 / 0;
            }
        }
        int i7 = f29436 + 59;
        f29434 = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        int i = 2 % 2;
        C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.3

            /* JADX INFO: renamed from: ﱡ */
            private static int f29443 = 1;

            /* JADX INFO: renamed from: ｋ */
            private static int f29444 = 0;

            /* JADX INFO: renamed from: ﾒ */
            private static long f29445 = 8206954942130082116L;

            /* JADX WARN: Code duplicated, block: B:12:0x0081 A[Catch: Exception -> 0x00d9, TryCatch #0 {Exception -> 0x00d9, blocks: (B:4:0x0013, B:10:0x004e, B:12:0x0081, B:14:0x00a6, B:16:0x00b0, B:21:0x00c7, B:7:0x0032), top: B:27:0x0011 }] */
            /* JADX WARN: Code duplicated, block: B:14:0x00a6 A[Catch: Exception -> 0x00d9, TryCatch #0 {Exception -> 0x00d9, blocks: (B:4:0x0013, B:10:0x004e, B:12:0x0081, B:14:0x00a6, B:16:0x00b0, B:21:0x00c7, B:7:0x0032), top: B:27:0x0011 }] */
            /* JADX WARN: Code duplicated, block: B:16:0x00b0 A[Catch: Exception -> 0x00d9, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d9, blocks: (B:4:0x0013, B:10:0x004e, B:12:0x0081, B:14:0x00a6, B:16:0x00b0, B:21:0x00c7, B:7:0x0032), top: B:27:0x0011 }] */
            /* JADX WARN: Code duplicated, block: B:19:0x00c3  */
            /* JADX WARN: Code duplicated, block: B:21:0x00c7 A[Catch: Exception -> 0x00d9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d9, blocks: (B:4:0x0013, B:10:0x004e, B:12:0x0081, B:14:0x00a6, B:16:0x00b0, B:21:0x00c7, B:7:0x0032), top: B:27:0x0011 }] */
            /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                int i2;
                int i3 = 2 % 2;
                int i4 = f29443 + 103;
                f29444 = i4 % 128;
                try {
                    if (i4 % 2 != 0) {
                        if (intent.getAction().equals(m30545("턥쥛\ue1c2顥냯\uab18䎆穽ኢ\u0ad8╚\uddb1\uf46b\uec96蜄뾵噺了曹ũ㧞큄좱\ue337鮕눛꩷䋻絁ᗖహ⒣\udf25\uf79b\uee01虲", 951 << AndroidCharacter.getMirror(AbstractJsonLexerKt.UNICODE_ESC)).intern())) {
                            C12085l.m30917(C12047iw.m30537(), m30545("턊˜益\uaac4黟\uf2c7⛁\u1a8f仏ꋎ雈쫵㻽ዾ䛦뫾\ueee2신㛺櫺庠닦\ue692\uda9eຒ抖嚓", TextUtils.getTrimmedLength("") + 54269).intern());
                            if (intent.getBooleanExtra(m30545("턪쳼\ueaa9袮ꙶ䐙戫ǆ㾈\udda2ﭔ餐뜤勖", AndroidCharacter.getMirror('0') + 7591).intern(), false)) {
                                C12085l.m30917(C12047iw.m30537(), m30545("턐管萻⺑笕薢\u2e79碿蕂\u2fde磦蔥⾽砙芅⽨秦色Ⲏ祐舯ⲻ礴莊Ⱏ盵荿ⷭ癁胉ⶻ", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 43660).intern());
                                C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.3.3
                                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                                    /* JADX INFO: renamed from: ﻛ */
                                    public final void mo28224() {
                                        C12047iw.this.m30543();
                                        C12047iw.m30535(C12047iw.this, false);
                                    }
                                });
                                return;
                            } else {
                                if (C12047iw.m30536(C12047iw.this, context)) {
                                    C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.3.4
                                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                                        /* JADX INFO: renamed from: ﻛ */
                                        public final void mo28224() {
                                            C12047iw.m30535(C12047iw.this, true);
                                            C12047iw.this.m30539();
                                        }
                                    });
                                    i2 = f29444 + 33;
                                    f29443 = i2 % 128;
                                    if (i2 % 2 == 0) {
                                        int i5 = 32 / 0;
                                        return;
                                    }
                                    return;
                                }
                                C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.3.2
                                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                                    /* JADX INFO: renamed from: ﻛ */
                                    public final void mo28224() {
                                        C12047iw.m30535(C12047iw.this, false);
                                        C12047iw.this.m30543();
                                    }
                                });
                            }
                        }
                    } else if (intent.getAction().equals(m30545("턥쥛\ue1c2顥냯\uab18䎆穽ኢ\u0ad8╚\uddb1\uf46b\uec96蜄뾵噺了曹ũ㧞큄좱\ue337鮕눛꩷䋻絁ᗖహ⒣\udf25\uf79b\uee01虲", AndroidCharacter.getMirror('0') + 6209).intern())) {
                        C12085l.m30917(C12047iw.m30537(), m30545("턊˜益\uaac4黟\uf2c7⛁\u1a8f仏ꋎ雈쫵㻽ዾ䛦뫾\ueee2신㛺櫺庠닦\ue692\uda9eຒ抖嚓", TextUtils.getTrimmedLength("") + 54269).intern());
                        if (intent.getBooleanExtra(m30545("턪쳼\ueaa9袮ꙶ䐙戫ǆ㾈\udda2ﭔ餐뜤勖", AndroidCharacter.getMirror('0') + 7591).intern(), false)) {
                            C12085l.m30917(C12047iw.m30537(), m30545("턐管萻⺑笕薢\u2e79碿蕂\u2fde磦蔥⾽砙芅⽨秦色Ⲏ祐舯ⲻ礴莊Ⱏ盵荿ⷭ癁胉ⶻ", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 43660).intern());
                            C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.3.3
                                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                                /* JADX INFO: renamed from: ﻛ */
                                public final void mo28224() {
                                    C12047iw.this.m30543();
                                    C12047iw.m30535(C12047iw.this, false);
                                }
                            });
                            return;
                        } else {
                            if (C12047iw.m30536(C12047iw.this, context)) {
                                C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.3.4
                                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                                    /* JADX INFO: renamed from: ﻛ */
                                    public final void mo28224() {
                                        C12047iw.m30535(C12047iw.this, true);
                                        C12047iw.this.m30539();
                                    }
                                });
                                i2 = f29444 + 33;
                                f29443 = i2 % 128;
                                if (i2 % 2 == 0) {
                                    int i6 = 32 / 0;
                                    return;
                                }
                                return;
                            }
                            C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.3.2
                                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                                /* JADX INFO: renamed from: ﻛ */
                                public final void mo28224() {
                                    C12047iw.m30535(C12047iw.this, false);
                                    C12047iw.this.m30543();
                                }
                            });
                        }
                    }
                    int i7 = f29443 + 81;
                    f29444 = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Exception e) {
                    C12080kb.m30845(C12047iw.m30537(), m30545("턁ꍉ㗈虖ᣊ\ued1f翗\uf053䊜흜\ua9dc㩣賕Ŕ鏓摜\uf6c2䭎", 29311 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), (Throwable) e, false);
                }
            }

            /* JADX INFO: renamed from: ﾒ */
            private static String m30545(String str, int i2) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (C11997h.f29102) {
                    C11997h.f29101 = i2;
                    char[] cArr2 = new char[cArr.length];
                    C11997h.f29103 = 0;
                    while (C11997h.f29103 < cArr.length) {
                        cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f29445);
                        C11997h.f29103++;
                    }
                    str2 = new String(cArr2);
                }
                return str2;
            }
        });
        int i2 = f29436 + 103;
        f29434 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 72 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public final synchronized boolean m30541() {
        boolean z;
        int i = 2 % 2;
        int i2 = f29436 + 85;
        f29434 = i2 % 128;
        if (i2 % 2 == 0) {
            z = this.f29441;
            int i3 = 93 / 0;
        } else {
            z = this.f29441;
        }
        return z;
    }

    /* JADX INFO: renamed from: ﻐ */
    private synchronized void m30534(boolean z) {
        int i = 2 % 2;
        int i2 = f29436 + 13;
        int i3 = i2 % 128;
        f29434 = i3;
        int i4 = i2 % 2;
        this.f29441 = z;
        int i5 = i3 + 47;
        f29436 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private static boolean m30538(Context context) {
        int i = 2 % 2;
        int i2 = f29434 + 17;
        f29436 = i2 % 128;
        int i3 = i2 % 2;
        NetworkInfo networkInfoM30532 = m30532(context);
        if (networkInfoM30532 == null || !networkInfoM30532.isConnected()) {
            return false;
        }
        String str = f29438;
        StringBuilder sb = new StringBuilder();
        sb.append(m30533("ꢻ䜗쯒ﷇ\ue085殃䡵⊝", (ViewConfiguration.getFadingEdgeLength() >> 16) + 8).intern());
        sb.append(networkInfoM30532.getTypeName());
        sb.append(m30533("\ue54e쑀\ue93b噰ッ➥譖\uf498鳪컳큫誎", 11 - TextUtils.indexOf("", "", 0)).intern());
        C12085l.m30917(str, sb.toString());
        int i4 = f29436 + 9;
        f29434 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static NetworkInfo m30532(Context context) {
        int i = 2 % 2;
        if (context != null) {
            int i2 = f29434 + 41;
            f29436 = i2 % 128;
            return ((ConnectivityManager) context.getSystemService(m30533("ㅹ畺ꬢ\ud8f9葺㚽语ሙ䢱堑䣋蝇", i2 % 2 != 0 ? 30 << (ExpandableListView.getPackedPositionForGroup(1) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 1L ? 0 : -1)) : (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12).intern())).getActiveNetworkInfo();
        }
        int i3 = f29434 + 55;
        f29436 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 98 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30533(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f29437)) ^ ((c2 >>> 5) + f29435)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f29433) ^ ((c3 + i2) ^ ((c3 << 4) + f29439))));
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

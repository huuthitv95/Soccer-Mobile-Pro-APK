package com.ironsource.adqualitysdk.sdk.p286i;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.iz */
/* JADX INFO: loaded from: classes6.dex */
public final class C12050iz {

    /* JADX INFO: renamed from: ﮐ */
    private static int f29482 = 1;

    /* JADX INFO: renamed from: ﱟ */
    private static long f29483;

    /* JADX INFO: renamed from: ﱡ */
    private static int f29484;

    /* JADX INFO: renamed from: ﺙ */
    private static char f29485;

    /* JADX INFO: renamed from: ﻏ */
    private static int f29486;

    /* JADX INFO: renamed from: ｋ */
    private static String f29487;

    /* JADX INFO: renamed from: ﻐ */
    private C12056je f29488;

    /* JADX INFO: renamed from: ﻛ */
    private List<Runnable> f29489 = new ArrayList();

    /* JADX INFO: renamed from: ﾇ */
    private C12049iy f29490;

    /* JADX INFO: renamed from: ﾒ */
    private String f29491;

    /* JADX INFO: renamed from: ﻛ */
    static void m30575() {
        f29483 = 0L;
        f29484 = 0;
        f29485 = (char) 56944;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ String m30572() {
        int i = 2 % 2;
        int i2 = f29482 + 87;
        int i3 = i2 % 128;
        f29486 = i3;
        int i4 = i2 % 2;
        String str = f29487;
        int i5 = i3 + 21;
        f29482 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ List m30574(C12050iz c12050iz) {
        int i = 2 % 2;
        int i2 = f29486 + 67;
        int i3 = i2 % 128;
        f29482 = i3;
        int i4 = i2 % 2;
        List<Runnable> list = c12050iz.f29489;
        int i5 = i3 + 31;
        f29486 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ void m30576(C12050iz c12050iz, C12053jb c12053jb, InterfaceC12038in interfaceC12038in) {
        int i = 2 % 2;
        int i2 = f29486 + 17;
        f29482 = i2 % 128;
        int i3 = i2 % 2;
        c12050iz.m30573(c12053jb, interfaceC12038in);
        int i4 = f29482 + 25;
        f29486 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ C12049iy m30577(C12050iz c12050iz) {
        int i = 2 % 2;
        int i2 = f29482;
        int i3 = i2 + 115;
        f29486 = i3 % 128;
        int i4 = i3 % 2;
        C12049iy c12049iy = c12050iz.f29490;
        if (i4 != 0) {
            int i5 = 19 / 0;
        }
        int i6 = i2 + 27;
        f29486 = i6 % 128;
        int i7 = i6 % 2;
        return c12049iy;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ C12056je m30579(C12050iz c12050iz) {
        int i = 2 % 2;
        int i2 = f29482 + 77;
        int i3 = i2 % 128;
        f29486 = i3;
        int i4 = i2 % 2;
        C12056je c12056je = c12050iz.f29488;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 19;
        f29482 = i5 % 128;
        if (i5 % 2 != 0) {
            return c12056je;
        }
        throw null;
    }

    static {
        m30575();
        f29487 = m30580("﮴㱖\uf3e9≢隋\uebba쁷厢퍻輸\ue629⧕연癅馐\ue20eꃛ殩痁쟟␎쫐릑ꜧ\ud83b랬쟁\udd17ፏ\ud8a3얏Ҩ犈寑朖ﳑ\ud8fb劆췚屬蛩\uf12a嗍㪗ﶱ竞뮣뾏䪍뤈ꯤ\u2439髥핪\u0dbe㬃ᣈ\uef62朘Ⳓ먣썂쇎ꂙᠵ圣勽悵\ue511笌", (char) (10497 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\u0000\u0000\u0000\u0000", View.combineMeasuredStates(0, 0), "矩黭\b㨩").intern();
        int i = f29486 + 91;
        f29482 = i % 128;
        int i2 = i % 2;
    }

    public C12050iz(Context context, C12049iy c12049iy, String str) {
        this.f29488 = new C12056je(context, m30580("\ued62엣ઃ춄뿖⅖ᨥ\udccb珫黄Ⲱ懬巉㒂\uda4e处\udda0럲霁遆靗Â傎ꣷ", (char) (KeyEvent.getMaxKeyCode() >> 16), "\u0000\u0000\u0000\u0000", (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "뤤\u07b7诋㎞").intern(), m30580("받ඇҬ彞넔뤣㕈⬎鉜鲢轐\ueb24쬕닶蘃䯟䥺", (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1969), "\u0000\u0000\u0000\u0000", TextUtils.lastIndexOf("", '0') + 1894928817, "냱\uf251뉰崇").intern());
        this.f29490 = c12049iy;
        this.f29491 = str;
        AbstractC11823ao.m28472().mo28502(new InterfaceC11828at() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC11828at
            /* JADX INFO: renamed from: ﻐ */
            public final void mo28394() {
                ArrayList arrayList;
                synchronized (this) {
                    arrayList = new ArrayList(C12050iz.m30574(C12050iz.this));
                    C12050iz.m30574(C12050iz.this).clear();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ﾇ */
    private synchronized String m30578() {
        String str;
        int i = 2 % 2;
        int i2 = f29482 + 51;
        int i3 = i2 % 128;
        f29486 = i3;
        int i4 = i2 % 2;
        str = this.f29491;
        int i5 = i3 + 7;
        f29482 = i5 % 128;
        if (i5 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final String m30583(String str, String str2, InterfaceC12038in interfaceC12038in) {
        int i = 2 % 2;
        C12053jb.c cVar = new C12053jb.c(str, str2);
        if (AbstractC11823ao.m28472().mo28487().m28562()) {
            String strM28560 = AbstractC11823ao.m28472().mo28487().m28560(str);
            if (!TextUtils.isEmpty(strM28560)) {
                C12053jb.d dVar = new C12053jb.d(str, str2, strM28560);
                int i2 = f29486 + 77;
                f29482 = i2 % 128;
                int i3 = i2 % 2;
                cVar = dVar;
            } else {
                int i4 = f29486 + 17;
                f29482 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 79 / 0;
                }
                return null;
            }
        }
        return m30582(cVar, interfaceC12038in);
    }

    /* JADX INFO: renamed from: ﾇ */
    public final String m30582(final C12053jb c12053jb, final InterfaceC12038in interfaceC12038in) {
        boolean z;
        if (TextUtils.isEmpty(c12053jb.m30611()) || TextUtils.isEmpty(c12053jb.m30615())) {
            return null;
        }
        String strM30610 = c12053jb.m30610();
        synchronized (this) {
            if (AbstractC11823ao.m28472().mo28492()) {
                z = true;
            } else {
                this.f29489.add(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.4
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        C12050iz.m30576(C12050iz.this, c12053jb, interfaceC12038in);
                    }
                });
                z = false;
            }
        }
        if (z) {
            m30573(c12053jb, interfaceC12038in);
        }
        return this.f29488.m30642(strM30610);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0079  */
    /* JADX INFO: renamed from: ﻐ */
    private void m30573(final C12053jb c12053jb, final InterfaceC12038in interfaceC12038in) {
        int i = 2 % 2;
        String strMo30612 = c12053jb.mo30612();
        StringBuilder sb = new StringBuilder();
        sb.append(m30578());
        sb.append(m30580("̪", (char) (8629 - KeyEvent.getDeadChar(0, 0)), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getScrollBarSize() >> 8) - 1445158854, "㪀\udca0떩✡").intern());
        sb.append(strMo30612);
        final String string = sb.toString();
        final String strM30610 = c12053jb.m30610();
        if (AbstractC11823ao.m28472().mo28503()) {
            int i2 = f29482 + 63;
            f29486 = i2 % 128;
            int i3 = i2 % 2;
            if (AbstractC11823ao.m28472().mo28500()) {
                C12072ju.m30751(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.1

                    /* JADX INFO: renamed from: ﮐ */
                    private static int f29492 = 67;

                    /* JADX INFO: renamed from: ﱟ */
                    private static int f29493 = 0;

                    /* JADX INFO: renamed from: ﺙ */
                    private static int f29494 = 1;

                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        int i4 = 2 % 2;
                        int i5 = f29493 + 57;
                        f29494 = i5 % 128;
                        int i6 = i5 % 2;
                        String str = string;
                        if (i6 != 0) {
                            m30587(str, c12053jb, strM30610, interfaceC12038in);
                            return;
                        }
                        m30587(str, c12053jb, strM30610, interfaceC12038in);
                        Object obj = null;
                        super.hashCode();
                        throw null;
                    }

                    /* JADX INFO: renamed from: ﾇ */
                    private void m30587(String str, C12053jb c12053jb2, String str2, InterfaceC12038in interfaceC12038in2) {
                        int i4 = 2 % 2;
                        int i5 = f29494 + 51;
                        f29493 = i5 % 128;
                        if (i5 % 2 != 0) {
                            C12050iz.m30577(C12050iz.this).m30564().m30541();
                            throw null;
                        }
                        if (!C12050iz.m30577(C12050iz.this).m30564().m30541()) {
                            m30586(c12053jb2, interfaceC12038in2);
                            return;
                        }
                        try {
                            C12045iu c12045iuM30546 = C12048ix.m30546(str);
                            try {
                                if (c12045iuM30546 == null || c12045iuM30546.m30525().m30528() != 200) {
                                    if (!C12050iz.m30577(C12050iz.this).m30564().m30541()) {
                                        m30586(c12053jb2, interfaceC12038in2);
                                        return;
                                    }
                                    if (c12045iuM30546.m30525().m30528() != 403) {
                                        int i6 = f29494 + 33;
                                        f29493 = i6 % 128;
                                        int i7 = i6 % 2;
                                        if (c12045iuM30546.m30525().m30528() != 404) {
                                            return;
                                        }
                                    }
                                    if (str.contains(m30585("\u0007\u0010\u0018\uffd1", Color.red(0) + 4, false, (ViewConfiguration.getLongPressTimeout() >> 16) + 4, (ViewConfiguration.getScrollBarSize() >> 8) + 161).intern())) {
                                        c12053jb2.m30614();
                                        C12050iz.this.m30582(c12053jb2, interfaceC12038in2);
                                        return;
                                    }
                                    return;
                                }
                                int i8 = f29493 + 115;
                                f29494 = i8 % 128;
                                int i9 = i8 % 2;
                                String strM30584 = m30584(C12048ix.m30554(c12045iuM30546));
                                if (Charset.forName(m30585("\u0002\u0002\u000e\f￦\ufffa\f￼", 8 - Color.red(0), false, 2 - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.argb(0, 0, 0, 0) + 138).intern()).newEncoder().canEncode(strM30584)) {
                                    if (TextUtils.isEmpty(strM30584)) {
                                        return;
                                    }
                                    C12050iz.m30579(C12050iz.this).m30651(str2, strM30584);
                                    C12089p.m30943(new AbstractRunnableC12044it(str2, strM30584) { // from class: com.ironsource.adqualitysdk.sdk.i.iz.1.5

                                        /* JADX INFO: renamed from: ﻛ */
                                        private /* synthetic */ String f29503;

                                        {
                                            this.f29503 = strM30584;
                                        }

                                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                                        /* JADX INFO: renamed from: ﻛ */
                                        public final void mo28224() {
                                            this.f29504.mo28594(this.f29503);
                                        }
                                    });
                                    return;
                                }
                                String strIntern = m30585("\u0016\u0011\u000f\u0007\ufff4￤￦\u0007", 8 - ExpandableListView.getPackedPositionType(0L), true, 5 - (ViewConfiguration.getWindowTouchSlop() >> 8), View.resolveSizeAndState(0, 0, 0) + 161).intern();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(m30585("\u0006\u0012\u000f\r\uffc0￤\u0005\u0003\u0012\u0019\u0010\u0014\u0005\u0004\uffc0\u0013\u0014\u0012\t\u000e\u0007\uffc0", TextUtils.getTrimmedLength("") + 22, false, TextUtils.indexOf("", "") + 5, ExpandableListView.getPackedPositionChild(0L) + 164).intern());
                                sb2.append(str);
                                sb2.append(m30585("\b\u0003\uffbf\u0002\u0007\u0000\u0011\u0012\uffbf\u0002\u000e\r\u0013\u0000\b\r\u0012\uffbf\b\r\u0015\u0000\u000b", 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), false, (ViewConfiguration.getEdgeSlop() >> 16) + 8, 164 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern());
                                C12080kb.m30845(strIntern, sb2.toString(), (Throwable) null, false);
                                return;
                            } catch (Exception e) {
                                e = e;
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                        if (!C12050iz.m30577(C12050iz.this).m30564().m30541()) {
                            m30586(c12053jb2, interfaceC12038in2);
                            return;
                        }
                        String strIntern2 = m30585("\u0016\u0011\u000f\u0007\ufff4￤￦\u0007", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8, true, 6 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 161).intern();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(m30585("\u000f\b\uffc1\u0013\u0006\u000e\u0010\u0015\u0006\uffc1\ufff4\u0015\u0013\n\u000f\b\uffc1\u0007\u0013\u0010\u000e\uffc1￦\u0013\u0013\u0010\u0013\uffc1\b\u0006\u0015\u0015\n", 33 - (ViewConfiguration.getFadingEdgeLength() >> 16), false, Color.blue(0) + 22, ((byte) KeyEvent.getModifierMetaStateMask()) + 163).intern());
                        sb3.append(str);
                        C12080kb.m30845(strIntern2, sb3.toString(), (Throwable) e, false);
                    }

                    /* JADX INFO: renamed from: ﻐ */
                    private static String m30584(String str) throws JSONException {
                        int i4 = 2 % 2;
                        JSONObject jSONObject = new JSONObject(str);
                        String strOptString = jSONObject.optString(m30585("\u0007\ufffe￼", (Process.myTid() >> 22) + 3, true, View.getDefaultSize(0, 0) + 2, 171 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
                        if (!TextUtils.isEmpty(strOptString)) {
                            String strM30746 = C12072ju.m30746(strOptString, C12050iz.m30572(), jSONObject.optString(m30585("\ufffa\u0007", 2 - KeyEvent.keyCodeFromString(""), false, 2 - View.MeasureSpec.makeMeasureSpec(0, 0), 178 - (ViewConfiguration.getTouchSlop() >> 8)).intern()), jSONObject.optString(m30585("\ufff4\u0006\u0007\uffff", 4 - (ViewConfiguration.getPressedStateDuration() >> 16), true, 2 - ExpandableListView.getPackedPositionType(0L), TextUtils.getOffsetBefore("", 0) + 176).intern()));
                            int i5 = f29494 + 77;
                            f29493 = i5 % 128;
                            if (i5 % 2 == 0) {
                                return strM30746;
                            }
                            throw null;
                        }
                        int i6 = f29493 + 23;
                        f29494 = i6 % 128;
                        int i7 = i6 % 2;
                        return str;
                    }

                    /* JADX INFO: renamed from: ﻛ */
                    private void m30586(final C12053jb c12053jb2, final InterfaceC12038in interfaceC12038in2) {
                        int i4 = 2 % 2;
                        C12050iz.m30577(C12050iz.this).m30564().m30540(new InterfaceC12041iq() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.1.2
                            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12041iq
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo28406() {
                                C12050iz.m30577(C12050iz.this).m30564().m30544(this);
                                C12050iz.m30576(C12050iz.this, c12053jb2, interfaceC12038in2);
                            }
                        });
                        int i5 = f29493 + 41;
                        f29494 = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 92 / 0;
                        }
                    }

                    /* JADX INFO: renamed from: ﻛ */
                    private static String m30585(String str, int i4, boolean z, int i5, int i6) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (C11889d.f28479) {
                            char[] cArr2 = new char[i4];
                            C11889d.f28481 = 0;
                            while (C11889d.f28481 < i4) {
                                C11889d.f28480 = cArr[C11889d.f28481];
                                cArr2[C11889d.f28481] = (char) (C11889d.f28480 + i6);
                                int i7 = C11889d.f28481;
                                cArr2[i7] = (char) (cArr2[i7] - f29492);
                                C11889d.f28481++;
                            }
                            if (i5 > 0) {
                                C11889d.f28478 = i5;
                                char[] cArr3 = new char[i4];
                                System.arraycopy(cArr2, 0, cArr3, 0, i4);
                                System.arraycopy(cArr3, 0, cArr2, i4 - C11889d.f28478, C11889d.f28478);
                                System.arraycopy(cArr3, C11889d.f28478, cArr2, 0, i4 - C11889d.f28478);
                            }
                            if (z) {
                                char[] cArr4 = new char[i4];
                                C11889d.f28481 = 0;
                                while (C11889d.f28481 < i4) {
                                    cArr4[C11889d.f28481] = cArr2[(i4 - C11889d.f28481) - 1];
                                    C11889d.f28481++;
                                }
                                cArr2 = cArr4;
                            }
                            str2 = new String(cArr2);
                        }
                        return str2;
                    }
                });
            } else {
                int i4 = f29482 + 91;
                f29486 = i4 % 128;
                if (i4 % 2 != 0) {
                    this.f29488.m30642(strM30610);
                    throw null;
                }
                if (this.f29488.m30642(strM30610) == null) {
                    C12072ju.m30751(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.1

                        /* JADX INFO: renamed from: ﮐ */
                        private static int f29492 = 67;

                        /* JADX INFO: renamed from: ﱟ */
                        private static int f29493 = 0;

                        /* JADX INFO: renamed from: ﺙ */
                        private static int f29494 = 1;

                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            int i5 = 2 % 2;
                            int i6 = f29493 + 57;
                            f29494 = i6 % 128;
                            int i7 = i6 % 2;
                            String str = string;
                            if (i7 != 0) {
                                m30587(str, c12053jb, strM30610, interfaceC12038in);
                                return;
                            }
                            m30587(str, c12053jb, strM30610, interfaceC12038in);
                            Object obj = null;
                            super.hashCode();
                            throw null;
                        }

                        /* JADX INFO: renamed from: ﾇ */
                        private void m30587(String str, C12053jb c12053jb2, String str2, InterfaceC12038in interfaceC12038in2) {
                            int i5 = 2 % 2;
                            int i6 = f29494 + 51;
                            f29493 = i6 % 128;
                            if (i6 % 2 != 0) {
                                C12050iz.m30577(C12050iz.this).m30564().m30541();
                                throw null;
                            }
                            if (!C12050iz.m30577(C12050iz.this).m30564().m30541()) {
                                m30586(c12053jb2, interfaceC12038in2);
                                return;
                            }
                            try {
                                C12045iu c12045iuM30546 = C12048ix.m30546(str);
                                try {
                                    if (c12045iuM30546 == null || c12045iuM30546.m30525().m30528() != 200) {
                                        if (!C12050iz.m30577(C12050iz.this).m30564().m30541()) {
                                            m30586(c12053jb2, interfaceC12038in2);
                                            return;
                                        }
                                        if (c12045iuM30546.m30525().m30528() != 403) {
                                            int i7 = f29494 + 33;
                                            f29493 = i7 % 128;
                                            int i8 = i7 % 2;
                                            if (c12045iuM30546.m30525().m30528() != 404) {
                                                return;
                                            }
                                        }
                                        if (str.contains(m30585("\u0007\u0010\u0018\uffd1", Color.red(0) + 4, false, (ViewConfiguration.getLongPressTimeout() >> 16) + 4, (ViewConfiguration.getScrollBarSize() >> 8) + 161).intern())) {
                                            c12053jb2.m30614();
                                            C12050iz.this.m30582(c12053jb2, interfaceC12038in2);
                                            return;
                                        }
                                        return;
                                    }
                                    int i9 = f29493 + 115;
                                    f29494 = i9 % 128;
                                    int i10 = i9 % 2;
                                    String strM30584 = m30584(C12048ix.m30554(c12045iuM30546));
                                    if (Charset.forName(m30585("\u0002\u0002\u000e\f￦\ufffa\f￼", 8 - Color.red(0), false, 2 - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.argb(0, 0, 0, 0) + 138).intern()).newEncoder().canEncode(strM30584)) {
                                        if (TextUtils.isEmpty(strM30584)) {
                                            return;
                                        }
                                        C12050iz.m30579(C12050iz.this).m30651(str2, strM30584);
                                        C12089p.m30943(new AbstractRunnableC12044it(str2, strM30584) { // from class: com.ironsource.adqualitysdk.sdk.i.iz.1.5

                                            /* JADX INFO: renamed from: ﻛ */
                                            private /* synthetic */ String f29503;

                                            {
                                                this.f29503 = strM30584;
                                            }

                                            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                                            /* JADX INFO: renamed from: ﻛ */
                                            public final void mo28224() {
                                                this.f29504.mo28594(this.f29503);
                                            }
                                        });
                                        return;
                                    }
                                    String strIntern = m30585("\u0016\u0011\u000f\u0007\ufff4￤￦\u0007", 8 - ExpandableListView.getPackedPositionType(0L), true, 5 - (ViewConfiguration.getWindowTouchSlop() >> 8), View.resolveSizeAndState(0, 0, 0) + 161).intern();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(m30585("\u0006\u0012\u000f\r\uffc0￤\u0005\u0003\u0012\u0019\u0010\u0014\u0005\u0004\uffc0\u0013\u0014\u0012\t\u000e\u0007\uffc0", TextUtils.getTrimmedLength("") + 22, false, TextUtils.indexOf("", "") + 5, ExpandableListView.getPackedPositionChild(0L) + 164).intern());
                                    sb2.append(str);
                                    sb2.append(m30585("\b\u0003\uffbf\u0002\u0007\u0000\u0011\u0012\uffbf\u0002\u000e\r\u0013\u0000\b\r\u0012\uffbf\b\r\u0015\u0000\u000b", 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), false, (ViewConfiguration.getEdgeSlop() >> 16) + 8, 164 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern());
                                    C12080kb.m30845(strIntern, sb2.toString(), (Throwable) null, false);
                                    return;
                                } catch (Exception e) {
                                    e = e;
                                }
                            } catch (Exception e2) {
                                e = e2;
                            }
                            if (!C12050iz.m30577(C12050iz.this).m30564().m30541()) {
                                m30586(c12053jb2, interfaceC12038in2);
                                return;
                            }
                            String strIntern2 = m30585("\u0016\u0011\u000f\u0007\ufff4￤￦\u0007", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8, true, 6 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 161).intern();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m30585("\u000f\b\uffc1\u0013\u0006\u000e\u0010\u0015\u0006\uffc1\ufff4\u0015\u0013\n\u000f\b\uffc1\u0007\u0013\u0010\u000e\uffc1￦\u0013\u0013\u0010\u0013\uffc1\b\u0006\u0015\u0015\n", 33 - (ViewConfiguration.getFadingEdgeLength() >> 16), false, Color.blue(0) + 22, ((byte) KeyEvent.getModifierMetaStateMask()) + 163).intern());
                            sb3.append(str);
                            C12080kb.m30845(strIntern2, sb3.toString(), (Throwable) e, false);
                        }

                        /* JADX INFO: renamed from: ﻐ */
                        private static String m30584(String str) throws JSONException {
                            int i5 = 2 % 2;
                            JSONObject jSONObject = new JSONObject(str);
                            String strOptString = jSONObject.optString(m30585("\u0007\ufffe￼", (Process.myTid() >> 22) + 3, true, View.getDefaultSize(0, 0) + 2, 171 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
                            if (!TextUtils.isEmpty(strOptString)) {
                                String strM30746 = C12072ju.m30746(strOptString, C12050iz.m30572(), jSONObject.optString(m30585("\ufffa\u0007", 2 - KeyEvent.keyCodeFromString(""), false, 2 - View.MeasureSpec.makeMeasureSpec(0, 0), 178 - (ViewConfiguration.getTouchSlop() >> 8)).intern()), jSONObject.optString(m30585("\ufff4\u0006\u0007\uffff", 4 - (ViewConfiguration.getPressedStateDuration() >> 16), true, 2 - ExpandableListView.getPackedPositionType(0L), TextUtils.getOffsetBefore("", 0) + 176).intern()));
                                int i6 = f29494 + 77;
                                f29493 = i6 % 128;
                                if (i6 % 2 == 0) {
                                    return strM30746;
                                }
                                throw null;
                            }
                            int i7 = f29493 + 23;
                            f29494 = i7 % 128;
                            int i8 = i7 % 2;
                            return str;
                        }

                        /* JADX INFO: renamed from: ﻛ */
                        private void m30586(final C12053jb c12053jb2, final InterfaceC12038in interfaceC12038in2) {
                            int i5 = 2 % 2;
                            C12050iz.m30577(C12050iz.this).m30564().m30540(new InterfaceC12041iq() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.1.2
                                @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12041iq
                                /* JADX INFO: renamed from: ﾒ */
                                public final void mo28406() {
                                    C12050iz.m30577(C12050iz.this).m30564().m30544(this);
                                    C12050iz.m30576(C12050iz.this, c12053jb2, interfaceC12038in2);
                                }
                            });
                            int i6 = f29493 + 41;
                            f29494 = i6 % 128;
                            if (i6 % 2 == 0) {
                                int i7 = 92 / 0;
                            }
                        }

                        /* JADX INFO: renamed from: ﻛ */
                        private static String m30585(String str, int i5, boolean z, int i6, int i7) {
                            String str2;
                            Object charArray = str;
                            if (str != null) {
                                charArray = str.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (C11889d.f28479) {
                                char[] cArr2 = new char[i5];
                                C11889d.f28481 = 0;
                                while (C11889d.f28481 < i5) {
                                    C11889d.f28480 = cArr[C11889d.f28481];
                                    cArr2[C11889d.f28481] = (char) (C11889d.f28480 + i7);
                                    int i8 = C11889d.f28481;
                                    cArr2[i8] = (char) (cArr2[i8] - f29492);
                                    C11889d.f28481++;
                                }
                                if (i6 > 0) {
                                    C11889d.f28478 = i6;
                                    char[] cArr3 = new char[i5];
                                    System.arraycopy(cArr2, 0, cArr3, 0, i5);
                                    System.arraycopy(cArr3, 0, cArr2, i5 - C11889d.f28478, C11889d.f28478);
                                    System.arraycopy(cArr3, C11889d.f28478, cArr2, 0, i5 - C11889d.f28478);
                                }
                                if (z) {
                                    char[] cArr4 = new char[i5];
                                    C11889d.f28481 = 0;
                                    while (C11889d.f28481 < i5) {
                                        cArr4[C11889d.f28481] = cArr2[(i5 - C11889d.f28481) - 1];
                                        C11889d.f28481++;
                                    }
                                    cArr2 = cArr4;
                                }
                                str2 = new String(cArr2);
                            }
                            return str2;
                        }
                    });
                }
            }
        }
        int i5 = f29486 + 87;
        f29482 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public final boolean m30581(C12053jb c12053jb) {
        int i = 2 % 2;
        int i2 = f29486 + 33;
        f29482 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 76 / 0;
            if (this.f29488.m30642(c12053jb.m30610()) != null) {
                return true;
            }
        } else {
            if (this.f29488.m30642(c12053jb.m30610()) != null) {
                return true;
            }
        }
        int i4 = f29482 + 63;
        f29486 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30580(String str, char c, String str2, int i, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (C12051j.f29510) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            C12051j.f29511 = 0;
            while (C12051j.f29511 < length) {
                int i2 = (C12051j.f29511 + 2) % 4;
                int i3 = (C12051j.f29511 + 3) % 4;
                C12051j.f29509 = (char) (((cArr4[C12051j.f29511 % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = C12051j.f29509;
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f29483) ^ ((long) f29484)) ^ ((long) f29485));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}

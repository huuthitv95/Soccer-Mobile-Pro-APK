package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.be */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11840be extends C11886cx implements InterfaceC11870ch {

    /* JADX INFO: renamed from: ﱟ */
    private static int f27594 = 0;

    /* JADX INFO: renamed from: ﱡ */
    private static int f27595 = 1;

    /* JADX INFO: renamed from: ﺙ */
    private static long f27596 = -3907461952839558503L;

    /* JADX INFO: renamed from: ﾒ */
    private static long f27597 = -1379339903010496422L;

    /* JADX INFO: renamed from: ﻐ */
    private String f27598;

    /* JADX INFO: renamed from: ﻛ */
    private String f27599;

    /* JADX INFO: renamed from: ｋ */
    private Map<String, b> f27600;

    /* JADX INFO: renamed from: ﾇ */
    private String f27601;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.be$b */
    interface b {
        /* JADX INFO: renamed from: ﾇ */
        Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl);
    }

    /* JADX INFO: renamed from: ｋ */
    abstract Map<String, b> mo28807();

    /* JADX INFO: renamed from: ﾇ */
    abstract Class mo28808(String str);

    /* JADX INFO: renamed from: ﾇ */
    abstract String mo28809();

    /* JADX INFO: renamed from: Ꮧ */
    static /* synthetic */ Object m28822(List list, Class cls) {
        int i = 2 % 2;
        int i2 = f27595 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f27594 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = m29851((List<Object>) list, 0, (Class<Object>) cls);
        int i4 = f27594 + 5;
        f27595 = i4 % 128;
        int i5 = i4 % 2;
        return obj;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ Class m28823(AbstractC11840be abstractC11840be, String str) {
        int i = 2 % 2;
        int i2 = f27594 + 5;
        f27595 = i2 % 128;
        int i3 = i2 % 2;
        Class clsM28825 = abstractC11840be.m28825(str, false);
        int i4 = f27594 + 57;
        f27595 = i4 % 128;
        int i5 = i4 % 2;
        return clsM28825;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ String m28824(AbstractC11840be abstractC11840be) {
        int i = 2 % 2;
        int i2 = f27594 + 21;
        f27595 = i2 % 128;
        int i3 = i2 % 2;
        String str = abstractC11840be.f27598;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    public AbstractC11840be(String str) {
        this.f27599 = str;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final void m28836() {
        int i = 2 % 2;
        Map<String, b> mapMo28807 = mo28807();
        this.f27600 = mapMo28807;
        mapMo28807.put(m28827("ꠝꡮ䒘\ue4a7턊释\udac3㮋⤀收厺妮ꪩ\ue7d9툘\ud830ⱗ恹問庢귓", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), new b() { // from class: com.ironsource.adqualitysdk.sdk.i.be.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                AbstractC11840be.this.m28832((String) AbstractC11840be.m28822(list, String.class));
                return AbstractC11840be.m28824(AbstractC11840be.this);
            }
        });
        this.f27600.put(m28827("\uf637\uf65e瓮퓇痩㔛⹝켦眳啀\uf754괴\uf48c힒盺Ⲋ牼倕\uf198ꨎ\uf3c4텱猻", View.resolveSizeAndState(0, 0, 0)).intern(), new b() { // from class: com.ironsource.adqualitysdk.sdk.i.be.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return Boolean.valueOf(AbstractC11840be.this.m28828());
            }
        });
        this.f27600.put(m28826("\udafe灗辻\udadb灙辯\udae8灇", 43692 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), new b() { // from class: com.ironsource.adqualitysdk.sdk.i.be.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return AbstractC11840be.m28823(AbstractC11840be.this, (String) list.get(0));
            }
        });
        int i2 = f27594 + 99;
        f27595 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0031 A[Catch: all -> 0x0045, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000c, B:9:0x0041, B:8:0x0031), top: B:15:0x0002 }] */
    /* JADX INFO: renamed from: ﻛ */
    public final synchronized String m28834() {
        int i = 2 % 2;
        if (TextUtils.isEmpty(this.f27601)) {
            this.f27601 = mo28809();
            int i2 = f27595 + 37;
            f27594 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            int i5 = f27594 + 47;
            f27595 = i5 % 128;
            int i6 = i5 % 2;
            if (this.f27601.equals(m28827("ꈺꉿﰅ少谍쳸ᮡ\ufaed⌞\udd82ຠ", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1).intern())) {
                this.f27601 = mo28809();
                int i7 = f27595 + 37;
                f27594 = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            }
        }
        return this.f27601;
    }

    /* JADX INFO: renamed from: ﻐ */
    public String mo28831() {
        int i = 2 % 2;
        String str = this.f27598;
        if (str == null) {
            return m28834();
        }
        int i2 = f27595 + 109;
        int i3 = i2 % 128;
        f27594 = i3;
        if (i2 % 2 != 0) {
            int i4 = 1 / 0;
        }
        int i5 = i3 + 53;
        f27595 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final void m28832(String str) {
        int i = 2 % 2;
        int i2 = f27595 + 45;
        int i3 = i2 % 128;
        f27594 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.f27598 = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f27595 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ */
    public final boolean m28828() {
        int i = 2 % 2;
        int i2 = f27595 + 109;
        int i3 = i2 % 128;
        f27594 = i3;
        int i4 = i2 % 2;
        if (this.f27598 == null) {
            return false;
        }
        int i5 = i3 + 21;
        f27595 = i5 % 128;
        return i5 % 2 != 0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC11870ch
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo28830(String str, List<Object> list, InterfaceC11874cl interfaceC11874cl) {
        int i = 2 % 2;
        int i2 = f27595 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f27594 = i2 % 128;
        int i3 = i2 % 2;
        b bVar = this.f27600.get(str);
        try {
            if (bVar == null) {
                String str2 = this.f27599;
                StringBuilder sb = new StringBuilder();
                sb.append(m28827("뼶뽳陋她蛌옊콌⸭㸬\ud8b3ѳ䰣붃娘藻춇㭧\uddadʁ䭋뫸峊耪죪㡈\ude56Ɩ䙖뜣凯轆으㚊퍃ಡ", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1).intern());
                sb.append(str);
                sb.append(m28826("\udabe㰈\u17ef滵䁐宺닳鑛\uefa5욺\ud859㎯૩氖䞰廩끙讲\ue2f0쑚\udfb1㛻ࡏ", (ViewConfiguration.getEdgeSlop() >> 16) + 59051).intern());
                C11875cm.m29607(str2, sb.toString(), null);
                return null;
            }
            int i4 = f27594 + 115;
            f27595 = i4 % 128;
            if (i4 % 2 == 0) {
                Object objMo28810 = bVar.mo28810(list, interfaceC11874cl);
                int i5 = 1 / 0;
                return objMo28810;
            }
            return bVar.mo28810(list, interfaceC11874cl);
        } catch (Exception e) {
            String str3 = this.f27599;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m28827("뼶뽳陋她蛌옊콌⸭㸬\ud8b3ѳ䰣붃娘藻춇㭧\uddadʁ䭋뫸峊耪죪㡈\ude56Ɩ䙖뜣凯轆으㚊퍃ಡ", View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
            sb2.append(str);
            sb2.append(m28826("\udabe", Color.green(0) + 56039).intern());
            C11875cm.m29607(str3, sb2.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public final Class m28833(String str) {
        int i = 2 % 2;
        try {
            if (Prode.m28198()) {
                return mo28808(str);
            }
            int i2 = f27595 + 35;
            f27594 = i2 % 128;
            int i3 = i2 % 2;
            Class clsM28825 = m28825(str, false);
            int i4 = f27594 + 91;
            f27595 = i4 % 128;
            if (i4 % 2 != 0) {
                return clsM28825;
            }
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public final Class m28835(String str) {
        int i = 2 % 2;
        int i2 = f27594 + 99;
        f27595 = i2 % 128;
        int i3 = i2 % 2;
        Class clsM28825 = m28825(str, true);
        int i4 = f27595 + 43;
        f27594 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return clsM28825;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:50:0x0158  */
    /* JADX WARN: Code duplicated, block: B:51:0x015a  */
    /* JADX INFO: renamed from: ｋ */
    private Class m28825(String str, boolean z) {
        byte b2 = 2;
        int i = 2 % 2;
        try {
            if (str.contains(m28826("\udab7", View.combineMeasuredStates(0, 0) + 271).intern())) {
                int i2 = f27595 + 45;
                f27594 = i2 % 128;
                if (i2 % 2 == 0) {
                    return C12079ka.m30818(str, z);
                }
                int i3 = 11 / 0;
                return C12079ka.m30818(str, z);
            }
            switch (str.hashCode()) {
                case -1325958191:
                    if (!str.equals(m28826("\udafd\ue05f꾾甀けﾱ", 15016 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                        b2 = -1;
                    } else {
                        int i4 = f27595 + 93;
                        f27594 = i4 % 128;
                        if (i4 % 2 != 0) {
                            b2 = 5;
                        }
                    }
                    break;
                case 104431:
                    if (!str.equals(m28826("\udaf0\uf866鿏", KeyEvent.normalizeMetaState(0) + 8849).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case 3029738:
                    if (str.equals(m28826("\udafb雗䊴㺖", TextUtils.getOffsetAfter("", 0) + 19489).intern())) {
                        b2 = 4;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 3039496:
                    if (!str.equals(m28827("\ue797\ue7f5\uee37且䚅مᨉﭢ", Color.blue(0)).intern())) {
                        b2 = -1;
                    } else {
                        int i5 = f27594 + 109;
                        f27595 = i5 % 128;
                        int i6 = i5 % 2;
                        b2 = 6;
                    }
                    break;
                case 3052374:
                    if (!str.equals(m28827("دٌ\ueeff仍\ue1c0ꄕ슰⏌", (-1) - TextUtils.lastIndexOf("", '0')).intern())) {
                        b2 = -1;
                    } else {
                        int i7 = f27595 + 41;
                        f27594 = i7 % 128;
                        if (i7 % 2 == 0) {
                            b2 = 5;
                        }
                    }
                    break;
                case 3327612:
                    if (!str.equals(m28827("볈벤\ue4ec䓙蟀윚皝韴", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case 3625364:
                    if (!str.equals(m28826("\udaef䝡\ue1deȸ", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 40343).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 7;
                    }
                    break;
                case 97526364:
                    if (!str.equals(m28826("\udaff뜮ŀ鍩涁", View.MeasureSpec.makeMeasureSpec(0, 0) + 28123).intern())) {
                        b2 = -1;
                    } else {
                        int i8 = f27595 + 49;
                        f27594 = i8 % 128;
                        if (i8 % 2 == 0) {
                            b2 = 3;
                        }
                    }
                    break;
                case 109413500:
                    if (!str.equals(m28827("㕾㔍쳭泟鱬\udcb7錔牨둢", TextUtils.indexOf("", "", 0, 0)).intern())) {
                        b2 = -1;
                    } else {
                        int i9 = f27594 + 71;
                        f27595 = i9 % 128;
                        int i10 = i9 % 2;
                        b2 = 8;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    return Integer.TYPE;
                case 1:
                    return Long.TYPE;
                case 2:
                    return Double.TYPE;
                case 3:
                    return Float.TYPE;
                case 4:
                    return Boolean.TYPE;
                case 5:
                    return Character.TYPE;
                case 6:
                    return Byte.TYPE;
                case 7:
                    return Void.TYPE;
                case 8:
                    return Short.TYPE;
                default:
                    return mo28808(str);
            }
        } catch (Throwable th) {
            if (!z) {
                return null;
            }
            String str2 = this.f27599;
            StringBuilder sb = new StringBuilder();
            sb.append(m28827("☳♰䮱\ueb87坵ហ舜捡Ꜩ橓", View.getDefaultSize(0, 0)).intern());
            sb.append(str);
            sb.append(m28826("\udab9⯖㢴\u098eḽ潚簰䴋叿ꃔ", 61729 - (ViewConfiguration.getTapTimeout() >> 16)).intern());
            C11875cm.m29607(str2, sb.toString(), th);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    final void m28837(InterfaceC12003hf interfaceC12003hf, InterfaceC11874cl interfaceC11874cl, String str, Object... objArr) {
        int i = 2 % 2;
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
            arrayList.add(0, interfaceC12003hf);
            interfaceC11874cl.mo29605(str, arrayList);
            int i2 = f27595 + 109;
            f27594 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            String str2 = this.f27599;
            StringBuilder sb = new StringBuilder();
            sb.append(m28826("\udadc\ua63e⍁겉⦿ꪐ㘎댤㰑", 31956 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
            sb.append(this);
            C11875cm.m29607(str2, sb.toString(), th);
        }
    }

    /* JADX INFO: renamed from: ﻏ */
    public boolean mo28821() {
        int i = 2 % 2;
        int i2 = f27595 + 15;
        int i3 = i2 % 128;
        f27594 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 103;
        f27595 = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ */
    public boolean mo28829() {
        int i = 2 % 2;
        int i2 = f27594 + 37;
        int i3 = i2 % 128;
        f27595 = i3;
        boolean z = i2 % 2 == 0;
        int i4 = i3 + 15;
        f27594 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m28827(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f27597, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f27597));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m28826(String str, int i) {
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
                cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f27596);
                C11997h.f29103++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}

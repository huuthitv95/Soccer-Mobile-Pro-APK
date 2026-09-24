package com.ironsource;

import com.ironsource.mediationsdk.C12333d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.W */
/* JADX INFO: loaded from: classes6.dex */
public class C11723W {

    /* JADX INFO: renamed from: q */
    public static final a f26053q = new a(null);

    /* JADX INFO: renamed from: r */
    public static final int f26054r = -1;

    /* JADX INFO: renamed from: a */
    private final IronSource.EnumC12328a f26055a;

    /* JADX INFO: renamed from: b */
    private final String f26056b;

    /* JADX INFO: renamed from: c */
    private final List<NetworkSettings> f26057c;

    /* JADX INFO: renamed from: d */
    private final C12470s2 f26058d;

    /* JADX INFO: renamed from: e */
    private int f26059e;

    /* JADX INFO: renamed from: f */
    private final int f26060f;

    /* JADX INFO: renamed from: g */
    private boolean f26061g;

    /* JADX INFO: renamed from: h */
    private final int f26062h;

    /* JADX INFO: renamed from: i */
    private final int f26063i;

    /* JADX INFO: renamed from: j */
    private final C11588O0 f26064j;

    /* JADX INFO: renamed from: k */
    private final C11498J0 f26065k;

    /* JADX INFO: renamed from: l */
    private final long f26066l;

    /* JADX INFO: renamed from: m */
    private final boolean f26067m;

    /* JADX INFO: renamed from: n */
    private final boolean f26068n;

    /* JADX INFO: renamed from: o */
    private final boolean f26069o;

    /* JADX INFO: renamed from: p */
    private boolean f26070p;

    /* JADX INFO: renamed from: com.ironsource.W$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11723W(IronSource.EnumC12328a adUnit, String str, List<? extends NetworkSettings> list, C12470s2 auctionSettings, int i, int i2, boolean z, int i3, int i4, C11588O0 loadingData, C11498J0 interactionData, long j, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        Intrinsics.checkNotNullParameter(interactionData, "interactionData");
        this.f26055a = adUnit;
        this.f26056b = str;
        this.f26057c = list;
        this.f26058d = auctionSettings;
        this.f26059e = i;
        this.f26060f = i2;
        this.f26061g = z;
        this.f26062h = i3;
        this.f26063i = i4;
        this.f26064j = loadingData;
        this.f26065k = interactionData;
        this.f26066l = j;
        this.f26067m = z2;
        this.f26068n = z3;
        this.f26069o = z4;
        this.f26070p = z5;
    }

    /* JADX INFO: renamed from: a */
    public final void m27766a(int i) {
        this.f26059e = i;
    }

    /* JADX INFO: renamed from: b */
    public final IronSource.EnumC12328a m27768b() {
        return this.f26055a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m27770c() {
        return this.f26061g;
    }

    /* JADX INFO: renamed from: d */
    public final C12470s2 m27771d() {
        return this.f26058d;
    }

    /* JADX INFO: renamed from: e */
    public final long m27772e() {
        return this.f26066l;
    }

    /* JADX INFO: renamed from: f */
    public final int m27773f() {
        return this.f26062h;
    }

    /* JADX INFO: renamed from: g */
    public final C11498J0 m27774g() {
        return this.f26065k;
    }

    /* JADX INFO: renamed from: h */
    public final C11588O0 m27775h() {
        return this.f26064j;
    }

    /* JADX INFO: renamed from: i */
    public final int m27776i() {
        return this.f26059e;
    }

    /* JADX INFO: renamed from: j */
    public List<NetworkSettings> mo27739j() {
        return this.f26057c;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m27777k() {
        return this.f26067m;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m27778l() {
        return this.f26069o;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m27779m() {
        return this.f26070p;
    }

    /* JADX INFO: renamed from: n */
    public final int m27780n() {
        return this.f26060f;
    }

    /* JADX INFO: renamed from: o */
    public String mo27740o() {
        return this.f26056b;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m27781p() {
        return this.f26068n;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m27782q() {
        return this.f26058d.m33281g() > 0;
    }

    /* JADX INFO: renamed from: r */
    public final String m27783r() {
        String str = String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", C12333d.f31060x, Integer.valueOf(this.f26059e), C12333d.f31061y, Boolean.valueOf(this.f26061g), C12333d.f31062z, Boolean.valueOf(this.f26070p));
        Intrinsics.checkNotNullExpressionValue(str, "format(\n          Locale…     showPriorityEnabled)");
        return str;
    }

    /* JADX INFO: renamed from: a */
    public final void m27767a(boolean z) {
        this.f26061g = z;
    }

    /* JADX INFO: renamed from: b */
    public final void m27769b(boolean z) {
        this.f26070p = z;
    }

    /* JADX INFO: renamed from: a */
    public final int m27764a() {
        return this.f26063i;
    }

    /* JADX INFO: renamed from: a */
    public final NetworkSettings m27765a(String instanceName) {
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        List<NetworkSettings> listMo27739j = mo27739j();
        Object obj = null;
        if (listMo27739j == null) {
            return null;
        }
        for (Object obj2 : listMo27739j) {
            if (((NetworkSettings) obj2).getProviderInstanceName().equals(instanceName)) {
                obj = obj2;
                break;
            }
        }
        return (NetworkSettings) obj;
    }

    public /* synthetic */ C11723W(IronSource.EnumC12328a enumC12328a, String str, List list, C12470s2 c12470s2, int i, int i2, boolean z, int i3, int i4, C11588O0 c11588o0, C11498J0 c11498j0, long j, boolean z2, boolean z3, boolean z4, boolean z5, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC12328a, str, list, c12470s2, i, i2, z, i3, i4, c11588o0, c11498j0, j, z2, z3, z4, (i5 & 32768) != 0 ? false : z5);
    }
}

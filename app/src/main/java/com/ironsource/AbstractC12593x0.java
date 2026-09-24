package com.ironsource;

import com.ironsource.mediationsdk.C12333d;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.x0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12593x0 {

    /* JADX INFO: renamed from: r */
    public static final a f32712r = new a(null);

    /* JADX INFO: renamed from: s */
    public static final int f32713s = -1;

    /* JADX INFO: renamed from: a */
    private final C12220h0 f32714a;

    /* JADX INFO: renamed from: b */
    private final boolean f32715b;

    /* JADX INFO: renamed from: c */
    private final String f32716c;

    /* JADX INFO: renamed from: d */
    private final List<NetworkSettings> f32717d;

    /* JADX INFO: renamed from: e */
    private final C12266ja f32718e;

    /* JADX INFO: renamed from: f */
    private final C12470s2 f32719f;

    /* JADX INFO: renamed from: g */
    private int f32720g;

    /* JADX INFO: renamed from: h */
    private final int f32721h;

    /* JADX INFO: renamed from: i */
    private boolean f32722i;

    /* JADX INFO: renamed from: j */
    private final int f32723j;

    /* JADX INFO: renamed from: k */
    private final int f32724k;

    /* JADX INFO: renamed from: l */
    private final C11588O0 f32725l;

    /* JADX INFO: renamed from: m */
    private final long f32726m;

    /* JADX INFO: renamed from: n */
    private final boolean f32727n;

    /* JADX INFO: renamed from: o */
    private final boolean f32728o;

    /* JADX INFO: renamed from: p */
    private final boolean f32729p;

    /* JADX INFO: renamed from: q */
    private boolean f32730q;

    /* JADX INFO: renamed from: com.ironsource.x0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final <AdFormatConfig, AdUnitData> AdUnitData m34092a(C12220h0 adProperties, C11666Sa c11666Sa, Function1<? super C11573N3, ? extends AdFormatConfig> getAdFormatConfig, Function2<? super C12575w0, ? super AdFormatConfig, ? extends AdUnitData> createAdUnitData) {
            List<C12533tc> listEmptyList;
            C11494Ie c11494IeM31106d;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            Intrinsics.checkNotNullParameter(getAdFormatConfig, "getAdFormatConfig");
            Intrinsics.checkNotNullParameter(createAdUnitData, "createAdUnitData");
            AdFormatConfig adformatconfigInvoke = getAdFormatConfig.invoke((c11666Sa == null || (c11494IeM31106d = c11666Sa.m31106d()) == null) ? null : c11494IeM31106d.m26133c());
            if (adformatconfigInvoke == null) {
                throw new IllegalStateException("Error getting " + adProperties.m31567a() + " configurations");
            }
            if (c11666Sa == null || (listEmptyList = c11666Sa.m27471d(adProperties.m31572e(), adProperties.m31570c())) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            String strM32774f = IronSourceUtils.m32774f();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listEmptyList, 10));
            Iterator<T> it = listEmptyList.iterator();
            while (it.hasNext()) {
                arrayList.add(((C12533tc) it.next()).m33799f());
            }
            C12266ja c12266jaM31872b = C12266ja.m31872b();
            Intrinsics.checkNotNullExpressionValue(c12266jaM31872b, "getInstance()");
            return createAdUnitData.invoke(new C12575w0(strM32774f, arrayList, c12266jaM31872b), adformatconfigInvoke);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC12593x0(C12220h0 adProperties, boolean z, String str, List<? extends NetworkSettings> providerList, C12266ja publisherDataHolder, C12470s2 auctionSettings, int i, int i2, boolean z2, int i3, int i4, C11588O0 loadingData, long j, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        this.f32714a = adProperties;
        this.f32715b = z;
        this.f32716c = str;
        this.f32717d = providerList;
        this.f32718e = publisherDataHolder;
        this.f32719f = auctionSettings;
        this.f32720g = i;
        this.f32721h = i2;
        this.f32722i = z2;
        this.f32723j = i3;
        this.f32724k = i4;
        this.f32725l = loadingData;
        this.f32726m = j;
        this.f32727n = z3;
        this.f32728o = z4;
        this.f32729p = z5;
        this.f32730q = z6;
    }

    /* JADX INFO: renamed from: a */
    public final void m34072a(int i) {
        this.f32720g = i;
    }

    /* JADX INFO: renamed from: b */
    public C12220h0 mo26467b() {
        return this.f32714a;
    }

    /* JADX INFO: renamed from: b */
    public abstract JSONObject mo26468b(NetworkSettings networkSettings);

    /* JADX INFO: renamed from: c */
    public abstract String mo26469c();

    /* JADX INFO: renamed from: d */
    public final boolean m34075d() {
        return this.f32722i;
    }

    /* JADX INFO: renamed from: e */
    public final C12470s2 m34076e() {
        return this.f32719f;
    }

    /* JADX INFO: renamed from: f */
    public final long m34077f() {
        return this.f32726m;
    }

    /* JADX INFO: renamed from: g */
    public final int m34078g() {
        return this.f32723j;
    }

    /* JADX INFO: renamed from: h */
    public final int m34079h() {
        return this.f32721h;
    }

    /* JADX INFO: renamed from: i */
    public final C11588O0 m34080i() {
        return this.f32725l;
    }

    /* JADX INFO: renamed from: j */
    public abstract String mo26470j();

    /* JADX INFO: renamed from: k */
    public final int m34081k() {
        return this.f32720g;
    }

    /* JADX INFO: renamed from: l */
    public final String m34082l() {
        String strM32814c;
        C12135cd c12135cdM31573f = mo26467b().m31573f();
        return (c12135cdM31573f == null || (strM32814c = c12135cdM31573f.m32814c()) == null) ? "" : strM32814c;
    }

    /* JADX INFO: renamed from: m */
    public final List<NetworkSettings> m34083m() {
        return this.f32717d;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m34084n() {
        return this.f32727n;
    }

    /* JADX INFO: renamed from: o */
    public final C12266ja m34085o() {
        return this.f32718e;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m34086p() {
        return this.f32729p;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m34087q() {
        return this.f32730q;
    }

    /* JADX INFO: renamed from: r */
    public final String m34088r() {
        return this.f32716c;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m34089s() {
        return this.f32728o;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m34090t() {
        return this.f32719f.m33281g() > 0;
    }

    /* JADX INFO: renamed from: u */
    public boolean mo26471u() {
        return this.f32715b;
    }

    /* JADX INFO: renamed from: v */
    public final String m34091v() {
        String str = String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", C12333d.f31060x, Integer.valueOf(this.f32720g), C12333d.f31061y, Boolean.valueOf(this.f32722i), C12333d.f31062z, Boolean.valueOf(this.f32730q));
        Intrinsics.checkNotNullExpressionValue(str, "format(\n          Locale…     showPriorityEnabled)");
        return str;
    }

    /* JADX INFO: renamed from: a */
    public final void m34073a(boolean z) {
        this.f32722i = z;
    }

    /* JADX INFO: renamed from: b */
    public final void m34074b(boolean z) {
        this.f32730q = z;
    }

    /* JADX INFO: renamed from: a */
    public final int m34070a() {
        return this.f32724k;
    }

    /* JADX INFO: renamed from: a */
    public final NetworkSettings m34071a(String instanceName) {
        Object next;
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        Iterator<T> it = this.f32717d.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((NetworkSettings) next).getProviderInstanceName().equals(instanceName)) {
                return (NetworkSettings) next;
            }
        }
        next = null;
        return (NetworkSettings) next;
    }

    public /* synthetic */ AbstractC12593x0(C12220h0 c12220h0, boolean z, String str, List list, C12266ja c12266ja, C12470s2 c12470s2, int i, int i2, boolean z2, int i3, int i4, C11588O0 c11588o0, long j, boolean z3, boolean z4, boolean z5, boolean z6, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12220h0, z, str, list, c12266ja, c12470s2, i, i2, z2, i3, i4, c11588o0, j, z3, z4, z5, (i5 & 65536) != 0 ? false : z6);
    }

    /* JADX INFO: renamed from: a */
    public AdData mo26466a(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(mo26468b(providerSettings), mo26467b().m31567a(), this.f32716c);
        Intrinsics.checkNotNullExpressionValue(adDataCreateAdDataForNetworkAdapter, "createAdDataForNetworkAd…perties.adFormat, userId)");
        return adDataCreateAdDataForNetworkAdapter;
    }
}

package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.C12332c;
import com.ironsource.mediationsdk.C12357j;
import com.ironsource.mediationsdk.C12366o;
import com.ironsource.mediationsdk.C12367p;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Gf */
/* JADX INFO: loaded from: classes6.dex */
public final class C11459Gf {

    /* JADX INFO: renamed from: a */
    public static final C11459Gf f24392a = new C11459Gf();

    private C11459Gf() {
    }

    /* JADX INFO: renamed from: a */
    public final String m25933a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C11409E1.m25644a(context, m25947c(context));
    }

    /* JADX INFO: renamed from: b */
    public final String m25944b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C11409E1.m25648b(context, m25947c(context));
    }

    /* JADX INFO: renamed from: c */
    public final String m25947c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C11409E1.m25655g(context);
    }

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap<String, List<String>> m25949d() {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.putAll(C12332c.m32303b().m32328d());
        concurrentHashMap.putAll(C12266ja.m31872b().m31877c());
        return concurrentHashMap;
    }

    /* JADX INFO: renamed from: e */
    public final void m25950e() {
        C12367p.m32628h().m32643H();
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m25937a(boolean z) {
        JSONObject jSONObjectM32751b = IronSourceUtils.m32751b(z);
        Intrinsics.checkNotNullExpressionValue(jSONObjectM32751b, "getMediationAdditionalData(isDemandOnlyMode)");
        return jSONObjectM32751b;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m25945b() throws JSONException {
        JSONObject jSONObjectM26073b = C11486I6.m26069a().m26073b();
        Intrinsics.checkNotNullExpressionValue(jSONObjectM26073b, "getProperties().toJSON()");
        return jSONObjectM26073b;
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m25948c() {
        JSONObject jSONObject = new JSONObject();
        try {
            ConcurrentHashMap<String, AdapterBaseWrapper> networkAdaptersMap = C12332c.m32303b().m32329e();
            Intrinsics.checkNotNullExpressionValue(networkAdaptersMap, "networkAdaptersMap");
            for (Map.Entry<String, AdapterBaseWrapper> entry : networkAdaptersMap.entrySet()) {
                if (entry.getValue().getAdapterBaseInterface() != null) {
                    C11459Gf c11459Gf = f24392a;
                    String key = entry.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "entry.key");
                    String strM25936a = c11459Gf.m25936a(key);
                    AdapterBaseInterface adapterBaseInterface = entry.getValue().getAdapterBaseInterface();
                    Intrinsics.checkNotNullExpressionValue(adapterBaseInterface, "entry.value.adapterBaseInterface");
                    String adapterVersion = adapterBaseInterface.getAdapterVersion();
                    Intrinsics.checkNotNullExpressionValue(adapterVersion, "adapterBaseInterface.adapterVersion");
                    jSONObject.putOpt(strM25936a, c11459Gf.m25929a(adapterVersion, adapterBaseInterface.getNetworkSDKVersion()));
                }
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final void m25938a(InterfaceC12133cb interfaceC12133cb) {
        C12112b8.m31149a().m31178b(interfaceC12133cb);
    }

    /* JADX INFO: renamed from: b */
    public final LevelPlayAdSize m25943b(String str, int i, int i2) {
        if (str != null && str.length() != 0 && !Intrinsics.areEqual(str, "CUSTOM")) {
            if (Intrinsics.areEqual(str, C12357j.f31265c)) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            return LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(str);
        }
        return LevelPlayAdSize.Companion.createCustomSize(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public final void m25939a(InterfaceC12389nb interfaceC12389nb) {
        C12642zd.m34322a().m34357b(interfaceC12389nb);
    }

    /* JADX INFO: renamed from: a */
    public final void m25941a(InterfaceC12621ya interfaceC12621ya) {
        C12595x2.m34097a().m34121b(interfaceC12621ya);
    }

    /* JADX INFO: renamed from: a */
    public final int m25930a() {
        return C11455Gb.f24351s.m25905d().mo25842a().mo27892c();
    }

    /* JADX INFO: renamed from: a */
    public final String m25934a(C12135cd c12135cd) {
        String strM32814c;
        return (c12135cd == null || (strM32814c = c12135cd.m32814c()) == null) ? new String() : strM32814c;
    }

    /* JADX INFO: renamed from: a */
    public final String m25935a(NetworkSettings networkSettings) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        String providerDefaultInstance = networkSettings.getProviderDefaultInstance();
        return providerDefaultInstance == null ? new String() : providerDefaultInstance;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m25942a(NetworkSettings networkSettings, IronSource.EnumC12328a adUnit) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return networkSettings.isBidder(adUnit);
    }

    /* JADX INFO: renamed from: a */
    public final ISBannerSize m25931a(String str, int i, int i2) {
        return new ISBannerSize(str, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public final C12366o m25932a(Activity activity, ISBannerSize size) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(size, "size");
        C12366o c12366oM32657b = C12367p.m32628h().m32657b(activity, size);
        Intrinsics.checkNotNullExpressionValue(c12366oM32657b, "getInstance().createBanner(activity, size)");
        return c12366oM32657b;
    }

    /* JADX INFO: renamed from: a */
    public final void m25940a(EnumC12598x5 event, JSONObject data) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(data, "data");
        C11686Td.m27533i().mo25281a(new C12580w5(event, data));
    }

    /* JADX INFO: renamed from: a */
    private final JSONObject m25929a(String str, String str2) {
        return new JSONObject(MapsKt.mapOf(TuplesKt.m43482to(C12644zf.f33347b, str), TuplesKt.m43482to("sdkVersion", str2)));
    }

    /* JADX INFO: renamed from: b */
    public final void m25946b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        IronLog.INTERNAL.error(message);
    }

    /* JADX INFO: renamed from: a */
    public final String m25936a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            try {
                if (!StringsKt.contains$default((CharSequence) key, (CharSequence) "-", false, 2, (Object) null)) {
                    return !StringsKt.contains$default((CharSequence) key, (CharSequence) "_", false, 2, (Object) null) ? key : (String) CollectionsKt.first(StringsKt.split$default((CharSequence) key, new String[]{"_"}, false, 0, 6, (Object) null));
                }
                String str = (String) CollectionsKt.last(StringsKt.split$default((CharSequence) key, new String[]{"-"}, false, 0, 6, (Object) null));
                return !StringsKt.contains$default((CharSequence) str, (CharSequence) "_", false, 2, (Object) null) ? str : (String) CollectionsKt.first(StringsKt.split$default((CharSequence) str, new String[]{"_"}, false, 0, 6, (Object) null));
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
        }
        Exception exc = e;
        C12317m4.m32153d().m32155a(exc);
        IronLog.INTERNAL.error(exc.getMessage());
        return key;
    }
}

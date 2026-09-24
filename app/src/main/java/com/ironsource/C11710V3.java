package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.V3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11710V3 {

    /* JADX INFO: renamed from: a */
    private Boolean f26012a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC12582w7 f26013b = C11455Gb.f24351s.m25905d().mo25842a();

    /* JADX INFO: renamed from: a */
    public final Boolean m27645a() {
        return this.f26012a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC12582w7 m27652b() {
        return this.f26013b;
    }

    /* JADX INFO: renamed from: a */
    public final void m27651a(boolean z) {
        this.f26012a = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: a */
    public final void m27650a(ConcurrentHashMap<String, AbstractAdapter> adapters, ConcurrentHashMap<String, AdapterBaseWrapper> networkAdapters) {
        Unit unit;
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        Intrinsics.checkNotNullParameter(networkAdapters, "networkAdapters");
        for (AbstractAdapter adapter : adapters.values()) {
            Intrinsics.checkNotNullExpressionValue(adapter, "adapter");
            m27648a(adapter, (NetworkSettings) null);
        }
        for (AdapterBaseWrapper adapterBaseWrapper : networkAdapters.values()) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (adapterBaseInterface != null) {
                m27649a(adapterBaseInterface, adapterBaseWrapper.getSettings());
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                IronLog.INTERNAL.error("adapter is null");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27649a(AdapterBaseInterface adapter, NetworkSettings networkSettings) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        try {
            Boolean boolM27643a = m27643a(networkSettings);
            if (boolM27643a == null || !(adapter instanceof AdapterConsentInterface)) {
                return;
            }
            ((AdapterConsentInterface) adapter).setConsent(boolM27643a.booleanValue());
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            String providerName = networkSettings != null ? networkSettings.getProviderName() : null;
            String str = "error while setting consent of " + providerName + ": " + th.getLocalizedMessage();
            m27644a(str);
            IronLog.INTERNAL.error(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27648a(AbstractAdapter adapter, NetworkSettings networkSettings) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        try {
            Boolean boolM27643a = m27643a(networkSettings);
            if (boolM27643a != null) {
                adapter.setNewConsent(boolM27643a.booleanValue());
            }
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            String str = "error while setting consent of " + adapter.getProviderName() + ": " + th.getLocalizedMessage();
            m27644a(str);
            IronLog.INTERNAL.error(str);
        }
    }

    /* JADX INFO: renamed from: a */
    private final Boolean m27643a(NetworkSettings networkSettings) {
        if (networkSettings != null && !networkSettings.isCustomNetwork()) {
            if (networkSettings.getApplicationSettings().has(C11727W3.f26077a)) {
                return Boolean.valueOf(networkSettings.getApplicationSettings().optBoolean(C11727W3.f26077a));
            }
            return this.f26012a;
        }
        return this.f26012a;
    }

    /* JADX INFO: renamed from: a */
    private final void m27644a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            C11399D9.m25613i().mo25281a(new C12580w5(EnumC12598x5.TROUBLESHOOTING_CONSENT_INTERNAL_ERROR, jSONObject));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27646a(int i) {
        JSONObject jSONObjectM32751b = IronSourceUtils.m32751b(false);
        try {
            jSONObjectM32751b.put(IronSourceConstants.EVENTS_EXT1, i + ";" + this.f26013b.mo27875G(ContextProvider.getInstance().getApplicationContext()));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(ExceptionsKt.stackTraceToString(e));
        }
        C11455Gb.f24351s.m25905d().mo25850q().mo25281a(new C12580w5(EnumC12598x5.CONSENT_TCF_CODE, jSONObjectM32751b));
    }

    /* JADX INFO: renamed from: a */
    public final void m27647a(int i, ConcurrentHashMap<String, NetworkSettings> providerSettings) {
        JSONObject applicationSettings;
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        String strMo27875G = this.f26013b.mo27875G(ContextProvider.getInstance().getApplicationContext());
        IronLog ironLog = IronLog.API;
        ironLog.general("TCF Additional Consent: " + strMo27875G);
        ironLog.general("CMP ID: " + i);
        ironLog.general("Network Consent Reporting:");
        ironLog.general("----------------------------");
        Collection<NetworkSettings> collectionValues = providerSettings.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "providerSettings.values");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (networkSettings.getProviderDefaultInstance() != null && !Intrinsics.areEqual(networkSettings.getProviderDefaultInstance(), IronSourceConstants.SUPERSONIC_CONFIG_NAME) && (applicationSettings = networkSettings.getApplicationSettings()) != null && applicationSettings.has(C11727W3.f26077a)) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<NetworkSettings> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((NetworkSettings) obj2).getProviderDefaultInstance())) {
                arrayList2.add(obj2);
            }
        }
        for (NetworkSettings networkSettings2 : arrayList2) {
            IronLog ironLog2 = IronLog.API;
            String providerDefaultInstance = networkSettings2.getProviderDefaultInstance();
            JSONObject applicationSettings2 = networkSettings2.getApplicationSettings();
            ironLog2.general(providerDefaultInstance + ": " + (applicationSettings2 != null ? Boolean.valueOf(applicationSettings2.optBoolean(C11727W3.f26077a)) : null));
        }
    }
}

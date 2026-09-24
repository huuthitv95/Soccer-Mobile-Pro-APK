package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.ironsource.C11399D9;
import com.ironsource.C11710V3;
import com.ironsource.C12196fc;
import com.ironsource.C12317m4;
import com.ironsource.C12518sf;
import com.ironsource.C12580w5;
import com.ironsource.EnumC12598x5;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.c */
/* JADX INFO: loaded from: classes6.dex */
public class C12332c {

    /* JADX INFO: renamed from: k */
    private static final String f31021k = "IronSource";

    /* JADX INFO: renamed from: l */
    private static final String f31022l = "com.ironsource.adapters";

    /* JADX INFO: renamed from: m */
    private static final String f31023m = "aps";

    /* JADX INFO: renamed from: n */
    private static final C12332c f31024n = new C12332c();

    /* JADX INFO: renamed from: o */
    private static final Object f31025o = new Object();

    /* JADX INFO: renamed from: c */
    private String f31028c;

    /* JADX INFO: renamed from: d */
    private String f31029d;

    /* JADX INFO: renamed from: e */
    private Boolean f31030e;

    /* JADX INFO: renamed from: h */
    private final AtomicBoolean f31033h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i */
    private C11710V3 f31034i = new C11710V3();

    /* JADX INFO: renamed from: j */
    private final C12196fc f31035j = new C12196fc();

    /* JADX INFO: renamed from: a */
    private final ConcurrentHashMap<String, AbstractAdapter> f31026a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    private final ConcurrentHashMap<String, AdapterBaseWrapper> f31027b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f */
    private final ConcurrentHashMap<String, List<String>> f31031f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g */
    private final ConcurrentHashMap<IronSource.EnumC12328a, JSONObject> f31032g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.c$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f31036a;

        static {
            int[] iArr = new int[IronSource.EnumC12328a.values().length];
            f31036a = iArr;
            try {
                iArr[IronSource.EnumC12328a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31036a[IronSource.EnumC12328a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31036a[IronSource.EnumC12328a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31036a[IronSource.EnumC12328a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C12332c m32303b() {
        return f31024n;
    }

    /* JADX INFO: renamed from: a */
    public AbstractAdapter m32317a(NetworkSettings networkSettings) {
        return m32278a(m32304b(networkSettings), networkSettings.getProviderTypeForReflection());
    }

    /* JADX INFO: renamed from: c */
    public void m32327c(String str, List<String> list) {
        synchronized (f31025o) {
            this.f31031f.put(str, list);
            if (!this.f31026a.isEmpty()) {
                IronSourceUtils.m32782i("setMetaData key = " + str + ", values = " + list);
                m32311b(str, list);
            }
            m32297a(str, list);
        }
    }

    /* JADX INFO: renamed from: d */
    public ConcurrentHashMap<String, List<String>> m32328d() {
        return this.f31031f;
    }

    /* JADX INFO: renamed from: e */
    public ConcurrentHashMap<String, AdapterBaseWrapper> m32329e() {
        return this.f31027b;
    }

    /* JADX INFO: renamed from: f */
    public void m32330f() {
        this.f31026a.clear();
        this.f31027b.clear();
    }

    /* JADX INFO: renamed from: b */
    public void m32324b(String str, String str2) {
        this.f31028c = str;
        this.f31029d = str2;
    }

    /* JADX INFO: renamed from: a */
    public AbstractAdapter m32318a(NetworkSettings networkSettings, JSONObject jSONObject, boolean z) {
        String coreSDKVersion;
        String strM32304b = m32304b(networkSettings);
        String providerTypeForReflection = z ? "IronSource" : networkSettings.getProviderTypeForReflection();
        synchronized (f31025o) {
            if (this.f31026a.containsKey(strM32304b)) {
                return this.f31026a.get(strM32304b);
            }
            AbstractAdapter abstractAdapterM32278a = m32278a(strM32304b, providerTypeForReflection);
            if (abstractAdapterM32278a == null) {
                m32310b(strM32304b + " adapter was not loaded");
                return null;
            }
            abstractAdapterM32278a.setProviderNetworkKey(networkSettings.getProviderNetworkKey());
            try {
                coreSDKVersion = abstractAdapterM32278a.getCoreSDKVersion();
            } catch (Throwable th) {
                C12317m4.m32153d().m32155a(th);
                String str = "error while retrieving coreSDKVersion " + abstractAdapterM32278a.getProviderName() + ": " + th.getLocalizedMessage();
                m32292a(EnumC12598x5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                IronLog.INTERNAL.error(str);
                coreSDKVersion = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
            }
            m32316c(strM32304b + " was allocated (adapter version: " + abstractAdapterM32278a.getVersion() + ", sdk version: " + coreSDKVersion + ")");
            m32313c(abstractAdapterM32278a);
            this.f31035j.m31504a(abstractAdapterM32278a);
            m32288a(abstractAdapterM32278a);
            this.f31034i.m27648a(abstractAdapterM32278a, networkSettings);
            m32306b(abstractAdapterM32278a);
            m32299a(jSONObject, abstractAdapterM32278a, providerTypeForReflection);
            this.f31026a.put(strM32304b, abstractAdapterM32278a);
            return abstractAdapterM32278a;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m32325b(boolean z) {
        synchronized (f31025o) {
            this.f31034i.m27651a(z);
            this.f31034i.m27650a(this.f31026a, this.f31027b);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m32308b(AdapterBaseInterface adapterBaseInterface) {
        Boolean bool = this.f31030e;
        if (bool == null || !(adapterBaseInterface instanceof AdapterDebugInterface)) {
            return;
        }
        try {
            ((AdapterDebugInterface) adapterBaseInterface).setAdapterDebug(bool.booleanValue());
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            String str = "error while setting adapterDebug of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e.getLocalizedMessage();
            m32292a(EnumC12598x5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            m32316c(str);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m32314c(final AdapterBaseInterface adapterBaseInterface) {
        if (adapterBaseInterface == null) {
            return;
        }
        for (final String str : this.f31031f.keySet()) {
            final List<String> list = this.f31031f.get(str);
            if (list != null && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                m32295a(new Runnable() { // from class: com.ironsource.mediationsdk.c$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12332c.m32309b(adapterBaseInterface, str, list);
                    }
                }, adapterBaseInterface.getClass().getSimpleName());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m32306b(AbstractAdapter abstractAdapter) {
        Boolean bool = this.f31030e;
        if (bool != null) {
            try {
                abstractAdapter.setAdapterDebug(bool);
            } catch (Throwable th) {
                C12317m4.m32153d().m32155a(th);
                String str = "error while setting adapterDebug of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                m32292a(EnumC12598x5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                m32316c(str);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m32313c(final AbstractAdapter abstractAdapter) {
        if (abstractAdapter == null) {
            return;
        }
        for (final String str : this.f31031f.keySet()) {
            final List<String> list = this.f31031f.get(str);
            if (list != null) {
                m32295a(new Runnable() { // from class: com.ironsource.mediationsdk.c$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12332c.m32307b(abstractAdapter, str, list);
                    }
                }, abstractAdapter.getProviderName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m32309b(AdapterBaseInterface adapterBaseInterface, String str, List list) {
        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
        IronSourceUtils.m32782i(adapterBaseInterface.getClass().getSimpleName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m32307b(AbstractAdapter abstractAdapter, String str, List list) {
        abstractAdapter.setMetaData(str, list);
        IronSourceUtils.m32782i(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    /* JADX INFO: renamed from: b */
    private void m32311b(final String str, final List<String> list) {
        for (final AbstractAdapter abstractAdapter : this.f31026a.values()) {
            m32295a(new Runnable() { // from class: com.ironsource.mediationsdk.c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C12332c.m32289a(abstractAdapter, str, list);
                }
            }, abstractAdapter.getProviderName());
        }
    }

    /* JADX INFO: renamed from: c */
    private String m32312c(NetworkSettings networkSettings, IronSource.EnumC12328a enumC12328a, UUID uuid) {
        return (uuid != null ? uuid.toString() : "") + "-" + enumC12328a.toString() + "-" + networkSettings.getProviderName();
    }

    /* JADX INFO: renamed from: c */
    private void m32315c(NetworkSettings networkSettings) {
        IronLog.INTERNAL.error("Missing package definition for " + networkSettings.getProviderTypeForReflection());
    }

    /* JADX INFO: renamed from: c */
    private void m32316c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 0);
    }

    /* JADX INFO: renamed from: c */
    public ConcurrentHashMap<String, LevelPlayBaseAdapter> m32326c() {
        ConcurrentHashMap<String, LevelPlayBaseAdapter> concurrentHashMap = new ConcurrentHashMap<>();
        for (String str : this.f31027b.keySet()) {
            AdapterBaseWrapper adapterBaseWrapper = this.f31027b.get(str);
            if (adapterBaseWrapper != null && (adapterBaseWrapper.getAdapterBaseInterface() instanceof LevelPlayBaseAdapter)) {
                concurrentHashMap.put(str, (LevelPlayBaseAdapter) adapterBaseWrapper.getAdapterBaseInterface());
            }
        }
        return concurrentHashMap;
    }

    /* JADX INFO: renamed from: b */
    private String m32304b(NetworkSettings networkSettings) {
        if (networkSettings.isMultipleInstances()) {
            return networkSettings.getProviderDefaultInstance();
        }
        return networkSettings.getProviderName();
    }

    /* JADX INFO: renamed from: b */
    public AdapterBaseInterface m32322b(NetworkSettings networkSettings, IronSource.EnumC12328a enumC12328a, UUID uuid) {
        String strM32312c;
        String providerTypeForReflection;
        if (networkSettings.isCustomNetwork()) {
            strM32312c = m32304b(networkSettings);
        } else {
            strM32312c = m32312c(networkSettings, enumC12328a, uuid);
        }
        if (this.f31027b.containsKey(strM32312c)) {
            return this.f31027b.get(strM32312c).getAdapterBaseInterface();
        }
        if (networkSettings.isCustomNetwork()) {
            providerTypeForReflection = networkSettings.getCustomNetworkAdapterName(null);
        } else {
            providerTypeForReflection = networkSettings.getProviderTypeForReflection();
        }
        AdapterBaseInterface adapterBaseInterfaceM32279a = m32279a(strM32312c, providerTypeForReflection, networkSettings);
        return (adapterBaseInterfaceM32279a != null || networkSettings.isCustomNetwork()) ? adapterBaseInterfaceM32279a : m32282a(networkSettings, enumC12328a, strM32312c);
    }

    /* JADX INFO: renamed from: a */
    private void m32299a(JSONObject jSONObject, AbstractAdapter abstractAdapter, String str) {
        if (str.equalsIgnoreCase("IronSource") && this.f31033h.compareAndSet(false, true)) {
            m32316c("SDK5 earlyInit  <" + str + ">");
            try {
                abstractAdapter.earlyInit(this.f31028c, this.f31029d, jSONObject);
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                String str2 = "error while calling early init for " + abstractAdapter.getProviderName() + ": " + e.getLocalizedMessage();
                m32292a(EnumC12598x5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                IronLog.INTERNAL.error(str2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private AbstractAdapter m32278a(String str, String str2) {
        try {
            Class<?> cls = Class.forName(m32286a(str2));
            return (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, String.class).invoke(cls, str);
        } catch (Exception e) {
            String str3 = "Error while loading adapter - exception = " + e.getLocalizedMessage();
            m32292a(EnumC12598x5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            m32310b(str3);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private JSONObject m32305b(NetworkSettings networkSettings, IronSource.EnumC12328a enumC12328a) {
        int i = a.f31036a[enumC12328a.ordinal()];
        if (i == 1) {
            return networkSettings.getRewardedVideoSettings();
        }
        if (i == 2) {
            return networkSettings.getInterstitialSettings();
        }
        if (i == 3) {
            return networkSettings.getBannerSettings();
        }
        if (i != 4) {
            return null;
        }
        return networkSettings.getNativeAdSettings();
    }

    /* JADX INFO: renamed from: a */
    private static String m32286a(String str) {
        return "com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter";
    }

    /* JADX INFO: renamed from: a */
    private String m32287a(String str, IronSource.EnumC12328a enumC12328a) {
        return "com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + StringUtils.toLowerCase(m32283a(enumC12328a)) + "." + str + m32283a(enumC12328a) + "Adapter";
    }

    /* JADX INFO: renamed from: b */
    public void m32323b(C12371t c12371t) {
        if (m32300a(c12371t)) {
            this.f31035j.m31506a(c12371t);
            c12371t.m32695a(this.f31026a.values(), this.f31027b.values());
            c12371t.m32696b();
            if (StringUtils.toLowerCase(c12371t.m32694a()).equals(f31023m)) {
                m32298a(c12371t.allData());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private String m32283a(IronSource.EnumC12328a enumC12328a) {
        if (enumC12328a == null) {
            return null;
        }
        int i = a.f31036a[enumC12328a.ordinal()];
        if (i == 1) {
            return "Rewarded";
        }
        if (i == 2) {
            return "Interstitial";
        }
        if (i == 3) {
            return "Banner";
        }
        if (i != 4) {
            return null;
        }
        return "NativeAd";
    }

    /* JADX INFO: renamed from: b */
    private void m32310b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 3);
    }

    /* JADX INFO: renamed from: a */
    public void m32321a(boolean z) {
        synchronized (f31025o) {
            this.f31030e = Boolean.valueOf(z);
            Iterator<AbstractAdapter> it = this.f31026a.values().iterator();
            while (it.hasNext()) {
                m32306b(it.next());
            }
            Iterator<AdapterBaseWrapper> it2 = this.f31027b.values().iterator();
            while (it2.hasNext()) {
                m32308b(it2.next().getAdapterBaseInterface());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m32289a(AbstractAdapter abstractAdapter, String str, List list) {
        abstractAdapter.setMetaData(str, list);
        IronSourceUtils.m32782i(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    /* JADX INFO: renamed from: a */
    private void m32297a(final String str, final List<String> list) {
        for (AdapterBaseWrapper adapterBaseWrapper : this.f31027b.values()) {
            final AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                m32295a(new Runnable() { // from class: com.ironsource.mediationsdk.c$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12332c.m32291a(adapterBaseInterface, str, list);
                    }
                }, adapterBaseInterface.getClass().getSimpleName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m32291a(AdapterBaseInterface adapterBaseInterface, String str, List list) {
        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
        IronSourceUtils.m32782i(adapterBaseInterface.getClass().getSimpleName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    /* JADX INFO: renamed from: a */
    private void m32295a(Runnable runnable, String str) {
        try {
            runnable.run();
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            String str2 = "Error while setting meta-data for adapter " + str + ": " + th.getLocalizedMessage();
            m32292a(EnumC12598x5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
            m32316c(str2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m32290a(AdapterBaseInterface adapterBaseInterface) {
        if (!(adapterBaseInterface instanceof SetAPSInterface) || this.f31032g.size() == 0) {
            return;
        }
        for (IronSource.EnumC12328a enumC12328a : this.f31032g.keySet()) {
            try {
                JSONObject jSONObject = this.f31032g.get(enumC12328a);
                if (jSONObject != null && jSONObject.length() > 0) {
                    ((SetAPSInterface) adapterBaseInterface).setAPSData(C12518sf.m33676a(enumC12328a), jSONObject);
                }
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                String str = "error while setting aps data: " + e.getLocalizedMessage();
                m32292a(EnumC12598x5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                m32316c(str);
            }
        }
        this.f31032g.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private void m32288a(AbstractAdapter abstractAdapter) {
        if (!StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(f31023m) || this.f31032g.size() == 0) {
            return;
        }
        for (IronSource.EnumC12328a enumC12328a : this.f31032g.keySet()) {
            try {
                JSONObject jSONObject = this.f31032g.get(enumC12328a);
                if (jSONObject != null && jSONObject.length() > 0 && (abstractAdapter instanceof SetAPSInterface)) {
                    ((SetAPSInterface) abstractAdapter).setAPSData(C12518sf.m33676a(enumC12328a), jSONObject);
                }
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                String str = "error while setting aps data: " + e.getLocalizedMessage();
                m32292a(EnumC12598x5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                m32316c(str);
            }
        }
        this.f31032g.clear();
    }

    /* JADX INFO: renamed from: a */
    private C12370s m32282a(NetworkSettings networkSettings, IronSource.EnumC12328a enumC12328a, String str) {
        AbstractAdapter abstractAdapterM32318a = m32318a(networkSettings, m32305b(networkSettings, enumC12328a), false);
        if (abstractAdapterM32318a != null) {
            C12370s c12370s = new C12370s(abstractAdapterM32318a);
            this.f31027b.put(str, new AdapterBaseWrapper(c12370s, networkSettings));
            return c12370s;
        }
        String str2 = "error creating network adapter " + networkSettings.getProviderName();
        m32292a(EnumC12598x5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
        IronLog.INTERNAL.error(str2);
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m32296a(String str, AdapterBaseInterface adapterBaseInterface, NetworkSettings networkSettings) {
        if (!networkSettings.isCustomNetwork()) {
            m32314c(adapterBaseInterface);
            m32290a(adapterBaseInterface);
        }
        this.f31034i.m27649a(adapterBaseInterface, networkSettings);
        m32308b(adapterBaseInterface);
        this.f31035j.m31505a(new AdapterBaseWrapper(adapterBaseInterface, networkSettings));
        this.f31027b.put(str, new AdapterBaseWrapper(adapterBaseInterface, networkSettings));
    }

    /* JADX INFO: renamed from: a */
    private AdapterBaseInterface m32279a(String str, String str2, NetworkSettings networkSettings) {
        String strM32286a;
        if (networkSettings.isCustomNetwork() && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            IronLog.INTERNAL.error("missing package definition for " + str);
            return null;
        }
        if (networkSettings.isCustomNetwork()) {
            strM32286a = networkSettings.getCustomNetworkPackage() + "." + str2;
        } else {
            strM32286a = m32286a(str2);
        }
        try {
            BaseAdapter baseAdapter = (BaseAdapter) Class.forName(strM32286a).newInstance();
            IronLog.INTERNAL.info(strM32286a + " was allocated (adapter version: " + baseAdapter.getAdapterVersion() + ", sdk version: " + baseAdapter.getNetworkSDKVersion() + ")");
            m32296a(str, baseAdapter, networkSettings);
            return baseAdapter;
        } catch (Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                String str3 = "failed to load " + strM32286a;
                IronLog.INTERNAL.error(str3);
                m32292a(EnumC12598x5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public BaseAdAdapter<?, ?> m32319a(NetworkSettings networkSettings, IronSource.EnumC12328a enumC12328a, UUID uuid) {
        BaseAdAdapter<?, ?> baseAdAdapterM32280a = m32280a(networkSettings, enumC12328a);
        if (baseAdAdapterM32280a != null || networkSettings.isCustomNetwork()) {
            return baseAdAdapterM32280a;
        }
        AbstractAdapter abstractAdapterM32317a = m32317a(networkSettings);
        if (abstractAdapterM32317a != null) {
            return AbstractC12329a.m32237a(abstractAdapterM32317a, networkSettings, enumC12328a, uuid);
        }
        String str = "error creating ad adapter " + networkSettings.getProviderName();
        m32292a(EnumC12598x5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    /* JADX INFO: renamed from: a */
    private BaseAdAdapter<?, ?> m32280a(NetworkSettings networkSettings, IronSource.EnumC12328a enumC12328a) {
        boolean zIsCustomNetwork = networkSettings.isCustomNetwork();
        if (zIsCustomNetwork && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            m32315c(networkSettings);
            return null;
        }
        String strM32285a = m32285a(networkSettings, enumC12328a, zIsCustomNetwork, m32284a(networkSettings, enumC12328a, zIsCustomNetwork));
        try {
            return m32281a(strM32285a, networkSettings);
        } catch (Exception e) {
            if (zIsCustomNetwork) {
                m32294a(e, strM32285a);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m32284a(NetworkSettings networkSettings, IronSource.EnumC12328a enumC12328a, boolean z) {
        if (z) {
            return networkSettings.getCustomNetworkAdapterName(enumC12328a);
        }
        return networkSettings.getProviderTypeForReflection();
    }

    /* JADX INFO: renamed from: a */
    private String m32285a(NetworkSettings networkSettings, IronSource.EnumC12328a enumC12328a, boolean z, String str) {
        if (z) {
            return networkSettings.getCustomNetworkPackage() + "." + str;
        }
        return m32287a(str, enumC12328a);
    }

    /* JADX INFO: renamed from: a */
    private BaseAdAdapter<?, ?> m32281a(String str, NetworkSettings networkSettings) throws Exception {
        return (BaseAdAdapter) Class.forName(str).getConstructor(NetworkSettings.class).newInstance(networkSettings);
    }

    /* JADX INFO: renamed from: a */
    private void m32294a(Exception exc, String str) {
        String str2 = "Failed to load adapter class: " + str;
        IronLog.INTERNAL.error(str2);
        m32292a(EnumC12598x5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2 + " - " + exc.getMessage());
    }

    /* JADX INFO: renamed from: a */
    private void m32292a(EnumC12598x5 enumC12598x5, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            C11399D9.m25613i().mo25281a(new C12580w5(enumC12598x5, jSONObject));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m32300a(C12371t c12371t) {
        if (c12371t.allData().length() == 0) {
            m32292a(EnumC12598x5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "empty network data");
            m32310b("empty network data");
            return false;
        }
        if (!TextUtils.isEmpty(c12371t.m32694a())) {
            return true;
        }
        m32292a(EnumC12598x5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "empty network key");
        m32310b("empty network key");
        return false;
    }

    /* JADX INFO: renamed from: a */
    private void m32298a(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
            if (next.equalsIgnoreCase(IronSource.EnumC12328a.BANNER.toString())) {
                m32293a(LevelPlay.AdFormat.BANNER, jSONObjectOptJSONObject);
            } else if (next.equalsIgnoreCase(IronSource.EnumC12328a.INTERSTITIAL.toString())) {
                m32293a(LevelPlay.AdFormat.INTERSTITIAL, jSONObjectOptJSONObject);
            } else if (next.equalsIgnoreCase(IronSource.EnumC12328a.REWARDED_VIDEO.toString())) {
                m32293a(LevelPlay.AdFormat.REWARDED, jSONObjectOptJSONObject);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private void m32293a(LevelPlay.AdFormat adFormat, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (!this.f31026a.isEmpty()) {
                    for (AbstractAdapter abstractAdapter : this.f31026a.values()) {
                        if (StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(f31023m) && (abstractAdapter instanceof SetAPSInterface)) {
                            ((SetAPSInterface) abstractAdapter).setAPSData(adFormat, jSONObject2);
                            return;
                        }
                    }
                }
                for (AdapterBaseWrapper adapterBaseWrapper : this.f31027b.values()) {
                    if (StringUtils.toLowerCase(adapterBaseWrapper.getSettings().getProviderTypeForReflection()).equals(f31023m)) {
                        AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                        if (adapterBaseInterface != null) {
                            ((AdapterAPSDataInterface) adapterBaseInterface).setAPSData(adFormat, jSONObject2);
                            return;
                        }
                        return;
                    }
                }
                synchronized (f31025o) {
                    this.f31032g.put(C12518sf.m33682b(adFormat), jSONObject2);
                }
                return;
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                String str = "error while setting APSData: " + e.getLocalizedMessage();
                m32292a(EnumC12598x5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                m32310b(str);
                return;
            }
        }
        m32292a(EnumC12598x5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "APSData is empty");
        m32310b("APSData is empty");
    }

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, AbstractAdapter> m32320a() {
        return this.f31026a;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m32302a(String str, AdapterBaseWrapper adapterBaseWrapper) {
        return (adapterBaseWrapper == null || adapterBaseWrapper.getSettings().getProviderNetworkKey() == null || !adapterBaseWrapper.getSettings().getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m32301a(String str, AbstractAdapter abstractAdapter) {
        return (abstractAdapter == null || abstractAdapter.getProviderNetworkKey() == null || !abstractAdapter.getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }
}

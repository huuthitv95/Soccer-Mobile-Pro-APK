package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.applovin.impl.v */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1790v {

    /* JADX INFO: renamed from: a */
    private static boolean f3435a = true;

    /* JADX INFO: renamed from: b */
    private static final Object f3436b = new Object();

    /* JADX INFO: renamed from: c */
    private static final Collection f3437c = new HashSet();

    /* JADX INFO: renamed from: d */
    private static boolean f3438d = false;

    /* JADX INFO: renamed from: e */
    private static a f3439e = null;

    /* JADX INFO: renamed from: com.applovin.impl.v$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private boolean f3440a;

        /* JADX INFO: renamed from: b */
        private String f3441b = "";

        /* JADX INFO: renamed from: c */
        private EnumC15440a f3442c = EnumC15440a.NOT_SET;

        /* JADX INFO: renamed from: com.applovin.impl.v$a$a, reason: collision with other inner class name */
        public enum EnumC15440a {
            NOT_SET("dnt_not_set"),
            ON("dnt_on"),
            OFF("dnt_off");


            /* JADX INFO: renamed from: a */
            private final String f3447a;

            EnumC15440a(String str) {
                this.f3447a = str;
            }

            /* JADX INFO: renamed from: b */
            public String m5331b() {
                return this.f3447a;
            }
        }

        /* JADX INFO: renamed from: a */
        public String m5323a() {
            return this.f3441b;
        }

        /* JADX INFO: renamed from: a */
        public void m5324a(EnumC15440a enumC15440a) {
            this.f3442c = enumC15440a;
        }

        /* JADX INFO: renamed from: a */
        public void m5325a(String str) {
            this.f3441b = str;
        }

        /* JADX INFO: renamed from: a */
        public void m5326a(boolean z) {
            this.f3440a = z;
        }

        /* JADX INFO: renamed from: a */
        protected boolean m5327a(Object obj) {
            return obj instanceof a;
        }

        /* JADX INFO: renamed from: b */
        public EnumC15440a m5328b() {
            return this.f3442c;
        }

        /* JADX INFO: renamed from: c */
        public boolean m5329c() {
            return this.f3440a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.m5327a(this) || m5329c() != aVar.m5329c()) {
                return false;
            }
            String strM5323a = m5323a();
            String strM5323a2 = aVar.m5323a();
            if (strM5323a != null ? !strM5323a.equals(strM5323a2) : strM5323a2 != null) {
                return false;
            }
            EnumC15440a enumC15440aM5328b = m5328b();
            EnumC15440a enumC15440aM5328b2 = aVar.m5328b();
            return enumC15440aM5328b != null ? enumC15440aM5328b.equals(enumC15440aM5328b2) : enumC15440aM5328b2 == null;
        }

        public int hashCode() {
            int i = m5329c() ? 79 : 97;
            String strM5323a = m5323a();
            int iHashCode = ((i + 59) * 59) + (strM5323a == null ? 43 : strM5323a.hashCode());
            EnumC15440a enumC15440aM5328b = m5328b();
            return (iHashCode * 59) + (enumC15440aM5328b != null ? enumC15440aM5328b.hashCode() : 43);
        }

        public String toString() {
            return "AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=" + m5329c() + ", advertisingId=" + m5323a() + ", dntCode=" + m5328b() + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    private static a m5319a(Context context) {
        a aVar;
        HashSet hashSet;
        AbstractC1701q7.m4044a();
        Object obj = f3436b;
        synchronized (obj) {
            if (f3438d) {
                return f3439e;
            }
            Collection collection = f3437c;
            boolean zIsEmpty = collection.isEmpty();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            collection.add(countDownLatch);
            if (zIsEmpty) {
                a aVarM5322c = m5322c(context);
                synchronized (obj) {
                    f3438d = true;
                    f3439e = aVarM5322c;
                    hashSet = new HashSet(collection);
                    collection.clear();
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((CountDownLatch) it.next()).countDown();
                }
            }
            try {
                if (!countDownLatch.await(60L, TimeUnit.SECONDS)) {
                    C1768p.m5167h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
                }
            } catch (InterruptedException e) {
                C1768p.m5164c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e);
            }
            synchronized (f3436b) {
                aVar = f3439e;
            }
            return aVar;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5320a() {
        return AbstractC1701q7.m4066a("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    /* JADX INFO: renamed from: b */
    public static a m5321b(Context context) {
        return m5319a(context);
    }

    /* JADX INFO: renamed from: c */
    private static a m5322c(Context context) {
        a aVarCollectGoogleAdvertisingInfo = collectGoogleAdvertisingInfo(context);
        if (aVarCollectGoogleAdvertisingInfo == null) {
            aVarCollectGoogleAdvertisingInfo = collectFireOSAdvertisingInfo(context);
        }
        return aVarCollectGoogleAdvertisingInfo == null ? new a() : aVarCollectGoogleAdvertisingInfo;
    }

    private static a collectFireOSAdvertisingInfo(Context context) {
        if (f3435a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                a aVar = new a();
                aVar.m5325a(StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id")));
                boolean z = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                aVar.m5326a(z);
                aVar.m5324a(z ? a.EnumC15440a.ON : a.EnumC15440a.OFF);
                return aVar;
            } catch (Settings.SettingNotFoundException e) {
                C1768p.m5164c("DataCollector", "Unable to determine if Fire OS limited ad tracking is turned on", e);
            } catch (Throwable th) {
                C1768p.m5164c("DataCollector", "Unable to collect Fire OS IDFA", th);
            }
        }
        f3435a = false;
        return null;
    }

    private static a collectGoogleAdvertisingInfo(Context context) {
        AbstractC1701q7.m4044a();
        if (!m5320a()) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            C1768p.m5167h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
        try {
            a aVar = new a();
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
            aVar.m5326a(zIsLimitAdTrackingEnabled);
            aVar.m5324a(zIsLimitAdTrackingEnabled ? a.EnumC15440a.ON : a.EnumC15440a.OFF);
            aVar.m5325a(advertisingIdInfo.getId());
            return aVar;
        } catch (Throwable th) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            C1768p.m5164c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
            return null;
        }
    }
}

package com.applovin.impl.sdk;

import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.AbstractC1568h2;
import com.applovin.impl.AbstractRunnableC1601k5;
import com.applovin.impl.C1548f2;
import com.applovin.impl.C1552f6;
import com.applovin.impl.C1711r7;
import com.applovin.impl.C1788u6;
import com.applovin.impl.C1831z4;
import com.applovin.impl.InterfaceC1718s4;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p025ad.C1735a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdType;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.sdk.d */
/* JADX INFO: loaded from: classes3.dex */
public class C1740d {

    /* JADX INFO: renamed from: b */
    private static final File f2940b = new File(C1748l.m4756p().getFilesDir(), "al/persisted-ads");

    /* JADX INFO: renamed from: a */
    private final C1748l f2941a;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.d$a */
    public static class a implements InterfaceC1718s4 {

        /* JADX INFO: renamed from: a */
        private final String f2942a;

        /* JADX INFO: renamed from: b */
        private final AppLovinAdType f2943b;

        /* JADX INFO: renamed from: c */
        private final boolean f2944c;

        /* JADX INFO: renamed from: d */
        private final long f2945d;

        /* JADX INFO: renamed from: e */
        private final long f2946e;

        public a(String str, AppLovinAdType appLovinAdType, boolean z, long j, long j2) {
            this.f2942a = str;
            this.f2943b = appLovinAdType;
            this.f2944c = z;
            this.f2945d = j;
            this.f2946e = j2;
        }

        /* JADX INFO: renamed from: a */
        public static a m4607a(AbstractC1736b abstractC1736b) {
            return m4608a(abstractC1736b, 0L, 0L);
        }

        /* JADX INFO: renamed from: a */
        public static a m4608a(AbstractC1736b abstractC1736b, long j, long j2) {
            if (abstractC1736b == null) {
                return null;
            }
            return new a(StringUtils.isValidString(abstractC1736b.getMediationServeId()) ? abstractC1736b.getMediationServeId() : UUID.randomUUID().toString(), abstractC1736b.getType(), abstractC1736b instanceof C1735a, SystemClock.elapsedRealtime() + j, j2);
        }

        /* JADX INFO: renamed from: a */
        public static a m4609a(JSONObject jSONObject, C1748l c1748l) {
            String string = JsonUtils.getString(jSONObject, "id", "");
            String string2 = JsonUtils.getString(jSONObject, "type", "");
            Boolean bool = JsonUtils.getBoolean(jSONObject, "is_ad_server_ad", null);
            long j = JsonUtils.getLong(jSONObject, "expiry_time_millis", 0L);
            long j2 = JsonUtils.getLong(jSONObject, "app_launch_timestamp", 0L);
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || bool == null) {
                return null;
            }
            return new a(string, AppLovinAdType.fromString(string2), bool.booleanValue(), j, j2);
        }

        @Override // com.applovin.impl.InterfaceC1718s4
        /* JADX INFO: renamed from: a */
        public JSONObject mo1889a() {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "id", this.f2942a);
            JsonUtils.putString(jSONObject, "type", this.f2943b.toString());
            JsonUtils.putBoolean(jSONObject, "is_ad_server_ad", this.f2944c);
            JsonUtils.putLong(jSONObject, "expiry_time_millis", this.f2945d);
            JsonUtils.putLong(jSONObject, "app_launch_timestamp", this.f2946e);
            return jSONObject;
        }

        /* JADX INFO: renamed from: a */
        protected boolean m4610a(Object obj) {
            return obj instanceof a;
        }

        /* JADX INFO: renamed from: b */
        public long m4611b() {
            return this.f2946e;
        }

        /* JADX INFO: renamed from: c */
        public long m4612c() {
            return this.f2945d;
        }

        /* JADX INFO: renamed from: d */
        public String m4613d() {
            return this.f2942a + "_" + this.f2943b;
        }

        /* JADX INFO: renamed from: e */
        public String m4614e() {
            return this.f2942a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.m4610a(this)) {
                return false;
            }
            String strM4614e = m4614e();
            String strM4614e2 = aVar.m4614e();
            if (strM4614e != null ? !strM4614e.equals(strM4614e2) : strM4614e2 != null) {
                return false;
            }
            AppLovinAdType appLovinAdTypeM4615f = m4615f();
            AppLovinAdType appLovinAdTypeM4615f2 = aVar.m4615f();
            return appLovinAdTypeM4615f != null ? appLovinAdTypeM4615f.equals(appLovinAdTypeM4615f2) : appLovinAdTypeM4615f2 == null;
        }

        /* JADX INFO: renamed from: f */
        public AppLovinAdType m4615f() {
            return this.f2943b;
        }

        /* JADX INFO: renamed from: g */
        public boolean m4616g() {
            return this.f2944c;
        }

        public int hashCode() {
            String strM4614e = m4614e();
            int iHashCode = strM4614e == null ? 43 : strM4614e.hashCode();
            AppLovinAdType appLovinAdTypeM4615f = m4615f();
            return ((iHashCode + 59) * 59) + (appLovinAdTypeM4615f != null ? appLovinAdTypeM4615f.hashCode() : 43);
        }

        public String toString() {
            return "AdPersistenceFileService.PersistedAdFilePath(id=" + m4614e() + ", type=" + m4615f() + ", isAdServerAd=" + m4616g() + ", expiryTimeMillis=" + m4612c() + ", appLaunchTimestamp=" + m4611b() + ")";
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.d$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo4617a(a aVar);
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.d$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo4618a(AbstractC1736b abstractC1736b, String str);
    }

    public C1740d(C1748l c1748l) {
        this.f2941a = c1748l;
    }

    /* JADX INFO: renamed from: a */
    private File m4596a(a aVar) {
        if (aVar == null) {
            return null;
        }
        return new File(f2940b.getAbsolutePath() + RemoteSettings.FORWARD_SLASH_STRING + aVar.m4613d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m4597a(AbstractC1736b abstractC1736b, b bVar) {
        a aVarM4608a = a.m4608a(abstractC1736b, ((Long) this.f2941a.m4801a(C1831z4.f3887b1)).longValue(), C1748l.m4755o());
        File fileM4596a = m4596a(aVarM4608a);
        if (fileM4596a == null) {
            m4600a("Could not persist incompatible ad", abstractC1736b, bVar);
            return;
        }
        try {
            JSONObject jSONObjectMo1889a = abstractC1736b.mo1889a();
            if (jSONObjectMo1889a == null) {
                m4600a("Could not serialize ad for persistence", abstractC1736b, bVar);
                return;
            }
            if (this.f2941a.m4771I().m4979a((InputStream) new ByteArrayInputStream(jSONObjectMo1889a.toString().getBytes("UTF-8")), fileM4596a, true)) {
                m4598a(aVarM4608a, abstractC1736b, bVar);
            } else {
                m4600a("Failed to write persisted ad to disk", abstractC1736b, bVar);
            }
        } catch (Throwable th) {
            m4600a("Ad could not be persisted", abstractC1736b, bVar);
            this.f2941a.m4764E().m4334a("AdPersistenceFileService", th, CollectionUtils.map("error_message", "Ad could not be persisted"));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4598a(a aVar, AbstractC1736b abstractC1736b, b bVar) {
        if (bVar == null) {
            return;
        }
        this.f2941a.m4782Q();
        if (C1768p.m5160a()) {
            this.f2941a.m4782Q().m5171a("AdPersistenceFileService", "Ad was persisted successfully");
        }
        bVar.mo4617a(aVar);
        this.f2941a.m4830g().m2525a(C1548f2.f1504U, abstractC1736b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m4599a(File file, c cVar, a aVar) throws Throwable {
        String strM4986f = this.f2941a.m4771I().m4986f(file);
        if (strM4986f == null) {
            cVar.mo4618a(null, "Persisted ad could not be retrieved: Read failed");
            return;
        }
        try {
            JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(strM4986f, new JSONObject());
            JsonUtils.putBoolean(JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "full_response", new JSONObject()), "is_persisted_ad", true);
            AbstractC1736b abstractC1736bM4433a = aVar.m4616g() ? C1735a.m4433a(jSONObjectJsonObjectFromJsonString, this.f2941a) : C1711r7.m4214a(jSONObjectJsonObjectFromJsonString, this.f2941a);
            if (abstractC1736bM4433a == null) {
                cVar.mo4618a(null, "Persisted ad could not be retrieved: Deserialization failed");
            } else {
                cVar.mo4618a(abstractC1736bM4433a, null);
            }
        } catch (Throwable th) {
            cVar.mo4618a(null, "Persisted ad could not be retrieved: Deserialization failed");
            this.f2941a.m4764E().m4334a("AdPersistenceFileService", th, CollectionUtils.map("error_message", "Persisted ad could not be retrieved: Deserialization failed"));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4600a(String str, AbstractC1736b abstractC1736b, b bVar) {
        if (bVar == null) {
            return;
        }
        this.f2941a.m4782Q();
        if (C1768p.m5160a()) {
            this.f2941a.m4782Q().m5171a("AdPersistenceFileService", str);
        }
        bVar.mo4617a(null);
        Map mapM2787a = AbstractC1568h2.m2787a((AppLovinAdImpl) abstractC1736b);
        CollectionUtils.putStringIfValid("error_message", str, mapM2787a);
        this.f2941a.m4830g().m2682d(C1548f2.f1506V, mapM2787a);
    }

    /* JADX INFO: renamed from: b */
    private boolean m4601b() {
        File file = f2940b;
        if (file.exists()) {
            return true;
        }
        return file.mkdir();
    }

    /* JADX INFO: renamed from: a */
    public void m4602a() {
        File[] fileArrListFiles;
        File file = f2940b;
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4603a(final a aVar, final c cVar) {
        final File fileM4596a = m4596a(aVar);
        if (fileM4596a == null || !fileM4596a.exists()) {
            cVar.mo4618a(null, "Persisted ad could not be retrieved: Retrieval failed");
        } else {
            this.f2941a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(this.f2941a, "retrievePersistedAd", new Runnable() { // from class: com.applovin.impl.sdk.d$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.m4599a(fileM4596a, cVar, aVar);
                }
            }), C1552f6.b.OTHER);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4604a(List list) {
        File[] fileArrListFiles = f2940b.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        boolean z = false;
        for (File file : fileArrListFiles) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((a) it.next()).m4613d().equals(file.getName())) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                file.delete();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m4605b(final AbstractC1736b abstractC1736b, final b bVar) {
        if (m4601b()) {
            this.f2941a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(this.f2941a, "persistAd", new Runnable() { // from class: com.applovin.impl.sdk.d$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m4597a(abstractC1736b, bVar);
                }
            }), C1552f6.b.CACHING);
        } else {
            m4600a("Ad Persistence directory could not be created", abstractC1736b, bVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m4606b(a aVar) {
        File fileM4596a = m4596a(aVar);
        if (fileM4596a != null) {
            fileM4596a.delete();
        }
    }
}

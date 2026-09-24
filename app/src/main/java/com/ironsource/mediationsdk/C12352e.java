package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.ironsource.C11453G9;
import com.ironsource.C11494Ie;
import com.ironsource.C11767Y9;
import com.ironsource.C11794a2;
import com.ironsource.C12106b2;
import com.ironsource.C12261j5;
import com.ironsource.C12317m4;
import com.ironsource.C12434q2;
import com.ironsource.C12470s2;
import com.ironsource.InterfaceC11691U1;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.e */
/* JADX INFO: loaded from: classes6.dex */
public class C12352e {

    /* JADX INFO: renamed from: a */
    private final String f31215a = "1";

    /* JADX INFO: renamed from: b */
    private final String f31216b = "102";

    /* JADX INFO: renamed from: c */
    private final String f31217c = "102";

    /* JADX INFO: renamed from: d */
    private final String f31218d = "GenericNotifications";

    /* JADX INFO: renamed from: e */
    private C12353f f31219e;

    /* JADX INFO: renamed from: f */
    private IronSource.EnumC12328a f31220f;

    /* JADX INFO: renamed from: g */
    private C12470s2 f31221g;

    /* JADX INFO: renamed from: h */
    private InterfaceC11691U1 f31222h;

    /* JADX INFO: renamed from: i */
    private ISBannerSize f31223i;

    public C12352e(C12353f c12353f) {
        this.f31219e = c12353f;
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public void m32459a(Context context, Map<String, Object> map, List<String> list, C12106b2 c12106b2, int i, C11767Y9 c11767y9, ISBannerSize iSBannerSize) {
        this.f31223i = iSBannerSize;
        m32458a(context, map, list, c12106b2, i, c11767y9);
    }

    /* JADX INFO: renamed from: a */
    public void m32457a(Context context, C12355h c12355h, InterfaceC11691U1 interfaceC11691U1) {
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f31219e.mo32477a(context, c12355h, interfaceC11691U1));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("execute auction exception " + e.getMessage());
            if (interfaceC11691U1 != null) {
                interfaceC11691U1.mo27553a(1000, e.getMessage(), 0, C11794a2.f26720a.m28099a(this.f31219e.mo32478a(), 1000), 0L);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.e$a */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        protected InterfaceC11691U1 f31224a;

        /* JADX INFO: renamed from: b */
        protected C12333d.a f31225b;

        /* JADX INFO: renamed from: c */
        protected int f31226c;

        /* JADX INFO: renamed from: d */
        protected String f31227d;

        /* JADX INFO: renamed from: e */
        protected long f31228e;

        /* JADX INFO: renamed from: f */
        protected int f31229f;

        /* JADX INFO: renamed from: h */
        private int f31231h;

        /* JADX INFO: renamed from: k */
        private final URL f31234k;

        /* JADX INFO: renamed from: l */
        private final JSONObject f31235l;

        /* JADX INFO: renamed from: m */
        private final boolean f31236m;

        /* JADX INFO: renamed from: n */
        private final int f31237n;

        /* JADX INFO: renamed from: o */
        private final long f31238o;

        /* JADX INFO: renamed from: p */
        private final boolean f31239p;

        /* JADX INFO: renamed from: q */
        private final boolean f31240q;

        /* JADX INFO: renamed from: r */
        private final boolean f31241r;

        /* JADX INFO: renamed from: i */
        protected String f31232i = "";

        /* JADX INFO: renamed from: j */
        protected int f31233j = 0;

        /* JADX INFO: renamed from: g */
        protected String f31230g = m32466a((Integer) null);

        public a(InterfaceC11691U1 interfaceC11691U1, URL url, JSONObject jSONObject, boolean z, C12470s2 c12470s2) {
            this.f31224a = interfaceC11691U1;
            this.f31234k = url;
            this.f31235l = jSONObject;
            this.f31236m = z;
            this.f31237n = c12470s2.m33281g();
            this.f31238o = c12470s2.m33287m();
            this.f31239p = c12470s2.m33289o();
            this.f31240q = c12470s2.m33290p();
            this.f31231h = c12470s2.m33278d();
            this.f31241r = c12470s2.m33288n();
        }

        /* JADX INFO: renamed from: a */
        private void m32470a(long j, long j2) {
            long time = j - (new Date().getTime() - j2);
            if (time > 0) {
                SystemClock.sleep(time);
            }
        }

        /* JADX INFO: renamed from: b */
        protected boolean m32475b() {
            this.f31228e = new Date().getTime();
            try {
                this.f31231h = this.f31233j == 1015 ? 1 : this.f31231h;
                this.f31229f = 0;
                HttpURLConnection httpURLConnectionM32468a = null;
                while (true) {
                    int i = this.f31229f;
                    int i2 = this.f31237n;
                    if (i >= i2) {
                        this.f31229f = i2 - 1;
                        this.f31230g = m32466a(Integer.valueOf(this.f31226c));
                        return false;
                    }
                    try {
                        long time = new Date().getTime();
                        String str = "Auction Handler: auction trial " + (this.f31229f + 1) + " out of " + this.f31237n + " max trials";
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, str, 0);
                        IronSourceUtils.m32782i(str);
                        httpURLConnectionM32468a = m32468a(this.f31234k, this.f31238o);
                        IronLog ironLog = IronLog.INTERNAL;
                        ironLog.verbose("parameters for auction url: " + this.f31234k.getQuery());
                        ironLog.verbose("parameters for auction POST data: " + this.f31235l);
                        m32471a(httpURLConnectionM32468a, this.f31235l, this.f31239p);
                        int responseCode = httpURLConnectionM32468a.getResponseCode();
                        if (responseCode == 200 || responseCode == 204) {
                            try {
                                m32474a(m32467a(httpURLConnectionM32468a), this.f31236m, this.f31240q);
                                httpURLConnectionM32468a.disconnect();
                                return true;
                            } catch (JSONException e) {
                                C12317m4.m32153d().m32155a(e);
                                if (e.getMessage() != null && e.getMessage().equalsIgnoreCase("decryption error")) {
                                    this.f31226c = 1003;
                                    this.f31227d = "Auction decryption error";
                                } else if (e.getMessage() == null || !e.getMessage().equalsIgnoreCase("decompression error")) {
                                    this.f31226c = 1002;
                                    this.f31227d = "Auction parsing error";
                                } else {
                                    this.f31226c = 1008;
                                    this.f31227d = "Auction decompression error";
                                }
                                this.f31230g = m32466a(Integer.valueOf(this.f31226c));
                                IronLog.INTERNAL.error("Auction handle response exception " + e.getMessage());
                                httpURLConnectionM32468a.disconnect();
                                return false;
                            }
                        }
                        this.f31226c = 1001;
                        String str2 = "Auction response code not valid, error code response from server - " + responseCode;
                        this.f31227d = str2;
                        ironLog.error(str2);
                        httpURLConnectionM32468a.disconnect();
                        if (this.f31229f < this.f31237n - 1) {
                            m32470a(this.f31238o, time);
                        }
                        this.f31229f++;
                    } catch (SocketTimeoutException e2) {
                        C12317m4.m32153d().m32155a(e2);
                        if (httpURLConnectionM32468a != null) {
                            httpURLConnectionM32468a.disconnect();
                        }
                        this.f31226c = 1006;
                        this.f31227d = "Connection timed out";
                        IronLog.INTERNAL.error("Auction socket timeout exception " + e2.getMessage());
                    } catch (Throwable th) {
                        C12317m4.m32153d().m32155a(th);
                        IronLog.INTERNAL.error("getting exception " + th);
                        if (httpURLConnectionM32468a != null) {
                            httpURLConnectionM32468a.disconnect();
                        }
                        this.f31226c = 1000;
                        this.f31227d = th.getMessage();
                        this.f31230g = m32466a(Integer.valueOf(this.f31226c));
                        return false;
                    }
                }
            } catch (Exception e3) {
                C12317m4.m32153d().m32155a(e3);
                this.f31226c = 1007;
                this.f31227d = e3.getMessage();
                this.f31229f = 0;
                this.f31230g = m32466a(Integer.valueOf(this.f31226c));
                IronLog.INTERNAL.error("Auction request exception " + e3.getMessage());
                return false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zM32475b = m32475b();
            InterfaceC11691U1 interfaceC11691U1 = this.f31224a;
            if (interfaceC11691U1 == null) {
                return;
            }
            mo32011a(zM32475b, interfaceC11691U1, new Date().getTime() - this.f31228e);
        }

        /* JADX INFO: renamed from: a */
        private String m32465a() {
            if (this.f31231h == 2) {
                return C12261j5.m31853b().m31856d();
            }
            return C12261j5.m31853b().m31855c();
        }

        /* JADX INFO: renamed from: a */
        private void m32471a(HttpURLConnection httpURLConnection, JSONObject jSONObject, boolean z) throws Exception {
            String strM31854a;
            String strM25870e;
            String str;
            OutputStream outputStream = httpURLConnection.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            if (this.f31231h == 2) {
                try {
                    strM31854a = C12261j5.m31853b().m31854a();
                } catch (JSONException e) {
                    C12317m4.m32153d().m32155a(e);
                    this.f31232i = e.getLocalizedMessage();
                    this.f31233j = 1015;
                    this.f31231h = 1;
                    IronLog.INTERNAL.error("get encrypted session key exception " + e.getMessage());
                    strM31854a = "";
                }
            } else {
                strM31854a = "";
            }
            String string = jSONObject.toString();
            String strM32465a = m32465a();
            if (z) {
                IronLog.INTERNAL.verbose("compressing and encrypting auction request");
                strM25870e = C11453G9.m25862a(strM32465a, string);
            } else {
                strM25870e = C11453G9.m25870e(strM32465a, string);
            }
            if (this.f31231h == 2) {
                str = String.format("{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}", strM31854a, strM25870e);
            } else {
                str = String.format("{\"request\" : \"%1$s\"}", strM25870e);
            }
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            outputStream.close();
        }

        /* JADX INFO: renamed from: a */
        private HttpURLConnection m32468a(URL url, long j) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setReadTimeout((int) j);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            return httpURLConnection;
        }

        /* JADX INFO: renamed from: a */
        protected JSONObject m32473a(JSONObject jSONObject, boolean z) throws JSONException {
            String str;
            String strM32465a = m32465a();
            if (this.f31231h == 2) {
                str = UserDataStore.CITY;
            } else {
                str = C11494Ie.f24627n;
            }
            String string = jSONObject.getString(str);
            if (z) {
                return m32472b(strM32465a, string);
            }
            return m32469a(strM32465a, string);
        }

        /* JADX INFO: renamed from: a */
        protected void m32474a(String str, boolean z, boolean z2) throws JSONException {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (z) {
                    jSONObject = m32473a(jSONObject, z2);
                }
                C12333d.a aVarM32334a = C12333d.m32333b().m32334a(jSONObject);
                this.f31225b = aVarM32334a;
                this.f31226c = aVarM32334a.m32346c();
                this.f31227d = this.f31225b.m32347d();
                return;
            }
            throw new JSONException("empty response");
        }

        /* JADX INFO: renamed from: a */
        private JSONObject m32469a(String str, String str2) throws JSONException {
            String strM25865b = C11453G9.m25865b(str, str2);
            if (!TextUtils.isEmpty(strM25865b)) {
                return new JSONObject(strM25865b);
            }
            throw new JSONException("decryption error");
        }

        /* JADX INFO: renamed from: a */
        private String m32467a(HttpURLConnection httpURLConnection) throws IOException {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
            }
        }

        /* JADX INFO: renamed from: a */
        protected void mo32011a(boolean z, InterfaceC11691U1 interfaceC11691U1, long j) {
            if (z) {
                interfaceC11691U1.mo27554a(this.f31225b.m32351h(), this.f31225b.m32344a(), this.f31225b.m32348e(), this.f31225b.m32349f(), this.f31225b.m32345b(), this.f31229f + 1, j, this.f31233j, this.f31232i);
            } else {
                interfaceC11691U1.mo27553a(this.f31226c, this.f31227d, this.f31229f + 1, this.f31230g, j);
            }
        }

        /* JADX INFO: renamed from: a */
        private String m32466a(Integer num) {
            return C11794a2.f26720a.m28099a(this.f31241r, num);
        }

        /* JADX INFO: renamed from: b */
        private JSONObject m32472b(String str, String str2) throws JSONException {
            IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
            String strM25868d = C11453G9.m25868d(str, str2);
            if (strM25868d != null) {
                return new JSONObject(strM25868d);
            }
            throw new JSONException("decompression error");
        }
    }

    @Deprecated
    public C12352e(IronSource.EnumC12328a enumC12328a, C12470s2 c12470s2, InterfaceC11691U1 interfaceC11691U1) {
        this.f31220f = enumC12328a;
        this.f31221g = c12470s2;
        this.f31222h = interfaceC11691U1;
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public void m32458a(Context context, Map<String, Object> map, List<String> list, C12106b2 c12106b2, int i, C11767Y9 c11767y9) {
        C12352e c12352e;
        try {
            boolean zM32779g = IronSourceUtils.m32779g();
            c12352e = this;
            try {
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(c12352e.f31222h, new URL(c12352e.f31221g.m33274a(false)), c12352e.m32456a(map, list, c12106b2, i, zM32779g, c11767y9), zM32779g, c12352e.f31221g));
            } catch (Exception e) {
                e = e;
                Exception exc = e;
                C12317m4.m32153d().m32155a(exc);
                IronLog.INTERNAL.error("execute auction exception " + exc.getMessage());
                c12352e.f31222h.mo27553a(1000, exc.getMessage(), 0, C11794a2.f26720a.m28099a(c12352e.f31221g.m33288n(), 1000), 0L);
            }
        } catch (Exception e2) {
            e = e2;
            c12352e = this;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m32461a(C12434q2 c12434q2, int i, C12434q2 c12434q3, String str) {
        Iterator<String> it = c12434q2.m33142b().iterator();
        while (it.hasNext()) {
            C12434q2 c12434q4 = c12434q2;
            int i2 = i;
            String str2 = str;
            C12333d.m32333b().m32339a("reportImpression", c12434q4.m33143c(), C12333d.m32333b().m32336a(it.next(), i2, c12434q4, "", "", str2));
            i = i2;
            c12434q2 = c12434q4;
            str = str2;
        }
        C12434q2 c12434q5 = c12434q2;
        int i3 = i;
        String str3 = str;
        if (c12434q3 != null) {
            Iterator<String> it2 = c12434q3.m33142b().iterator();
            while (it2.hasNext()) {
                C12333d.m32333b().m32339a("reportImpression", "GenericNotifications", C12333d.m32333b().m32336a(it2.next(), i3, c12434q5, "", "102", str3));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m32460a(C12434q2 c12434q2, int i, C12434q2 c12434q3) {
        Iterator<String> it = c12434q2.m33148h().iterator();
        while (it.hasNext()) {
            C12434q2 c12434q4 = c12434q2;
            int i2 = i;
            C12333d.m32333b().m32339a("reportLoadSuccess", c12434q4.m33143c(), C12333d.m32333b().m32336a(it.next(), i2, c12434q4, "", "", ""));
            i = i2;
            c12434q2 = c12434q4;
        }
        C12434q2 c12434q5 = c12434q2;
        int i3 = i;
        if (c12434q3 != null) {
            Iterator<String> it2 = c12434q3.m33148h().iterator();
            while (it2.hasNext()) {
                C12333d.m32333b().m32339a("reportLoadSuccess", "GenericNotifications", C12333d.m32333b().m32336a(it2.next(), i3, c12434q5, "", "102", ""));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m32463a(CopyOnWriteArrayList<AbstractC12372u> copyOnWriteArrayList, ConcurrentHashMap<String, C12434q2> concurrentHashMap, int i, C12434q2 c12434q2, C12434q2 c12434q3) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<AbstractC12372u> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo26207c());
        }
        m32462a(arrayList, concurrentHashMap, i, c12434q2, c12434q3);
    }

    /* JADX INFO: renamed from: a */
    public void m32462a(ArrayList<String> arrayList, ConcurrentHashMap<String, C12434q2> concurrentHashMap, int i, C12434q2 c12434q2, C12434q2 c12434q3) {
        int iM33150j = c12434q3.m33150j();
        for (String str : arrayList) {
            if (!str.equals(c12434q3.m33143c())) {
                C12434q2 c12434q4 = concurrentHashMap.get(str);
                int iM33150j2 = c12434q4.m33150j();
                String strM33149i = c12434q4.m33149i();
                String str2 = iM33150j2 < iM33150j ? "1" : "102";
                IronLog.INTERNAL.verbose("instance=" + c12434q4.m33143c() + ", instancePriceOrder= " + iM33150j2 + ", loseReasonCode=" + str2 + ", winnerInstance=" + c12434q3.m33143c() + ", winnerInstancePriceOrder=" + iM33150j);
                Iterator<String> it = c12434q4.m33147g().iterator();
                while (it.hasNext()) {
                    C12333d.m32333b().m32339a("reportAuctionLose", c12434q4.m33143c(), C12333d.m32333b().m32336a(it.next(), i, c12434q3, strM33149i, str2, ""));
                }
            }
        }
        if (c12434q2 != null) {
            Iterator<String> it2 = c12434q2.m33147g().iterator();
            while (it2.hasNext()) {
                C12333d.m32333b().m32339a("reportAuctionLose", "GenericNotifications", C12333d.m32333b().m32336a(it2.next(), i, c12434q3, "", "102", ""));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m32456a(Map<String, Object> map, List<String> list, C12106b2 c12106b2, int i, boolean z, C11767Y9 c11767y9) throws JSONException {
        C12355h c12355h = new C12355h(this.f31220f);
        c12355h.m32494a(map);
        c12355h.m32493a(list);
        c12355h.m32487a(c12106b2);
        c12355h.m32485a(i);
        c12355h.m32489a(this.f31223i);
        c12355h.m32486a(c11767y9);
        c12355h.m32498b(z);
        return C12333d.m32333b().m32338a(c12355h);
    }

    /* JADX INFO: renamed from: a */
    public boolean m32464a() {
        return this.f31219e.mo32479b();
    }
}

package com.bytedance.sdk.openadsdk.wjv;

import android.text.TextUtils;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.ironsource.C11341A5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.wjv.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3608ka {

    /* JADX INFO: renamed from: ik */
    private InterfaceC3605di f13369ik;

    /* JADX INFO: renamed from: ka */
    private InterfaceC3610ri f13370ka;

    /* JADX INFO: renamed from: lr */
    private C3607ik f13371lr;

    /* JADX INFO: renamed from: ri */
    private final String f13372ri = "StrategyCenter";

    /* JADX INFO: renamed from: fi */
    private int f13368fi = 0;

    /* JADX INFO: renamed from: di */
    private final ConcurrentHashMap<String, Object> f13367di = new ConcurrentHashMap<>();
    private Runnable xha = new Runnable() { // from class: com.bytedance.sdk.openadsdk.wjv.ka.2
        @Override // java.lang.Runnable
        public void run() {
            C3608ka.this.m16730lr();
        }
    };

    public C3608ka(InterfaceC3605di interfaceC3605di) {
        this.f13371lr = null;
        xha xhaVar = new xha(interfaceC3605di);
        this.f13369ik = xhaVar;
        String strMo16689ik = xhaVar.mo16689ik();
        if (!TextUtils.isEmpty(strMo16689ik) && !strMo16689ik.startsWith("pag")) {
            strMo16689ik = "pag_".concat(String.valueOf(strMo16689ik));
        }
        this.f13371lr = new C3607ik(this.f13369ik.mo16691lr(), strMo16689ik);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public void m16727ik() {
        this.f13367di.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m16730lr() {
        InterfaceC3605di interfaceC3605di = this.f13369ik;
        if (interfaceC3605di == null || interfaceC3605di.mo16688fi() == null || this.f13369ik.mo16687di() == null || this.f13369ik.mo16692mj()) {
            return;
        }
        this.f13369ik.mo16694ri().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wjv.ka.1
            @Override // java.lang.Runnable
            public void run() {
                OutputStream outputStream;
                C3608ka.this.f13368fi++;
                try {
                    if (C3608ka.this.f13370ka != null) {
                        C3608ka.this.f13370ka.mo16713ri();
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(C3608ka.this.f13369ik.mo16688fi()).openConnection();
                    if (C3608ka.this.f13369ik.xha() != null && C3608ka.this.f13369ik.xha().size() > 0) {
                        for (Map.Entry<String, String> entry : C3608ka.this.f13369ik.xha().entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", C11341A5.f23800M);
                    try {
                        outputStream = httpURLConnection.getOutputStream();
                        try {
                            outputStream.write(C3608ka.this.f13369ik.mo16687di().toString().getBytes());
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            Log.i("StrategyCenter", "executing strategy fetch");
                            if (responseCode == 200) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                                StringBuffer stringBuffer = new StringBuffer();
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    } else {
                                        stringBuffer.append(line);
                                    }
                                }
                                bufferedReader.close();
                                JSONObject jSONObjectMo16695ri = C3608ka.this.f13369ik.mo16695ri(new JSONObject(stringBuffer.toString()));
                                C3608ka.this.f13371lr.m16720ri();
                                C3608ka.this.m16727ik();
                                C3608ka.this.f13371lr.m16722ri(jSONObjectMo16695ri);
                                if (C3608ka.this.f13370ka != null) {
                                    C3608ka.this.f13370ka.mo16712lr();
                                }
                            } else if (C3608ka.this.f13370ka != null) {
                                C3608ka.this.f13370ka.mo16714ri(responseCode, httpURLConnection.getResponseMessage());
                            }
                            C3608ka.this.f13371lr.m16721ri("local_last_update_time", System.currentTimeMillis());
                            C3608ka.this.m16736ri();
                        } catch (Throwable th) {
                            th = th;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = null;
                    }
                } catch (Throwable th3) {
                    Log.e("StrategyCenter", th3.getMessage() == null ? "error " : th3.getMessage());
                    if (C3608ka.this.f13370ka != null) {
                        C3608ka.this.f13370ka.mo16714ri(-1, th3.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public int m16733ri(String str, int i) {
        C3607ik c3607ik = this.f13371lr;
        return c3607ik == null ? i : c3607ik.m16717ri(str, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r4.getClass().isInstance(r0) != false) goto L11;
     */
    /* JADX INFO: renamed from: ri */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T m16734ri(java.lang.String r3, T r4, com.bytedance.sdk.openadsdk.wjv.InterfaceC3609lr.ri<T> r5) {
        /*
            r2 = this;
            com.bytedance.sdk.openadsdk.wjv.ik r0 = r2.f13371lr
            if (r0 == 0) goto L2c
            if (r3 != 0) goto L7
            goto L2c
        L7:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r2.f13367di
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L1c
            if (r4 == 0) goto L1b
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Exception -> L1c
            boolean r1 = r1.isInstance(r0)     // Catch: java.lang.Exception -> L1c
            if (r1 == 0) goto L1c
        L1b:
            return r0
        L1c:
            if (r5 == 0) goto L2c
            com.bytedance.sdk.openadsdk.wjv.ik r0 = r2.f13371lr     // Catch: java.lang.Exception -> L2c
            java.lang.Object r5 = r0.m16718ri(r3, r4, r5)     // Catch: java.lang.Exception -> L2c
            if (r5 == 0) goto L2c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r2.f13367di     // Catch: java.lang.Exception -> L2c
            r0.put(r3, r5)     // Catch: java.lang.Exception -> L2c
            return r5
        L2c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.wjv.C3608ka.m16734ri(java.lang.String, java.lang.Object, com.bytedance.sdk.openadsdk.wjv.lr$ri):java.lang.Object");
    }

    /* JADX INFO: renamed from: ri */
    public String m16735ri(String str, String str2) {
        C3607ik c3607ik = this.f13371lr;
        return c3607ik == null ? str2 : c3607ik.m16719ri(str, str2);
    }

    /* JADX INFO: renamed from: ri */
    public void m16736ri() {
        if (this.f13369ik != null) {
            C3607ik c3607ik = this.f13371lr;
            int i = Constants.ONE_HOUR;
            int iM16717ri = c3607ik.m16717ri("req_interval", Constants.ONE_HOUR);
            long j = 0;
            long jM16716lr = this.f13371lr.m16716lr("local_last_update_time", 0L);
            if (iM16717ri >= 600000 && iM16717ri <= 86400000) {
                i = iM16717ri;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - jM16716lr;
            Log.i("StrategyCenter", "before  realInterval=".concat(String.valueOf(jCurrentTimeMillis)));
            if (jCurrentTimeMillis >= 0) {
                long j2 = i;
                if (jCurrentTimeMillis <= j2) {
                    j = j2 - jCurrentTimeMillis;
                }
            }
            Log.i("StrategyCenter", "after  realInterval=".concat(String.valueOf(j)));
            this.f13369ik.mo16690ka().removeCallbacks(this.xha);
            if (this.f13368fi > 24) {
                return;
            }
            this.f13369ik.mo16690ka().postDelayed(this.xha, j);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m16737ri(InterfaceC3610ri interfaceC3610ri) {
        this.f13370ka = interfaceC3610ri;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m16738ri(String str, boolean z) {
        C3607ik c3607ik = this.f13371lr;
        return c3607ik == null ? z : c3607ik.m16723ri(str, z);
    }
}

package com.ironsource;

import android.util.Log;
import android.util.Pair;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.ironsource.I5 */
/* JADX INFO: loaded from: classes6.dex */
public class C11485I5 {

    /* JADX INFO: renamed from: e */
    private static final String f24476e = "EventsTracker";

    /* JADX INFO: renamed from: a */
    private InterfaceC12299l7 f24477a;

    /* JADX INFO: renamed from: b */
    private C11377C5 f24478b;

    /* JADX INFO: renamed from: c */
    private InterfaceC11415E7 f24479c;

    /* JADX INFO: renamed from: d */
    private ExecutorService f24480d;

    /* JADX INFO: renamed from: com.ironsource.I5$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f24481a;

        a(String str) {
            this.f24481a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C11385Cd c11385Cd = new C11385Cd();
                ArrayList<Pair<String, String>> arrayListM25563d = C11485I5.this.f24478b.m25563d();
                if ("POST".equals(C11485I5.this.f24478b.m25564e())) {
                    c11385Cd = C11800a8.m28122b(C11485I5.this.f24478b.m25561b(), this.f24481a, arrayListM25563d);
                } else if ("GET".equals(C11485I5.this.f24478b.m25564e())) {
                    c11385Cd = C11800a8.m28115a(C11485I5.this.f24478b.m25561b(), this.f24481a, arrayListM25563d);
                }
                C11485I5.this.m26065a("response status code: " + c11385Cd.f24177a);
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
            }
        }
    }

    public C11485I5(C11377C5 c11377c5, InterfaceC12299l7 interfaceC12299l7) {
        if (c11377c5 == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        if (c11377c5.m25562c() == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.f24478b = c11377c5;
        this.f24477a = interfaceC12299l7;
        this.f24479c = c11377c5.m25562c();
        this.f24480d = Executors.newSingleThreadExecutor();
    }

    /* JADX INFO: renamed from: b */
    private void m26067b(String str) {
        this.f24480d.submit(new a(str));
    }

    /* JADX INFO: renamed from: a */
    public void m26068a(String str, Map<String, Object> map) {
        m26065a(String.format(Locale.ENGLISH, "%s %s", str, map.toString()));
        if (this.f24478b.m25560a() && !str.isEmpty()) {
            HashMap map2 = new HashMap();
            map2.put("eventname", str);
            m26066a(map2, this.f24477a.mo32058a());
            m26066a(map2, map);
            m26067b(this.f24479c.mo25662a(map2));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m26066a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m26065a(String str) {
        if (this.f24478b.m25565f()) {
            Log.d(f24476e, str);
        }
    }
}

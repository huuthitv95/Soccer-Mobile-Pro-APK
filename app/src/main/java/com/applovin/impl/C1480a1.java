package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.sdk.C1846R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.applovin.impl.a1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1480a1 {

    /* JADX INFO: renamed from: a */
    private final C1748l f951a;

    /* JADX INFO: renamed from: b */
    private final int f952b;

    /* JADX INFO: renamed from: d */
    private List f954d;

    /* JADX INFO: renamed from: e */
    private String f955e;

    /* JADX INFO: renamed from: f */
    private C1800w0 f956f;

    /* JADX INFO: renamed from: g */
    private C1791v0.c f957g;

    /* JADX INFO: renamed from: h */
    private C1800w0 f958h;

    /* JADX INFO: renamed from: i */
    private Dialog f959i;

    /* JADX INFO: renamed from: j */
    private long f960j;

    /* JADX INFO: renamed from: k */
    private long f961k;

    /* JADX INFO: renamed from: l */
    private long f962l;

    /* JADX INFO: renamed from: c */
    private final C1782u0 f953c = new C1782u0();

    /* JADX INFO: renamed from: m */
    private C1791v0.b f963m = new C1791v0.b();

    /* JADX INFO: renamed from: n */
    private final AbstractC1505b f964n = new a();

    /* JADX INFO: renamed from: com.applovin.impl.a1$a */
    class a extends AbstractC1505b {
        a() {
        }

        @Override // com.applovin.impl.AbstractC1505b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || C1480a1.this.f958h == null) {
                return;
            }
            if (C1480a1.this.f959i != null) {
                C1480a1 c1480a1 = C1480a1.this;
                if (!AbstractC1525d.m2250d(c1480a1.m1771a(c1480a1.f959i))) {
                    C1480a1.this.f959i.dismiss();
                }
                C1480a1.this.f959i = null;
            }
            C1800w0 c1800w0 = C1480a1.this.f958h;
            C1480a1.this.f958h = null;
            C1480a1 c1480a2 = C1480a1.this;
            c1480a2.m1788a(c1480a2.f956f, c1800w0, activity);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.a1$b */
    class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f966a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C1818y0 f967b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C1800w0 f968c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Activity f969d;

        b(boolean z, C1818y0 c1818y0, C1800w0 c1800w0, Activity activity) {
            this.f966a = z;
            this.f967b = c1818y0;
            this.f968c = c1800w0;
            this.f969d = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C1480a1.this.f958h = null;
            C1480a1.this.f959i = null;
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - C1480a1.this.f962l));
            CollectionUtils.putStringIfValid("details", String.valueOf(this.f966a), mapHashMap);
            C1480a1.this.f951a.m4863x0().m2682d(C1548f2.f1556p, mapHashMap);
            C1800w0 c1800w0M1773a = C1480a1.this.m1773a(this.f967b.m5609a());
            if (c1800w0M1773a == null) {
                C1480a1.this.m1790a("Destination state for TOS/PP alert is null");
                return;
            }
            C1480a1.this.m1788a(this.f968c, c1800w0M1773a, this.f969d);
            if (c1800w0M1773a.m5498d() != C1800w0.b.ALERT) {
                dialogInterface.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.a1$c */
    class c extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Uri f971a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Activity f972b;

        c(Uri uri, Activity activity) {
            this.f971a = uri;
            this.f972b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC1701q7.m4047a(this.f971a, this.f972b, C1480a1.this.f951a);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.a1$d */
    class d extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Uri f974a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Activity f975b;

        d(Uri uri, Activity activity) {
            this.f974a = uri;
            this.f975b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC1701q7.m4047a(this.f974a, this.f975b, C1480a1.this.f951a);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.a1$e */
    class e implements CmpServiceImpl.InterfaceC1690e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f977a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C1800w0 f978b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Activity f979c;

        e(long j, C1800w0 c1800w0, Activity activity) {
            this.f977a = j;
            this.f978b = c1800w0;
            this.f979c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.InterfaceC1690e
        /* JADX INFO: renamed from: a */
        public void mo1803a(AppLovinCmpError appLovinCmpError) {
            C1480a1.this.f963m.m5356a(appLovinCmpError);
            C1480a1.this.m1789a(appLovinCmpError, SystemClock.elapsedRealtime() - this.f977a);
            C1480a1.this.m1787a(this.f978b, this.f979c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.a1$f */
    class f implements CmpServiceImpl.InterfaceC1690e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f981a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C1800w0 f982b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Activity f983c;

        f(long j, C1800w0 c1800w0, Activity activity) {
            this.f981a = j;
            this.f982b = c1800w0;
            this.f983c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.InterfaceC1690e
        /* JADX INFO: renamed from: a */
        public void mo1803a(AppLovinCmpError appLovinCmpError) {
            C1480a1.this.f963m.m5356a(appLovinCmpError);
            C1480a1.this.m1789a(appLovinCmpError, SystemClock.elapsedRealtime() - this.f981a);
            C1480a1.this.m1787a(this.f982b, this.f983c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.a1$g */
    class g implements CmpServiceImpl.InterfaceC1691f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f985a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C1800w0 f986b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Activity f987c;

        g(long j, C1800w0 c1800w0, Activity activity) {
            this.f985a = j;
            this.f986b = c1800w0;
            this.f987c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.InterfaceC1691f
        /* JADX INFO: renamed from: a */
        public void mo1804a(AppLovinCmpError appLovinCmpError) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f985a));
            if (appLovinCmpError != null) {
                C1480a1.this.f963m.m5356a(appLovinCmpError);
                mapHashMap.putAll(C1480a1.this.m1778a(appLovinCmpError));
                C1480a1.this.f951a.m4863x0().m2682d(C1548f2.f1566u, mapHashMap);
            } else {
                C1480a1.this.f963m.m5359c();
                C1480a1.this.f951a.m4863x0().m2682d(C1548f2.f1568v, mapHashMap);
            }
            C1480a1.this.m1794b(this.f986b, this.f987c);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.a1$h */
    class h implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1800w0 f989a;

        h(C1800w0 c1800w0) {
            this.f989a = c1800w0;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1480a1 c1480a1 = C1480a1.this;
            c1480a1.m1788a(c1480a1.f956f, this.f989a, C1480a1.this.f951a.m4861w0());
        }
    }

    public C1480a1(C1748l c1748l) {
        this.f951a = c1748l;
        this.f952b = ((Integer) c1748l.m4801a(C1831z4.f3902c7)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public Activity m1771a(Dialog dialog) {
        Context context = dialog.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public C1800w0 m1773a(int i) {
        List<C1800w0> list = this.f954d;
        if (list == null) {
            return null;
        }
        for (C1800w0 c1800w0 : list) {
            if (i == c1800w0.m5497c()) {
                return c1800w0;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public HashMap m1778a(AppLovinCmpError appLovinCmpError) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", appLovinCmpError.getMessage());
        CollectionUtils.putStringIfValid("mediated_network_error_message", appLovinCmpError.getCmpMessage(), mapHashMap);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(appLovinCmpError.getCode().getValue()), mapHashMap);
        CollectionUtils.putStringIfValid("mediated_network_error_code", String.valueOf(appLovinCmpError.getCmpCode()), mapHashMap);
        return mapHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m1779a(AlertDialog alertDialog, Activity activity, boolean z, DialogInterface dialogInterface) {
        TextView textView = (TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
        textView.setLinkTextColor(textView.getCurrentTextColor());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMaxLines(this.f952b);
        textView.setMinHeight(AppLovinSdkUtils.dpToPx(activity, 48));
        this.f962l = SystemClock.elapsedRealtime();
        this.f951a.m4863x0().m2682d(C1548f2.f1554o, CollectionUtils.hashMap("details", String.valueOf(z)));
    }

    /* JADX INFO: renamed from: a */
    private void m1785a(C1800w0 c1800w0) {
        this.f953c.m5274b();
        AppLovinSdkUtils.runOnUiThreadDelayed(new h(c1800w0), TimeUnit.SECONDS.toMillis(1L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m1786a(C1800w0 c1800w0, final Activity activity) {
        boolean z;
        SpannableString spannableString;
        if (c1800w0 == null) {
            m1790a("Consent flow state is null");
            return;
        }
        this.f951a.m4782Q();
        if (C1768p.m5160a()) {
            this.f951a.m4782Q().m5171a("ConsentFlowStateMachine", "Transitioning to state: " + c1800w0);
        }
        long jElapsedRealtime = this.f956f != null ? SystemClock.elapsedRealtime() - this.f961k : 0L;
        this.f961k = SystemClock.elapsedRealtime();
        this.f953c.m5272a(c1800w0, jElapsedRealtime);
        if (c1800w0.m5498d() == C1800w0.b.ALERT) {
            if (AbstractC1525d.m2250d(activity)) {
                m1785a(c1800w0);
                return;
            }
            this.f951a.m4768G().trackEvent("cf_start");
            C1809x0 c1809x0 = (C1809x0) c1800w0;
            this.f958h = c1809x0;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setCancelable(false);
            Uri uriM5348h = this.f951a.m4864y().m5348h();
            final boolean z2 = uriM5348h != null;
            for (C1818y0 c1818y0 : c1809x0.m5560f()) {
                b bVar = new b(z2, c1818y0, c1800w0, activity);
                if (c1818y0.m5611c() == C1818y0.a.POSITIVE) {
                    builder.setPositiveButton(c1818y0.m5612d(), bVar);
                } else if (c1818y0.m5611c() == C1818y0.a.NEGATIVE) {
                    builder.setNegativeButton(c1818y0.m5612d(), bVar);
                } else {
                    builder.setNeutralButton(c1818y0.m5612d(), bVar);
                }
            }
            String strM5562h = c1809x0.m5562h();
            if (StringUtils.isValidString(strM5562h)) {
                spannableString = new SpannableString(strM5562h);
                String strM4728a = C1748l.m4728a(C1846R.string.applovin_terms_of_service_text);
                String strM4728a2 = C1748l.m4728a(C1846R.string.applovin_privacy_policy_text);
                if (StringUtils.containsAtLeastOneSubstring(strM5562h, Arrays.asList(strM4728a, strM4728a2))) {
                    if (z2) {
                        StringUtils.addLinks(spannableString, Pattern.compile(strM4728a), new c(uriM5348h, activity), true);
                    }
                    StringUtils.addLinks(spannableString, Pattern.compile(strM4728a2), new d(this.f951a.m4864y().m5346f(), activity), true);
                }
            } else {
                spannableString = null;
            }
            final AlertDialog alertDialogCreate = builder.setTitle(spannableString).setMessage(c1809x0.m5561g()).create();
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.a1$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f$0.m1779a(alertDialogCreate, activity, z2, dialogInterface);
                }
            });
            this.f959i = alertDialogCreate;
            alertDialogCreate.show();
            this.f963m.m5360d();
            return;
        }
        if (c1800w0.m5498d() == C1800w0.b.POST_ALERT) {
            if (!this.f951a.m4864y().m5351k() || !this.f951a.m4864y().m5353m()) {
                m1787a(c1800w0, activity, Boolean.FALSE);
                return;
            } else if (AbstractC1525d.m2250d(activity)) {
                m1785a(c1800w0);
                return;
            } else {
                this.f951a.m4863x0().m3768a(C1548f2.f1558q);
                this.f951a.m4854t().loadCmp(activity, new e(SystemClock.elapsedRealtime(), c1800w0, activity));
                return;
            }
        }
        if (c1800w0.m5498d() == C1800w0.b.EVENT) {
            C1827z0 c1827z0 = (C1827z0) c1800w0;
            String strM5732g = c1827z0.m5732g();
            Map<String, ?> mapM5731f = c1827z0.m5731f();
            if (mapM5731f == null) {
                mapM5731f = new HashMap<>(1);
            }
            mapM5731f.put("flow_type", "unified");
            this.f951a.m4768G().trackEvent(strM5732g, mapM5731f);
            m1794b(c1827z0, activity);
            return;
        }
        if (c1800w0.m5498d() == C1800w0.b.CMP_LOAD) {
            if (AbstractC1525d.m2250d(activity)) {
                m1785a(c1800w0);
                return;
            } else if (this.f951a.m4864y().m5353m()) {
                this.f951a.m4854t().preloadCmp(activity);
                m1787a(c1800w0, activity, Boolean.FALSE);
                return;
            } else {
                this.f951a.m4863x0().m3768a(C1548f2.f1558q);
                this.f951a.m4854t().loadCmp(activity, new f(SystemClock.elapsedRealtime(), c1800w0, activity));
                return;
            }
        }
        if (c1800w0.m5498d() == C1800w0.b.CMP_SHOW) {
            if (AbstractC1525d.m2250d(activity)) {
                m1785a(c1800w0);
                return;
            }
            if (!this.f951a.m4864y().m5353m()) {
                this.f951a.m4768G().trackEvent("cf_start");
            }
            this.f951a.m4863x0().m3768a(C1548f2.f1564t);
            this.f951a.m4854t().showCmp(activity, new g(SystemClock.elapsedRealtime(), c1800w0, activity));
            return;
        }
        if (c1800w0.m5498d() != C1800w0.b.DECISION) {
            if (c1800w0.m5498d() == C1800w0.b.REINIT) {
                m1793b();
                return;
            }
            m1790a("Invalid consent flow destination state: " + c1800w0);
            return;
        }
        C1800w0.a aVarM5494a = c1800w0.m5494a();
        if (aVarM5494a == C1800w0.a.IS_AL_GDPR) {
            boolean zM5351k = this.f951a.m4864y().m5351k();
            this.f953c.m5273a(c1800w0, zM5351k, jElapsedRealtime);
            m1787a(c1800w0, activity, Boolean.valueOf(zM5351k));
        } else if (aVarM5494a == C1800w0.a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT) {
            z = !this.f951a.m4760B0() || ((Boolean) this.f951a.m4800a(C1511b5.f1180t, Boolean.FALSE)).booleanValue();
            this.f953c.m5273a(c1800w0, z, jElapsedRealtime);
            m1787a(c1800w0, activity, Boolean.valueOf(z));
        } else if (aVarM5494a == C1800w0.a.HAS_TERMS_OF_SERVICE_URI) {
            z = this.f951a.m4864y().m5348h() != null;
            this.f953c.m5273a(c1800w0, z, jElapsedRealtime);
            m1787a(c1800w0, activity, Boolean.valueOf(z));
        } else {
            m1790a("Invalid consent flow decision type: " + aVarM5494a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m1787a(C1800w0 c1800w0, Activity activity, Boolean bool) {
        m1788a(c1800w0, m1773a(c1800w0.m5493a(bool)), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m1788a(C1800w0 c1800w0, C1800w0 c1800w1, Activity activity) {
        this.f956f = c1800w0;
        m1796c(c1800w1, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m1789a(AppLovinCmpError appLovinCmpError, long j) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(j));
        if (appLovinCmpError == null) {
            this.f951a.m4863x0().m2682d(C1548f2.f1560r, mapHashMap);
        } else {
            mapHashMap.putAll(m1778a(appLovinCmpError));
            this.f951a.m4863x0().m2682d(C1548f2.f1562s, mapHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m1790a(String str) {
        AbstractC1617m1.m3169a(str, new Object[0]);
        this.f951a.m4764E().m2678a(C1548f2.f1507V0, str, CollectionUtils.hashMap("details", "Last started states: " + this.f955e + "\nLast successful state: " + this.f956f));
        this.f953c.m5275b(str);
        C1791v0.b bVar = this.f963m;
        if (bVar != null) {
            bVar.m5355a(new C1773t0(C1773t0.f3270e, str));
        }
        m1793b();
    }

    /* JADX INFO: renamed from: b */
    private void m1793b() {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f960j));
        CollectionUtils.putStringIfValid("details", this.f953c.toString(), mapHashMap);
        this.f951a.m4863x0().m2682d(C1548f2.f1570w, mapHashMap);
        this.f954d = null;
        this.f956f = null;
        this.f960j = 0L;
        this.f961k = 0L;
        this.f962l = 0L;
        this.f953c.m5271a();
        this.f951a.m4826e().m2146b(this.f964n);
        C1791v0.c cVar = this.f957g;
        if (cVar != null) {
            cVar.mo4869a(this.f963m);
            this.f957g = null;
        }
        this.f963m = new C1791v0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m1794b(C1800w0 c1800w0, Activity activity) {
        m1787a(c1800w0, activity, (Boolean) null);
    }

    /* JADX INFO: renamed from: c */
    private void m1796c(final C1800w0 c1800w0, final Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.a1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1786a(c1800w0, activity);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m1800a(int i, Activity activity, C1791v0.c cVar) {
        if (this.f954d != null) {
            this.f951a.m4782Q();
            if (C1768p.m5160a()) {
                this.f951a.m4782Q().m5171a("ConsentFlowStateMachine", "Unable to start states: " + this.f954d);
            }
            this.f951a.m4782Q();
            if (C1768p.m5160a()) {
                this.f951a.m4782Q().m5171a("ConsentFlowStateMachine", "Consent flow already in progress for states: " + this.f954d);
            }
            cVar.mo4869a(new C1791v0.b(new C1773t0(C1773t0.f3269d, "Consent flow is already in progress.")));
            return;
        }
        List listM2064a = AbstractC1507b1.m2064a(this.f951a);
        this.f954d = listM2064a;
        this.f955e = String.valueOf(listM2064a);
        this.f957g = cVar;
        C1800w0 c1800w0M1773a = m1773a(i);
        this.f951a.m4782Q();
        if (C1768p.m5160a()) {
            this.f951a.m4782Q().m5171a("ConsentFlowStateMachine", "Starting consent flow with states: " + this.f954d + "\nInitial state: " + c1800w0M1773a);
        }
        C1748l.m4725a(activity).m2144a(this.f964n);
        this.f951a.m4863x0().m3768a(C1548f2.f1552n);
        this.f960j = SystemClock.elapsedRealtime();
        m1788a((C1800w0) null, c1800w0M1773a, activity);
    }

    /* JADX INFO: renamed from: a */
    public void m1801a(Activity activity, C1791v0.c cVar) {
        m1800a(C1800w0.a.IS_AL_GDPR.m5501b(), activity, cVar);
    }

    /* JADX INFO: renamed from: a */
    public boolean m1802a() {
        return this.f954d != null;
    }
}

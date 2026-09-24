package com.fyber.inneractive.sdk.flow;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.fyber.inneractive.sdk.config.AbstractC7945a;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8260a;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8261b;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8262c;
import com.fyber.inneractive.sdk.metrics.C8285d;
import com.fyber.inneractive.sdk.network.AbstractC8434z;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.network.timeouts.content.C8419a;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.response.EnumC9083a;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.k */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8129k implements InterfaceC8262c, InterfaceC8261b {

    /* JADX INFO: renamed from: a */
    public InneractiveAdRequest f18089a;

    /* JADX INFO: renamed from: b */
    public AbstractC9087e f18090b;

    /* JADX INFO: renamed from: c */
    public AbstractC8236x f18091c;

    /* JADX INFO: renamed from: d */
    public InterfaceC8260a f18092d;

    /* JADX INFO: renamed from: e */
    public InterfaceC8261b f18093e;

    /* JADX INFO: renamed from: f */
    public C8028r0 f18094f;

    /* JADX INFO: renamed from: g */
    public C8006r f18095g;

    /* JADX INFO: renamed from: j */
    public C8419a f18098j;

    /* JADX INFO: renamed from: h */
    public boolean f18096h = false;

    /* JADX INFO: renamed from: i */
    public int f18097i = 0;

    /* JADX INFO: renamed from: l */
    public final RunnableC8127j f18100l = new RunnableC8127j(this);

    /* JADX INFO: renamed from: k */
    public C8079d f18099k = new C8079d(this);

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8261b
    /* JADX INFO: renamed from: a */
    public void mo20549a() {
        int i;
        String strM21943a = IAlog.m21943a(this);
        Integer numValueOf = Integer.valueOf(this.f18097i - 1);
        int i2 = this.f18097i - 1;
        C8419a c8419a = this.f18098j;
        if (c8419a != null) {
            if (c8419a.f18732g) {
                i2 = c8419a.f18726a - i2;
            }
            i = (c8419a.f18727b * i2) + c8419a.f18729d + (i2 == c8419a.f18726a ? c8419a.f18733h : 0);
        } else {
            i = 0;
        }
        IAlog.m21945a("%s : IAAdContentLoaderImpl : onTimeout() attempt: %d timeout: %d", strM21943a, numValueOf, Integer.valueOf(i));
        InterfaceC8261b interfaceC8261b = this.f18093e;
        if (interfaceC8261b != null) {
            interfaceC8261b.mo20549a();
        }
        C8419a c8419a2 = this.f18098j;
        InneractiveInfrastructureError inneractiveInfrastructureErrorMo20554d = this.f18097i <= (c8419a2 != null ? c8419a2.f18726a : 0) ? mo20554d() : new InneractiveInfrastructureError(InneractiveErrorCode.IN_FLIGHT_TIMEOUT, EnumC8125i.NO_TIME_TO_LOAD_AD_CONTENT);
        AbstractC9183r.f21477a.execute(new RunnableC8081e(new C8119f(this.f18090b, this.f18089a, mo20555e(), this.f18095g.m20435b()), inneractiveInfrastructureErrorMo20554d));
        m20552b(inneractiveInfrastructureErrorMo20554d);
    }

    /* JADX INFO: renamed from: a */
    public final void m20550a(InneractiveAdRequest inneractiveAdRequest, AbstractC9087e abstractC9087e, C8006r c8006r, InterfaceC8260a interfaceC8260a, InterfaceC8261b interfaceC8261b) {
        this.f18089a = inneractiveAdRequest;
        this.f18090b = abstractC9087e;
        this.f18092d = interfaceC8260a;
        this.f18093e = interfaceC8261b;
        this.f18099k = new C8079d(this);
        this.f18095g = c8006r;
        UnitDisplayType unitDisplayType = abstractC9087e.f21314n;
        this.f18098j = new C8419a((unitDisplayType == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.NATIVE) ? unitDisplayType.name().toLowerCase(Locale.US) : UnitDisplayType.BANNER.name().toLowerCase(Locale.US), EnumC9083a.m21884a(abstractC9087e.f21307g) == EnumC9083a.RETURNED_ADTYPE_VAST ? "video" : "display", (int) abstractC9087e.f21298H, abstractC9087e.f21291A, IAConfigManager.f17654M.f17680l, this.f18095g);
        if (this.f18089a == null) {
            this.f18094f = AbstractC7945a.m20382a(abstractC9087e.f21313m);
        }
        try {
            m20558h();
        } catch (Throwable th) {
            IAlog.m21950f("Failed to start ContentLoader", IAlog.m21943a(this));
            AbstractC8434z.m20812a(th, inneractiveAdRequest, abstractC9087e);
            this.f18099k.m20496a();
            m20552b(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, EnumC8125i.CONTENT_LOADER_START_FAILED));
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8261b
    /* JADX INFO: renamed from: b */
    public final void mo20551b() {
        int i;
        String strM21943a = IAlog.m21943a(this);
        Integer numValueOf = Integer.valueOf(this.f18097i - 1);
        int i2 = this.f18097i - 1;
        C8419a c8419a = this.f18098j;
        if (c8419a != null) {
            if (c8419a.f18732g) {
                i2 = c8419a.f18726a - i2;
            }
            i = (c8419a.f18727b * i2) + c8419a.f18729d + (i2 == c8419a.f18726a ? c8419a.f18733h : 0);
        } else {
            i = 0;
        }
        IAlog.m21945a("%s : IAAdContentLoaderImpl : onRetry() attempt: %d timeout: %d", strM21943a, numValueOf, Integer.valueOf(i));
        InterfaceC8261b interfaceC8261b = this.f18093e;
        if (interfaceC8261b != null) {
            interfaceC8261b.mo20551b();
        }
        m20558h();
    }

    /* JADX INFO: renamed from: b */
    public final void m20552b(InneractiveInfrastructureError inneractiveInfrastructureError) {
        String string;
        IAlog.m21945a("%s : IAAdContentLoaderImpl : Handle Retry for error: %s", IAlog.m21943a(this), inneractiveInfrastructureError.getErrorCode().toString());
        C8079d c8079d = this.f18099k;
        c8079d.getClass();
        IAlog.m21945a("%s : ContentLoadTimeoutHandler stopping timeout handler", IAlog.m21943a(c8079d));
        Handler handler = c8079d.f17972a;
        if (handler != null) {
            handler.removeCallbacks(c8079d.f17975d);
        }
        C8419a c8419a = this.f18098j;
        boolean z = this.f18097i <= (c8419a != null ? c8419a.f18726a : 0);
        IAlog.m21945a("%s : IAAdContentLoaderImpl : should retry: %s", IAlog.m21943a(this), Boolean.valueOf(z));
        if (z) {
            AbstractC8236x abstractC8236x = this.f18091c;
            if (abstractC8236x != null) {
                abstractC8236x.destroy();
                this.f18091c = null;
            }
            C8419a c8419a2 = this.f18098j;
            int i = c8419a2 != null ? c8419a2.f18730e : 0;
            IAlog.m21945a("%s : IAAdContentLoaderImpl : retryLoad : post load ad content retry task with delay: %d", IAlog.m21943a(this), Integer.valueOf(i));
            AbstractC9183r.f21478b.postDelayed(this.f18100l, i);
            return;
        }
        InterfaceC8260a interfaceC8260a = this.f18092d;
        if (interfaceC8260a != null) {
            interfaceC8260a.mo20581a(inneractiveInfrastructureError);
        }
        InneractiveAdRequest inneractiveAdRequest = this.f18089a;
        AbstractC9087e abstractC9087e = this.f18090b;
        C8006r c8006r = this.f18095g;
        JSONArray jSONArrayM20435b = c8006r == null ? null : c8006r.m20435b();
        if (inneractiveInfrastructureError.getErrorCode() == InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD) {
            EnumC8415t enumC8415t = EnumC8415t.NATIVE_ERROR_FAILED_TO_LOAD_AD;
            if (!inneractiveInfrastructureError.isErrorAlreadyReported(enumC8415t)) {
                IAlog.m21945a("Firing Event 402 - NativeAdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
                JSONObject jSONObject = new JSONObject();
                C8428w c8428w = new C8428w(abstractC9087e);
                c8428w.f18754b = enumC8415t;
                c8428w.f18753a = inneractiveAdRequest;
                c8428w.f18756d = jSONArrayM20435b;
                if (inneractiveInfrastructureError.getCause() != null) {
                    string = Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace());
                } else {
                    StringBuilder sb = new StringBuilder();
                    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                    for (int i2 = 7; i2 >= 0 && i2 < 13 && i2 < stackTrace.length; i2++) {
                        sb.append(stackTrace[i2].toString());
                        sb.append(",");
                    }
                    Log.d("stack trace:", sb.toString());
                    string = sb.toString();
                }
                String string2 = inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason().toString();
                try {
                    jSONObject.put("message", string2);
                } catch (Exception unused) {
                    IAlog.m21950f("Got exception adding param to json object: %s, %s", "message", string2);
                }
                try {
                    jSONObject.put("description", string);
                } catch (Exception unused2) {
                    IAlog.m21950f("Got exception adding param to json object: %s, %s", "description", string);
                }
                String strDescription = inneractiveInfrastructureError.description();
                try {
                    jSONObject.put("extra_description", strDescription);
                } catch (Exception unused3) {
                    IAlog.m21950f("Got exception adding param to json object: %s, %s", "extra_description", strDescription);
                }
                c8428w.f18758f.put(jSONObject);
                c8428w.m20808a((String) null);
                inneractiveInfrastructureError.addReportedError(enumC8415t);
            }
        } else {
            AbstractC8073a.m20470a(inneractiveAdRequest, inneractiveInfrastructureError, this.f18091c, abstractC9087e, jSONArrayM20435b);
        }
        cancel();
    }

    /* JADX INFO: renamed from: c */
    public void m20553c() {
        m20556f();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8262c
    public abstract void cancel();

    /* JADX INFO: renamed from: d */
    public InneractiveInfrastructureError mo20554d() {
        EnumC8125i enumC8125i = EnumC8125i.WEBVIEW_LOAD_TIMEOUT;
        AbstractC9087e abstractC9087e = this.f18090b;
        if ("video".equalsIgnoreCase((abstractC9087e == null || EnumC9083a.m21884a(abstractC9087e.f21307g) != EnumC9083a.RETURNED_ADTYPE_VAST) ? "display" : "video")) {
            enumC8125i = EnumC8125i.VIDEO_AD_LOAD_TIMEOUT;
        }
        return new InneractiveInfrastructureError(InneractiveErrorCode.LOAD_TIMEOUT, enumC8125i);
    }

    /* JADX INFO: renamed from: e */
    public abstract String mo20555e();

    /* JADX INFO: renamed from: f */
    public final void m20556f() {
        String str;
        this.f18099k.m20496a();
        InneractiveAdRequest inneractiveAdRequest = this.f18089a;
        if (inneractiveAdRequest != null) {
            str = inneractiveAdRequest.f18328b;
        } else {
            AbstractC9087e abstractC9087e = this.f18090b;
            if (abstractC9087e == null || (str = abstractC9087e.f21325y) == null) {
                str = null;
            }
        }
        C8285d.f18476d.m20685a(str).mo20695i();
        AbstractC8236x abstractC8236x = this.f18091c;
        if (abstractC8236x != null) {
            abstractC8236x.mo20634a(str);
        }
        InterfaceC8260a interfaceC8260a = this.f18092d;
        if (interfaceC8260a != null) {
            interfaceC8260a.mo20578a(this.f18089a);
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo20557g();

    /* JADX INFO: renamed from: h */
    public final void m20558h() {
        int i;
        int i2 = this.f18097i;
        this.f18097i = i2 + 1;
        C8419a c8419a = this.f18098j;
        if (c8419a != null) {
            if (c8419a.f18732g) {
                i2 = c8419a.f18726a - i2;
            }
            i = (c8419a.f18727b * i2) + c8419a.f18729d + (i2 == c8419a.f18726a ? c8419a.f18733h : 0);
        } else {
            i = 0;
        }
        IAlog.m21945a("%s : IAAdContentLoaderImpl : Start timeout: %d, attempt number: %d", IAlog.m21943a(this), Integer.valueOf(i), Integer.valueOf(this.f18097i - 1));
        C8079d c8079d = this.f18099k;
        if (c8079d.f17972a == null) {
            HandlerThread handlerThread = new HandlerThread("TimeoutHandlerThread");
            handlerThread.start();
            c8079d.f17972a = new Handler(handlerThread.getLooper());
        }
        c8079d.f17972a.postDelayed(c8079d.f17975d, i);
        mo20557g();
    }
}

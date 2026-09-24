package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.bidder.adm.C7854y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C7967a;
import com.fyber.inneractive.sdk.config.global.C7968b;
import com.fyber.inneractive.sdk.config.global.C7999k;
import com.fyber.inneractive.sdk.config.global.C8000l;
import com.fyber.inneractive.sdk.config.global.C8005q;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.AbstractC7981i;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.network.C8390k1;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.C8430x;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.response.nativead.C9095a;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.c0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8078c0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7854y f17968a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8006r f17969b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f17970c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C8124h0 f17971d;

    public C8078c0(C8124h0 c8124h0, C7854y c7854y, C8006r c8006r, String str) {
        this.f17971d = c8124h0;
        this.f17968a = c7854y;
        this.f17969b = c8006r;
        this.f17970c = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m20494a() {
        C8005q c8005q;
        C7968b c7968b;
        C7999k c7999k;
        C8000l c8000l;
        C8005q c8005q2;
        IAlog.m21945a("%s : InneractiveAdSpotImpl markup data available", C8124h0.m20543a(this.f17971d));
        if (this.f17971d.f18086n.get()) {
            C8124h0 c8124h0 = this.f17971d;
            C8169p c8169p = c8124h0.f18084l;
            c8124h0.m20547a(c8124h0.f18077e);
            return;
        }
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f17968a.f17514a;
        if (admParametersOuterClass$AdmParameters != null) {
            C8006r c8006r = this.f17969b;
            List<AdmParametersOuterClass$AdmParameters.Experiment> abExperimentsList = admParametersOuterClass$AdmParameters.getAbExperimentsList();
            c8006r.getClass();
            C7967a c7967a = IAConfigManager.f17654M.f17693y;
            c7967a.getClass();
            for (AbstractC7981i abstractC7981i : c8006r.f17776b.values()) {
                if (abstractC7981i != null && (c8000l = c7967a.f17742a) != null && (c8005q2 = (C8005q) c8000l.f17770a.get(abstractC7981i.f17757b)) != null) {
                    abstractC7981i.f17772a = c8005q2.f17772a;
                }
            }
            if (abExperimentsList == null || abExperimentsList.size() <= 0) {
                return;
            }
            C7967a c7967a2 = IAConfigManager.f17654M.f17693y;
            c7967a2.f17743b = c8006r;
            for (AbstractC7981i abstractC7981i2 : c8006r.f17776b.values()) {
                for (AdmParametersOuterClass$AdmParameters.Experiment experiment : abExperimentsList) {
                    String identifier = experiment.getIdentifier();
                    String variant = experiment.getVariant();
                    C8000l c8000l2 = c7967a2.f17742a;
                    if (c8000l2 != null && (c8005q = (C8005q) c8000l2.f17770a.get(abstractC7981i2.f17757b)) != null && (c7968b = (C7968b) c8005q.f17774c.get(identifier)) != null) {
                        Iterator it = c7968b.f17746c.iterator();
                        do {
                            if (!it.hasNext()) {
                                c7999k = null;
                                break;
                            }
                            c7999k = (C7999k) it.next();
                        } while (!c7999k.f17768b.equals(variant));
                        abstractC7981i2.f17758c.put(c7968b.f17744a, c7968b);
                        if (c7999k != null) {
                            abstractC7981i2.f17759d.put(c7968b.f17744a, c7999k);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20495a(Exception exc, InneractiveErrorCode inneractiveErrorCode, AbstractC9087e... abstractC9087eArr) {
        EnumC8415t enumC8415t;
        if (this.f17971d.f18086n.get()) {
            IAlog.m21945a("%s : onResponseDataError: spot is already destroyed won't continue", C8124h0.m20543a(this.f17971d));
            C8124h0 c8124h0 = this.f17971d;
            C8169p c8169p = c8124h0.f18084l;
            c8124h0.m20547a(c8124h0.f18077e);
            return;
        }
        IAlog.m21945a("%s : InneractiveAdSpotImpl data error", C8124h0.m20543a(this.f17971d));
        AbstractC9087e abstractC9087e = abstractC9087eArr.length > 0 ? abstractC9087eArr[0] : null;
        this.f17971d.getClass();
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode, exc.getCause() instanceof C9095a ? EnumC8125i.NATIVE_AD_PARSING_ERROR : EnumC8125i.ADM_FETCH_FAILED);
        C8082e0 c8082e0 = this.f17971d.f18076d;
        if (c8082e0 != null) {
            c8082e0.m20497a(null, abstractC9087e, inneractiveInfrastructureError);
        }
        C8169p c8169p2 = this.f17971d.f18084l;
        if (c8169p2 != null) {
            IAlog.m21949e("%sgot handleFailedLoading! with: %s", c8169p2.mo20561d(), inneractiveInfrastructureError);
            InterfaceC8135n interfaceC8135n = c8169p2.f18185b;
            if (interfaceC8135n != null) {
                ((C8082e0) interfaceC8135n).m20497a(null, abstractC9087e, inneractiveInfrastructureError);
            }
            if (inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason() != EnumC8125i.NATIVE_AD_PARSING_ERROR) {
                c8169p2.mo20579a(null, abstractC9087e);
            }
        }
        C8124h0 c8124h1 = this.f17971d;
        String str = this.f17970c;
        C8006r c8006r = this.f17969b;
        c8124h1.getClass();
        int i = AbstractC8120f0.f18068a[inneractiveErrorCode.ordinal()];
        if (i == 1 || i == 2) {
            enumC8415t = EnumC8415t.FATAL_ADM_MARKUP_FETCHING_ERROR;
        } else {
            enumC8415t = i != 3 ? EnumC8415t.FATAL_ADM_PARSING_ERROR : EnumC8415t.NATIVE_ERROR_INVALID_NATIVE_RESPONSE;
        }
        if (abstractC9087e != null) {
            abstractC9087e.f21291A = false;
        }
        String name = exc.getClass().getName();
        if (exc instanceof C8390k1) {
            name = "NetworkStackException";
        }
        JSONArray jSONArrayM20435b = c8006r.m20435b();
        C8428w c8428w = new C8428w(abstractC9087e);
        c8428w.f18754b = enumC8415t;
        c8428w.f18753a = null;
        c8428w.f18756d = jSONArrayM20435b;
        C8430x c8430x = new C8430x();
        c8430x.m20809a(name, "exception").m20809a(exc.getLocalizedMessage() != null ? exc.getLocalizedMessage() : exc, "message");
        InneractiveErrorCode inneractiveErrorCode2 = InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD;
        if (inneractiveErrorCode == inneractiveErrorCode2 && exc.getCause() != null && exc.getCause().getCause() != null) {
            c8430x.m20809a(exc.getCause().getCause().getMessage(), "reason");
        } else if (inneractiveErrorCode != inneractiveErrorCode2) {
            c8430x.m20809a(str, "admPayload");
        }
        c8428w.f18758f.put(c8430x.f18760a);
        c8428w.m20808a((String) null);
    }
}

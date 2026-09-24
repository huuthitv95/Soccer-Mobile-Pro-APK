package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.EnumC8125i;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class InneractiveInfrastructureError extends InneractiveError {

    /* JADX INFO: renamed from: a */
    public final InneractiveErrorCode f17925a;

    /* JADX INFO: renamed from: b */
    public final EnumC8125i f17926b;

    /* JADX INFO: renamed from: c */
    public final Throwable f17927c;

    /* JADX INFO: renamed from: d */
    public Exception f17928d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f17929e;

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, EnumC8125i enumC8125i) {
        this(inneractiveErrorCode, enumC8125i, null);
    }

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, EnumC8125i enumC8125i, Throwable th) {
        this.f17929e = new ArrayList();
        this.f17925a = inneractiveErrorCode;
        this.f17926b = enumC8125i;
        this.f17927c = th;
    }

    public void addReportedError(EnumC8415t enumC8415t) {
        this.f17929e.add(enumC8415t);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17925a);
        if (this.f17927c != null) {
            sb.append(" : ");
            sb.append(this.f17927c);
        }
        return sb.toString();
    }

    public Throwable getCause() {
        Exception exc = this.f17928d;
        return exc == null ? this.f17927c : exc;
    }

    public InneractiveErrorCode getErrorCode() {
        return this.f17925a;
    }

    public EnumC8125i getFyberMarketplaceAdLoadFailureReason() {
        return this.f17926b;
    }

    public boolean isErrorAlreadyReported(EnumC8415t enumC8415t) {
        return this.f17929e.contains(enumC8415t);
    }

    public void setCause(Exception exc) {
        this.f17928d = exc;
    }
}

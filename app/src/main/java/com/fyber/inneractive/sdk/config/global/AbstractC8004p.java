package com.fyber.inneractive.sdk.config.global;

import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.global.p */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8004p implements InterfaceC8002n {

    /* JADX INFO: renamed from: a */
    public InterfaceC8002n f17772a;

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC8002n
    /* JADX INFO: renamed from: a */
    public Integer mo20416a(String str) {
        InterfaceC8002n interfaceC8002n = this.f17772a;
        if (interfaceC8002n == null || interfaceC8002n.mo20430a() == null || this.f17772a.mo20430a().size() <= 0) {
            return null;
        }
        return this.f17772a.mo20416a(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC8002n
    /* JADX INFO: renamed from: a */
    public String mo20417a(String str, String str2) {
        InterfaceC8002n interfaceC8002n = this.f17772a;
        return interfaceC8002n != null ? interfaceC8002n.mo20417a(str, str2) : str2;
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC8002n
    /* JADX INFO: renamed from: a */
    public final Map mo20430a() {
        InterfaceC8002n interfaceC8002n = this.f17772a;
        if (interfaceC8002n != null) {
            return interfaceC8002n.mo20430a();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC8002n
    /* JADX INFO: renamed from: b */
    public String mo20419b(String str) {
        InterfaceC8002n interfaceC8002n = this.f17772a;
        if (interfaceC8002n == null || interfaceC8002n.mo20430a() == null || this.f17772a.mo20430a().size() <= 0) {
            return null;
        }
        return this.f17772a.mo20419b(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC8002n
    /* JADX INFO: renamed from: c */
    public Boolean mo20420c(String str) {
        InterfaceC8002n interfaceC8002n = this.f17772a;
        if (interfaceC8002n == null || interfaceC8002n.mo20430a() == null || this.f17772a.mo20430a().size() <= 0) {
            return null;
        }
        return this.f17772a.mo20420c(str);
    }
}

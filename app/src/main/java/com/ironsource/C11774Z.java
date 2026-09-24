package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Z */
/* JADX INFO: loaded from: classes6.dex */
public final class C11774Z implements InterfaceC11757Y {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12286kc f26651a;

    /* JADX INFO: renamed from: com.ironsource.Z$a */
    public static final class a implements InterfaceC11474Hc {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C11732W8 f26652a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InitListener f26653b;

        a(C11732W8 c11732w8, InitListener initListener) {
            this.f26652a = c11732w8;
            this.f26653b = initListener;
        }

        @Override // com.ironsource.InterfaceC11474Hc
        public void onFail(C12404o8 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            IronLog.ADAPTER_API.verbose("initSDKWithNetworkConfigurations error: " + error);
            this.f26653b.onInitFailed(C12526t5.f32437a.m33742a(new IronSourceError(error.m32956a(), error.m32957b())));
        }

        @Override // com.ironsource.InterfaceC11474Hc
        public void onSuccess() {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("initSDKWithNetworkConfigurations success");
            InterfaceC11740X interfaceC11740XM27827e = this.f26652a.m27827e();
            ironLog.verbose("controllerURL = " + (interfaceC11740XM27827e != null ? interfaceC11740XM27827e.mo27848a() : null));
            InterfaceC11740X interfaceC11740XM27827e2 = this.f26652a.m27827e();
            ironLog.verbose("controllerConfig = " + (interfaceC11740XM27827e2 != null ? interfaceC11740XM27827e2.mo27849b() : null));
            InterfaceC11740X interfaceC11740XM27827e3 = this.f26652a.m27827e();
            ironLog.verbose("debugMode = " + (interfaceC11740XM27827e3 != null ? Integer.valueOf(interfaceC11740XM27827e3.mo27850c()) : null));
            ironLog.verbose("applicationKey = " + this.f26652a.m27826d());
            ironLog.verbose("userId = " + this.f26652a.m27830h());
            this.f26653b.onInitSuccess();
        }
    }

    public C11774Z(InterfaceC12286kc networkInitApi) {
        Intrinsics.checkNotNullParameter(networkInitApi, "networkInitApi");
        this.f26651a = networkInitApi;
    }

    @Override // com.ironsource.InterfaceC11757Y
    /* JADX INFO: renamed from: a */
    public void mo28002a(Context context, C11732W8 initConfig, InitListener initListener) {
        JSONObject jSONObjectMo27849b;
        String strMo27848a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initConfig, "initConfig");
        Intrinsics.checkNotNullParameter(initListener, "initListener");
        InterfaceC12286kc interfaceC12286kc = this.f26651a;
        InterfaceC11740X interfaceC11740XM27827e = initConfig.m27827e();
        interfaceC12286kc.mo31949a(interfaceC11740XM27827e != null ? interfaceC11740XM27827e.mo27850c() : 0);
        InterfaceC11740X interfaceC11740XM27827e2 = initConfig.m27827e();
        if (interfaceC11740XM27827e2 != null && (strMo27848a = interfaceC11740XM27827e2.mo27848a()) != null) {
            this.f26651a.mo31953b(strMo27848a);
        }
        InterfaceC11740X interfaceC11740XM27827e3 = initConfig.m27827e();
        if (interfaceC11740XM27827e3 != null && (jSONObjectMo27849b = interfaceC11740XM27827e3.mo27849b()) != null) {
            InterfaceC12286kc interfaceC12286kc2 = this.f26651a;
            String string = jSONObjectMo27849b.toString();
            Intrinsics.checkNotNullExpressionValue(string, "applicationConfig.toString()");
            interfaceC12286kc2.mo31952a(string);
        }
        Map<String, String> mapM31741a = new C12250ic().m31741a();
        this.f26651a.mo31951a(new a(initConfig, initListener));
        this.f26651a.mo31950a(context, initConfig.m27826d(), initConfig.m27830h(), mapM31741a);
    }
}

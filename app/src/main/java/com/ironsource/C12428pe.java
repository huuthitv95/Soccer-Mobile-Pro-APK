package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.C12367p;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.pe */
/* JADX INFO: loaded from: classes6.dex */
public final class C12428pe implements InterfaceC12623yc {

    /* JADX INFO: renamed from: a */
    public static final C12428pe f31723a = new C12428pe();

    /* JADX INFO: renamed from: b */
    private static final C12517se f31724b = new C12517se();

    /* JADX INFO: renamed from: com.ironsource.pe$a */
    public static final class a implements InterfaceC12216ge {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC12216ge f31725a;

        a(InterfaceC12216ge interfaceC12216ge) {
            this.f31725a = interfaceC12216ge;
        }

        @Override // com.ironsource.InterfaceC12216ge
        /* JADX INFO: renamed from: a */
        public void mo26373a(final C12100ae sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            C12517se c12517se = C12428pe.f31724b;
            final InterfaceC12216ge interfaceC12216ge = this.f31725a;
            c12517se.mo33666c(new Runnable() { // from class: com.ironsource.pe$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C12428pe.a.m33114a(sdkConfig, interfaceC12216ge);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public static final void m33114a(C12100ae sdkConfig, InterfaceC12216ge listener) {
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullParameter(listener, "$listener");
            C12428pe.f31723a.m33102a(sdkConfig, listener);
        }

        @Override // com.ironsource.InterfaceC12216ge
        /* JADX INFO: renamed from: a */
        public void mo26374a(final C12136ce error, final C12113b9 c12113b9) {
            Intrinsics.checkNotNullParameter(error, "error");
            C12517se c12517se = C12428pe.f31724b;
            final InterfaceC12216ge interfaceC12216ge = this.f31725a;
            c12517se.mo33662b(new Runnable() { // from class: com.ironsource.pe$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C12428pe.a.m33115a(interfaceC12216ge, error, c12113b9);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public static final void m33115a(InterfaceC12216ge listener, C12136ce error, C12113b9 c12113b9) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(error, "$error");
            listener.mo26374a(error, c12113b9);
        }
    }

    private C12428pe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m33108b(Context context, C12252ie initRequest, InterfaceC12216ge listener) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        new C11648R9().m27345a(EnumC12234he.LEVEL_PLAY_INIT);
        f31723a.m33101a(context, initRequest, listener, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m33110d(Context context, C12252ie initRequest, InterfaceC12216ge listener) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        C12367p c12367pM32628h = C12367p.m32628h();
        String strM31766d = initRequest.m31766d();
        IronSource.EnumC12328a[] enumC12328aArr = (IronSource.EnumC12328a[]) initRequest.m31767e().toArray(new IronSource.EnumC12328a[0]);
        List<IronSource.EnumC12328a> validAdUnitsList = c12367pM32628h.m32648a(context, strM31766d, false, (IronSource.EnumC12328a[]) Arrays.copyOf(enumC12328aArr, enumC12328aArr.length));
        Intrinsics.checkNotNullExpressionValue(validAdUnitsList, "validAdUnitsList");
        initRequest.m31763a(validAdUnitsList);
        new C11648R9().m27345a(EnumC12234he.EXTERNAL_MEDIATION_INIT);
        f31723a.m33101a(context, initRequest, listener, true);
    }

    /* JADX INFO: renamed from: c */
    public final void m33113c(final Context context, final C12252ie initRequest, final InterfaceC12216ge listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        f31724b.mo33667d(new Runnable() { // from class: com.ironsource.pe$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C12428pe.m33110d(context, initRequest, listener);
            }
        });
    }

    @Override // com.ironsource.InterfaceC12623yc
    public void onInitFailed(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        f31724b.mo33666c(new Runnable() { // from class: com.ironsource.pe$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C12428pe.m33106a(error);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m33111a(final Context context, final C12252ie initRequest, final InterfaceC12216ge listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        f31724b.mo33667d(new Runnable() { // from class: com.ironsource.pe$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C12428pe.m33108b(context, initRequest, listener);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private final void m33101a(Context context, C12252ie c12252ie, final InterfaceC12216ge interfaceC12216ge, boolean z) throws Throwable {
        String strM31768f = c12252ie.m31768f();
        if (strM31768f != null && strM31768f.length() > 0) {
            C12367p.m32628h().m32670j(c12252ie.m31768f());
        } else {
            c12252ie = new C12252ie(c12252ie.m31766d(), C12367p.m32628h().m32669j(), CollectionsKt.toMutableList((Collection) c12252ie.m31767e()));
        }
        C12367p c12367pM32628h = C12367p.m32628h();
        String strM31766d = c12252ie.m31766d();
        IronSource.EnumC12328a[] enumC12328aArr = (IronSource.EnumC12328a[]) c12252ie.m31767e().toArray(new IronSource.EnumC12328a[0]);
        final IronSourceError ironSourceErrorM32647a = c12367pM32628h.m32647a(context, strM31766d, z, this, (IronSource.EnumC12328a[]) Arrays.copyOf(enumC12328aArr, enumC12328aArr.length));
        if (ironSourceErrorM32647a != null && ironSourceErrorM32647a.getErrorCode() != 2020) {
            if (ironSourceErrorM32647a.getErrorCode() == 2040) {
                C11494Ie c11494IeM32665e = C12367p.m32628h().m32665e();
                if (c11494IeM32665e != null) {
                    m33102a(new C12100ae(new C12270je(c11494IeM32665e), null, null, 6, null), interfaceC12216ge);
                    return;
                }
            } else if (ironSourceErrorM32647a.getErrorCode() == 2030) {
                C12410oe.f31639l.m33000a().m32998e();
                return;
            }
            f31724b.mo33662b(new Runnable() { // from class: com.ironsource.pe$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    C12428pe.m33105a(interfaceC12216ge, ironSourceErrorM32647a);
                }
            });
            return;
        }
        C12410oe.f31639l.m33000a().m32995a(context, c12252ie, new a(interfaceC12216ge));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m33109b(C11494Ie serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "$serverResponse");
        C12410oe.f31639l.m33000a().m32997a(new C12270je(serverResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m33105a(InterfaceC12216ge listener, IronSourceError error) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullExpressionValue(error, "error");
        InterfaceC12216ge.CC.m31563a(listener, new C12136ce(error), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m33102a(final C12100ae c12100ae, final InterfaceC12216ge interfaceC12216ge) {
        if (!C12367p.m32628h().m32655a(false, c12100ae.m31106d())) {
            f31724b.mo33662b(new Runnable() { // from class: com.ironsource.pe$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    C12428pe.m33103a(interfaceC12216ge);
                }
            });
        } else {
            f31724b.mo33662b(new Runnable() { // from class: com.ironsource.pe$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    C12428pe.m33104a(interfaceC12216ge, c12100ae);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m33103a(InterfaceC12216ge listener) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        InterfaceC12216ge.CC.m31563a(listener, new C12136ce(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "An unknown error has occurred"), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m33104a(InterfaceC12216ge listener, C12100ae sdkInitResponse) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(sdkInitResponse, "$sdkInitResponse");
        listener.mo26373a(sdkInitResponse);
    }

    @Override // com.ironsource.InterfaceC12623yc
    /* JADX INFO: renamed from: a */
    public void mo33112a(final C11494Ie serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        f31724b.mo33666c(new Runnable() { // from class: com.ironsource.pe$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C12428pe.m33109b(serverResponse);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m33106a(IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "$error");
        C12410oe.f31639l.m33000a().m32996a(new C12136ce(error));
    }
}
